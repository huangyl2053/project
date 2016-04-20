/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.entity.basic.helper;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5129TennyuShiboEntity;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 転入・死亡情報エンティティのテスト用インスタンスを作成する補助クラスです。
 */
public final class DbT5129TennyuShiboEntityGenerator {

    public static final ShinseishoKanriNo DEFAULT_申請書管理番号 = new ShinseishoKanriNo("1");
    public static final FlexibleDate DEFAULT_二次判定年月日 = new FlexibleDate("20150402");
    public static final Code DEFAULT_二次判定要介護状態区分コード = new Code("1");
    public static final int DEFAULT_二次判定認定有効期間 = 1;
    public static final FlexibleDate DEFAULT_二時判定認定有効開始年月日 = new FlexibleDate("20150402");
    public static final FlexibleDate DEFAULT_二時判定認定有効終了年月日 = new FlexibleDate("20150402");
    public static final RString DEFAULT_介護認定審査会開催番号 = new RString("1");
    public static final RString DEFAULT_介護認定審査会意見 = new RString("1");
    public static final RString DEFAULT_一次判定結果変更理由 = new RString("1");
    public static final Code DEFAULT_要介護状態像例コード = new Code("1");
    public static final RString DEFAULT_認定審査会意見種類 = new RString("1");
    public static final RString DEFAULT_審査会メモ = new RString("1");
    public static final Code DEFAULT_二次判定結果入力方法 = new Code("1");
    public static final FlexibleDate DEFAULT_二次判定結果入力年月日 = new FlexibleDate("20150402");

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private DbT5129TennyuShiboEntityGenerator() {
    }

    public static DbT5129TennyuShiboEntity createDbT5129TennyuShiboEntity() {
        DbT5129TennyuShiboEntity entity = new DbT5129TennyuShiboEntity();
        entity.setShinseishoKanriNo(DEFAULT_申請書管理番号);
        entity.setNijiHanteiYMD(DEFAULT_二次判定年月日);
        entity.setNijiHanteiYokaigoJotaiKubunCode(DEFAULT_二次判定要介護状態区分コード);
        entity.setNijiHanteiNinteiYukoKikan(DEFAULT_二次判定認定有効期間);
        entity.setNijiHanteiNinteiYukoKaishiYMD(DEFAULT_二時判定認定有効開始年月日);
        entity.setNijiHanteiNinteiYukoShuryoYMD(DEFAULT_二時判定認定有効終了年月日);
        entity.setShinsakaiKaisaiNo(DEFAULT_介護認定審査会開催番号);
        entity.setShinsakaiIken(DEFAULT_介護認定審査会意見);
        entity.setIchijiHanteiKekkaHenkoRiyu(DEFAULT_一次判定結果変更理由);
        entity.setYokaigoJotaizoReiCode(DEFAULT_要介護状態像例コード);
        entity.setNinteishinsakaiIkenShurui(DEFAULT_認定審査会意見種類);
        entity.setShinsakaiMemo(DEFAULT_審査会メモ);
        entity.setNijiHanteiKekkaInputHoho(DEFAULT_二次判定結果入力方法);
        entity.setNijiHanteiKekkaInputYMD(DEFAULT_二次判定結果入力年月日);
        return entity;
    }
}