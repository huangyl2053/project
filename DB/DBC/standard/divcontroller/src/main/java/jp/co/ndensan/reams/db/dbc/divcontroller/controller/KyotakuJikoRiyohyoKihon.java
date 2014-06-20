/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller;

import java.util.HashMap;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.DBC0120000.KyotakuJikoRiyohyoKihonDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.KaigoShikakuKihonDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.ControlGenerator;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.ur.ura.divcontroller.controller.AtenaShokaiSimple;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * @author N8187 久保田 英男
 */
public class KyotakuJikoRiyohyoKihon {

    private List<HashMap> getYaml() {
        return YamlLoader.DBC.loadAsList(new RString("dbc0100000/KyotakuKeikakuTodokedeDetail.yml"));
    }

    /**
     * 画面ロード時の処理です。
     *
     * @param panel 居宅サービス計画作成依頼届出
     * @return ResponseData
     */
    public ResponseData onLoad(KyotakuJikoRiyohyoKihonDiv panel) {
        ResponseData<KyotakuJikoRiyohyoKihonDiv> response = new ResponseData<>();
        setAtenaData(panel);
        setKihonData(panel);
        response.data = panel;
        return response;
    }

    private void setAtenaData(KyotakuJikoRiyohyoKihonDiv panel) {
        ControlGenerator cg = new ControlGenerator(getYaml().get(0));
        AtenaShokaiSimple.setData(panel.getKyotakuJikoRiyohyoKihonAtena().getAtenaInfo(),
                new ShikibetsuCode(cg.getAsRString("識別コード")));
    }

    private void setKihonData(KyotakuJikoRiyohyoKihonDiv panel) {
        ControlGenerator cg = new ControlGenerator(getYaml().get(1));
        KaigoShikakuKihonDiv kihon = panel.getKyotakuJikoRiyohyoKaigoKihon();
        kihon.getTxtHihokenshaNo().setValue(cg.getAsRString("被保番号"));
        kihon.getTxtShikakuJotai().setValue(cg.getAsRString("資格状態"));
        kihon.getTxtShutokuYmd().setValue(cg.getAsRDate("取得日"));
        kihon.getTxtSoshitsuYmd().setValue(cg.getAsRDate("喪失日"));
        kihon.getTxtShutokuJiyu().setValue(cg.getAsRString("取得事由"));
        kihon.getTxtSoshitsuJiyu().setValue(cg.getAsRString("喪失事由"));
        kihon.getTxtJutokuTekiyo().setValue(cg.getAsRDate("住特開始"));
        kihon.getTxtJutokuKaijo().setValue(cg.getAsRDate("住特終了"));
        kihon.getTxtYokaigoJotaiKubun().setValue(cg.getAsRString("要介護度"));
        kihon.getTxtNinteiKikan().setFromValue(cg.getAsRDate("認定開始日"));
        kihon.getTxtNinteiKikan().setToValue(cg.getAsRDate("認定終了日"));
        kihon.getTxtKyuSochiNyusho().setValue(cg.getAsRString("旧措置入所"));
    }
}
