/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.realservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.NinteichosaKekkaTorikomiTaishosha;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.NinteichosaIraiRirekiNo;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5001NinteiShinseiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5005NinteiShinchokuJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5006NinteichosaIraiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT7010NinteichosaItakusakiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT7013ChosainJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.mapper.NinteichosaKekkaTorikomiTaishoshaMapper;
import jp.co.ndensan.reams.db.dbe.entity.relate.KaigoNinteichosainEntity;
import jp.co.ndensan.reams.db.dbe.entity.relate.NinteichosaKekkaTorikomiTaishoshaEntity;
import jp.co.ndensan.reams.db.dbe.persistence.INinteichosaItakusakiDac;
import jp.co.ndensan.reams.db.dbe.persistence.basic.IKaigoNinteichosainDac;
import jp.co.ndensan.reams.db.dbe.persistence.basic.INinteiChosaIraiJohoDac;
import jp.co.ndensan.reams.db.dbe.persistence.basic.INinteiShinchokuJohoDac;
import jp.co.ndensan.reams.db.dbe.persistence.basic.INinteiShinseiJohoDac;
import jp.co.ndensan.reams.ur.urf.entity.basic.KaigoJigyoshaEntity;
import jp.co.ndensan.reams.ur.urf.persistence.basic.IKaigoJigyoshaDac;
import jp.co.ndensan.reams.ur.urz.entity.basic.KojinEntity;
import jp.co.ndensan.reams.ur.urz.persistence.basic.IKojinDac;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 認定調査結果取込対象者を扱うクラスです。
 *
 * @author N8187 久保田 英男
 */
public class NinteichosaKekkaTorikomiTaishoshaManager {

    private final INinteiShinchokuJohoDac shinchokuJohoDac;
    private final INinteiShinseiJohoDac shinseiJohoDac;
    private final INinteiChosaIraiJohoDac chosaIraiJohoDac;
    private final IKaigoNinteichosainDac ninteichosainDac;
    private final INinteichosaItakusakiDac ninteichosaItakusakiDac;
    private final IKaigoJigyoshaDac kaigoJigyoshaDac;
    private final IKojinDac kojinDac;

    /**
     * デフォルトコンストラクタです。
     */
    public NinteichosaKekkaTorikomiTaishoshaManager() {
        shinchokuJohoDac = InstanceProvider.create(INinteiShinchokuJohoDac.class);
        shinseiJohoDac = InstanceProvider.create(INinteiShinseiJohoDac.class);
        chosaIraiJohoDac = InstanceProvider.create(INinteiChosaIraiJohoDac.class);
        ninteichosainDac = InstanceProvider.create(IKaigoNinteichosainDac.class);
        ninteichosaItakusakiDac = InstanceProvider.create(INinteichosaItakusakiDac.class);
        kaigoJigyoshaDac = InstanceProvider.create(IKaigoJigyoshaDac.class);
        kojinDac = InstanceProvider.create(IKojinDac.class);
    }

    /**
     * テスト用プライベートコンストラクタです。
     *
     * @param shinchokuJohoDac shinchokuJohoDac
     * @param shinseiJohoDac shinseiJohoDac
     * @param chosaIraiJohoDac chosaIraiJohoDac
     * @param kojinDac kojinDac
     */
    NinteichosaKekkaTorikomiTaishoshaManager(
            INinteiShinchokuJohoDac shinchokuJohoDac,
            INinteiShinseiJohoDac shinseiJohoDac,
            INinteiChosaIraiJohoDac chosaIraiJohoDac,
            IKaigoNinteichosainDac ninteichosainDac,
            INinteichosaItakusakiDac ninteichosaItakusakiDac,
            IKaigoJigyoshaDac kaigoJigyoshaDac,
            IKojinDac kojinDac) {
        this.shinchokuJohoDac = shinchokuJohoDac;
        this.shinseiJohoDac = shinseiJohoDac;
        this.chosaIraiJohoDac = chosaIraiJohoDac;
        this.ninteichosainDac = ninteichosainDac;
        this.ninteichosaItakusakiDac = ninteichosaItakusakiDac;
        this.kaigoJigyoshaDac = kaigoJigyoshaDac;
        this.kojinDac = kojinDac;
    }

