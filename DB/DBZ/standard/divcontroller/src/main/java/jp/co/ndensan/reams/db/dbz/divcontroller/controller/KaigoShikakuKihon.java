/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.divcontroller.controller;

import java.util.HashMap;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.KaigoAtenaInfoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.KaigoShikakuKihonDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.ControlGenerator;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.ur.ura.divcontroller.controller.AtenaShokaiSimple;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * @author N3317 塚田 萌
 */
public class KaigoShikakuKihon {

    public static void setData(KaigoAtenaInfoDiv atenaDiv, KaigoShikakuKihonDiv kaigoDiv, ShikibetsuCode 識別コード, int rowId) {
        AtenaShokaiSimple.setData(atenaDiv.getAtenaInfo(), 識別コード);

        List<HashMap> targetSource = YamlLoader.DBZ.loadAsList(new RString("KaigoShikakuKihon.yml"));
        ControlGenerator cg = new ControlGenerator(targetSource.get(rowId));

        kaigoDiv.getTxtHihokenshaNo().setValue(cg.getAsRString("被保番号"));
        kaigoDiv.getTxtShikakuJotai().setValue(cg.getAsRString("資格状態"));
        kaigoDiv.getTxtShutokuYmd().setValue(cg.getAsRDate("取得日"));
        kaigoDiv.getTxtSoshitsuYmd().setValue(cg.getAsRDate("喪失日"));
        kaigoDiv.getTxtShutokuJiyu().setValue(cg.getAsRString("取得事由"));
        kaigoDiv.getTxtSoshitsuJiyu().setValue(cg.getAsRString("喪失事由"));
        kaigoDiv.getTxtJutokuTekiyo().setValue(cg.getAsRDate("住特開始"));
        kaigoDiv.getTxtJutokuKaijo().setValue(cg.getAsRDate("住特終了"));
        kaigoDiv.getTxtYokaigoJotaiKubun().setValue(cg.getAsRString("要介護度"));
        kaigoDiv.getTxtNinteiKikan().setFromValue(cg.getAsRDate("認定開始日"));
        kaigoDiv.getTxtNinteiKikan().setToValue(cg.getAsRDate("認定終了日"));
        kaigoDiv.getTxtKyuSochiNyusho().setValue(cg.getAsRString("旧措置入所"));
    }
}
