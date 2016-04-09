/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.business.report.hihokenshadaicho;

import jp.co.ndensan.reams.db.dba.entity.db.relate.hihokenshadaichosakusei.HihokenshaDaichoDivisionEntity;
import jp.co.ndensan.reams.db.dba.entity.report.hihokenshadaicho.HihokenshaDaichoReportSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 被保険者台帳_資格移動情報のEditorです。
 *
 * @reamsid_L DBA-0500-040 zuotao
 */
public class HihokenshaDaichoShikakuIdoEditor implements IHihokenshaDaichoEditor {

    private final HihokenshaDaichoDivisionEntity entity;
    private final int index;

    /**
     * コンストラクタです。
     *
     * @param entity 資格移動情報のエンティティクラス
     * @param index Index
     */
    public HihokenshaDaichoShikakuIdoEditor(HihokenshaDaichoDivisionEntity entity, int index) {
        this.entity = entity;
        this.index = index;
    }

    /**
     * 被保険者台帳ReportSourceを作成します。
     *
     * @param source 被保険者台帳ReportSource
     * @return 被保険者台帳ReportSource
     */
    @Override
    public HihokenshaDaichoReportSource edit(HihokenshaDaichoReportSource source) {
        if (entity == null || entity.get資格異動No().size() < index) {
            return source;
        }
        return editBody(source);
    }

    private HihokenshaDaichoReportSource editBody(HihokenshaDaichoReportSource source) {
        source.listShikakuIdo_1 = entity.get資格異動No().get(index);
        source.listShikakuIdo_2 = entity.get取得日().get(index);
        source.listShikakuIdo_3 = entity.get取得事由コード().get(index);
        source.listShikakuIdo_4 = entity.get取得事由名称().get(index);
        source.listShikakuIdo_5 = entity.get一号取得日().get(index);
        source.listShikakuIdo_6 = entity.get喪失日().get(index);
        source.listShikakuIdo_7 = entity.get喪失事由コード().get(index);
        source.listShikakuIdo_8 = entity.get喪失事由名称().get(index);
        source.listShikakuIdo_9 = entity.get資格区分().get(index);
        source.listShikakuIdo_10 = entity.get変更日().get(index);
        source.listShikakuIdo_11 = entity.get変更事由コード().get(index);
        source.listShikakuIdo_12 = entity.get変更事由名称().get(index);
        source.listShikakuIdo_13 = entity.get住特適用日().get(index);
        source.listShikakuIdo_14 = entity.get住特適用日().get(index);
        source.listShikakuIdo_15 = entity.get措置保険者().get(index) == null ? RString.EMPTY : entity.get措置保険者().get(index).value();
        source.listShikakuIdo_16 = entity.get旧保険者().get(index) == null ? RString.EMPTY : entity.get旧保険者().get(index).value();
        return source;
    }
}
