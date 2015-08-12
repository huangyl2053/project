/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.model;

import java.io.Serializable;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ServiceCode;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3049ShokanJutakuKaishuEntity;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 償還払請求住宅改修のモデルクラスです。
 *
 * @author LDNS 周杏月
 */
public class ShokanJutakuKaishuModel implements Serializable {

    private DbT3049ShokanJutakuKaishuEntity entity;

    /**
     * コンストラクタです。
     */
    public ShokanJutakuKaishuModel() {
        entity = new DbT3049ShokanJutakuKaishuEntity();
    }

    /**
     * コンストラクタです。
     *
     * @param entity DbT3049ShokanJutakuKaishuEntity
     */
    public ShokanJutakuKaishuModel(DbT3049ShokanJutakuKaishuEntity entity) {
        this.entity = entity;
    }

    /**
     * DbT3049ShokanJutakuKaishuEntityを返します。
     *
     * @return DbT3049ShokanJutakuKaishuEntity
     */
    public DbT3049ShokanJutakuKaishuEntity getEntity() {
        return entity;
    }

    /**
     * DbT3049ShokanJutakuKaishuEntityを設定します。
     *
     * @param entity DbT3049ShokanJutakuKaishuEntity
     */
    public void setEntity(DbT3049ShokanJutakuKaishuEntity entity) {
        this.entity = entity;
    }

    /**
     * 被保険者番号を返します。
     *
     * @return 被保険者番号
     */
    public HihokenshaNo get被保険者番号() {
        return entity.getHiHokenshaNo();
    }

    /**
     * サービス提供年月を返します。
     *
     * @return サービス提供年月
     */
    public FlexibleYearMonth getサービス提供年月() {
        return entity.getServiceTeikyoYM();
    }

    /**
     * 整理番号を返します。
     *
     * @return 整理番号
     */
    public RString get整理番号() {
        return entity.getSeiriNo();
    }

    /**
     * 事業者番号を返します。
     *
     * @return 事業者番号
     */
    public JigyoshaNo get事業者番号() {
        return entity.getJigyoshaNo();
    }

    /**
     * 様式番号を返します。
     *
     * @return 様式番号
     */
    public RString get様式番号() {
        return entity.getYoshikiNo();
    }

    /**
     * 順次番号を返します。
     *
     * @return 順次番号
     */
    public RString get順次番号() {
        return entity.getJunjiNo();
    }

    /**
     * サービスコードを返します。
     *
     * @return サービスコード
     */
    public ServiceCode getサービスコード() {
        return entity.getServiceCode();
    }

    /**
     * 住宅改修着工年月日を返します。
     *
     * @return 住宅改修着工年月日
     */
    public FlexibleDate get住宅改修着工年月日() {
        return entity.getJutakuKaishuChakkoYMD();
    }

    /**
     * 住宅改修事業者名を返します。
     *
     * @return 住宅改修事業者名
     */
    public RString get住宅改修事業者名() {
        return entity.getJutakuKaishuJigyoshaName();
    }

    /**
     * 住宅改修住宅住所を返します。
     *
     * @return 住宅改修住宅住所
     */
    public RString get住宅改修住宅住所() {
        return entity.getJutakuKaishuJutakuAddress();
    }

    /**
     * 改修金額を返します。
     *
     * @return 改修金額
     */
    public int get改修金額() {
        return entity.getKaishuKingaku();
    }

    /**
     * 審査方法区分コードを返します。
     *
     * @return 審査方法区分コード
     */
    public RString get審査方法区分コード() {
        return entity.getShinsaHohoKubunCode();
    }

    /**
     * 住宅改修完成年月日を返します。
     *
     * @return 住宅改修完成年月日
     */
    public FlexibleDate get住宅改修完成年月日() {
        return entity.getJutakuKaishuKanseiYMD();
    }

    /**
     * 差額金額を返します。
     *
     * @return 差額金額
     */
    public int get差額金額() {
        return entity.getSagakuKingaku();
    }

