/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.jyuryoitakukeiyakukakuninshokeiyaku;

import jp.co.ndensan.reams.db.dbc.entity.report.source.jyuryoitakukeiyakukakuninshokeiyaku.JyuryoItakuKeiyakuKakuninShoKeiyakuJigyoshayoSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 帳票設計_DBCMN31003_介護保険受領委任契約承認（不承認）確認書（事業者用）Builder
 *
 * @reamsid_L DBC-2130-060 liuxiaoyu
 */
public class JyuryoItakuKeiyakuKakuninShoKeiyakuBuilder
        implements IJyuryoItakuKeiyakuKakuninShoKeiyakuBuilder {

    private final IJyuryoItakuKeiyakuKakuninShoKeiyakuEditor bodyEditor;

    /**
     * コンストラクタです
     *
     * @param bodyEditor BodyEditor
     */
    public JyuryoItakuKeiyakuKakuninShoKeiyakuBuilder(
            IJyuryoItakuKeiyakuKakuninShoKeiyakuEditor bodyEditor) {
        this.bodyEditor = bodyEditor;
    }

    @Override
    public JyuryoItakuKeiyakuKakuninShoKeiyakuJigyoshayoSource build() {
        return ReportEditorJoiner.from(new JyuryoItakuKeiyakuKakuninShoKeiyakuJigyoshayoSource())
                .join(bodyEditor).buildSource();
    }
}
