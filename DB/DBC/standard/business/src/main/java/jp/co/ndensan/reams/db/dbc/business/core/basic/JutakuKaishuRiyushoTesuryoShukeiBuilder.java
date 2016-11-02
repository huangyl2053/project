/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * {@link JutakuKaishuRiyushoTesuryoShukei}の編集を行うビルダークラスです。
 */
public class JutakuKaishuRiyushoTesuryoShukeiBuilder {

    private final DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity entity;
    private final JutakuKaishuRiyushoTesuryoShukeiIdentifier id;

    /**
     * {@link DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity}より{@link JutakuKaishuRiyushoTesuryoShukei}の編集用Builderクラスを生成します。
     *
     * @param entity {@link DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity}
     * @param id {@link JutakuKaishuRiyushoTesuryoShukeiIdentifier}
     *
     */
    JutakuKaishuRiyushoTesuryoShukeiBuilder(
            DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity entity,
            JutakuKaishuRiyushoTesuryoShukeiIdentifier id
    ) {
        this.entity = entity.clone();
        this.id = id;

    }

//TODO Key項目のsetterメソッドは削除してください。
//TODO 一緒に置換される値のまとまりで不変なクラスを作成し、その単位でsetterを作る様に見直してください。
    /**
     * 証記載保険者番号を設定します。
     *
     * @param 証記載保険者番号 証記載保険者番号
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set証記載保険者番号(HokenshaNo 証記載保険者番号) {
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        entity.setShoKisaiHokenshaNo(証記載保険者番号);
        return this;
    }

    /**
     * 集計開始年月を設定します。
     *
     * @param 集計開始年月 集計開始年月
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set集計開始年月(FlexibleYearMonth 集計開始年月) {
        requireNonNull(集計開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage("集計開始年月"));
        entity.setShukeiKaishiYM(集計開始年月);
        return this;
    }

    /**
     * 履歴番号を設定します。
     *
     * @param 履歴番号 履歴番号
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set履歴番号(Decimal 履歴番号) {
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));
        entity.setRirekiNo(履歴番号.intValue());
        return this;
    }

    /**
     * 集計終了年月を設定します。
     *
     * @param 集計終了年月 集計終了年月
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set集計終了年月(FlexibleYearMonth 集計終了年月) {
        requireNonNull(集計終了年月, UrSystemErrorMessages.値がnull.getReplacedMessage("集計終了年月"));
        entity.setShukeiShuryoYM(集計終了年月);
        return this;
    }

    /**
     * 介護住宅改修理由書作成事業者番号を設定します。
     *
     * @param 介護住宅改修理由書作成事業者番号 介護住宅改修理由書作成事業者番号
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set介護住宅改修理由書作成事業者番号(JigyoshaNo 介護住宅改修理由書作成事業者番号) {
        requireNonNull(介護住宅改修理由書作成事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("介護住宅改修理由書作成事業者番号"));
        entity.setRiyushoSakuseiJigyoshaNo(介護住宅改修理由書作成事業者番号);
        return this;
    }

    /**
     * 介護住宅改修理由書作成件数を設定します。
     *
     * @param 介護住宅改修理由書作成件数 介護住宅改修理由書作成件数
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set介護住宅改修理由書作成件数(Decimal 介護住宅改修理由書作成件数) {
        requireNonNull(介護住宅改修理由書作成件数, UrSystemErrorMessages.値がnull.getReplacedMessage("介護住宅改修理由書作成件数"));
        entity.setRiyushoSakuseiKensu(介護住宅改修理由書作成件数);
        return this;
    }

    /**
     * 介護住宅改修理由書作成単価を設定します。
     *
     * @param 介護住宅改修理由書作成単価 介護住宅改修理由書作成単価
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set介護住宅改修理由書作成単価(Decimal 介護住宅改修理由書作成単価) {
        requireNonNull(介護住宅改修理由書作成単価, UrSystemErrorMessages.値がnull.getReplacedMessage("介護住宅改修理由書作成単価"));
        entity.setRiyushoSakuseiTanka(介護住宅改修理由書作成単価);
        return this;
    }

    /**
     * 介護住宅改修理由書作成請求金額を設定します。
     *
     * @param 介護住宅改修理由書作成請求金額 介護住宅改修理由書作成請求金額
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set介護住宅改修理由書作成請求金額(Decimal 介護住宅改修理由書作成請求金額) {
        requireNonNull(介護住宅改修理由書作成請求金額, UrSystemErrorMessages.値がnull.getReplacedMessage("介護住宅改修理由書作成請求金額"));
        entity.setRiyushoSakuseiSeikyuKingaku(介護住宅改修理由書作成請求金額);
        return this;
    }

    /**
     * 介護住宅改修理由書作成申請年月日を設定します。
     *
     * @param 申請年月日 申請年月日
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set申請年月日(FlexibleDate 申請年月日) {
        requireNonNull(申請年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("申請年月日"));
        entity.setShinseiYMD(申請年月日);
        return this;
    }

    /**
     * 受付年月日を設定します。
     *
     * @param 受付年月日 受付年月日
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set受付年月日(FlexibleDate 受付年月日) {
        requireNonNull(受付年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("受付年月日"));
        entity.setUketsukeYMD(受付年月日);
        return this;
    }

    /**
     * 介護支払方法区分を設定します。
     *
     * @param 介護支払方法区分 介護支払方法区分
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set介護支払方法区分(RString 介護支払方法区分) {
        requireNonNull(介護支払方法区分, UrSystemErrorMessages.値がnull.getReplacedMessage("介護支払方法区分"));
        entity.setShiharaiHohoKubun(介護支払方法区分);
        return this;
    }

    /**
     * 識別コードを設定します。
     *
     * @param 識別コード 識別コード
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set識別コード(ShikibetsuCode 識別コード) {
        requireNonNull(識別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("識別コード"));
        entity.setShikibetsuNo(識別コード);
        return this;
    }

    /**
     * 金融機関コードを設定します。
     *
     * @param 金融機関コード 金融機関コード
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set金融機関コード(RString 金融機関コード) {
        requireNonNull(金融機関コード, UrSystemErrorMessages.値がnull.getReplacedMessage("金融機関コード"));
        entity.setKinyuKikanCode(金融機関コード);
        return this;
    }

    /**
     * 支店コードを設定します。
     *
     * @param 支店コード 支店コード
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set支店コード(RString 支店コード) {
        requireNonNull(支店コード, UrSystemErrorMessages.値がnull.getReplacedMessage("支店コード"));
        entity.setShitenCode(支店コード);
        return this;
    }

    /**
     * 口座種別を設定します。
     *
     * @param 口座種別 口座種別
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set口座種別(RString 口座種別) {
        requireNonNull(口座種別, UrSystemErrorMessages.値がnull.getReplacedMessage("口座種別"));
        entity.setKozaShubetsu(口座種別);
        return this;
    }

    /**
     * 口座番号を設定します。
     *
     * @param 口座番号 口座番号
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set口座番号(RString 口座番号) {
        requireNonNull(口座番号, UrSystemErrorMessages.値がnull.getReplacedMessage("口座番号"));
        entity.setKozaNo(口座番号);
        return this;
    }

    /**
     * 口座名義人を設定します。
     *
     * @param 口座名義人 口座名義人
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set口座名義人(RString 口座名義人) {
        requireNonNull(口座名義人, UrSystemErrorMessages.値がnull.getReplacedMessage("口座名義人"));
        entity.setKozaMeiginin(口座名義人);
        return this;
    }

    /**
     * 口座名義人カナを設定します。
     *
     * @param 口座名義人カナ 口座名義人カナ
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set口座名義人カナ(RString 口座名義人カナ) {
        requireNonNull(口座名義人カナ, UrSystemErrorMessages.値がnull.getReplacedMessage("口座名義人カナ"));
        entity.setKozaMeigininKana(口座名義人カナ);
        return this;
    }

    /**
     * 口座IDを設定します。
     *
     * @param 口座ID 口座ID
     * @return {@link JutakuKaishuRiyushoTesuryoShukeiBuilder}
     */
    public JutakuKaishuRiyushoTesuryoShukeiBuilder set口座ID(Decimal 口座ID) {
        requireNonNull(口座ID, UrSystemErrorMessages.値がnull.getReplacedMessage("口座ID"));
        entity.setKozaID(口座ID);
        return this;
    }

    /**
     * {@link JutakuKaishuRiyushoTesuryoShukei}のインスタンスを生成します。
     *
     * @return {@link JutakuKaishuRiyushoTesuryoShukei}のインスタンス
     */
    public JutakuKaishuRiyushoTesuryoShukei build() {
        return new JutakuKaishuRiyushoTesuryoShukei(entity, id);
    }
}
