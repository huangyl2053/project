/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.entity.basic.helper;

import jp.co.ndensan.reams.db.dbz.entity.basic.DbT1002TekiyoJogaishaEntity;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.code.KaigoJogaiTekiyoJiyu;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.code.KaigoJogaiKaijoJiyu;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 適用除外者エンティティのテスト用インスタンスを作成する補助クラスです。
 *
 * @author n8178 城間篤人
 */
public final class DbT1002TekiyoJogaishaEntityGenerator {

    public static final LasdecCode DEFAULT_市町村コード = new LasdecCode("000010");
    public static final ShikibetsuCode DEFAULT_識別コード = new ShikibetsuCode("000010000100001");
    public static final FlexibleDate DEFAULT_異動日 = new FlexibleDate("20140402");
    public static final RString DEFAULT_枝番 = new RString("1");
    public static final RString DEFAULT_異動事由コード = new RString("1");
    public static final KaigoJogaiTekiyoJiyu DEFAULT_適用除外適用事由コード = new KaigoJogaiTekiyoJiyu(new Code("31"));
    public static final FlexibleDate DEFAULT_適用年月日 = new FlexibleDate("20160712");
    public static final FlexibleDate DEFAULT_適用届出年月日 = new FlexibleDate("20160712");
    public static final FlexibleDate DEFAULT_適用受付年月日 = new FlexibleDate("20160712");
    public static final KaigoJogaiKaijoJiyu DEFAULT_適用除外解除事由コード = new KaigoJogaiKaijoJiyu(new Code("81"));
    public static final FlexibleDate DEFAULT_解除年月日 = new FlexibleDate("20170130");
    public static final FlexibleDate DEFAULT_解除届出年月日 = new FlexibleDate("20170130");
    public static final FlexibleDate DEFAULT_解除受付年月日 = new FlexibleDate("20170130");
    public static final FlexibleDate DEFAULT_入所通知発行日 = new FlexibleDate("20160713");
    public static final FlexibleDate DEFAULT_退所通知発行日 = new FlexibleDate("20170202");
    public static final FlexibleDate DEFAULT_変更通知発行日 = new FlexibleDate("20161201");

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private DbT1002TekiyoJogaishaEntityGenerator() {
    }

    public static DbT1002TekiyoJogaishaEntity createDbT1002TekiyoJogaishaEntity() {
        DbT1002TekiyoJogaishaEntity entity = new DbT1002TekiyoJogaishaEntity();
        entity.setShichosonCode(DEFAULT_市町村コード);
        entity.setShikibetsuCode(DEFAULT_識別コード);
        entity.setIdoYMD(DEFAULT_異動日);
        entity.setEdaNo(DEFAULT_枝番);
        entity.setIdoJiyuCode(DEFAULT_異動事由コード);
        entity.setTekiyoJogaiTekiyoJiyuCode(DEFAULT_適用除外適用事由コード);
        entity.setTekiyoYMD(DEFAULT_適用年月日);
        entity.setTekiyoTodokedeYMD(DEFAULT_適用届出年月日);
        entity.setTekiyoUketsukeYMD(DEFAULT_適用受付年月日);
        entity.setTekiyoJogaikaijokaijoJiyuCode(DEFAULT_適用除外解除事由コード);
        entity.setKaijoYMD(DEFAULT_解除年月日);
        entity.setKaijoTodokedeYMD(DEFAULT_解除届出年月日);
        entity.setKaijoUketsukeYMD(DEFAULT_解除受付年月日);
        entity.setNyushoTsuchiHakkoYMD(DEFAULT_入所通知発行日);
        entity.setTaishoTsuchiHakkoYMD(DEFAULT_退所通知発行日);
        entity.setHenkoTsuchiHakkoYMD(DEFAULT_変更通知発行日);
        return entity;
    }
}
