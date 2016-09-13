/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.processprm.itizihanteishori;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.itizihanteishori.ItziHanteiShoriMybitisParamter;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * バッチ設計_DBE309000_一次判定処理のバッチ処理クラスです。
 *
 * @reamsid_L DBE-1470-020 wanghui
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@Getter
@Setter
public class ItziHanteiShoriProcessParamter implements IBatchProcessParameter {

    private final List<RString> shinseishoKanriNoList;
    private final RString battishuturyokukubun;
    private RString イメージ区分;
    private final RDateTime fileId;

    /**
     * コンストラクタです。
     *
     * @param 申請書管理番号リスト List<RString>
     * @param battishuturyokukubun RString
     * @param fileId RDateTime
     */
    public ItziHanteiShoriProcessParamter(
            List<RString> 申請書管理番号リスト,
            RString battishuturyokukubun,
            RDateTime fileId) {
        this.shinseishoKanriNoList = 申請書管理番号リスト;
        this.battishuturyokukubun = battishuturyokukubun;
        this.fileId = fileId;
    }

    /**
     * mybatisのパラメータを生成します。
     *
     * @return ItziHanteiShoriMybitisParamter
     */
    public ItziHanteiShoriMybitisParamter toItziHanteiShoriMybitisParamter() {
        return ItziHanteiShoriMybitisParamter.createParam(shinseishoKanriNoList,
                battishuturyokukubun,
                イメージ区分);
    }
}