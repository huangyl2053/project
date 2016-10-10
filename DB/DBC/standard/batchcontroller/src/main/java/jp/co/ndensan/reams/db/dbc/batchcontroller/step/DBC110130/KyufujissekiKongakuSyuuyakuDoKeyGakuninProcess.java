/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC110130;

import jp.co.ndensan.reams.db.dbc.definition.message.DbcErrorMessages;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kyufujissekikogakukaigoservicehi.DbWT1132KyufujissekiKogakuKaigoServicehiTempEntity;
import jp.co.ndensan.reams.uz.uza.batch.BatchInterruptedException;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 保険者保有給付実績情報作成のバッチ給付実績高額一時データの集約の不正データ確認同一キーが３件以上Processです。
 *
 * @reamsid_L DBC-2460-010 gongliang
 */
public class KyufujissekiKongakuSyuuyakuDoKeyGakuninProcess extends BatchProcessBase<DbWT1132KyufujissekiKogakuKaigoServicehiTempEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.hokenshakyufujisseki."
            + "IHokenshaKyufujissekiMapper.get集約_高額対象データ_3件以上");
    private static final RString 同一キーMESSAGE = new RString("【整理番号：入力識別番号：被保険者番号：サービス提供年月】");
    private static final RString コロン = new RString(":");
    private static final RString 改行 = new RString("\n");

    private RString 同一キーmessagges;

    @Override
    protected void initialize() {
        同一キーmessagges = RString.EMPTY;
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID);
    }

    @Override
    protected void process(DbWT1132KyufujissekiKogakuKaigoServicehiTempEntity entity) {
        同一キーmessagges = getMessage(同一キーmessagges, entity);
    }

    @Override
    protected void afterExecute() {
        if (!同一キーmessagges.isEmpty()) {
            throw new BatchInterruptedException(
                    DbcErrorMessages.給付実績_同一キーが３件以上.getMessage().replace(同一キーmessagges.toString()).evaluate());
        }
    }

    private RString getMessage(RString message, DbWT1132KyufujissekiKogakuKaigoServicehiTempEntity dbWT1132ErrorEntity) {
        RString 入力識別番号 = dbWT1132ErrorEntity.getInputShikibetsuNo() == null
                ? RString.EMPTY : dbWT1132ErrorEntity.getInputShikibetsuNo().getColumnValue();
        RString 被保険者番号 = dbWT1132ErrorEntity.getHiHokenshaNo() == null
                ? RString.EMPTY : dbWT1132ErrorEntity.getHiHokenshaNo().getColumnValue();
        RString サービス提供年月 = dbWT1132ErrorEntity.getServiceTeikyoYM() == null
                ? RString.EMPTY : dbWT1132ErrorEntity.getServiceTeikyoYM().toDateString();
        message = message.concat(同一キーMESSAGE)
                .concat(RString.FULL_SPACE)
                .concat(dbWT1132ErrorEntity.getKanriNo()).concat(コロン)
                .concat(入力識別番号).concat(コロン)
                .concat(被保険者番号).concat(コロン)
                .concat(サービス提供年月).concat(改行);
        return message;
    }
}
