/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.divcontroller.handler.parentdiv.DBD1090001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.futangendogakunintei.FutanGendogakuNintei;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.GemmenGengakuShurui;
import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.relate.futangendogakunintei.FutanGendogakuNinteiParameter;
import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD1090001.FutanGendogakuNinteiKousinTsuchisyoKobetHakkoDiv;
import jp.co.ndensan.reams.db.dbd.entity.db.basic.DbT4018KaigoHokenFutanGendogakuNinteiEntity;
import jp.co.ndensan.reams.db.dbd.service.core.futangendogakunintei.FutanGendogakuNinteiKanshoTsuchisho;
import jp.co.ndensan.reams.db.dbd.service.core.gemmengengaku.futangendogakunintei.FutanGendogakuNinteiManager;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 負担限度額認定更新のお知らせ通知書個別発行のHandlerクラスです。
 *
 * @reamsid_L DBD-3570-010 wangchao
 */
public class FutanGendogakuNinteiKousinTsuchisyoKobetHakkoHandler {

    private final FutanGendogakuNinteiKousinTsuchisyoKobetHakkoDiv div;

    /**
     * コンストラクタです。
     *
     * @param div 負担限度額認定更新のお知らせ通知書個別発行のコントロールdiv
     */
    public FutanGendogakuNinteiKousinTsuchisyoKobetHakkoHandler(FutanGendogakuNinteiKousinTsuchisyoKobetHakkoDiv div) {
        this.div = div;
    }

    /**
     * 初期化の処理です。
     *
     * @param 被保険者番号 被保険者番号
     * @param 識別コード 識別コード
     * @return
     */
    public boolean initialize(HihokenshaNo 被保険者番号, ShikibetsuCode 識別コード) {

        // 発行帳票グリッドの作成
        FutanGendogakuNinteiKanshoTsuchisho futanGendogakuNinteiKanshoTsuchisho = FutanGendogakuNinteiKanshoTsuchisho.createInstance();
        List<DbT4018KaigoHokenFutanGendogakuNinteiEntity> dbT4018EntityList = futanGendogakuNinteiKanshoTsuchisho.selectCount(被保険者番号, 識別コード);
        if (dbT4018EntityList.isEmpty()) {
            return false;
        }
        // 業務概念「介護負担限度額認定の情報」を取得する
        FutanGendogakuNinteiManager futanGendogakuNinteiManager = FutanGendogakuNinteiManager.createInstance();
        FutanGendogakuNinteiParameter parameter
                = FutanGendogakuNinteiParameter.createSelectParam(GemmenGengakuShurui.負担限度額認定.getコード(), 被保険者番号);
        ArrayList<FutanGendogakuNintei> 介護保険負担限度額認定List = futanGendogakuNinteiManager.get負担限度額認定画面用リスト(parameter);
        ViewStateHolder.put(介護保険負担限度額認定.リストキー, 介護保険負担限度額認定List);
        return true;
    }

    /**
     * 介護保険負担限度額認定のenumクラスです。
     */
    public enum 介護保険負担限度額認定 {

        リストキー;
    }
}
