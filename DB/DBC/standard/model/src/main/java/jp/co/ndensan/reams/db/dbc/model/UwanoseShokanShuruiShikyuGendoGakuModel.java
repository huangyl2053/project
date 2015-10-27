/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.model;

import java.io.Serializable;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 上乗せ償還払い給付種類支給限度額のモデルクラスです。
 *
 * @author LDNS 宋文娟
 */
public class UwanoseShokanShuruiShikyuGendoGakuModel implements Serializable {

    private DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity entity;

    /**
     * コンストラクタです。
     */
    public UwanoseShokanShuruiShikyuGendoGakuModel() {
        entity = new DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity();
    }

    /**
     * コンストラクタです。
     *
     * @param entity DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity
     */
    public UwanoseShokanShuruiShikyuGendoGakuModel(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity entity) {
        this.entity = entity;
    }

    /**
     * DbT7115UwanoseShokanShuruiShikyuGendoGakuEntityを返します。
     *
     * @return DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity
     */
    public DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity getEntity() {
        return entity;
    }

    /**
     * DbT7115UwanoseShokanShuruiShikyuGendoGakuEntityを設定します。
     *
     * @param entity DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity
     */
    public void setEntity(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity entity) {
        this.entity = entity;
    }

    /**
     * サービス種類コードを返します。
     *
     * @return サービス種類コード
     */
    public ServiceShuruiCode getサービス種類コード() {
        return entity.getServiceShuruiCode();
    }

    /**
     * 適用開始年月を返します。
     *
     * @return 適用開始年月
     */
    public FlexibleYearMonth get適用開始年月() {
        return entity.getTekiyoKaishiYM();
    }

//    /**
//     * 処理日時を返します。
//     *
//     * @return 処理日時
//     */
//    public YMDHMS get処理日時() {
//        return entity.getShoriTimestamp();
//    }
//
    /**
     * 適用終了年月を返します。
     *
     * @return 適用終了年月
     */
    public FlexibleYearMonth get適用終了年月() {
        return entity.getTekiyoShuryoYM();
    }

    /**
     * 支給限度単位数を返します。
     *
     * @return 支給限度単位数
     */
    public Decimal get支給限度単位数() {
        return entity.getShikyuGendoTaniSu();
    }

    /**
     * サービス種類コードを設定します。
     *
     * @param サービス種類コード サービス種類コード
     */
    public void setサービス種類コード(ServiceShuruiCode サービス種類コード) {
        requireNonNull(サービス種類コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス種類コード"));
        entity.setServiceShuruiCode(サービス種類コード);
    }

    /**
     * 適用開始年月を設定します。
     *
     * @param 適用開始年月 適用開始年月
     */
    public void set適用開始年月(FlexibleYearMonth 適用開始年月) {
        requireNonNull(適用開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage("適用開始年月"));
        entity.setTekiyoKaishiYM(適用開始年月);
    }

//    /**
//     * 処理日時を設定します。
//     *
//     * @param 処理日時 処理日時
//     */
//    public void set処理日時(YMDHMS 処理日時) {
//        requireNonNull(処理日時, UrSystemErrorMessages.値がnull.getReplacedMessage("処理日時"));
//        entity.setShoriTimestamp(処理日時);
//    }
//
    /**
     * 適用終了年月を設定します。
     *
     * @param 適用終了年月 適用終了年月
     */
    public void set適用終了年月(FlexibleYearMonth 適用終了年月) {
        requireNonNull(適用終了年月, UrSystemErrorMessages.値がnull.getReplacedMessage("適用終了年月"));
        entity.setTekiyoShuryoYM(適用終了年月);
    }

    /**
     * 支給限度単位数を設定します。
     *
     * @param 支給限度単位数 支給限度単位数
     */
    public void set支給限度単位数(Decimal 支給限度単位数) {
        requireNonNull(支給限度単位数, UrSystemErrorMessages.値がnull.getReplacedMessage("支給限度単位数"));
        entity.setShikyuGendoTaniSu(支給限度単位数);
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