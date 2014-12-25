/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.model;

import java.io.Serializable;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7110TankiNyushoShikyuGendoGakuEntity;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 短期入所系支給限度額のモデルクラスです。
 *
 * @author LDNS 宋文娟
 */
public class TankiNyushoShikyuGendoGakuModel implements Serializable {

    private DbT7110TankiNyushoShikyuGendoGakuEntity entity;

    /**
     * コンストラクタです。
     */
    public TankiNyushoShikyuGendoGakuModel() {
        entity = new DbT7110TankiNyushoShikyuGendoGakuEntity();
    }

    /**
     * コンストラクタです。
     *
     * @param entity DbT7110TankiNyushoShikyuGendoGakuEntity
     */
    public TankiNyushoShikyuGendoGakuModel(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        this.entity = entity;
    }

    /**
     * DbT7110TankiNyushoShikyuGendoGakuEntityを返します。
     *
     * @return DbT7110TankiNyushoShikyuGendoGakuEntity
     */
    public DbT7110TankiNyushoShikyuGendoGakuEntity getEntity() {
        return entity;
    }

    /**
     * DbT7110TankiNyushoShikyuGendoGakuEntityを設定します。
     *
     * @param entity DbT7110TankiNyushoShikyuGendoGakuEntity
     */
    public void setEntity(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        this.entity = entity;
    }

    /**
     * 要介護状態区分を返します。
     *
     * @return 要介護状態区分
     */
    public RString get要介護状態区分() {
        return entity.getYoKaigoJotaiKubun();
    }

    /**
     * 適用開始年月を返します。
     *
     * @return 適用開始年月
     */
    public FlexibleYearMonth get適用開始年月() {
        return entity.getTekiyoKaishiYM();
    }

    /**
     * 処理日時を返します。
     *
     * @return 処理日時
     */
    public YMDHMS get処理日時() {
        return entity.getShoriTimestamp();
    }

    /**
     * 適用終了年月を返します。
     *
     * @return 適用終了年月
     */
    public FlexibleYearMonth get適用終了年月() {
        return entity.getTekiyoShuryoYM();
    }

    /**
     * 支給限度日数を返します。
     *
     * @return 支給限度日数
     */
    public Decimal get支給限度日数() {
        return entity.getShikyuGendoNissu();
    }

    /**
     * 要介護状態区分を設定します。
     *
     * @param 要介護状態区分 要介護状態区分
     */
    public void set要介護状態区分(RString 要介護状態区分) {
        requireNonNull(要介護状態区分, UrSystemErrorMessages.値がnull.getReplacedMessage("要介護状態区分"));
        entity.setYoKaigoJotaiKubun(要介護状態区分);
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

    /**
     * 処理日時を設定します。
     *
     * @param 処理日時 処理日時
     */
    public void set処理日時(YMDHMS 処理日時) {
        requireNonNull(処理日時, UrSystemErrorMessages.値がnull.getReplacedMessage("処理日時"));
        entity.setShoriTimestamp(処理日時);
    }

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
     * 支給限度日数を設定します。
     *
     * @param 支給限度日数 支給限度日数
     */
    public void set支給限度日数(Decimal 支給限度日数) {
        requireNonNull(支給限度日数, UrSystemErrorMessages.値がnull.getReplacedMessage("支給限度日数"));
        entity.setShikyuGendoNissu(支給限度日数);
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