    /**
     * 認定調査結果取込対象者を全件取得します。
     *
     * @return 認定調査結果取込対象者全件
     */
    public List<NinteichosaKekkaTorikomiTaishosha> get認定調査結果取込対象者全件(RString 支所コード) {

        List<DbT5005NinteiShinchokuJohoEntity> shinchokuJohoEntityList = shinchokuJohoDac.select依頼済認定調査未完了();
        List<NinteichosaKekkaTorikomiTaishoshaEntity> TaishosyaEntityList = create認定調査結果取込対象者EntityList(shinchokuJohoEntityList, 支所コード);

        return create認定調査結果取込対象者List(TaishosyaEntityList);
    }

    private List<NinteichosaKekkaTorikomiTaishoshaEntity> create認定調査結果取込対象者EntityList(List<DbT5005NinteiShinchokuJohoEntity> shinchokuJohoEntityList, RString 支所コード) {
        List<NinteichosaKekkaTorikomiTaishoshaEntity> list = new ArrayList<>();

        for (DbT5005NinteiShinchokuJohoEntity shinchokuJohoEntity : shinchokuJohoEntityList) {
            DbT5001NinteiShinseiJohoEntity shinseiJohoEntity = shinseiJohoDac.select(shinchokuJohoEntity.getShinseishoKanriNo());
            if (shinseiJohoEntity.getShishoCode().compareTo(支所コード) != 0) {
                continue;
            }
            DbT5006NinteichosaIraiJohoEntity iraiJohoEntity = chosaIraiJohoDac.select(
                    shinchokuJohoEntity.getShinseishoKanriNo().value(),
                    new NinteichosaIraiRirekiNo(shinseiJohoEntity.getNinteichosaIraiRirekiNo()));
            List<DbT7013ChosainJohoEntity> chosainEntityList = ninteichosainDac.selectAll(shinseiJohoEntity.getShichosonCode(), iraiJohoEntity.getNinteichosaItakusakiCode());

            NinteichosaKekkaTorikomiTaishoshaEntity entity = new NinteichosaKekkaTorikomiTaishoshaEntity();
            entity.setNinteiShinseiJohoEntity(shinseiJohoEntity);
            entity.setNinteiShinchokuJohoEntity(shinchokuJohoEntity);
            entity.setNinteichosaIraiJohoEntity(iraiJohoEntity);
            entity.setNinteichosainEntityList(create介護認定調査員EntityList(chosainEntityList));
            list.add(entity);
        }

        return list;
    }

    private List<NinteichosaKekkaTorikomiTaishosha> create認定調査結果取込対象者List(List<NinteichosaKekkaTorikomiTaishoshaEntity> entityList) {
        List<NinteichosaKekkaTorikomiTaishosha> list = new ArrayList<>();

        for (NinteichosaKekkaTorikomiTaishoshaEntity entity : entityList) {
            KojinEntity kojin = kojinDac.select最新(entity.getNinteiShinseiJohoEntity().getShikibetsuCode().value());
            KaigoJigyoshaEntity kaigoJigyosha = create介護事業者Entity(entity.getNinteichosaIraiJohoEntity());
            list.add(NinteichosaKekkaTorikomiTaishoshaMapper.toNinteichosaKekkaTorikomiTaishosha(entity, kaigoJigyosha, kojin));
        }

        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }

        return list;
    }

    private List<KaigoNinteichosainEntity> create介護認定調査員EntityList(List<DbT7013ChosainJohoEntity> chosainEntityList) {
        List<KaigoNinteichosainEntity> list = new ArrayList<>();

        for (DbT7013ChosainJohoEntity chosainJohoEntity : chosainEntityList) {
            DbT7010NinteichosaItakusakiJohoEntity itakusakiJohoEntity = ninteichosaItakusakiDac.select(chosainJohoEntity.getShichosonCode().getValue(), chosainJohoEntity.getKaigoJigyoshaNo(), true);
            KaigoNinteichosainEntity ninteichosainEntity = new KaigoNinteichosainEntity();
            ninteichosainEntity.setDbT7013ChosainJohoEntity(chosainJohoEntity);
            ninteichosainEntity.setDbT7010NinteichosaItakusakiJohoEntity(itakusakiJohoEntity);
            list.add(ninteichosainEntity);
        }

        return list;
    }

    private KaigoJigyoshaEntity create介護事業者Entity(DbT5006NinteichosaIraiJohoEntity iraiJohoEntity) {
        List<KaigoJigyoshaEntity> entityList = kaigoJigyoshaDac.select特定の事業者番号の事業者(iraiJohoEntity.getNinteichosaItakusakiCode().value());

        if (entityList.isEmpty()) {
            return null;
        }

        return entityList.get(0);
    }
}