    /**
     * 被保険者番号を設定します。
     *
     * @param 被保険者番号 被保険者番号
     */
    public void set被保険者番号(HihokenshaNo 被保険者番号) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        entity.setHiHokenshaNo(被保険者番号);
    }

    /**
     * サービス提供年月を設定します。
     *
     * @param サービス提供年月 サービス提供年月
     */
    public void setサービス提供年月(FlexibleYearMonth サービス提供年月) {
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        entity.setServiceTeikyoYM(サービス提供年月);
    }

    /**
     * 整理番号を設定します。
     *
     * @param 整理番号 整理番号
     */
    public void set整理番号(RString 整理番号) {
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("整理番号"));
        entity.setSeiriNo(整理番号);
    }

    /**
     * 事業者番号を設定します。
     *
     * @param 事業者番号 事業者番号
     */
    public void set事業者番号(JigyoshaNo 事業者番号) {
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業者番号"));
        entity.setJigyoshaNo(事業者番号);
    }

    /**
     * 様式番号を設定します。
     *
     * @param 様式番号 様式番号
     */
    public void set様式番号(RString 様式番号) {
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage("様式番号"));
        entity.setYoshikiNo(様式番号);
    }

    /**
     * 順次番号を設定します。
     *
     * @param 順次番号 順次番号
     */
    public void set順次番号(RString 順次番号) {
        requireNonNull(順次番号, UrSystemErrorMessages.値がnull.getReplacedMessage("順次番号"));
        entity.setJunjiNo(順次番号);
    }

    /**
     * サービスコードを設定します。
     *
     * @param サービスコード サービスコード
     */
    public void setサービスコード(ServiceCode サービスコード) {
        requireNonNull(サービスコード, UrSystemErrorMessages.値がnull.getReplacedMessage("サービスコード"));
        entity.setServiceCode(サービスコード);
    }

    /**
     * 住宅改修着工年月日を設定します。
     *
     * @param 住宅改修着工年月日 住宅改修着工年月日
     */
    public void set住宅改修着工年月日(FlexibleDate 住宅改修着工年月日) {
        requireNonNull(住宅改修着工年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("住宅改修着工年月日"));
        entity.setJutakuKaishuChakkoYMD(住宅改修着工年月日);
    }

    /**
     * 住宅改修事業者名を設定します。
     *
     * @param 住宅改修事業者名 住宅改修事業者名
     */
    public void set住宅改修事業者名(RString 住宅改修事業者名) {
        requireNonNull(住宅改修事業者名, UrSystemErrorMessages.値がnull.getReplacedMessage("住宅改修事業者名"));
        entity.setJutakuKaishuJigyoshaName(住宅改修事業者名);
    }

    /**
     * 住宅改修住宅住所を設定します。
     *
     * @param 住宅改修住宅住所 住宅改修住宅住所
     */
    public void set住宅改修住宅住所(RString 住宅改修住宅住所) {
        requireNonNull(住宅改修住宅住所, UrSystemErrorMessages.値がnull.getReplacedMessage("住宅改修住宅住所"));
        entity.setJutakuKaishuJutakuAddress(住宅改修住宅住所);
    }

    /**
     * 改修金額を設定します。
     *
     * @param 改修金額 改修金額
     */
    public void set改修金額(int 改修金額) {
        requireNonNull(改修金額, UrSystemErrorMessages.値がnull.getReplacedMessage("改修金額"));
        entity.setKaishuKingaku(改修金額);
    }

    /**
     * 審査方法区分コードを設定します。
     *
     * @param 審査方法区分コード 審査方法区分コード
     */
    public void set審査方法区分コード(RString 審査方法区分コード) {
        requireNonNull(審査方法区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("審査方法区分コード"));
        entity.setShinsaHohoKubunCode(審査方法区分コード);
    }

    /**
     * 住宅改修完成年月日を設定します。
     *
     * @param 住宅改修完成年月日 住宅改修完成年月日
     */
    public void set住宅改修完成年月日(FlexibleDate 住宅改修完成年月日) {
        requireNonNull(住宅改修完成年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("住宅改修完成年月日"));
        entity.setJutakuKaishuKanseiYMD(住宅改修完成年月日);
    }

    /**
     * 差額金額を設定します。
     *
     * @param 差額金額 差額金額
     */
    public void set差額金額(int 差額金額) {
        requireNonNull(差額金額, UrSystemErrorMessages.値がnull.getReplacedMessage("差額金額"));
        entity.setSagakuKingaku(差額金額);
    }

    /**
     * 状態に削除を設定します。
     *
     * @param deleteFlag deleteFlag
     */
    public void setDeletedState(boolean deleteFlag) {
        if (deleteFlag) {
            entity.setState(EntityDataState.Deleted);
        } else {
            entity.unsetState();
        }
    }

    /**
     * stateを返します。
     *
     * @return EntityDataState
     */
    public EntityDataState getState() {
        return entity.getState();
    }
}