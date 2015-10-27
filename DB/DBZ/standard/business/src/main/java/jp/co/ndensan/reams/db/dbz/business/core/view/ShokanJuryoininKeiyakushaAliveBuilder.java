/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.view;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3078ShokanJuryoininKeiyakushaEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * {@link ShokanJuryoininKeiyakushaAlive}の編集を行うビルダークラスです。
 */
public class ShokanJuryoininKeiyakushaAliveBuilder {

    private final DbV3078ShokanJuryoininKeiyakushaEntity entity;
    private final ShokanJuryoininKeiyakushaAliveIdentifier id;

    /**
     * {@link DbV3078ShokanJuryoininKeiyakushaEntity}より{@link ShokanJuryoininKeiyakushaAlive}の編集用Builderクラスを生成します。
     *
     * @param entity {@link DbV3078ShokanJuryoininKeiyakushaEntity}
     * @param id {@link ShokanJuryoininKeiyakushaAliveIdentifier}
     *
     */
    ShokanJuryoininKeiyakushaAliveBuilder(
            DbV3078ShokanJuryoininKeiyakushaEntity entity,
            ShokanJuryoininKeiyakushaAliveIdentifier id
    ) {
        this.entity = entity.clone();
        this.id = id;

    }

//TODO Key項目のsetterメソッドは削除してください。
//TODO 一緒に置換される値のまとまりで不変なクラスを作成し、その単位でsetterを作る様に見直してください。
    /**
     * 被保険者番号を設定します。
     *
     * @param 被保険者番号 被保険者番号
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set被保険者番号(HihokenshaNo 被保険者番号) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        entity.setHihokenshaNo(被保険者番号);
        return this;
    }

    /**
     * 証記載保険者番号を設定します。
     *
     * @param 証記載保険者番号 証記載保険者番号
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set証記載保険者番号(ShoKisaiHokenshaNo 証記載保険者番号) {
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        entity.setShoKisaiHokenshaNo(証記載保険者番号);
        return this;
    }

    /**
     * 受付年月日を設定します。
     *
     * @param 受付年月日 受付年月日
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set受付年月日(FlexibleDate 受付年月日) {
        requireNonNull(受付年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("受付年月日"));
        entity.setUketsukeYMD(受付年月日);
        return this;
    }

    /**
     * 履歴番号を設定します。
     *
     * @param 履歴番号 履歴番号
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set履歴番号(int 履歴番号) {
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));
        entity.setRirekiNo(履歴番号);
        return this;
    }

    /**
     * 申請年月日を設定します。
     *
     * @param 申請年月日 申請年月日
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set申請年月日(FlexibleDate 申請年月日) {
        requireNonNull(申請年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("申請年月日"));
        entity.setShinseiYMD(申請年月日);
        return this;
    }

    /**
     * 事業者契約番号を設定します。
     *
     * @param 事業者契約番号 事業者契約番号
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set事業者契約番号(RString 事業者契約番号) {
        requireNonNull(事業者契約番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業者契約番号"));
        entity.setJigyoshaKeiyakuNo(事業者契約番号);
        return this;
    }

    /**
     * 契約サービス種類を設定します。
     *
     * @param 契約サービス種類 契約サービス種類
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set契約サービス種類(RString 契約サービス種類) {
        requireNonNull(契約サービス種類, UrSystemErrorMessages.値がnull.getReplacedMessage("契約サービス種類"));
        entity.setKeiyakuServiceShurui(契約サービス種類);
        return this;
    }

    /**
     * 決定年月日を設定します。
     *
     * @param 決定年月日 決定年月日
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set決定年月日(FlexibleDate 決定年月日) {
        requireNonNull(決定年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("決定年月日"));
        entity.setKetteiYMD(決定年月日);
        return this;
    }

    /**
     * 承認結果区分を設定します。
     *
     * @param 承認結果区分 承認結果区分
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set承認結果区分(RString 承認結果区分) {
        requireNonNull(承認結果区分, UrSystemErrorMessages.値がnull.getReplacedMessage("承認結果区分"));
        entity.setShoninKekkaKubun(承認結果区分);
        return this;
    }

    /**
     * 受領委任払適用開始年月日を設定します。
     *
     * @param 受領委任払適用開始年月日 受領委任払適用開始年月日
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set受領委任払適用開始年月日(FlexibleDate 受領委任払適用開始年月日) {
        requireNonNull(受領委任払適用開始年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("受領委任払適用開始年月日"));
        entity.setJuryoininKaishiYMD(受領委任払適用開始年月日);
        return this;
    }

    /**
     * 受領委任払適用終了年月日を設定します。
     *
     * @param 受領委任払適用終了年月日 受領委任払適用終了年月日
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set受領委任払適用終了年月日(FlexibleDate 受領委任払適用終了年月日) {
        requireNonNull(受領委任払適用終了年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("受領委任払適用終了年月日"));
        entity.setJuryoininShuryoYMD(受領委任払適用終了年月日);
        return this;
    }

    /**
     * 契約番号を設定します。
     *
     * @param 契約番号 契約番号
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set契約番号(RString 契約番号) {
        requireNonNull(契約番号, UrSystemErrorMessages.値がnull.getReplacedMessage("契約番号"));
        entity.setKeiyakuNo(契約番号);
        return this;
    }

    /**
     * 不承認理由を設定します。
     *
     * @param 不承認理由 不承認理由
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set不承認理由(RString 不承認理由) {
        requireNonNull(不承認理由, UrSystemErrorMessages.値がnull.getReplacedMessage("不承認理由"));
        entity.setFuShoninRiyu(不承認理由);
        return this;
    }

    /**
     * 費用額合計を設定します。
     *
     * @param 費用額合計 費用額合計
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set費用額合計(Decimal 費用額合計) {
        requireNonNull(費用額合計, UrSystemErrorMessages.値がnull.getReplacedMessage("費用額合計"));
        entity.setHiyoGakuGokei(費用額合計);
        return this;
    }

    /**
     * 保険対象費用額を設定します。
     *
     * @param 保険対象費用額 保険対象費用額
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set保険対象費用額(Decimal 保険対象費用額) {
        requireNonNull(保険対象費用額, UrSystemErrorMessages.値がnull.getReplacedMessage("保険対象費用額"));
        entity.setHokenTaishoHiyoGaku(保険対象費用額);
        return this;
    }

    /**
     * 利用者自己負担額を設定します。
     *
     * @param 利用者自己負担額 利用者自己負担額
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set利用者自己負担額(Decimal 利用者自己負担額) {
        requireNonNull(利用者自己負担額, UrSystemErrorMessages.値がnull.getReplacedMessage("利用者自己負担額"));
        entity.setRiyoshaJikoFutanGaku(利用者自己負担額);
        return this;
    }

    /**
     * 保険給付費額を設定します。
     *
     * @param 保険給付費額 保険給付費額
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set保険給付費額(Decimal 保険給付費額) {
        requireNonNull(保険給付費額, UrSystemErrorMessages.値がnull.getReplacedMessage("保険給付費額"));
        entity.setHokenKyufuhiGaku(保険給付費額);
        return this;
    }

    /**
     * 承認結果通知書作成日を設定します。
     *
     * @param 承認結果通知書作成日 承認結果通知書作成日
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set承認結果通知書作成日(FlexibleDate 承認結果通知書作成日) {
        requireNonNull(承認結果通知書作成日, UrSystemErrorMessages.値がnull.getReplacedMessage("承認結果通知書作成日"));
        entity.setShoninKekkaTsuchiSakuseiYMD(承認結果通知書作成日);
        return this;
    }

    /**
     * 承認結果通知書再発行区分を設定します。
     *
     * @param 承認結果通知書再発行区分 承認結果通知書再発行区分
     * @return {@link ShokanJuryoininKeiyakushaAliveBuilder}
     */
    public ShokanJuryoininKeiyakushaAliveBuilder set承認結果通知書再発行区分(RString 承認結果通知書再発行区分) {
        requireNonNull(承認結果通知書再発行区分, UrSystemErrorMessages.値がnull.getReplacedMessage("承認結果通知書再発行区分"));
        entity.setShoninKekkaTsuchiSaiHakkoKubun(承認結果通知書再発行区分);
        return this;
    }

    /**
     * {@link ShokanJuryoininKeiyakushaAlive}のインスタンスを生成します。
     *
     * @return {@link ShokanJuryoininKeiyakushaAlive}のインスタンス
     */
    public ShokanJuryoininKeiyakushaAlive build() {
        return new ShokanJuryoininKeiyakushaAlive(entity, id);
    }
}