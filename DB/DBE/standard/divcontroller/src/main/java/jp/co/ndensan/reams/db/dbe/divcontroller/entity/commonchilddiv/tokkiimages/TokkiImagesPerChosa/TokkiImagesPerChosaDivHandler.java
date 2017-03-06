/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.entity.commonchilddiv.tokkiimages.TokkiImagesPerChosa;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.commonchilddiv.tokkiimages.Operation;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.commonchilddiv.tokkiimages.TokkiImagesPerKomoku.ITokkiImagesPerKomokuDiv;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteiShinseiJoho;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosahyoTokkijiko;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosahyoTokkijikos;
import jp.co.ndensan.reams.db.dbz.definition.core.ninteichosatokkijikou.NinteiChosaTokkiJikou;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.TokkijikoTextImageKubun;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ImageManager;
import jp.co.ndensan.reams.db.dbz.service.core.basic.NinteiShinseiJohoManager;
import jp.co.ndensan.reams.db.dbz.service.core.basic.NinteichosahyoTokkijikoManager;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DropDownList;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSourceConverter;

/**
 * {@link TokkiImagesPerChosaDiv}の制御を行います。
 */
public class TokkiImagesPerChosaDivHandler {

    private static final Comparator<KeyValueDataSource> VALUE_ASC
            = new Comparator<KeyValueDataSource>() {
                @Override
                public int compare(KeyValueDataSource o1, KeyValueDataSource o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            };

    private final TokkiImagesPerChosaDiv div;

    /**
     * @param div {@link TokkiImagesPerChosaDiv}
     */
    TokkiImagesPerChosaDivHandler(TokkiImagesPerChosaDiv div) {
        this.div = div;
    }

    /**
     * @return 共有ファイル名
     */
    FilesystemName createOrFindSharedFileName() {
        if (RString.isNullOrEmpty(div.getSharedFileNameValue())) {
            NinteiShinseiJoho n = NinteiShinseiJohoManager.createInstance().get要介護認定申請情報(div.getShinseishoKanriNo());
            div.setSharedFileNameValue(n.get証記載保険者番号().concat(n.get被保険者番号()));
        }
        return FilesystemName.fromString(div.getSharedFileNameValue());
    }

    /**
     * @return 共有ファイルID検索結果
     */
    RDateTime findSharedFileID() {
        return new ImageManager().getイメージ情報(div.getShinseishoKanriNo()).getイメージ共有ファイルID();
    }

    /**
     * 初期化します。
     *
     * @param directoryPath イメージが展開されたフォルダのパス
     */
    void initialize(RString directoryPath) {
        div.setDirectoryPath(directoryPath);
        getBehaviorIn(div.getOperation(), div).initialize();
    }

    /**
     * {@link TokkiImagesPerChosaDiv}の処理モード毎の振る舞いを取得します。
     *
     * @param op 処理
     * @param div 対象の{@link TokkiImagesPerChosaDiv}のインスタンス
     * @return 振る舞い
     */
    private static TokkiImagesPerChosaDivBehavior getBehaviorIn(Operation op, TokkiImagesPerChosaDiv div) {
        switch (op) {
            case 修正:
                return new ModifingMode(div);
            default:
                return new ReferringMode(div);
        }
    }

    /**
     * 選択された特記事項について画面描画を行います。
     */
    void renderSelectedTokkiJiko() {
        getBehaviorIn(div.getOperation(), div).renderSelectedTokkiJiko();
    }

    /**
     * 指定のディレクトリのイメージを使って、再描画します。
     *
     * @param directoryPath イメージが展開されたフォルダのパス
     */
    void refresh(RString directoryPath) {
        div.setDirectoryPath(directoryPath);
        renderSelectedTokkiJiko();
    }

    //<editor-fold defaultstate="collapsed" desc="private static class ControlsForEdit {...}">
    private static class ControlsForEdit {

        private final DropDownList ddlTokkiJikoNos;
        private final Button btnToDisplay;
        private final Button btnSave;

        private ControlsForEdit(TokkiImagesPerChosaDiv div) {
            this.ddlTokkiJikoNos = div.getDdlTokkiJikoNos();
            this.btnToDisplay = div.getBtnToDisplay();
            this.btnSave = div.getBtnSave();
        }

        void setDisplayNone(boolean displayNone) {
            this.ddlTokkiJikoNos.setDisplayNone(displayNone);
            this.btnToDisplay.setDisplayNone(displayNone);
            this.btnSave.setDisplayNone(displayNone);
        }

        void setDisabled(boolean disabled) {
            this.ddlTokkiJikoNos.setDisabled(disabled);
            this.btnToDisplay.setDisabled(disabled);
            this.btnSave.setDisabled(disabled);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="private static abstract class TokkiImagesPerChosaDivBehavior {...}">
    private static abstract class TokkiImagesPerChosaDivBehavior {

        protected final TokkiImagesPerChosaDiv div;
        private final ControlsForEdit cfe;

        protected TokkiImagesPerChosaDivBehavior(TokkiImagesPerChosaDiv div) {
            this.div = div;
            this.cfe = new ControlsForEdit(div);
        }

        protected final NinteichosahyoTokkijikos findNinteiChosaTokkiJikos() {
            return NinteichosahyoTokkijikoManager
                    .createInstance()
                    .find特記事項s(
                            div.getShinseishoKanriNo(),
                            div.getNinteichosaIraiRirekiNo(),
                            TokkijikoTextImageKubun.イメージ
                    );
        }

        protected ControlsForEdit controlsForEdit() {
            return this.cfe;
        }

        protected abstract void initialize();

        protected void renderSelectedTokkiJiko() {
        }
    }
    //</editor-fold>

    private static class ModifingMode extends TokkiImagesPerChosaDivBehavior {

        private static final Operation OPERATION = Operation.修正;

        protected ModifingMode(TokkiImagesPerChosaDiv div) {
            super(div);
        }

        @Override
        protected void initialize() {
            controlsForEdit().setDisplayNone(false);

            final NinteichosahyoTokkijikos nts = findNinteiChosaTokkiJikos();
            final List<KeyValueDataSource> dataSource = createDataSource(nts);
            div.getDdlTokkiJikoNos().setDataSource(dataSource);
            if (dataSource.isEmpty()) {
                controlsForEdit().setDisabled(true);
                div.getRepTokkiJikos().setDisplayNone(true);
                return;
            }
            RString key = dataSource.get(0).getKey();
            div.getDdlTokkiJikoNos().setSelectedKey(key);
            ITokkiImagesPerKomokuDiv komoku = div.getRepTokkiJikos().getNewRepeatControlInstance();
            komoku.initialize(
                    div.getDirectoryPath(),
                    nts,
                    NinteiChosaTokkiJikou.getEnumByDbt5205認定調査特記事項番号(key),
                    OPERATION
            );
            div.getRepTokkiJikos().getRepeateData().add(0, komoku);
        }

        private static List<KeyValueDataSource> createDataSource(NinteichosahyoTokkijikos nts) {
            Map<RString, RString> map = new HashMap<>();
            for (NinteichosahyoTokkijiko n : nts) {
                NinteiChosaTokkiJikou tokki = n.getTokkiJiko();
                RString tokkiNo = tokki.get認定調査票_特記情報_認定調査特記事項番号();
                map.put(tokkiNo, new RStringBuilder().append(tokkiNo).append(RString.HALF_SPACE).append(tokki.get特記事項名()).toRString());
            }
            List<KeyValueDataSource> list = KeyValueDataSourceConverter.getDataSource(map);
            Collections.sort(list, VALUE_ASC);
            return list;
        }

        @Override
        protected void renderSelectedTokkiJiko() {
            RString key = div.getDdlTokkiJikoNos().getSelectedKey();
            ITokkiImagesPerKomokuDiv komoku = div.getRepTokkiJikos().getNewRepeatControlInstance();
            komoku.initialize(
                    div.getDirectoryPath(),
                    findNinteiChosaTokkiJikos(),
                    NinteiChosaTokkiJikou.getEnumByDbt5205認定調査特記事項番号(key),
                    OPERATION
            );
            div.getRepTokkiJikos().getRepeateData().add(0, komoku);
        }
    }

    private static class ReferringMode extends TokkiImagesPerChosaDivBehavior {

        private static final Operation OPERATION = Operation.照会;

        private ReferringMode(TokkiImagesPerChosaDiv div) {
            super(div);
        }

        @Override
        protected void initialize() {
            controlsForEdit().setDisplayNone(true);
            final RString directoryPath = div.getDirectoryPath();
            final NinteichosahyoTokkijikos nts = findNinteiChosaTokkiJikos();
            for (NinteiChosaTokkiJikou t : NinteiChosaTokkiJikou.values()) {
                NinteichosahyoTokkijikos filterd = nts.tokkiJiko(t);
                if (filterd.isEmpty()) {
                    continue;
                }
                ITokkiImagesPerKomokuDiv komoku = div.getRepTokkiJikos().getNewRepeatControlInstance();
                komoku.initialize(directoryPath, nts, t, OPERATION);
                div.getRepTokkiJikos().getRepeateData().add(komoku);
            }
            div.getRepTokkiJikos().getRepeateData().remove(0);
        }
    }
}
