/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.service.core.basic.ninteichosainjikan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.ninteichosainjikan.NinteiChosainBusiness;
import jp.co.ndensan.reams.db.dbe.definition.mybatis.param.ninteichosainjikan.NinteiChosainJikanMasterParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.ninteichosainjikan.NinteiChosainEntity;
import jp.co.ndensan.reams.db.dbe.persistence.db.mapper.basic.ninteichosainjikan.INinteiChosainJikanMasterMapper;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosaSchedule;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5221NinteichosaScheduleEntity;
import jp.co.ndensan.reams.db.dbz.service.core.MapperProvider;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.SearchResult;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 認定調査スケジュール登録6を管理するクラスです。
 */
public class NinteiChosainJikanMasterManager {

    private final MapperProvider mapperProvider;

    /**
     * コンストラクタです。
     */
    NinteiChosainJikanMasterManager() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * 単体テスト用コンストラクタです。
     *
     * @param mapper Mapper
     */
    NinteiChosainJikanMasterManager(MapperProvider mapper) {
        this.mapperProvider = mapper;
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link NinteiChosainJikanMasterManager}のインスタンスを返します。
     *
     * @return NinteiChosainJikanMasterManager NinteiChosainJikanMasterManager
     */
    public static NinteiChosainJikanMasterManager createInstance() {
        return InstanceProvider.create(NinteiChosainJikanMasterManager.class);
    }

    /**
     * 認定調査スケジュール情報を取得します。
     *
     * @param ninteiChosaYoteiYMD 認定調査予定年月日
     * @param chosaChikuCode 調査地区コード
     * @param ninteiChosaItakusakiCode 認定調査委託先コード
     * @param ninteiChosainCode 認定調査員コード
     * @param shichosonCode 市町村コード
     * @return SearchResult<NinteiChosainBusiness> 認定調査スケジュール情報
     */
    @Transaction
    public SearchResult<NinteiChosainBusiness> get時間枠設定一覧情報(
            FlexibleDate ninteiChosaYoteiYMD,
            Code chosaChikuCode,
            RString ninteiChosaItakusakiCode,
            RString ninteiChosainCode,
            LasdecCode shichosonCode) {
        NinteiChosainJikanMasterParameter parameter = NinteiChosainJikanMasterParameter.createParam時間枠設定一覧情報(
                new FlexibleDate(ninteiChosaYoteiYMD.getYearMonth().toDateString()),
                chosaChikuCode,
                ninteiChosaItakusakiCode,
                ninteiChosainCode,
                shichosonCode);
        INinteiChosainJikanMasterMapper mapper = mapperProvider.create(INinteiChosainJikanMasterMapper.class);
        List<NinteiChosainEntity> entityList = mapper.selectNinteichosa(parameter);
        if (entityList == null || entityList.isEmpty()) {
            return SearchResult.of(Collections.<NinteiChosainBusiness>emptyList(), 0, false);
        }
        List<NinteiChosainBusiness> 認定調査 = new ArrayList<>();
        for (NinteiChosainEntity entity : entityList) {
            認定調査.add(new NinteiChosainBusiness(entity));
        }
        return SearchResult.of(認定調査, 0, false);
    }

    /**
     * 認定調査スケジュール情報を取得します。
     *
     * @param ninteiChosaYoteiYMD 認定調査予定年月日
     * @param chosaChikuCode 調査地区コード
     * @param ninteiChosaItakusakiCode 認定調査委託先コード
     * @param ninteiChosainCode 認定調査員コード
     * @param shichosonCode 市町村コード
     * @return SearchResult<NinteiChosainBusiness> 認定調査スケジュール情報
     */
    @Transaction
    public SearchResult<NinteichosaSchedule> select時間枠設定一覧情報(
            FlexibleDate ninteiChosaYoteiYMD,
            Code chosaChikuCode,
            RString ninteiChosaItakusakiCode,
            RString ninteiChosainCode,
            LasdecCode shichosonCode) {
        NinteiChosainJikanMasterParameter parameter = NinteiChosainJikanMasterParameter.createParam時間枠設定一覧情報(
                new FlexibleDate(ninteiChosaYoteiYMD.getYearMonth().toDateString()),
                chosaChikuCode,
                ninteiChosaItakusakiCode,
                ninteiChosainCode,
                shichosonCode);
        INinteiChosainJikanMasterMapper mapper = mapperProvider.create(INinteiChosainJikanMasterMapper.class);
        List<DbT5221NinteichosaScheduleEntity> entityList = mapper.selectNintei(parameter);
        if (entityList == null || entityList.isEmpty()) {
            return SearchResult.of(Collections.<NinteichosaSchedule>emptyList(), 0, false);
        }
        List<NinteichosaSchedule> 認定調査 = new ArrayList<>();
        for (DbT5221NinteichosaScheduleEntity entity : entityList) {
            entity.initializeMd5();
            認定調査.add(new NinteichosaSchedule(entity));
        }
        return SearchResult.of(認定調査, 0, false);
    }

    /**
     * 時間枠設定の編集元を取得します。
     *
     * @param ninteiChosaYoteiYMD 認定調査予定年月日
     * @param chosaChikuCode 調査地区コード
     * @param ninteiChosaItakusakiCode 認定調査委託先コード
     * @param ninteiChosainCode 認定調査員コード
     * @param shichosonCode 市町村コード
     * @param ninteiChosaYoteiKaishiTime 認定調査予定開始時間
     * @param ninteiChosaYoteiShuryoTime 認定調査予定終了時間
     * @param ninteiChosaJikanWaku 認定調査時間枠
     * @return SearchResult<NinteiChosainBusiness> 時間枠設定の編集元取得
     */
    @Transaction
    public NinteiChosainBusiness 時間枠設定の編集元取得(
            FlexibleDate ninteiChosaYoteiYMD,
            Code chosaChikuCode,
            RString ninteiChosaItakusakiCode,
            RString ninteiChosainCode,
            LasdecCode shichosonCode,
            RString ninteiChosaYoteiKaishiTime,
            RString ninteiChosaYoteiShuryoTime,
            Code ninteiChosaJikanWaku) {
        NinteiChosainJikanMasterParameter parameter = NinteiChosainJikanMasterParameter.createParam時間枠設定(
                ninteiChosaYoteiYMD,
                chosaChikuCode,
                ninteiChosaItakusakiCode,
                ninteiChosainCode,
                shichosonCode,
                ninteiChosaYoteiKaishiTime,
                ninteiChosaYoteiShuryoTime,
                ninteiChosaJikanWaku);
        INinteiChosainJikanMasterMapper mapper = mapperProvider.create(INinteiChosainJikanMasterMapper.class);
        return new NinteiChosainBusiness(mapper.selectByKy(parameter));
    }
}
