/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbV1001HihokenshaDaicho;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbV1001HihokenshaDaichoEntity;
import jp.co.ndensan.reams.db.dbz.model.hihokenshadaicho.HihokenshaDaichoViewModel;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.IItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.ItemList;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbV1001HihokenshaDaicho.*;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.*;

/**
 * 被保険者台帳ビューのデータアクセスクラスです。
 *
 * @author N8156 宮本 康
 */
public class HihokenshaDaichoViewDac {

    @InjectSession
    private SqlSession session;

    /**
     * 指定した被保険者番号に合致する被保険者台帳ビューを取得します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 被保険者台帳ビューリスト
     */
    @Transaction
    public IItemList<HihokenshaDaichoViewModel> selectBy被保険者番号(HihokenshaNo 被保険者番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        List<DbV1001HihokenshaDaichoEntity> entityList = accessor.
                select().
                table(DbV1001HihokenshaDaicho.class).
                where(eq(hihokenshaNo, 被保険者番号)).
                toList(DbV1001HihokenshaDaichoEntity.class);
        return getModelList(entityList);
    }

    /**
     * 指定した市町村コードに合致する被保険者台帳ビューを取得します。
     *
     * @param 市町村コード 市町村コード、又は広住特措置元市町村コード
     * @param 被保険者番号 被保険者番号
     * @return 被保険者台帳ビューリスト
     */
    @Transaction
    public IItemList<HihokenshaDaichoViewModel> selectByAny市町村コード(LasdecCode 市町村コード, HihokenshaNo 被保険者番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        List<DbV1001HihokenshaDaichoEntity> entityList = accessor.
                select().
                table(DbV1001HihokenshaDaicho.class).
                where(被保険者番号 != null
                        ? and(or(eq(shichosonCode, 市町村コード), eq(koikinaiTokureiSochimotoShichosonCode, 市町村コード)), eq(hihokenshaNo, 被保険者番号))
                        : or(eq(shichosonCode, 市町村コード), eq(koikinaiTokureiSochimotoShichosonCode, 市町村コード))).
                toList(DbV1001HihokenshaDaichoEntity.class);
        return getModelList(entityList);
    }

    /**
     * 指定した市町村コードに合致する被保険者台帳ビューを取得します。
     *
     * @param 市町村コード 市町村コード
     * @param 被保険者番号 被保険者番号
     * @return 被保険者台帳ビューリスト
     */
    @Transaction
    public IItemList<HihokenshaDaichoViewModel> selectBy市町村コード(LasdecCode 市町村コード, HihokenshaNo 被保険者番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        List<DbV1001HihokenshaDaichoEntity> entityList = accessor.
                select().
                table(DbV1001HihokenshaDaicho.class).
                where(被保険者番号 != null
                        ? and(eq(shichosonCode, 市町村コード), eq(hihokenshaNo, 被保険者番号))
                        : eq(shichosonCode, 市町村コード)).
                toList(DbV1001HihokenshaDaichoEntity.class);
        return getModelList(entityList);
    }

    /**
     * 指定した広住特措置元市町村コードに合致する被保険者台帳ビューを取得します。
     *
     * @param 市町村コード 広住特措置元市町村コード
     * @param 被保険者番号 被保険者番号
     * @return 被保険者台帳ビューリスト
     */
    @Transaction
    public IItemList<HihokenshaDaichoViewModel> selectBy広住特措置元市町村コード(LasdecCode 市町村コード, HihokenshaNo 被保険者番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        List<DbV1001HihokenshaDaichoEntity> entityList = accessor.
                select().
                table(DbV1001HihokenshaDaicho.class).
                where(被保険者番号 != null
                        ? and(eq(koikinaiTokureiSochimotoShichosonCode, 市町村コード), eq(hihokenshaNo, 被保険者番号))
                        : eq(koikinaiTokureiSochimotoShichosonCode, 市町村コード)).
                toList(DbV1001HihokenshaDaichoEntity.class);
        return getModelList(entityList);
    }

    private IItemList<HihokenshaDaichoViewModel> getModelList(List<DbV1001HihokenshaDaichoEntity> entityList) {
        List<HihokenshaDaichoViewModel> list = new ArrayList<>();
        for (DbV1001HihokenshaDaichoEntity entity : entityList) {
            list.add(new HihokenshaDaichoViewModel(entity));
        }
        return ItemList.of(list);
    }
}