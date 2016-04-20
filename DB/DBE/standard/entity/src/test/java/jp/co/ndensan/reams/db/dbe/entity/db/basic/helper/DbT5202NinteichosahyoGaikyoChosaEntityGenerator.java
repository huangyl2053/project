/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.basic.helper;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5202NinteichosahyoGaikyoChosaEntity;
import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 認定調査票（概況調査）エンティティのテスト用インスタンスを作成する補助クラスです。
 */
public final class DbT5202NinteichosahyoGaikyoChosaEntityGenerator {

    public static final ShinseishoKanriNo DEFAULT_申請書管理番号 = new ShinseishoKanriNo("1");
    public static final int DEFAULT_認定調査依頼履歴番号 = 1;
    public static final Code DEFAULT_厚労省IF識別コード = new Code("09A");
    public static final Code DEFAULT_認定調査依頼区分コード = new Code("0");
    public static final int DEFAULT_認定調査回数 = 1;
    public static final FlexibleDate DEFAULT_認定調査実施年月日 = new FlexibleDate("20140402");
    public static final FlexibleDate DEFAULT_認定調査受領年月日 = new FlexibleDate("20140402");
    public static final Code DEFAULT_調査委託区分コード = new Code("1");
    public static final Code DEFAULT_認定調査区分コード = new Code("0");
    public static final JigyoshaNo DEFAULT_認定調査委託先コード = new JigyoshaNo("1");
    public static final RString DEFAULT_認定調査員コード = new RString("1");
    public static final Code DEFAULT_認定調査実施場所コード = new Code("1");
    public static final RString DEFAULT_認定調査実施場所名称 = new RString("認定調査実施場所名称");
    public static final RDateTime DEFAULT_実施場所イメージ共有ファイルID = RDateTime.of(2014, 04, 02, 10, 00, 00);
    public static final Code DEFAULT_認定調査_サービス区分コード = new Code("1");
    public static final RString DEFAULT_利用施設名 = new RString("利用施設名");
    public static final RString DEFAULT_利用施設住所 = new RString("長野市県町");
    public static final RString DEFAULT_利用施設電話番号 = new RString("1234567890");
    public static final YubinNo DEFAULT_利用施設郵便番号 = new YubinNo("3801111");
    public static final RDateTime DEFAULT_利用施設名イメージ共有ファイルID = RDateTime.of(2014, 04, 02, 10, 00, 00);
    public static final RDateTime DEFAULT_利用施設住所イメージ共有ファイルID = RDateTime.of(2014, 04, 02, 10, 00, 00);
    public static final RDateTime DEFAULT_利用施設電話番号イメージ共有ファイルID = RDateTime.of(2014, 04, 02, 10, 00, 00);
    public static final RString DEFAULT_特記 = new RString("1");
    public static final RDateTime DEFAULT_特記イメージ共有ファイルID = RDateTime.of(2014, 04, 02, 10, 00, 00);
    public static final FlexibleDate DEFAULT_認定調査特記事項受付年月日 = new FlexibleDate("20140402");
    public static final FlexibleDate DEFAULT_認定調査特記事項受領年月日 = new FlexibleDate("20140402");

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private DbT5202NinteichosahyoGaikyoChosaEntityGenerator() {
    }

    public static DbT5202NinteichosahyoGaikyoChosaEntity createDbT5202NinteichosahyoGaikyoChosaEntity() {
        DbT5202NinteichosahyoGaikyoChosaEntity entity = new DbT5202NinteichosahyoGaikyoChosaEntity();
        entity.setShinseishoKanriNo(DEFAULT_申請書管理番号);
        entity.setNinteichosaRirekiNo(DEFAULT_認定調査依頼履歴番号);
        entity.setKoroshoIfShikibetsuCode(DEFAULT_厚労省IF識別コード);
        entity.setNinteichousaIraiKubunCode(DEFAULT_認定調査依頼区分コード);
        entity.setNinteichosaIraiKaisu(DEFAULT_認定調査回数);
        entity.setNinteichosaJisshiYMD(DEFAULT_認定調査実施年月日);
        entity.setNinteichosaJuryoYMD(DEFAULT_認定調査受領年月日);
        entity.setNinteiChosaKubunCode(DEFAULT_認定調査区分コード);
        entity.setChosaItakusakiCode(DEFAULT_認定調査委託先コード);
        entity.setChosainCode(DEFAULT_認定調査員コード);
        entity.setChosaJisshiBashoCode(DEFAULT_認定調査実施場所コード);
        entity.setChosaJisshiBashoMeisho(DEFAULT_認定調査実施場所名称);
        entity.setServiceKubunCode(DEFAULT_認定調査_サービス区分コード);
        entity.setRiyoShisetsuShimei(DEFAULT_利用施設名);
        entity.setRiyoShisetsuJusho(DEFAULT_利用施設住所);
        entity.setRiyoShisetsuTelNo(DEFAULT_利用施設電話番号);
        entity.setRiyoShisetsuYubinNo(DEFAULT_利用施設郵便番号);
        entity.setTokki(DEFAULT_特記);
        entity.setTokkijikoUketsukeYMD(DEFAULT_認定調査特記事項受付年月日);
        entity.setTokkijikoJuryoYMD(DEFAULT_認定調査特記事項受領年月日);
        return entity;
    }
}