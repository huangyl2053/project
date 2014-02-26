/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.mapper;

import jp.co.ndensan.reams.db.dbe.business.ShinsakaiKaisaiBasho;
import jp.co.ndensan.reams.db.dbe.business.ShinsakaiKaisaiChiku;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ShinsakaiKaisaiBashoJokyo;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.ShinsakaiKaisaiBashoCode;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5104ShinsakaiKaisaiBashoJohoEntity;
import jp.co.ndensan.reams.uz.uza.biz.Code;

/**
 * 介護認定審査会開催場所のマッピングを行うクラスです。
 *
 * @author n8178 城間篤人
 */
public final class ShinsakaiKaisaiBashoMapper {
    //TODO n8178 城間篤人 他チケットで実装予定の箇所のため、後に改修が入る可能性があり 2014年3月末

    /**
     * インスタンス化防止のためのプライベートコンストラクタです。
     */
    private ShinsakaiKaisaiBashoMapper() {
    }

    /**
     * 審査会開催場所Entityの情報を、審査会開催場所クラスにマッピングします。<br/>
     * 引数にnullが渡されたとき、nullが返ります。
     *
     * @param 審査会開催場所Entity 審査会開催場所entity
     * @return 審査会開催場所
     */
    public static ShinsakaiKaisaiBasho to審査会開催場所(DbT5104ShinsakaiKaisaiBashoJohoEntity 審査会開催場所Entity) {
        if (審査会開催場所Entity == null) {
            return null;
        }

        return new ShinsakaiKaisaiBasho(new ShinsakaiKaisaiBashoCode(審査会開催場所Entity.getShinsakaiKaisaiBashoCode()),
                審査会開催場所Entity.getShinsakaiKaisaiBashoMei(),
                new ShinsakaiKaisaiChiku(審査会開催場所Entity.getShinsakaiKaisaiChikuCode().value(),
                審査会開催場所Entity.getShinsakaiKaisaiChikuName()),
                審査会開催場所Entity.getShinsakaiKaisaiBashoJusho(),
                審査会開催場所Entity.getShinsakaiKaisaiBashoTelNo(),
                ShinsakaiKaisaiBashoJokyo.toValue(審査会開催場所Entity.getShinsakaiKaisaiBashoJokyo()));
    }

    /**
     * 審査会開催場所の情報を、審査会開催場所Entityにマッピングします。<br/>
     * 引数にnullが渡されたとき、nullが返ります。
     *
     * @param 審査会開催場所 審査会開催場所
     * @return 審査会開催場所Entity
     */
    public static DbT5104ShinsakaiKaisaiBashoJohoEntity to審査会開催場所Entity(ShinsakaiKaisaiBasho 審査会開催場所) {
        if (審査会開催場所 == null) {
            return null;
        }

        DbT5104ShinsakaiKaisaiBashoJohoEntity 審査会開催場所Entity = new DbT5104ShinsakaiKaisaiBashoJohoEntity();
        審査会開催場所Entity.setShinsakaiKaisaiBashoCode(審査会開催場所.get開催場所コード().value());
        審査会開催場所Entity.setShinsakaiKaisaiBashoMei(審査会開催場所.get開催場所名());
        審査会開催場所Entity.setShinsakaiKaisaiChikuCode(new Code(審査会開催場所.get開催地区().getCode()));
        審査会開催場所Entity.setShinsakaiKaisaiBashoJusho(審査会開催場所.get開催場所住所());
        審査会開催場所Entity.setShinsakaiKaisaiBashoTelNo(審査会開催場所.get電話番号());
        審査会開催場所Entity.setShinsakaiKaisaiBashoJokyo(審査会開催場所.get開催場所状況().is有効());
        return 審査会開催場所Entity;
    }
}
