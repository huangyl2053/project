/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.jukyushakyufujissekidaicho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static jp.co.ndensan.reams.db.dbc.business.core.jukyushakyufujissekidaicho.JukyushaKyufuDaichoData.set帳票データ;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushajyufujissekidaicho.JukyushaKyufuJissekidaichoData;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.CareManagementEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.HukushiYouguEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.JuutakuKaishuuEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.KeikakuHiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.KihonEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.KinkyuuziShisetuRyouyouEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.KojinyoTyohyoDataKomoku;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.MeisaiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.ShakaiHukushiHouzinKeigenEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.ShoteiShikkanEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.ShuukeiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.TokuteiServiceHiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushakyufujissekidaicho.TokuteiShinryouHiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.codeshubetsu.DBCCodeShubetsu;
import jp.co.ndensan.reams.db.dbx.definition.core.serviceshurui.ServiceCategoryShurui;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.code.CodeMaster;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 * 受給者給付実績台帳Editクラスです。
 *
 * @reamsid_L DBC-3080-030 dongyabin
 */
public class JukyushaKyufuDaichoEdit {

    private static final RString 区分_高額 = new RString("2");
    private static final RString 入力識別番号_3411 = new RString("3411");
    private static final RString 入力識別番号_3421 = new RString("3421");
    private static final RString 入力識別番号_7131 = new RString("7131");
    private static final RString 入力識別番号_2131 = new RString("2131");
    private static final RString 入力識別番号_7132 = new RString("7132");
    private static final RString 入力識別番号_2132 = new RString("2132");
    private static final RString 入力識別番号_7143 = new RString("7143");
    private static final RString 入力識別番号_2143 = new RString("2143");
    private static final RString 入力識別番号_7144 = new RString("7144");
    private static final RString 入力識別番号_2144 = new RString("2144");
    private static final RString 入力識別番号_7183 = new RString("7183");
    private static final RString 入力識別番号_2183 = new RString("2183");
    private static final RString 入力識別番号_7155 = new RString("7155");
    private static final RString 入力識別番号_2155 = new RString("2155");
    private static final RString 入力識別番号_7156 = new RString("7156");
    private static final RString 入力識別番号_2156 = new RString("2156");
    private static final RString 入力識別番号_7164 = new RString("7164");
    private static final RString 入力識別番号_2164 = new RString("2164");
    private static final RString 入力識別番号_7165 = new RString("7165");
    private static final RString 入力識別番号_2165 = new RString("2165");
    private static final RString 入力識別番号_7171 = new RString("7171");
    private static final RString 入力識別番号_2171 = new RString("2171");
    private static final RString 入力識別番号_7172 = new RString("7172");
    private static final RString 入力識別番号_2172 = new RString("2172");
    private static final RString 入力識別番号_7173 = new RString("7173");
    private static final RString 入力識別番号_2173 = new RString("2173");
    private static final RString 入力識別番号_7174 = new RString("7174");
    private static final RString 入力識別番号_2174 = new RString("2174");
    private static final RString 入力識別番号_7175 = new RString("7175");
    private static final RString 入力識別番号_2175 = new RString("2175");
    private static final RString 入力識別番号_7176 = new RString("7176");
    private static final RString 入力識別番号_2176 = new RString("2176");
    private static final RString 入力識別番号_7177 = new RString("7177");
    private static final RString 入力識別番号_2177 = new RString("2177");
    private static final RString 入力識別番号_8124 = new RString("8124");
    private static final RString 入力識別番号_2184 = new RString("2184");
    private static final RString 入力識別番号_8125 = new RString("8125");
    private static final RString 入力識別番号_2185 = new RString("2185");
    private static final RString 入力識別番号_7195 = new RString("7195");
    private static final RString 入力識別番号_2195 = new RString("2195");
    private static final RString 入力識別番号_71A3 = new RString("71A3");
    private static final RString 入力識別番号_21A3 = new RString("21A3");
    private static final RString 入力識別番号_21C1 = new RString("21C1");
    private static final RString 入力識別番号_21C2 = new RString("21C2");
    private static final RString 入力識別番号_21D1 = new RString("21D1");
    private static final RString 入力識別番号_21D2 = new RString("21D2");
    private static final RString 入力識別番号_71P1 = new RString("71P1");
    private static final RString 入力識別番号_8161 = new RString("8161");
    private static final RString 入力識別番号_71R1 = new RString("71R1");
    private static final RString 入力識別番号_8171 = new RString("8171");
    private static final RString 頁数_1 = new RString("1");
    private static final int LIST_SIZE_2 = 2;
    private static final int LIST_SIZE_3 = 3;
    private static final int INDEX_3 = 3;
    private static final int INDEX_4 = 4;
    private static final int INDEX_5 = 5;
    private static final int INDEX_6 = 6;
    private static final int INDEX_7 = 6;
    private static final int INDEX_10 = 10;
    private static final int INDEX_20 = 20;
    private static final int INDEX_30 = 30;
    private static final int INDEX_40 = 40;
    private static final int INDEX_50 = 50;
    private static final int INDEX_64 = 64;
    private static final RString SPACE_1 = new RString("　");
    private static final RString SPACE_2 = new RString("　　");
    private static final RString SPACE_3 = new RString("　　　");
    private static final RString SPACE_4 = new RString("　　　　");
    private static final RString SPACE_5 = new RString("　　　　　");
    private static final RString SPACE_6 = new RString("　　　　　　");
    private static final RString SPACE_7 = new RString("　　　　　　　");
    private static final RString SPACE_8 = new RString("　　　　　　　　");
    private static final RString SPACE_9 = new RString("　　　　　　　　　");
    private static final RString SPACE_10 = new RString("　　　　　　　　　　");
    private static final RString SPACE_12 = new RString("　　　　　　　　　　　　");
    private static final RString SPACE_13 = new RString("　　　　　　　　　　　　　");
    private static final RString SPACE_14 = new RString("　　　　　　　　　　　　　　");
    private static final RString SPACE_17 = new RString("　　　　　　　　　　　　　　　　　");
    private static final RString SPACE_24 = new RString("　　　　　　　　　　　　　　　　　　　　　　　　");
    private static final RString SPACE_28 = new RString("　　　　　　　　　　　　　　　　　　　　　　　　　　　　");
    private static final RString SPACE_29 = new RString("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　");
    private static final RString SPACE_35 = new RString("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　");
    private static final RString 単位数 = new RString("単位数");
    private static final RString 回数 = new RString("回数");
    private static final RString 利用者負担額 = new RString("利用者負担額");
    private static final RString 請求金額 = new RString("請求金額");
    private static final RString 摘要 = new RString("摘要");
    private static final RString 再審査回数 = new RString("再審査回数");
    private static final RString 審査年月 = new RString("審査年月");
    private static final RString 決定後 = new RString("決定後");
    private static final RString 短期入所 = new RString("短期入所");
    private static final RString 合計点数 = new RString("合計点数");
    private static final RString 点数 = new RString("点数");
    private static final RString 公費１ = new RString("公費１");
    private static final RString 公費２ = new RString("公費２");
    private static final RString 公費３ = new RString("公費３");
    private static final FlexibleYearMonth 日付200201 = new FlexibleYearMonth("200201");

    private RString 保険者コード;
    private RString 保険者名;

    /**
     * 受給者給付台帳を出力します。
     *
     * @param entity entity
     * @param jukyushaKyufuDaicho jukyushaKyufuDaicho
     * @param データList データList
     * @param 明細List 明細List
     * @param 集計List 集計List
     * @param 入所List 入所List
     * @param 施設療養List 施設療養List
     * @param 特別療養List 特別療養List
     * @param 計画費List 計画費List
     * @param 所定疾患List 所定疾患List
     * @param 社福List 社福List
     * @param 福祉List 福祉List
     * @param ケアList ケアList
     * @param 住宅List 住宅List
     * @param 保険者コード_TMP 保険者コード
     * @param 保険者名_TMP 保険者名
     */
    public void report受給者給付台帳(KihonEntity entity,
            JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            BatchEntityCreatedTempTableWriter データList,
            List<MeisaiEntity> 明細List,
            List<ShuukeiEntity> 集計List,
            List<TokuteiServiceHiEntity> 入所List,
            List<KinkyuuziShisetuRyouyouEntity> 施設療養List,
            List<TokuteiShinryouHiEntity> 特別療養List,
            List<KeikakuHiEntity> 計画費List,
            List<ShoteiShikkanEntity> 所定疾患List,
            List<HukushiYouguEntity> 福祉List,
            List<JuutakuKaishuuEntity> 住宅List,
            List<CareManagementEntity> ケアList,
            List<ShakaiHukushiHouzinKeigenEntity> 社福List,
            RString 保険者コード_TMP,
            RString 保険者名_TMP) {
        保険者コード = 保険者コード_TMP;
        保険者名 = 保険者名_TMP;
        RString 入力識別番号 = entity.get入力識別番号();
        if (is3411(入力識別番号)) {
            report3411_3421(jukyushaKyufuDaicho, entity, データList);
        }
        if (!区分_高額.equals(entity.get区分())) {
            if (is7131(入力識別番号)) {
                report7131_2131(jukyushaKyufuDaicho, entity, 明細List, 集計List, 社福List, データList);
            }
            if (is7143(入力識別番号)) {
                report7143_2143(jukyushaKyufuDaicho, entity, 明細List, 集計List, 社福List, 入所List, データList);
            }
            if (is7155(入力識別番号)) {
                report7155_2155(jukyushaKyufuDaicho, entity, 明細List, 施設療養List, 特別療養List, 集計List, 入所List, データList);
            }
            if (is7164(入力識別番号)) {
                report7164_2164(jukyushaKyufuDaicho, entity, 明細List, 特別療養List, 集計List, 入所List, データList);
            }
            if (is7171(入力識別番号)) {
                report7171_2171(jukyushaKyufuDaicho, entity, 明細List, 集計List, データList);
            }
            if (is8124(入力識別番号)) {
                report8124_2184(jukyushaKyufuDaicho, entity, 計画費List, データList);
            }
            if (is7195(入力識別番号)) {
                report7195_2195(jukyushaKyufuDaicho, entity, 明細List, 所定疾患List, 集計List, 入所List, 特別療養List, データList);
            }
            if (is71A3(入力識別番号)) {
                report71A3_21A3(jukyushaKyufuDaicho, entity, 明細List, 集計List, 入所List, 特別療養List, データList);
            }
            if (is21C1(入力識別番号)) {
                report21C1(jukyushaKyufuDaicho, entity, 福祉List, 集計List, データList);
            }
            if (is21D1(入力識別番号)) {
                report21D1(jukyushaKyufuDaicho, entity, 住宅List, 集計List, データList);
            }
            if (is8161(入力識別番号)) {
                report8161(jukyushaKyufuDaicho, entity, 明細List, ケアList, データList);
            }
        }

    }

    private void report3411_3421(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本データ,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        if (区分_高額.equals(基本データ.get区分())) {
            個人用帳票データ = set基本(基本データ, 個人用帳票データ);
        }
        個人用帳票データ.setヘッダー1(基本データ.get出力様式());
        個人用帳票データ.setヘッダー2(new RString(" 受付年月日              負担者番号      負担額      支給額      審査年月"));
        個人用帳票データ.setヘッダー3(new RString(" 決定年月日"));
        個人用帳票データ.set明細1(SPACE_1.concat(dateFormat(基本データ.get高額受付年月日())).concat(SPACE_29)
                .concat(kingakuFormat(基本データ.get高額利用者負担額()))
                .concat(SPACE_5).concat(kingakuFormat(基本データ.get高額支給額())).concat(SPACE_17)
                .concat(dateFormat年月(基本データ.get審査年月())));
        個人用帳票データ.set明細3(SPACE_1.concat(dateFormat(基本データ.get高額決定年月日())).concat(SPACE_6).concat(公費１).concat(SPACE_4)
                .concat(nullToEmpty(基本データ.get高額公費１負担番号()))
                .concat(SPACE_5).concat(kingakuFormat(基本データ.get高額公費１負担額())).concat(SPACE_5)
                .concat(kingakuFormat(基本データ.get高額公費１支給額())));
        個人用帳票データ.set明細4(SPACE_17.concat(公費２).concat(SPACE_4)
                .concat(nullToEmpty(基本データ.get高額公費２負担番号()))
                .concat(SPACE_5).concat(kingakuFormat(基本データ.get高額公費２負担額())).concat(SPACE_5)
                .concat(kingakuFormat(基本データ.get高額公費２支給額())));
        個人用帳票データ.set明細6(SPACE_17.concat(公費３).concat(SPACE_4)
                .concat(nullToEmpty(基本データ.get高額公費３負担番号()))
                .concat(SPACE_5).concat(kingakuFormat(基本データ.get高額公費３負担額())).concat(SPACE_5)
                .concat(kingakuFormat(基本データ.get高額公費２支給額())));
        データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, INDEX_3, INDEX_3, 保険者コード, 保険者名));
    }

    private void report7131_2131(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<ShuukeiEntity> 集計List,
            List<ShakaiHukushiHouzinKeigenEntity> 社福List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 社福 = set社会福祉法人軽減額の編集(社福List, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 社福.size()) {
            tmp = 社福.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            if (i < 社福.size()
                    && 社福.get(i) != null) {
                個人用帳票データ = set社会福祉法人軽減額の編集(社福List, 個人用帳票データ).get(i);
            }
            データList.insert(
                    set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report7143_2143(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<ShuukeiEntity> 集計List,
            List<ShakaiHukushiHouzinKeigenEntity> 社福List,
            List<TokuteiServiceHiEntity> 入所List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 社福 = set社会福祉法人軽減額の編集(社福List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 入所 = set入所(基本, 入所List, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 社福.size()) {
            tmp = 社福.size();
        }
        if (tmp < 入所.size()) {
            tmp = 入所.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            if (i < 社福.size()
                    && 社福.get(i) != null) {
                個人用帳票データ = set社会福祉法人軽減額の編集(社福List, 個人用帳票データ).get(i);
            }
            if (i < 入所.size()
                    && 入所.get(i) != null) {
                個人用帳票データ = set入所(基本, 入所List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report7155_2155(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<KinkyuuziShisetuRyouyouEntity> 施設療養List,
            List<TokuteiShinryouHiEntity> 特別療養List,
            List<ShuukeiEntity> 集計List,
            List<TokuteiServiceHiEntity> 入所List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 入所 = set入所(基本, 入所List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 施設療養 = set施設療養明細(施設療養List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 特別療養 = set特別療養明細(特別療養List, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 施設療養.size()) {
            tmp = 施設療養.size();
        }
        if (tmp < 入所.size()) {
            tmp = 入所.size();
        }
        if (tmp < 特別療養.size()) {
            tmp = 特別療養.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            if (i < 施設療養.size()
                    && 施設療養.get(i) != null) {
                個人用帳票データ = set施設療養明細(施設療養List, 個人用帳票データ).get(i);
            }
            if (i < 入所.size()
                    && 入所.get(i) != null) {
                個人用帳票データ = set入所(基本, 入所List, 個人用帳票データ).get(i);
            }
            if (i < 特別療養.size()
                    && 特別療養.get(i) != null) {
                個人用帳票データ = set特別療養明細(特別療養List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report7164_2164(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<TokuteiShinryouHiEntity> 特別療養List,
            List<ShuukeiEntity> 集計List,
            List<TokuteiServiceHiEntity> 入所List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 入所 = set入所(基本, 入所List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 特別療養 = set特別療養明細(特別療養List, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 入所.size()) {
            tmp = 入所.size();
        }
        if (tmp < 特別療養.size()) {
            tmp = 特別療養.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            if (i < 入所.size()
                    && 入所.get(i) != null) {
                個人用帳票データ = set入所(基本, 入所List, 個人用帳票データ).get(i);
            }
            if (i < 特別療養.size()
                    && 特別療養.get(i) != null) {
                個人用帳票データ = set特別療養明細(特別療養List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report7171_2171(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<ShuukeiEntity> 集計List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report8124_2184(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<KeikakuHiEntity> 計画費List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 計画費 = JukyushaKyufuDaichoData.set計画費明細(計画費List, 個人用帳票データ);
        for (int i = 0; i < 計画費.size(); i++) {
            データList.insert(set帳票データ(jukyushaKyufuDaicho,
                    計画費.get(i), i, 計画費.size(), 保険者コード, 保険者名));
        }
    }

    private void report7195_2195(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<ShoteiShikkanEntity> 所定疾患List,
            List<ShuukeiEntity> 集計List,
            List<TokuteiServiceHiEntity> 入所List,
            List<TokuteiShinryouHiEntity> 特別療養List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 所定疾患 = set所定疾患施設療養明細(所定疾患List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 入所 = set入所(基本, 入所List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 特別療養 = set特別療養明細(特別療養List, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 所定疾患.size()) {
            tmp = 所定疾患.size();
        }
        if (tmp < 入所.size()) {
            tmp = 入所.size();
        }
        if (tmp < 特別療養.size()) {
            tmp = 特別療養.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            if (i < 所定疾患.size()
                    && 所定疾患.get(i) != null) {
                個人用帳票データ = set所定疾患施設療養明細(所定疾患List, 個人用帳票データ).get(i);
            }
            if (i < 入所.size()
                    && 入所.get(i) != null) {
                個人用帳票データ = set入所(基本, 入所List, 個人用帳票データ).get(i);
            }
            if (i < 特別療養.size()
                    && 特別療養.get(i) != null) {
                個人用帳票データ = set特別療養明細(特別療養List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report71A3_21A3(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<ShuukeiEntity> 集計List,
            List<TokuteiServiceHiEntity> 入所List,
            List<TokuteiShinryouHiEntity> 特別療養List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 入所 = set入所(基本, 入所List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 特別療養 = set特別療養明細(特別療養List, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 入所.size()) {
            tmp = 入所.size();
        }
        if (tmp < 特別療養.size()) {
            tmp = 特別療養.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            if (i < 入所.size()
                    && 入所.get(i) != null) {
                個人用帳票データ = set入所(基本, 入所List, 個人用帳票データ).get(i);
            }
            if (i < 特別療養.size()
                    && 特別療養.get(i) != null) {
                個人用帳票データ = set特別療養明細(特別療養List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report21C1(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<HukushiYouguEntity> 福祉List,
            List<ShuukeiEntity> 集計List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 福祉 = set福祉用具の編集(福祉List, 個人用帳票データ);

        int tmp = 0;
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 福祉.size()) {
            tmp = 福祉.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 福祉.size()
                    && 福祉.get(i) != null) {
                個人用帳票データ = set福祉用具の編集(福祉List, 個人用帳票データ).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report21D1(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<JuutakuKaishuuEntity> 住宅List,
            List<ShuukeiEntity> 集計List,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 集計 = set集計(基本, 集計List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 住宅 = set住宅改修(住宅List, 個人用帳票データ);

        int tmp = 0;
        if (tmp < 集計.size()) {
            tmp = 集計.size();
        }
        if (tmp < 住宅.size()) {
            tmp = 住宅.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 住宅.size()
                    && 住宅.get(i) != null) {
                個人用帳票データ = set住宅改修(住宅List, 個人用帳票データ).get(i);
            }
            if (i < 集計.size()
                    && 集計.get(i) != null) {
                個人用帳票データ = set集計(基本, 集計List, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private void report8161(JukyushaKyufuJissekidaichoData jukyushaKyufuDaicho,
            KihonEntity 基本,
            List<MeisaiEntity> 明細List,
            List<CareManagementEntity> ケアList,
            BatchEntityCreatedTempTableWriter データList) {
        KojinyoTyohyoDataKomoku 個人用帳票データ = new KojinyoTyohyoDataKomoku();
        個人用帳票データ = set基本(基本, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> 明細 = set明細(基本, 明細List, 個人用帳票データ);
        List<KojinyoTyohyoDataKomoku> ケア = setケアマネジメント費の編集(ケアList, 個人用帳票データ);
        int tmp = 0;
        if (tmp < 明細.size()) {
            tmp = 明細.size();
        }
        if (tmp < ケア.size()) {
            tmp = ケア.size();
        }
        for (int i = 0; i < tmp; i++) {
            if (i < 明細.size()
                    && 明細.get(i) != null) {
                個人用帳票データ = set明細(基本, 明細List, 明細.get(i)).get(i);
            }
            if (i < ケア.size()
                    && ケア.get(i) != null) {
                個人用帳票データ = setケアマネジメント費の編集(ケアList, 個人用帳票データ).get(i);
            }
            データList.insert(set帳票データ(jukyushaKyufuDaicho, 個人用帳票データ, i, tmp, 保険者コード, 保険者名));
        }
    }

    private KojinyoTyohyoDataKomoku set基本(KihonEntity 基本,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        個人用帳票データ.set頁数(頁数_1);
        個人用帳票データ.set被保険者番号(基本.get被保険者番号());
        個人用帳票データ.set実績区分(基本.get給付実績区分コード());
        個人用帳票データ.set被保険者氏名カナ(基本.get被保険者氏名カナ());
        個人用帳票データ.set被保険者氏名(基本.get被保険者氏名());
        個人用帳票データ.set生年月日(基本.get生年月日());
        個人用帳票データ.set性別(基本.get性別コード());
        個人用帳票データ.set要介護度(基本.get要介護度());
        個人用帳票データ.set認定有効期間(基本.get認定有効期間());
        個人用帳票データ.set証記載保険者番号(基本.get証記載保険者番号());
        個人用帳票データ.set老健市町村番号(基本.get老人保険市町村番号());
        個人用帳票データ.set老健受給者番号(基本.get老人保険受給者番号());
        個人用帳票データ.set旧措置入所者特例コード(基本.get旧措置入所者特例コード());
        個人用帳票データ.set警告区分コード(基本.get警告区分コード());
        個人用帳票データ.set審査年月(基本.get審査年月());
        個人用帳票データ.setサービス提供年月(基本.getサービス提供年月());
        個人用帳票データ.set住民コード(基本.get住民コード());
        個人用帳票データ.set世帯コード(基本.get世帯コード());
        個人用帳票データ.set住所コード(基本.get住所コード());
        個人用帳票データ.set住所(基本.get住所());
        個人用帳票データ.set行政区コード(基本.get行政区コード());
        個人用帳票データ.set行政区(基本.get行政区());
        個人用帳票データ.set後期高齢者資格情報_保険者番号(基本.get保険者番号後期());
        個人用帳票データ.set後期高齢者資格情報_被保険者番号(基本.get被保険者番号後期());
        個人用帳票データ.set国保資格情報_保険者番号(基本.get保険者番号国保());
        個人用帳票データ.set国保資格情報_被保険者証番号(基本.get被保険者証番号国保());
        個人用帳票データ.set国保資格情報_個人番号(基本.get整理番号());
        個人用帳票データ.set整理番号(基本.get整理番号());
        個人用帳票データ.setサービス計画作成1(基本.get居住サービス計画作成区分名１());
        個人用帳票データ.setサービス計画作成2(基本.get居住サービス計画作成区分名２());
        個人用帳票データ.set居宅サービス計画事業者(基本.get居住サービス計画事業者番号());
        個人用帳票データ.set居宅サービス計画事業者名1(基本.get居住サービス計画事業者名１());
        個人用帳票データ.set居宅サービス計画事業者名2(基本.get居住サービス計画事業者名２());
        個人用帳票データ.set入所_院_期間(基本.get入所院期間());
        個人用帳票データ.set入所_院_実日数(基本.get入所院実日数());
        個人用帳票データ.set外泊日数(基本.get外泊日数());
        個人用帳票データ.set出力様式(基本.get出力様式());
        個人用帳票データ.set出力様式１(基本.get出力様式１());
        個人用帳票データ.set出力様式２(基本.get出力様式２());
        個人用帳票データ.setサービス事業者(基本.getサービス事業者番号());
        個人用帳票データ.setサービス事業者名(基本.getサービス事業者名());
        個人用帳票データ.set退所_院_の状態(基本.get退所院の状態());
        個人用帳票データ.setサービス期間(基本.getサービス期間());
        個人用帳票データ.set中止理由タイトル(基本.get中止理由タイトル());
        個人用帳票データ.set中止理由(基本.get中止理由コード());
        個人用帳票データ.set保険_給付率(基本.get保険給付率());
        個人用帳票データ.set決定前_ｻｰﾋﾞｽ単位数_保険(基本.get前サービス単位数());
        個人用帳票データ.set決定後_ｻｰﾋﾞｽ単位数_保険(基本.get後サービス単位数());
        個人用帳票データ.set決定前_請求額_保険(基本.get前保険請求額());
        個人用帳票データ.set決定後_請求額_保険(基本.get後保険請求額());
        個人用帳票データ.set決定前_負担額_保険(基本.get前利用者負担額());
        個人用帳票データ.set決定後_負担額_保険(基本.get後利用者負担額());
        個人用帳票データ.set決定前_施設療養費請求額_保険(基本.get前緊急時施設療養費請求額());
        個人用帳票データ.set決定後_施設療養費請求額_保険(基本.get後緊急時施設療養費請求額());
        個人用帳票データ.set基本ヘッダー１(基本.get基本ヘッダー１());
        個人用帳票データ.set基本ヘッダー２(基本.get基本ヘッダー２());
        個人用帳票データ.set決定前_特別療養費請求額_保険(基本.get前特定診療費請求額());
        個人用帳票データ.set決定後_特別療養費請求額_保険(基本.get後特定診療費請求額());
        個人用帳票データ.set基本ヘッダー3(基本.get基本ヘッダー3());
        個人用帳票データ.set基本ヘッダー４(基本.get基本ヘッダー４());
        個人用帳票データ.set決定前_特定入所者介護費等請求額_保険(基本.get前特定入所者介護サービス等等請求額());
        個人用帳票データ.set決定後_特定入所者介護費等請求額_保険(基本.get後特定入所者介護サービス等等請求額());
        個人用帳票データ.set公費負担者_公費１(基本.get公費１負担者番号());
        個人用帳票データ.set公費受給者_公費１(基本.get公費１受給者番号());
        個人用帳票データ.set給付率_公費１(基本.get公費１給付率());
        個人用帳票データ.set決定前_サービス単位数_公費１(基本.get前公費１サービス単位数());
        個人用帳票データ.set決定後_サービス単位数_公費１(基本.get後公費１サービス単位数());
        個人用帳票データ.set決定前_請求額_公費１(基本.get前公費１保険請求額());
        個人用帳票データ.set決定後_請求額_公費１(基本.get後公費１保険請求額());
        個人用帳票データ.set決定前_負担額_公費１(基本.get前公費１利用者負担額());
        個人用帳票データ.set決定後_負担額_公費１(基本.get後公費１利用者負担額());
        個人用帳票データ.set決定前_施設療養費請求額_公費１(基本.get前公費１緊急時施設療養費請求額());
        個人用帳票データ.set決定後_施設療養費請求額_公費１(基本.get後公費１緊急時施設療養費請求額());
        個人用帳票データ.set決定前_特別療養費請求額_公費１(基本.get前公費１特定診療費請求額());
        個人用帳票データ.set決定後_特別療養費請求額_公費１(基本.get後公費１特定診療費請求額());
        個人用帳票データ.set決定前_特定入所者介護費等請求額_公費１(基本.get前公費１特定入所者介護サービス費等請求額());
        個人用帳票データ.set決定後_特定入所者介護費等請求額_公費１(基本.get後公費１特定入所者介護サービス費等請求額());
        個人用帳票データ.set公費負担者_公費２(基本.get公費２負担者番号());
        個人用帳票データ.set公費受給者_公費２(基本.get公費２受給者番号());
        個人用帳票データ.set給付率_公費２(基本.get公費２給付率());
        個人用帳票データ.set決定前_サービス単位数_公費２(基本.get前公費２サービス単位数());
        個人用帳票データ.set決定後_サービス単位数_公費２(基本.get後公費２サービス単位数());
        個人用帳票データ.set決定前_請求額_公費２(基本.get前公費２保険請求額());
        個人用帳票データ.set決定後_請求額_公費２(基本.get後公費２保険請求額());
        個人用帳票データ.set決定前_負担額_公費２(基本.get前公費２利用者負担額());
        個人用帳票データ.set決定後_負担額_公費２(基本.get後公費２利用者負担額());
        個人用帳票データ.set決定前_施設療養費請求額_公費２(基本.get前公費２緊急時施設療養費請求額());
        個人用帳票データ.set決定後_施設療養費請求額_公費２(基本.get後公費２緊急時施設療養費請求額());
        個人用帳票データ.set決定前_特別療養費請求額_公費２(基本.get前公費２特定診療費請求額());
        個人用帳票データ.set決定後_特別療養費請求額_公費２(基本.get後公費２特定診療費請求額());
        個人用帳票データ.set決定前_特定入所者介護費等請求額_公費２(基本.get前公費２特定入所者介護サービス費等請求額());
        個人用帳票データ.set決定後_特定入所者介護費等請求額_公費２(基本.get後公費２特定入所者介護サービス費等請求額());
        個人用帳票データ.set公費負担者_公費３(基本.get公費３負担者番号());
        個人用帳票データ.set公費受給者_公費３(基本.get公費３受給者番号());
        個人用帳票データ.set給付率_公費３(基本.get公費３給付率());
        個人用帳票データ.set決定前_サービス単位数_公費３(基本.get前公費３サービス単位数());
        個人用帳票データ.set決定後_ｻｰﾋﾞｽ単位数_公費３(基本.get後公費３サービス単位数());
        個人用帳票データ.set決定前_請求額_公費３(基本.get前公費３保険請求額());
        個人用帳票データ.set決定後_請求額_公費３(基本.get後公費３保険請求額());
        個人用帳票データ.set決定前_負担額_公費３(基本.get前公費３利用者負担額());
        個人用帳票データ.set決定後_負担額_公費３(基本.get後公費３利用者負担額());
        個人用帳票データ.set決定前_施設療養費請求額_公費３(基本.get前公費３緊急時施設療養費請求額());
        個人用帳票データ.set決定後_施設療養費請求額_公費３(基本.get後公費３緊急時施設療養費請求額());
        個人用帳票データ.set決定前_特別療養費請求額_公費３(基本.get前公費３特定診療費請求額());
        個人用帳票データ.set決定後_特別療養費請求額_公費３(基本.get後公費３特定診療費請求額());
        個人用帳票データ.set決定前_特定入所者介護費等請求額_公費３(基本.get前公費３特定入所者介護サービス費等請求額());
        個人用帳票データ.set決定後_特定入所者介護費等請求額_公費３(基本.get後公費３特定入所者介護サービス費等請求額());
        個人用帳票データ.set市町村コード(基本.get市町村コード());
        個人用帳票データ.set入力識別番号(基本.get入力識別番号());
        個人用帳票データ.set事業所番号(基本.get事業所番号());
        return 個人用帳票データ;
    }

    private List<KojinyoTyohyoDataKomoku> set明細(KihonEntity 基本,
            List<MeisaiEntity> list明細,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list明細データ = new ArrayList<>();
        for (int i = 0; i < list明細.size(); i++) {
            MeisaiEntity 明細 = list明細.get(i);
            if (基本.get入力識別番号().equals(明細.get入力識別番号())
                    && 基本.get被保険者番号().equals(明細.get被保険者番号())
                    && 基本.getサービス提供年月().equals(明細.getサービス提供年月().toDateString())
                    && 基本.get事業所番号().equals(明細.get事業所番号())
                    && 基本.get通し番号().equals(明細.get通し番号())) {
                list明細データ = 明細セット(i, list明細データ, list明細, 明細, 個人用帳票データ);
                if ((i % LIST_SIZE_3) == 2) {
                    個人用帳票データ.setサービスコード3(明細.getサービス種類コード().concat(明細.getサービス項目コード()));
                    個人用帳票データ.setサービス内容3(明細.getサービス内容());
                    個人用帳票データ.set決定前_単位数3(明細.get単位数());
                    個人用帳票データ.set決定後_単位数3(明細.get後単位数());
                    個人用帳票データ.set単位数識別3(明細.get単位数識別());
                    個人用帳票データ.set決定前_日の回数3(integerTOInt(明細.get日数回数()));
                    個人用帳票データ.set決定後_日の回数3(integerTOInt(明細.get後日数回数()));
                    個人用帳票データ.set決定前_サービス単位数3(明細.getサービス単位数());
                    個人用帳票データ.set決定後_サービス単位数3(明細.get後サービス単位数());
                    個人用帳票データ.set決定前_日の回数3_公費１対象(integerTOInt(明細.get公費１対象日数回数()));
                    個人用帳票データ.set決定後_日の回数3_公費１対象(integerTOInt(明細.get後公費１対象日数回数()));
                    個人用帳票データ.set決定前_サービス単位数3_公費１対象(明細.get公費１対象サービス点数());
                    個人用帳票データ.set決定後_サービス単位数3_公費１対象(明細.get後公費１対象サービス点数());
                    個人用帳票データ.set決定前_１日の回数3_公費２対象(integerTOInt(明細.get公費２対象日数回数()));
                    個人用帳票データ.set決定後_１日の回数3_公費２対象(integerTOInt(明細.get後公費２対象日数回数()));
                    個人用帳票データ.set決定前_サービス単位数3_公費２対象(明細.get公費２対象サービス点数());
                    個人用帳票データ.set決定後_サービス単位数3_公費２対象(明細.get後公費２対象サービス点数());
                    個人用帳票データ.set決定前_日の回数3_公費３対象(integerTOInt(明細.get公費３対象日数回数()));
                    個人用帳票データ.set決定後_日の回数3_公費３対象(integerTOInt(明細.get後公費３対象日数回数()));
                    個人用帳票データ.set決定前_サービス単位数3_公費３対象(明細.get公費３対象サービス点数());
                    個人用帳票データ.set決定後_サービス単位数3_公費３対象(明細.get後公費３対象サービス点数());
                    個人用帳票データ.set摘要3(明細.get摘要());
                    個人用帳票データ.set再審査回数3(integerTOInt(明細.get再審査回数()));
                    個人用帳票データ.set過誤回数3(integerTOInt(明細.get過誤回数()));
                    個人用帳票データ.set審査年月3(明細.get審査年月());
                    list明細データ.add(個人用帳票データ);
                }
            }
        }
        return list明細データ;
    }

    private List<KojinyoTyohyoDataKomoku> 明細セット(int i,
            List<KojinyoTyohyoDataKomoku> list明細データ,
            List<MeisaiEntity> list明細,
            MeisaiEntity 明細,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        if ((i % LIST_SIZE_3) == 0) {
            個人用帳票データ.setサービスコード1(明細.getサービス種類コード().concat(明細.getサービス項目コード()));
            個人用帳票データ.setサービス内容1(明細.getサービス内容());
            個人用帳票データ.set決定前_単位数1(明細.get単位数());
            個人用帳票データ.set決定後_単位数1(明細.get後単位数());
            個人用帳票データ.set単位数識別1(明細.get単位数識別());
            個人用帳票データ.set決定前_日の回数1(null == 明細.get日数回数() ? 0 : 明細.get日数回数());
            個人用帳票データ.set決定後_日の回数1(null == 明細.get後日数回数() ? 0 : 明細.get後日数回数());
            個人用帳票データ.set決定前_サービス単位数1(明細.getサービス単位数());
            個人用帳票データ.set決定後_サービス単位数1(明細.get後サービス単位数());
            個人用帳票データ.set決定前_日の回数1_公費１対象(null == 明細.get公費１対象日数回数() ? 0 : 明細.get公費１対象日数回数());
            個人用帳票データ.set決定後_日の回数1_公費１対象(null == 明細.get後公費１対象日数回数() ? 0 : 明細.get後公費１対象日数回数());
            個人用帳票データ.set決定前_サービス単位数1_公費１対象(明細.get公費１対象サービス点数());
            個人用帳票データ.set決定後_サービス単位数1_公費１対象(明細.get後公費１対象サービス点数());
            個人用帳票データ.set決定前_１日の回数1_公費２対象(null == 明細.get公費２対象日数回数() ? 0 : 明細.get公費２対象日数回数());
            個人用帳票データ.set決定後_１日の回数1_公費２対象(null == 明細.get後公費２対象日数回数() ? 0 : 明細.get後公費２対象日数回数());
            個人用帳票データ.set決定前_サービス単位数1_公費２対象(明細.get公費２対象サービス点数());
            個人用帳票データ.set決定後_サービス単位数1_公費２対象(明細.get後公費２対象サービス点数());
            個人用帳票データ.set決定前_日の回数1_公費３対象(null == 明細.get公費３対象日数回数() ? 0 : 明細.get公費３対象日数回数());
            個人用帳票データ.set決定後_日の回数1_公費３対象(null == 明細.get後公費３対象日数回数() ? 0 : 明細.get後公費３対象日数回数());
            個人用帳票データ.set決定前_サービス単位数1_公費３対象(明細.get公費３対象サービス点数());
            個人用帳票データ.set決定後_サービス単位数1_公費３対象(明細.get後公費３対象サービス点数());
            個人用帳票データ.set摘要1(明細.get摘要());
            個人用帳票データ.set再審査回数1(null == 明細.get再審査回数() ? 0 : 明細.get再審査回数());
            個人用帳票データ.set過誤回数1(null == 明細.get過誤回数() ? 0 : 明細.get過誤回数());
            個人用帳票データ.set審査年月1(明細.get審査年月());
            if (i == list明細.size() - 1) {
                list明細データ.add(個人用帳票データ);
            }
        }
        if ((i % LIST_SIZE_3) == 1) {
            個人用帳票データ.setサービスコード2(明細.getサービス種類コード().concat(明細.getサービス項目コード()));
            個人用帳票データ.setサービス内容2(明細.getサービス内容());
            個人用帳票データ.set決定前_単位数2(明細.get単位数());
            個人用帳票データ.set決定後_単位数2(明細.get後単位数());
            個人用帳票データ.set単位数識別2(明細.get単位数識別());
            個人用帳票データ.set決定前_日の回数2(integerTOInt(明細.get日数回数()));
            個人用帳票データ.set決定後_日の回数2(integerTOInt(明細.get後日数回数()));
            個人用帳票データ.set決定前_サービス単位数2(明細.getサービス単位数());
            個人用帳票データ.set決定後_サービス単位数2(明細.get後サービス単位数());
            個人用帳票データ.set決定前_日の回数2_公費１対象(integerTOInt(明細.get公費１対象日数回数()));
            個人用帳票データ.set決定後_日の回数2_公費１対象(integerTOInt(明細.get後公費１対象日数回数()));
            個人用帳票データ.set決定前_サービス単位数2_公費１対象(明細.get公費１対象サービス点数());
            個人用帳票データ.set決定後_サービス単位数2_公費１対象(明細.get後公費１対象サービス点数());
            個人用帳票データ.set決定前_１日の回数2_公費２対象(integerTOInt(明細.get公費２対象日数回数()));
            個人用帳票データ.set決定後_１日の回数2_公費２対象(integerTOInt(明細.get後公費２対象日数回数()));
            個人用帳票データ.set決定前_サービス単位数2_公費２対象(明細.get公費２対象サービス点数());
            個人用帳票データ.set決定後_サービス単位数2_公費２対象(明細.get後公費２対象サービス点数());
            個人用帳票データ.set決定前_日の回数2_公費３対象(integerTOInt(明細.get公費３対象日数回数()));
            個人用帳票データ.set決定後_日の回数2_公費３対象(integerTOInt(明細.get後公費３対象日数回数()));
            個人用帳票データ.set決定前_サービス単位数2_公費３対象(明細.get公費３対象サービス点数());
            個人用帳票データ.set決定後_サービス単位数2_公費３対象(明細.get後公費３対象サービス点数());
            個人用帳票データ.set摘要2(明細.get摘要());
            個人用帳票データ.set再審査回数2(integerTOInt(明細.get再審査回数()));
            個人用帳票データ.set過誤回数2(integerTOInt(明細.get過誤回数()));
            個人用帳票データ.set審査年月2(明細.get審査年月());
            if (i == list明細.size() - 1) {
                list明細データ.add(個人用帳票データ);
            }
        }
        return list明細データ;
    }

    private List<KojinyoTyohyoDataKomoku> set入所(
            KihonEntity 基本,
            List<TokuteiServiceHiEntity> list特定,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        List list順次番号 = new ArrayList();
        for (int i = 0; i < list特定.size(); i++) {
            TokuteiServiceHiEntity 特定 = list特定.get(i);
            int 順次番号 = 0;
            if (!RString.isNullOrEmpty(list特定.get(i).get順次番号())) {
                順次番号 = Integer.parseInt(list特定.get(i).get順次番号().toString());
            }
            list順次番号.add(順次番号);
            Integer max順次番号_Int = (Integer) Collections.max(list順次番号);
            RString max順次番号 = new RString(max順次番号_Int.intValue());
            最大データ(max順次番号, 特定, 個人用帳票データ);
            if (基本.get入力識別番号().equals(特定.get入力識別番号())
                    && 基本.get被保険者番号().equals(特定.get被保険者番号())
                    && 基本.getサービス提供年月().equals(特定.getサービス提供年月().toDateString())
                    && 基本.get事業所番号().equals(特定.get事業所番号())
                    && 基本.get通し番号().equals(特定.get通し番号())) {
                list特定データ = 入所セット(i, 特定, list特定, list特定データ, 個人用帳票データ);
                if ((i % LIST_SIZE_3) == 2) {
                    個人用帳票データ.set番号3(特定.get順次番号());
                    個人用帳票データ.setサービスコードﾞ3(特定.getサービス種別コード().concat(特定.getサービス項目コード()));
                    個人用帳票データ.setサービス内容3(特定.getサービス内容());
                    個人用帳票データ.set決定前_費用単価3(特定.get費用単価());
                    個人用帳票データ.set決定後_費用単価3(特定.get後費用単価());
                    個人用帳票データ.set負担限度額3(特定.get負担限度額());
                    個人用帳票データ.set決定前_日数3(integerTOInt(特定.get日数()));
                    個人用帳票データ.set決定後_日数3(integerTOInt(特定.get後日数()));
                    個人用帳票データ.set決定前_公費１日数3(integerTOInt(特定.get公費１日数()));
                    個人用帳票データ.set決定後_公費１日数3(integerTOInt(特定.get後公費１日数()));
                    個人用帳票データ.set決定前_公費２日数3(integerTOInt(特定.get公費２日数()));
                    個人用帳票データ.set決定後_公費２日数3(integerTOInt(特定.get後公費２日数()));
                    個人用帳票データ.set決定前_公費３日数3(integerTOInt(特定.get公費３日数()));
                    個人用帳票データ.set決定後_公費３日数3(integerTOInt(特定.get後公費３日数()));
                    個人用帳票データ.set決定前_費用額3(特定.get費用額());
                    個人用帳票データ.set決定後_費用額3(特定.get後費用額());
                    個人用帳票データ.set決定前_保険分請求額3(特定.get保険分請求額());
                    個人用帳票データ.set決定後_保険分請求額3(特定.get後保険分請求額());
                    個人用帳票データ.set決定前_公費１負担額3(特定.get公費１負担額明細());
                    個人用帳票データ.set決定後_公費１負担額3(特定.get後公費１負担額明細());
                    個人用帳票データ.set決定前_公費２負担額3(特定.get公費２負担額明細());
                    個人用帳票データ.set決定後_公費２負担額3(特定.get後公費２負担額明細());
                    個人用帳票データ.set決定前_公費３負担額3(特定.get公費３負担額明細());
                    個人用帳票データ.set決定後_公費３負担額3(特定.get後公費３負担額明細());
                    個人用帳票データ.set決定前_利用者負担額3(特定.get利用者負担額());
                    個人用帳票データ.set決定後_利用者負担額3(特定.get後利用者負担額());
                    個人用帳票データ.set再審査回数3(特定.get再審査回数());
                    個人用帳票データ.set過誤回数3(特定.get過誤回数());
                    個人用帳票データ.set審査年月3(特定.get審査年月());
                    list特定データ.add(個人用帳票データ);
                }
            }
        }
        return list特定データ;

    }

    private List<KojinyoTyohyoDataKomoku> 入所セット(int i,
            TokuteiServiceHiEntity 特定,
            List<TokuteiServiceHiEntity> list特定,
            List<KojinyoTyohyoDataKomoku> list特定データ,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        if ((i % LIST_SIZE_3 == 0)) {
            個人用帳票データ.set番号1(特定.get順次番号());
            個人用帳票データ.setサービスコードﾞ1(特定.getサービス種別コード().concat(特定.getサービス項目コード()));
            個人用帳票データ.setサービス内容1(特定.getサービス内容());
            個人用帳票データ.set決定前_費用単価1(特定.get費用単価());
            個人用帳票データ.set決定後_費用単価1(特定.get後費用単価());
            個人用帳票データ.set負担限度額1(特定.get負担限度額());
            個人用帳票データ.set決定前_日数1(integerTOInt(特定.get日数()));
            個人用帳票データ.set決定後_日数1(integerTOInt(特定.get後日数()));
            個人用帳票データ.set決定前_公費１日数1(integerTOInt(特定.get公費１日数()));
            個人用帳票データ.set決定後_公費１日数1(integerTOInt(特定.get後公費１日数()));
            個人用帳票データ.set決定前_公費２日数1(integerTOInt(特定.get公費２日数()));
            個人用帳票データ.set決定後_公費２日数1(integerTOInt(特定.get後公費２日数()));
            個人用帳票データ.set決定前_公費３日数1(integerTOInt(特定.get公費３日数()));
            個人用帳票データ.set決定後_公費３日数1(integerTOInt(特定.get後公費３日数()));
            個人用帳票データ.set決定前_費用額1(特定.get費用額());
            個人用帳票データ.set決定後_費用額1(特定.get後費用額());
            個人用帳票データ.set決定前_保険分請求額1(特定.get保険分請求額());
            個人用帳票データ.set決定後_保険分請求額1(特定.get後保険分請求額());
            個人用帳票データ.set決定前_公費１負担額1(特定.get公費１負担額明細());
            個人用帳票データ.set決定後_公費１負担額1(特定.get後公費１負担額明細());
            個人用帳票データ.set決定前_公費２負担額1(特定.get公費２負担額明細());
            個人用帳票データ.set決定後_公費２負担額1(特定.get後公費２負担額明細());
            個人用帳票データ.set決定前_公費３負担額1(特定.get公費３負担額明細());
            個人用帳票データ.set決定後_公費３負担額1(特定.get後公費３負担額明細());
            個人用帳票データ.set決定前_利用者負担額1(特定.get利用者負担額());
            個人用帳票データ.set決定後_利用者負担額1(特定.get後利用者負担額());
            個人用帳票データ.set再審査回数1(特定.get再審査回数());
            個人用帳票データ.set過誤回数1(特定.get過誤回数());
            個人用帳票データ.set審査年月1(特定.get審査年月());
            if (i == list特定.size() - 1) {
                list特定データ.add(個人用帳票データ);
            }
        }
        if (i % LIST_SIZE_3 == 1) {
            個人用帳票データ.set番号2(特定.get順次番号());
            個人用帳票データ.setサービスコードﾞ2(特定.getサービス種別コード().concat(特定.getサービス項目コード()));
            個人用帳票データ.setサービス内容2(特定.getサービス内容());
            個人用帳票データ.set決定前_費用単価2(特定.get費用単価());
            個人用帳票データ.set決定後_費用単価2(特定.get後費用単価());
            個人用帳票データ.set負担限度額2(特定.get負担限度額());
            個人用帳票データ.set決定前_日数2(integerTOInt(特定.get日数()));
            個人用帳票データ.set決定後_日数2(integerTOInt(特定.get後日数()));
            個人用帳票データ.set決定前_公費１日数2(integerTOInt(特定.get公費１日数()));
            個人用帳票データ.set決定後_公費１日数2(integerTOInt(特定.get後公費１日数()));
            個人用帳票データ.set決定前_公費２日数2(integerTOInt(特定.get公費２日数()));
            個人用帳票データ.set決定後_公費２日数2(integerTOInt(特定.get後公費２日数()));
            個人用帳票データ.set決定前_公費３日数2(integerTOInt(特定.get公費３日数()));
            個人用帳票データ.set決定後_公費３日数2(integerTOInt(特定.get後公費３日数()));
            個人用帳票データ.set決定前_費用額2(特定.get費用額());
            個人用帳票データ.set決定後_費用額2(特定.get後費用額());
            個人用帳票データ.set決定前_保険分請求額2(特定.get保険分請求額());
            個人用帳票データ.set決定後_保険分請求額2(特定.get後保険分請求額());
            個人用帳票データ.set決定前_公費１負担額2(特定.get公費１負担額明細());
            個人用帳票データ.set決定後_公費１負担額2(特定.get後公費１負担額明細());
            個人用帳票データ.set決定前_公費２負担額2(特定.get公費２負担額明細());
            個人用帳票データ.set決定後_公費２負担額2(特定.get後公費２負担額明細());
            個人用帳票データ.set決定前_公費３負担額2(特定.get公費３負担額明細());
            個人用帳票データ.set決定後_公費３負担額2(特定.get後公費３負担額明細());
            個人用帳票データ.set決定前_利用者負担額2(特定.get利用者負担額());
            個人用帳票データ.set決定後_利用者負担額2(特定.get後利用者負担額());
            個人用帳票データ.set再審査回数2(特定.get再審査回数());
            個人用帳票データ.set過誤回数2(特定.get過誤回数());
            個人用帳票データ.set審査年月2(特定.get審査年月());
            if (i == list特定.size() - 1) {
                list特定データ.add(個人用帳票データ);
            }
        }
        return list特定データ;
    }

    private KojinyoTyohyoDataKomoku 最大データ(RString max順次番号,
            TokuteiServiceHiEntity 特定,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        if (max順次番号.equals(特定.get順次番号())) {
            個人用帳票データ.set決定前_費用額合計_合計情報(特定.get費用額合計());
            個人用帳票データ.set決定後_費用額合計_合計情報(特定.get後費用額合計());
            個人用帳票データ.set決定前_保険分請求額合計_合計情報(特定.get保険分請求額合計());
            個人用帳票データ.set決定後_保険分請求額合計_合計情報(特定.get後保険分請求額合計());
            個人用帳票データ.set決定前_利用者負担額合計_合計情報(特定.get利用者負担額合計());
            個人用帳票データ.set決定後_利用者負担額合計_合計情報(特定.get後利用者負担額合計());
            個人用帳票データ.set決定前_費用額合計_合計情報公費１(特定.get公費１負担額合計());
            個人用帳票データ.set決定後_費用額合計_合計情報公費１(特定.get後公費１負担額合計());
            個人用帳票データ.set決定前_保険分請求額合計_合計情報公費１(特定.get公費１保険分請求額合計());
            個人用帳票データ.set決定後_保険分請求額合計_合計情報公費１(特定.get後公費１保険分請求額合計());
            個人用帳票データ.set決定前_利用者負担額合計_合計情報公費１(特定.get公費１本人負担月額());
            個人用帳票データ.set決定後_利用者負担額合計_合計情報公費１(特定.get後公費１本人負担月額());
            個人用帳票データ.set決定前_費用額合計_合計情報公費２(特定.get公費２負担額合計());
            個人用帳票データ.set決定後_費用額合計_合計情報公費２(特定.get後公費２負担額合計());
            個人用帳票データ.set決定前_保険分請求額合計_合計情報公費２(特定.get公費２保険分請求額合計());
            個人用帳票データ.set決定後_保険分請求額合計_合計情報公費２(特定.get後公費２保険分請求額合計());
            個人用帳票データ.set決定前_利用者負担額合計_合計情報公費２(特定.get公費２本人負担月額());
            個人用帳票データ.set決定後_利用者負担額合計_合計情報公費２(特定.get後公費２本人負担月額());
            個人用帳票データ.set決定前_費用額合計_合計情報公費３(特定.get公費３負担額合計());
            個人用帳票データ.set決定後_費用額合計_合計情報公費３(特定.get後公費３負担額合計());
            個人用帳票データ.set決定前_保険分請求額合計_合計情報公費３(特定.get公費３保険分請求額合計());
            個人用帳票データ.set決定後_保険分請求額合計_合計情報公費３(特定.get後公費３保険分請求額合計());
            個人用帳票データ.set決定前_利用者負担額合計_合計情報公費３(特定.get公費３本人負担月額());
            個人用帳票データ.set決定後_利用者負担額合計_合計情報公費３(特定.get後公費３本人負担月額());
        }
        return 個人用帳票データ;
    }

    private List<KojinyoTyohyoDataKomoku> set集計(KihonEntity 基本,
            List<ShuukeiEntity> 集計List,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        for (ShuukeiEntity 集計 : 集計List) {
            if (基本.get入力識別番号().equals(集計.get入力識別番号())
                    && 基本.get被保険者番号().equals(集計.get被保険者番号())
                    && 基本.getサービス提供年月().equals(集計.getサービス提供年月().toDateString())
                    && 基本.get事業所番号().equals(集計.get事業所番号())
                    && 基本.get通し番号().equals(集計.get通し番号())) {
                FlexibleYearMonth サービス提供年月 = 集計.getサービス提供年月();
                個人用帳票データ.set集計_ｻｰﾋﾞｽ種類(集計.getサービス種類コード());
                個人用帳票データ.set集計_サービス種類名称1(集計.getサービス種類名称1());
                個人用帳票データ.set集計_サービス種類名称2(集計.getサービス種類名称2());
                個人用帳票データ.set集計_サービス実日数(integerTOInt(集計.getサービス実日数()));
                個人用帳票データ.set集計_計画単位数(集計.get計画単位数());
                個人用帳票データ.set集計_限度額管理対象単位数(集計.get限度額管理対象単位数());
                個人用帳票データ.set集計_限度額管理対象外単位数(集計.get限度額管理対象外単位数());
                if (less200201(サービス提供年月)) {
                    個人用帳票データ.set集計_決定後サービス計画日数1(短期入所);
                    個人用帳票データ.set集計_決定後サービス計画日数2(new RString("計画日数"));
                    個人用帳票データ.set集計_短期日数(new RString(集計.get短期入所計画日数()));
                    個人用帳票データ.set集計_決定後サービス実施日数1(短期入所);
                    個人用帳票データ.set集計_決定後サービス実施日数2(new RString("実日数"));
                    個人用帳票データ.set集計_決定後サービス実施日数3(new RString("下段決定後"));
                } else {
                    個人用帳票データ.set集計_決定後サービス実施日数1(new RString("決定後サー"));
                    個人用帳票データ.set集計_決定後サービス実施日数2(new RString("ビス実日数"));

                }
                個人用帳票データ.set集計_決定前_単位数合計_保険(集計.get請求点数合計());
                個人用帳票データ.set集計_決定後_単位数合計_保険(集計.get後点数合計());
                個人用帳票データ.set集計_単位数単価_保険(集計.get後請求点数単価());
                個人用帳票データ.set集計_決定前_請求額_保険(集計.get請求額());
                個人用帳票データ.set集計_決定後_請求額_保険(集計.get後保険請求分請求額());
                個人用帳票データ.set集計_負担額_保険(集計.get利用者負担額());
                個人用帳票データ.set集計_決定前_出来高医療費単位数合計_保険(集計.get出来高点数合計());
                個人用帳票データ.set集計_決定後_出来高医療費単位数合計_保険(集計.get後出来高点数合計());
                個人用帳票データ.set集計_決定前_出来高医療費請求額_保険(集計.get出来高請求額());
                個人用帳票データ.set集計_決定後_出来高医療費請求額_保険(集計.get後出来高請求額());
                個人用帳票データ.set集計_出来高医療費負担額_保険(集計.get利用者負担額());
                個人用帳票データ.set集計_決定前_単位数合計_公費１(集計.get公費１点数合計());
                個人用帳票データ.set集計_決定後_単位数合計_公費１(集計.get後公費１点数合計());
                個人用帳票データ.set集計_決定前_請求額_公費１(集計.get公費１請求額());
                個人用帳票データ.set集計_決定後_請求額_公費１(集計.get後公費１請求額());
                個人用帳票データ.set集計_負担額_公費１(集計.get公費１公費分本人負担額());
                個人用帳票データ.set集計_決定前_出来高医療費単位数合計_公費１(集計.get公費１出来高点数合計());
                個人用帳票データ.set集計_決定後_出来高医療費単位数合計_公費１(集計.get後公費１出来高点数合計());
                個人用帳票データ.set集計_決定前_出来高医療費請求額_公費１(集計.get公費１出来高請求額());
                個人用帳票データ.set集計_決定後_出来高医療費請求額_公費１(集計.get後公費１出来高請求額());
                個人用帳票データ.set集計_出来高医療費負担額_公費１(集計.get公費１_出来高医療費負担額());
                個人用帳票データ.set集計_決定前_単位数合計_公費２(集計.get公費２点数合計());
                個人用帳票データ.set集計_決定後_単位数合計_公費２(集計.get後公費２点数合計());
                個人用帳票データ.set集計_決定前_請求額_公費２(集計.get公費２請求額());
                個人用帳票データ.set集計_決定後_請求額_公費２(集計.get後公費２請求額());
                個人用帳票データ.set集計_負担額_公費２(集計.get公費２公費分本人負担額());
                個人用帳票データ.set集計_決定前_出来高医療費単位数合計_公費２(集計.get公費２出来高点数合計());
                個人用帳票データ.set集計_決定後_出来高医療費単位数合計_公費２(集計.get後公費２出来高点数合計());
                個人用帳票データ.set集計_決定前_出来高医療費請求額_公費２(集計.get公費２出来高請求額());
                個人用帳票データ.set集計_決定後_出来高医療費請求額_公費２(集計.get後公費２出来高請求額());
                個人用帳票データ.set集計_出来高医療費負担額_公費２(集計.get公費２_出来高医療費負担額());
                個人用帳票データ.set集計_決定前_単位数合計_公費３(集計.get公費３点数合計());
                個人用帳票データ.set集計_決定後_単位数合計_公費３(集計.get後公費３点数合計());
                個人用帳票データ.set集計_決定前_請求額_公費３(集計.get公費３請求額());
                個人用帳票データ.set集計_決定後_請求額_公費３(集計.get後公費３請求額());
                個人用帳票データ.set集計_負担額_公費３(集計.get公費３公費分本人負担額());
                個人用帳票データ.set集計_決定前_出来高医療費単位数合計_公費３(集計.get公費３出来高点数合計());
                個人用帳票データ.set集計_決定後_出来高医療費単位数合計_公費３(集計.get後公費３出来高点数合計());
                個人用帳票データ.set集計_決定前_出来高医療費請求額_公費３(集計.get公費３出来高請求額());
                個人用帳票データ.set集計_決定後_出来高医療費請求額_公費３(集計.get後公費３出来高請求額());
                個人用帳票データ.set集計_出来高医療費負担額_公費３(集計.get公費３_出来高医療費負担額());
                個人用帳票データ.set集計_再審査回数(integerTOInt(集計.get再審査回数()));
                個人用帳票データ.set集計_過誤回数(integerTOInt(集計.get過誤回数()));
                個人用帳票データ.set集計_審査年月(集計.get審査年月());
                list特定データ.add(個人用帳票データ);
            }
        }
        return list特定データ;
    }

    private int integerTOInt(Integer data) {
        if (data == null) {
            return 0;
        }
        return data;
    }

    private boolean less200201(FlexibleYearMonth サービス提供年月) {
        return サービス提供年月.isBefore(日付200201);
    }

    private RString dateFormat年月日(FlexibleDate date) {
        if (date == null || date.isEmpty()) {
            return RString.EMPTY;
        }
        return date.wareki().eraType(EraType.ALPHABET).firstYear(FirstYear.GAN_NEN).
                separator(Separator.PERIOD).fillType(FillType.ZERO).toDateString();
    }

    private RString dateFormat年月(FlexibleYearMonth date) {
        if (date == null || date.isEmpty()) {
            return RString.EMPTY;
        }
        return date.wareki().eraType(EraType.ALPHABET).firstYear(FirstYear.GAN_NEN).
                separator(Separator.PERIOD).fillType(FillType.ZERO).toDateString();
    }

    private RString kingakuFormat(int date) {
        return DecimalFormatter.toコンマ区切りRString(new Decimal(date), 0);
    }

    private List<KojinyoTyohyoDataKomoku> setケアマネジメント費の編集(
            List<CareManagementEntity> list編集,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        for (int i = 0; i < list編集.size(); i++) {
            CareManagementEntity 編集 = list編集.get(i);
            if (0 == i % INDEX_5) {
                個人用帳票データ.setヘッダー1(編集.get略称());
                個人用帳票データ.set明細2((CodeMaster.getCodeRyakusho(DBCCodeShubetsu.指定_基準該当等事業所区分.getコード(), new Code(編集.get指定基準該当等事業所区分コード()),
                        FlexibleDate.getNowDate())).concat(SPACE_10).concat(kingakuFormat(編集.get単位数()))
                        .concat(SPACE_12).concat(dateFormat年月日(編集.get居宅サービス計画作成依頼届出年月日()))
                        .concat(SPACE_7).concat(編集.get担当介護支援専門員番号()));
                個人用帳票データ.set明細4((new RString("明細行番号")).concat(SPACE_1).concat((new RString("決定前")))
                        .concat((SPACE_2)).concat((単位数)).concat((SPACE_2)).concat(回数)
                        .concat((SPACE_1)).concat((new RString("ｻｰﾋﾞｽ単位数"))).concat((SPACE_2)).concat((new RString("ｻｰﾋﾞｽ単位数合計")))
                        .concat((SPACE_2)).concat(請求金額).concat((SPACE_2)).concat(利用者負担額));
                個人用帳票データ.set明細5((new RString("ｻｰﾋﾞｽｺｰﾄ")).concat(SPACE_2).concat(決定後)
                        .concat((SPACE_2)).concat((単位数)).concat((SPACE_2)).concat(回数)
                        .concat((SPACE_1)).concat((new RString("ｻｰﾋﾞｽ単位数")))
                        .concat(SPACE_10).concat((new RString("ｻｰﾋﾞｽ単位数合計")))
                        .concat((SPACE_2)).concat(請求金額).concat((SPACE_2)).concat(利用者負担額));
                個人用帳票データ.set明細6((new RString("ｻｰﾋﾞｽ名称")).concat(new RString("　　　　　　　　　　　　　　　　　　　　　　　"))
                        .concat(摘要).concat(new RString("　　　　　　　　　　　　　　　　　　")).concat(再審査回数)
                        .concat(SPACE_2).concat(new RString("過誤回数")).concat(SPACE_2).concat(審査年月));
                個人用帳票データ.set明細7(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())));
                個人用帳票データ.set明細8(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())).concat(monziForma六スペース(編集.getサービスコード()))
                        .concat(SPACE_13).concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2)
                        .concat(new RString(編集.get後回数())).concat(SPACE_3)
                        .concat(kingakuFormat(編集.get後サービス単位数())).concat(SPACE_9)
                        .concat(kingakuFormat(編集.get後サービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get後請求金額())).concat(SPACE_6)
                        .concat(kingakuFormat(編集.get後利用者負担額())));
                個人用帳票データ.set明細9(new RString("サービス名称").concat(SPACE_2).concat(編集.get摘要())
                        .concat(SPACE_8).concat(new RString(編集.get再審査回数())).concat(new RString("回"))
                        .concat(SPACE_6).concat(new RString(編集.get過誤回数())).concat(new RString("回"))
                        .concat(SPACE_3).concat(dateFormat年月(編集.get審査年月())));
                if (i == list編集.size() - 1) {
                    list特定データ.add(個人用帳票データ);
                }
            }
            if (1 == i % INDEX_5) {
                個人用帳票データ.set明細10(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())));
                個人用帳票データ.set明細11(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())).concat(monziForma六スペース(編集.getサービスコード()))
                        .concat(SPACE_13).concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2)
                        .concat(new RString(編集.get後回数())).concat(SPACE_3)
                        .concat(kingakuFormat(編集.get後サービス単位数())).concat(SPACE_9)
                        .concat(kingakuFormat(編集.get後サービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get後請求金額())).concat(SPACE_6)
                        .concat(kingakuFormat(編集.get後利用者負担額())));
                個人用帳票データ.set明細12(new RString("サービス名称").concat(SPACE_2).concat(編集.get摘要())
                        .concat(SPACE_8).concat(new RString(編集.get再審査回数())).concat(new RString("回"))
                        .concat(SPACE_6).concat(new RString(編集.get過誤回数())).concat(new RString("回"))
                        .concat(SPACE_3).concat(dateFormat年月(編集.get審査年月())));
                if (i == list編集.size() - 1) {
                    list特定データ.add(個人用帳票データ);
                }
            }
            if (2 == (i % INDEX_5)) {
                個人用帳票データ.set明細13(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())));
                個人用帳票データ.set明細14(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())).concat(monziForma六スペース(編集.getサービスコード()))
                        .concat(SPACE_13).concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2)
                        .concat(new RString(編集.get後回数())).concat(SPACE_3)
                        .concat(kingakuFormat(編集.get後サービス単位数())).concat(SPACE_9)
                        .concat(kingakuFormat(編集.get後サービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get後請求金額())).concat(SPACE_6)
                        .concat(kingakuFormat(編集.get後利用者負担額())));
                個人用帳票データ.set明細15(new RString("サービス名称").concat(SPACE_2).concat(編集.get摘要())
                        .concat(SPACE_8).concat(new RString(編集.get再審査回数())).concat(new RString("回"))
                        .concat(SPACE_6).concat(new RString(編集.get過誤回数())).concat(new RString("回"))
                        .concat(SPACE_3).concat(dateFormat年月(編集.get審査年月())));
                if (i == list編集.size() - 1) {
                    list特定データ.add(個人用帳票データ);
                }
            }
            if (INDEX_3 == (i % INDEX_5)) {
                個人用帳票データ.set明細16(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())));
                個人用帳票データ.set明細17(編集.get明細行番号().concat(SPACE_17)
                        .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                        .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get利用者負担額())).concat(monziForma六スペース(編集.getサービスコード()))
                        .concat(SPACE_13).concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2)
                        .concat(new RString(編集.get後回数())).concat(SPACE_3)
                        .concat(kingakuFormat(編集.get後サービス単位数())).concat(SPACE_9)
                        .concat(kingakuFormat(編集.get後サービス単位数合計())).concat(SPACE_2)
                        .concat(kingakuFormat(編集.get後請求金額())).concat(SPACE_6)
                        .concat(kingakuFormat(編集.get後利用者負担額())));
                個人用帳票データ.set明細18(new RString("サービス名称").concat(SPACE_2).concat(編集.get摘要())
                        .concat(SPACE_8).concat(new RString(編集.get再審査回数())).concat(new RString("回"))
                        .concat(SPACE_6).concat(new RString(編集.get過誤回数())).concat(new RString("回"))
                        .concat(SPACE_3).concat(dateFormat年月(編集.get審査年月())));
                if (i == list編集.size() - 1) {
                    list特定データ.add(個人用帳票データ);
                }
            }
            list特定データ = setケアマネジメント費の編集_1(i, 編集, 個人用帳票データ, list特定データ);
        }
        return list特定データ;
    }

    private List<KojinyoTyohyoDataKomoku> setケアマネジメント費の編集_1(
            int i,
            CareManagementEntity 編集,
            KojinyoTyohyoDataKomoku 個人用帳票データ,
            List<KojinyoTyohyoDataKomoku> list特定データ) {
        if (INDEX_4 == (i % INDEX_5)) {
            個人用帳票データ.set明細19(編集.get明細行番号().concat(SPACE_17)
                    .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                    .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                    .concat(kingakuFormat(編集.get利用者負担額())));
            個人用帳票データ.set明細20(編集.get明細行番号().concat(SPACE_17)
                    .concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2).concat(kingakuFormat(編集.getサービス単位数()))
                    .concat(SPACE_9).concat(kingakuFormat(編集.getサービス単位数合計())).concat(SPACE_2)
                    .concat(kingakuFormat(編集.get利用者負担額())).concat(monziForma六スペース(編集.getサービスコード()))
                    .concat(SPACE_13).concat(kingakuFormat(編集.get後単位数())).concat(SPACE_2)
                    .concat(new RString(編集.get後回数())).concat(SPACE_3)
                    .concat(kingakuFormat(編集.get後サービス単位数())).concat(SPACE_9)
                    .concat(kingakuFormat(編集.get後サービス単位数合計())).concat(SPACE_2)
                    .concat(kingakuFormat(編集.get後請求金額())).concat(SPACE_6)
                    .concat(kingakuFormat(編集.get後利用者負担額())));
            個人用帳票データ.set明細21(new RString("サービス名称").concat(SPACE_2).concat(編集.get摘要())
                    .concat(SPACE_8).concat(new RString(編集.get再審査回数())).concat(new RString("回"))
                    .concat(SPACE_6).concat(new RString(編集.get過誤回数())).concat(new RString("回"))
                    .concat(SPACE_3).concat(dateFormat年月(編集.get審査年月())));
            list特定データ.add(個人用帳票データ);
        }
        return list特定データ;
    }

    private List<KojinyoTyohyoDataKomoku> set住宅改修(
            List<JuutakuKaishuuEntity> list住宅改修,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list住宅改修データ = new ArrayList<>();
        個人用帳票データ.setヘッダー2((new RString("サービスコード")).concat(SPACE_28)
                .concat((new RString("住宅改修着工年月日"))).concat(SPACE_5).concat((new RString("改修金額")))
                .concat(SPACE_2).concat((審査年月)));
        個人用帳票データ.setヘッダー4((new RString("改修業者名")));
        個人用帳票データ.setヘッダー5((new RString("改修住宅の住所")));
        for (int i = 0; i < list住宅改修.size(); i++) {
            JuutakuKaishuuEntity 住宅改修 = list住宅改修.get(i);
            個人用帳票データ.setヘッダー1(住宅改修.get略称());
            if (0 == (i % INDEX_7)) {
                個人用帳票データ.set明細1(住宅改修.getサービスコード().concat(SPACE_35).concat(SPACE_1)
                        .concat(dateFormat年月日(住宅改修.get住宅改修着工年月日()))
                        .concat(SPACE_12).concat(kingakuFormat(住宅改修.get改修金額().intValue()))
                        .concat(SPACE_2).concat(dateFormat年月(住宅改修.get審査年月())));
                if (!RString.isNullOrEmpty(住宅改修.getサービスコード()) && 住宅改修.getサービスコード().length() >= LIST_SIZE_2) {
                    RString サービスコード = 住宅改修.getサービスコード().substring(0, LIST_SIZE_2);
                    個人用帳票データ.set明細3(ServiceCategoryShurui.toValue(サービスコード).get名称());
                }
                個人用帳票データ.set適用1(住宅改修.get住宅改修事業者名());
                if (住宅改修.get住宅改修事業者名().length() > INDEX_64) {
                    個人用帳票データ.set適用2(住宅改修.get住宅改修事業者名().substring(0, INDEX_64));
                    個人用帳票データ.set適用3(住宅改修.get住宅改修事業者名().substring(INDEX_64));
                } else {
                    個人用帳票データ.set適用2(住宅改修.get住宅改修事業者名());
                }
                if (i == list住宅改修.size() - 1) {
                    list住宅改修データ.add(個人用帳票データ);
                }
            }
            if (1 == (i % INDEX_7)) {
                個人用帳票データ.set明細4(住宅改修.getサービスコード().concat(SPACE_35).concat(SPACE_1)
                        .concat(dateFormat年月日(住宅改修.get住宅改修着工年月日()))
                        .concat(SPACE_12).concat(kingakuFormat(住宅改修.get改修金額().intValue()))
                        .concat(SPACE_2).concat(dateFormat年月(住宅改修.get審査年月())));
                個人用帳票データ.set明細6(ServiceCategoryShurui.toValue(住宅改修.getサービスコード()).get名称());
                個人用帳票データ.set適用4(住宅改修.get住宅改修事業者名());
                if (住宅改修.get住宅改修事業者名().length() > INDEX_64) {
                    個人用帳票データ.set適用5(住宅改修.get住宅改修事業者名().substring(0, INDEX_64));
                    個人用帳票データ.set適用6(住宅改修.get住宅改修事業者名().substring(INDEX_64));
                } else {
                    個人用帳票データ.set適用5(住宅改修.get住宅改修事業者名());
                }
                if (i == list住宅改修.size() - 1) {
                    list住宅改修データ.add(個人用帳票データ);
                }
            }
            if (2 == (i % INDEX_7)) {
                個人用帳票データ.set明細7(住宅改修.getサービスコード().concat(SPACE_35).concat(SPACE_1)
                        .concat(dateFormat年月日(住宅改修.get住宅改修着工年月日()))
                        .concat(SPACE_12).concat(kingakuFormat(住宅改修.get改修金額().intValue()))
                        .concat(SPACE_2).concat(dateFormat年月(住宅改修.get審査年月())));
                個人用帳票データ.set明細9(ServiceCategoryShurui.toValue(住宅改修.getサービスコード()).get名称());
                個人用帳票データ.set適用7(住宅改修.get住宅改修事業者名());
                if (住宅改修.get住宅改修事業者名().length() > INDEX_64) {
                    個人用帳票データ.set適用8(住宅改修.get住宅改修事業者名().substring(0, INDEX_64));
                    個人用帳票データ.set適用9(住宅改修.get住宅改修事業者名().substring(INDEX_64));
                } else {
                    個人用帳票データ.set適用8(住宅改修.get住宅改修事業者名());
                }
                if (i == list住宅改修.size() - 1) {
                    list住宅改修データ.add(個人用帳票データ);
                }
            }
            if (INDEX_3 == (i % INDEX_64)) {
                個人用帳票データ.set明細10(住宅改修.getサービスコード().concat(SPACE_35).concat(SPACE_1)
                        .concat(dateFormat年月日(住宅改修.get住宅改修着工年月日()))
                        .concat(SPACE_12).concat(kingakuFormat(住宅改修.get改修金額().intValue()))
                        .concat(SPACE_2).concat(dateFormat年月(住宅改修.get審査年月())));
                個人用帳票データ.set明細12(ServiceCategoryShurui.toValue(住宅改修.getサービスコード()).get名称());
                個人用帳票データ.set適用10(住宅改修.get住宅改修事業者名());
                if (住宅改修.get住宅改修事業者名().length() > INDEX_64) {
                    個人用帳票データ.set適用11(住宅改修.get住宅改修事業者名().substring(0, INDEX_64));
                    個人用帳票データ.set適用12(住宅改修.get住宅改修事業者名().substring(INDEX_64));
                } else {
                    個人用帳票データ.set適用11(住宅改修.get住宅改修事業者名());
                }
                if (i == list住宅改修.size() - 1) {
                    list住宅改修データ.add(個人用帳票データ);
                }
            }
            list住宅改修データ = set住宅改修_1(list住宅改修, 住宅改修, 個人用帳票データ, list住宅改修データ, i);
        }
        return list住宅改修データ;
    }

    private List<KojinyoTyohyoDataKomoku> set住宅改修_1(
            List<JuutakuKaishuuEntity> list住宅改修,
            JuutakuKaishuuEntity 住宅改修,
            KojinyoTyohyoDataKomoku 個人用帳票データ,
            List<KojinyoTyohyoDataKomoku> list住宅改修データ,
            int i) {
        if (INDEX_4 == (i % INDEX_7)) {
            個人用帳票データ.set明細13(住宅改修.getサービスコード().concat(SPACE_35).concat(SPACE_1)
                    .concat(dateFormat年月日(住宅改修.get住宅改修着工年月日()))
                    .concat(SPACE_12).concat(kingakuFormat(住宅改修.get改修金額().intValue()))
                    .concat(SPACE_2).concat(dateFormat年月(住宅改修.get審査年月())));
            個人用帳票データ.set明細15(ServiceCategoryShurui.toValue(住宅改修.getサービスコード()).get名称());
            個人用帳票データ.set適用13(住宅改修.get住宅改修事業者名());
            if (住宅改修.get住宅改修事業者名().length() > INDEX_64) {
                個人用帳票データ.set適用14(住宅改修.get住宅改修事業者名().substring(0, INDEX_64));
                個人用帳票データ.set適用15(住宅改修.get住宅改修事業者名().substring(INDEX_64));
            } else {
                個人用帳票データ.set適用14(住宅改修.get住宅改修事業者名());
            }
            if (i == list住宅改修.size() - 1) {
                list住宅改修データ.add(個人用帳票データ);
            }
        }
        if (INDEX_5 == (i % INDEX_7)) {
            個人用帳票データ.set明細16(住宅改修.getサービスコード().concat(SPACE_35).concat(SPACE_1)
                    .concat(dateFormat年月日(住宅改修.get住宅改修着工年月日()))
                    .concat(SPACE_12).concat(kingakuFormat(住宅改修.get改修金額().intValue()))
                    .concat(SPACE_2).concat(dateFormat年月(住宅改修.get審査年月())));
            個人用帳票データ.set明細18(ServiceCategoryShurui.toValue(住宅改修.getサービスコード()).get名称());
            個人用帳票データ.set適用16(住宅改修.get住宅改修事業者名());
            if (住宅改修.get住宅改修事業者名().length() > INDEX_64) {
                個人用帳票データ.set適用17(住宅改修.get住宅改修事業者名().substring(0, INDEX_64));
                個人用帳票データ.set適用18(住宅改修.get住宅改修事業者名().substring(INDEX_64));
            } else {
                個人用帳票データ.set適用17(住宅改修.get住宅改修事業者名());
            }
            if (i == list住宅改修.size() - 1) {
                list住宅改修データ.add(個人用帳票データ);
            }
        }
        if (INDEX_6 == (i % INDEX_64)) {
            個人用帳票データ.set明細19(住宅改修.getサービスコード().concat(SPACE_35).concat(SPACE_1)
                    .concat(dateFormat年月日(住宅改修.get住宅改修着工年月日()))
                    .concat(SPACE_12).concat(kingakuFormat(住宅改修.get改修金額().intValue()))
                    .concat(SPACE_2).concat(dateFormat年月(住宅改修.get審査年月())));
            個人用帳票データ.set明細21(ServiceCategoryShurui.toValue(住宅改修.getサービスコード()).get名称());
            個人用帳票データ.set適用19(住宅改修.get住宅改修事業者名());
            if (住宅改修.get住宅改修事業者名().length() > INDEX_64) {
                個人用帳票データ.set適用20(住宅改修.get住宅改修事業者名().substring(0, INDEX_64));
                個人用帳票データ.set適用21(住宅改修.get住宅改修事業者名().substring(INDEX_64));
            } else {
                個人用帳票データ.set適用20(住宅改修.get住宅改修事業者名());
            }
            if (i == (list住宅改修.size() - 1)) {
                list住宅改修データ.add(個人用帳票データ);
            }
        }
        return list住宅改修データ;
    }

    private List<KojinyoTyohyoDataKomoku> set施設療養明細(List<KinkyuuziShisetuRyouyouEntity> 施設療養List,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        for (KinkyuuziShisetuRyouyouEntity 施設療養 : 施設療養List) {
            個人用帳票データ.setヘッダー1(施設療養.get略称());
            個人用帳票データ.setヘッダー2(new RString("番号　緊急時傷病名　緊急時治療"));
            個人用帳票データ.setヘッダー3(new RString("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　開始年月日"));
            個人用帳票データ.setヘッダー4(RString.EMPTY);
            個人用帳票データ.setヘッダー5(new RString("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　摘要"));
            個人用帳票データ.setヘッダー6(RString.EMPTY);
            個人用帳票データ.set明細1(SPACE_5.concat(施設療養.get緊急時傷病名１()).concat(SPACE_2).
                    concat(dateFormat年月日(施設療養.get緊急時治療開始年月日１())));
            個人用帳票データ.set明細2(SPACE_2.concat(施設療養.get順次番号()).concat(SPACE_1).concat(施設療養.get緊急時傷病名２()).
                    concat(dateFormat年月日(施設療養.get緊急時治療開始年月日２())));
            個人用帳票データ.set明細3(SPACE_5.concat(施設療養.get緊急時傷病名３()).concat(SPACE_2).
                    concat(dateFormat年月日(施設療養.get緊急時治療開始年月日３())));
            個人用帳票データ.set明細4(new RString("往診").concat(SPACE_1).concat(new RString(施設療養.get往診日数())).concat("日").concat(SPACE_1).concat(決定後).
                    concat(SPACE_1).concat(new RString(施設療養.get後往診日数())).concat("日").concat(SPACE_2).concat(施設療養.get往診医療機関名()));
            個人用帳票データ.set明細6(new RString("通院").concat(SPACE_1).concat(new RString(施設療養.get通院日数())).concat("日").concat(SPACE_5)
                    .concat(new RString(施設療養.get通院日数())).concat("日").concat(SPACE_2).concat(施設療養.get通院医療機関名()));
            個人用帳票データ.set明細7(new RString("緊急時治療管単位").concat(SPACE_2).concat(kingakuFormat(施設療養.get緊急時治療管理点数())).concat(SPACE_2)
                    .concat("決定後緊急時治療管単位").concat(SPACE_2).concat(kingakuFormat(施設療養.get後緊急時治療管理点数())));
            個人用帳票データ.set明細8(new RString("緊急時治療管日数").concat(SPACE_2).concat(kingakuFormat(施設療養.get緊急時治療管理日数())).concat(SPACE_2)
                    .concat("決定後緊急時治療管日数").concat(SPACE_2).concat(kingakuFormat(施設療養.get後緊急時治療管理日数())));
            個人用帳票データ.set明細9(new RString("緊急時治療管小計").concat(SPACE_2).concat(kingakuFormat(施設療養.get緊急時治療管理小計())).
                    concat(SPACE_24).concat("緊急施設療養費合計").concat(SPACE_6)
                    .concat(kingakuFormat(施設療養.get緊急時施設療養費合計点数())));
            個人用帳票データ.set明細11(SPACE_8.concat("ﾘﾊﾋﾞﾘﾃｰｼｮﾝ(点)").concat(SPACE_7).concat("手術(点)").
                    concat(SPACE_7).concat("手術(点)").concat(SPACE_7).concat("麻酔(点)").concat(SPACE_2)
                    .concat("麻酔(点)"));
            個人用帳票データ.set明細14(SPACE_13.concat(kingakuFormat(施設療養.getリハビリテーション点数())).
                    concat(SPACE_7).concat(kingakuFormat(施設療養.get処置点数())).
                    concat(SPACE_6).concat(kingakuFormat(施設療養.get手術点数())).concat(SPACE_6).concat(kingakuFormat(施設療養.get麻酔点数()))
                    .concat(SPACE_7).concat(kingakuFormat(施設療養.get放射線治療点数())));
            個人用帳票データ.set明細17(決定後.concat(SPACE_7).concat(kingakuFormat(施設療養.get後リハビリテーション点数()))
                    .concat(SPACE_7).concat(kingakuFormat(施設療養.get後処置点数())).concat(SPACE_6).
                    concat(kingakuFormat(施設療養.get後手術点数())).concat(SPACE_6).concat(kingakuFormat(施設療養.get後麻酔点数()))
                    .concat(SPACE_7).concat(kingakuFormat(施設療養.get後放射線治療点数())));
            個人用帳票データ.set明細20(new RString("再審査").concat(SPACE_2).
                    concat(new RString(施設療養.get再審査回数())).concat("回").concat(SPACE_4).concat("過誤").
                    concat(new RString(施設療養.get過誤回数())).concat("回").concat(SPACE_4).concat(審査年月)
                    .concat(SPACE_2).concat(dateFormat年月(施設療養.get審査年月())));
            個人用帳票データ.set適用1(施設療養.get摘要１());
            個人用帳票データ.set適用2(施設療養.get摘要２());
            個人用帳票データ.set適用3(施設療養.get摘要３());
            個人用帳票データ.set適用4(施設療養.get摘要４());
            個人用帳票データ.set適用5(施設療養.get摘要５());
            個人用帳票データ.set適用6(施設療養.get摘要６());
            個人用帳票データ.set適用7(施設療養.get摘要７());
            個人用帳票データ.set適用8(施設療養.get摘要８());
            個人用帳票データ.set適用9(施設療養.get摘要９());
            個人用帳票データ.set適用10(施設療養.get摘要１０());
            個人用帳票データ.set適用11(施設療養.get摘要１１());
            個人用帳票データ.set適用12(施設療養.get摘要１２());
            個人用帳票データ.set適用13(施設療養.get摘要１３());
            個人用帳票データ.set適用14(施設療養.get摘要１４());
            個人用帳票データ.set適用15(施設療養.get摘要１５());
            個人用帳票データ.set適用16(施設療養.get摘要１６());
            個人用帳票データ.set適用17(施設療養.get摘要１７());
            個人用帳票データ.set適用18(施設療養.get摘要１８());
            個人用帳票データ.set適用19(施設療養.get摘要１９());
            個人用帳票データ.set適用20(施設療養.get摘要２０());
            list特定データ.add(個人用帳票データ);
        }
        return list特定データ;
    }

    private List<KojinyoTyohyoDataKomoku> set特別療養明細(List<TokuteiShinryouHiEntity> 特別療養List,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        for (int i = 0; i < 特別療養List.size(); i++) {
            RString 摘要_Sub = 特別療養List.get(i).get摘要();
            RString 摘要_10 = RString.EMPTY;
            RString 摘要_20 = RString.EMPTY;
            RString 摘要_30 = RString.EMPTY;
            RString 摘要_40 = RString.EMPTY;
            RString 摘要_50 = RString.EMPTY;
            if (RString.isNullOrEmpty(摘要_Sub) && 摘要_Sub.length() >= INDEX_10) {
                摘要_10 = 特別療養List.get(i).get摘要().substring(0, INDEX_10);
            }
            if (RString.isNullOrEmpty(摘要_Sub) && 摘要_Sub.length() >= INDEX_20) {
                摘要_20 = 特別療養List.get(i).get摘要().substring(INDEX_10, INDEX_20);
            }
            if (RString.isNullOrEmpty(摘要_Sub) && 摘要_Sub.length() >= INDEX_30) {
                摘要_30 = 特別療養List.get(i).get摘要().substring(INDEX_20, INDEX_30);
            }
            if (RString.isNullOrEmpty(摘要_Sub) && 摘要_Sub.length() >= INDEX_40) {
                摘要_40 = 特別療養List.get(i).get摘要().substring(INDEX_30, INDEX_40);
            }
            if (RString.isNullOrEmpty(摘要_Sub) && 摘要_Sub.length() >= INDEX_50) {
                摘要_50 = 特別療養List.get(i).get摘要().substring(INDEX_40, INDEX_50);
            }
            if (0 == i % LIST_SIZE_2) {
                個人用帳票データ.setヘッダー1(特別療養List.get(i).get略称());
                個人用帳票データ.setヘッダー2(new RString("番号").concat("  ").concat("傷病名")
                        .concat("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　")
                        .concat("再審査").concat(SPACE_3).concat("過誤").concat(SPACE_3).concat(審査年月));
                個人用帳票データ.setヘッダー3(new RString("識別").concat(" ").concat("識別名称")
                        .concat("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　")
                        .concat(回数).concat(SPACE_7).concat(回数));
                個人用帳票データ.set明細1(SPACE_1.concat(特別療養List.get(i).get順次番号()).concat(SPACE_2)
                        .concat(特別療養List.get(i).get傷病名()).concat(SPACE_4)
                        .concat(new RString(特別療養List.get(i).get再審査回数())).concat("回").concat(SPACE_3)
                        .concat(new RString(特別療養List.get(i).get過誤回数())).concat("回").concat(SPACE_3)
                        .concat(dateFormat年月(特別療養List.get(i).get審査年月())));
                個人用帳票データ.set明細2(SPACE_5.concat(特別療養List.get(i).get傷病名()));
                RString サービス名称 = RString.EMPTY;
                if (!RString.isNullOrEmpty(特別療養List.get(i).getサービス名称())) {
                    サービス名称 = 特別療養List.get(i).getサービス名称();
                }
                個人用帳票データ.set明細3(SPACE_1.concat(特別療養List.get(i).get識別番号()).concat(SPACE_2)
                        .concat(サービス名称));
                個人用帳票データ.set明細4(SPACE_4.concat(単位数).concat(SPACE_4).concat(kingakuFormat(特別療養List.get(i).get単位数()))
                        .concat(SPACE_14).concat("【決定後】").concat(SPACE_2).concat(単位数).concat(SPACE_2)
                        .concat(kingakuFormat(特別療養List.get(i).get後単位数())).concat(SPACE_2).concat(摘要));
                個人用帳票データ.set明細5(SPACE_6.concat(回数).concat(SPACE_5).concat(点数)
                        .concat(SPACE_4).concat(合計点数).concat(SPACE_3).concat(回数).concat(SPACE_5).concat(点数).concat(SPACE_4)
                        .concat(合計点数).concat(SPACE_2).concat(摘要_10));
                個人用帳票データ.set明細6(SPACE_8.concat(new RString(特別療養List.get(i).get回数())).concat(SPACE_2)
                        .concat(kingakuFormat(特別療養List.get(i).get後サービス点数())).concat(SPACE_2)
                        .concat(kingakuFormat(特別療養List.get(i).get後合計点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後回数())).concat(SPACE_2).concat(kingakuFormat(特別療養List.get(i).get後サービス点数()))
                        .concat(SPACE_2).concat(kingakuFormat(特別療養List.get(i).get後合計点数())).concat(SPACE_2)
                        .concat(摘要_20));
                個人用帳票データ.set明細7(公費１.concat(SPACE_2).concat(new RString(特別療養List.get(i).get公費１回数())).concat(SPACE_2)
                        .concat(kingakuFormat(特別療養List.get(i).get公費１サービス点数())).concat(SPACE_2)
                        .concat(kingakuFormat(特別療養List.get(i).get公費１合計点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後公費１回数())).concat(SPACE_2)
                        .concat(kingakuFormat(特別療養List.get(i).get後公費１サービス点数()))
                        .concat(SPACE_2).concat(kingakuFormat(特別療養List.get(i).get後公費１合計点数())).concat(SPACE_2)
                        .concat(摘要_30));
                個人用帳票データ.set明細8(公費２.concat(SPACE_2).concat(new RString(特別療養List.get(i).get公費２回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費２サービス点数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費２合計点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後公費２回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後公費２サービス点数()))
                        .concat(SPACE_2).concat(new RString(特別療養List.get(i).get後公費２合計点数())).concat(SPACE_2)
                        .concat(摘要_40));
                個人用帳票データ.set明細9(公費３.concat(SPACE_2).concat(new RString(特別療養List.get(i).get公費３回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費３サービス点数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費３合計点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後公費３回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後公費３サービス点数()))
                        .concat(SPACE_2).concat(new RString(特別療養List.get(i).get後公費３合計点数())).concat(SPACE_2)
                        .concat(摘要_50));
                if (i == 特別療養List.size() - 1) {
                    list特定データ.add(個人用帳票データ);
                }
            }
            if (1 == i % LIST_SIZE_2) {
                個人用帳票データ.set明細10(SPACE_1.concat(特別療養List.get(i).get順次番号()).concat(SPACE_2)
                        .concat(特別療養List.get(i).get傷病名()).concat(SPACE_4).concat(new RString(特別療養List.get(i).get再審査回数()))
                        .concat("回").concat(SPACE_3).concat(new RString(特別療養List.get(i).get過誤回数())).concat("回").concat(SPACE_3)
                        .concat(dateFormat年月(特別療養List.get(i).get審査年月())));
                個人用帳票データ.set明細11(SPACE_5.concat(特別療養List.get(i).get傷病名()));
                個人用帳票データ.set明細12(SPACE_1.concat(特別療養List.get(i).get識別番号()).concat(SPACE_2));
                個人用帳票データ.set明細13(SPACE_4.concat(単位数).concat(SPACE_4).concat(new RString(特別療養List.get(i).get単位数()))
                        .concat(SPACE_14).concat("【決定後】").concat(SPACE_2).concat(単位数).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後単位数())).concat(SPACE_2).concat(摘要));
                個人用帳票データ.set明細14(SPACE_6.concat(回数).concat(SPACE_5).concat(点数)
                        .concat(SPACE_4).concat(合計点数).concat(SPACE_3).concat(回数).concat(SPACE_5).concat(点数).concat(SPACE_4)
                        .concat(合計点数).concat(SPACE_2).concat(摘要_10));
                個人用帳票データ.set明細15(SPACE_8.concat(new RString(特別療養List.get(i).get回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後サービス点数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後サービス点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後回数())).concat(SPACE_2).concat(new RString(特別療養List.get(i).get後サービス点数()))
                        .concat(SPACE_2).concat(new RString(特別療養List.get(i).get後合計点数())).concat(SPACE_2)
                        .concat(摘要_20));
                個人用帳票データ.set明細16(公費１.concat(SPACE_2).concat(new RString(特別療養List.get(i).get公費１回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費１サービス点数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費１合計点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後公費１回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後公費１サービス点数()))
                        .concat(SPACE_2).concat(new RString(特別療養List.get(i).get後公費１合計点数())).concat(SPACE_2)
                        .concat(摘要_30));
                個人用帳票データ.set明細17(公費２.concat(SPACE_2).concat(new RString(特別療養List.get(i).get公費２回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費２サービス点数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費２合計点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後公費２回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後公費２サービス点数()))
                        .concat(SPACE_2).concat(new RString(特別療養List.get(i).get後公費２合計点数())).concat(SPACE_2)
                        .concat(摘要_40));
                個人用帳票データ.set明細18(公費３.concat(SPACE_2).concat(new RString(特別療養List.get(i).get公費３回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費３サービス点数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get公費３合計点数())).concat(SPACE_5)
                        .concat(new RString(特別療養List.get(i).get後公費３回数())).concat(SPACE_2)
                        .concat(new RString(特別療養List.get(i).get後公費３サービス点数()))
                        .concat(SPACE_2).concat(new RString(特別療養List.get(i).get後公費３合計点数())).concat(SPACE_2)
                        .concat(摘要_50));
                if (i == 特別療養List.size() - 1) {
                    list特定データ.add(個人用帳票データ);
                }
            }
            list特定データ.add(個人用帳票データ);
        }
        return list特定データ;
    }

    private List<KojinyoTyohyoDataKomoku> set所定疾患施設療養明細(List<ShoteiShikkanEntity> 所定疾患List,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        for (ShoteiShikkanEntity 所定疾患 : 所定疾患List) {
            個人用帳票データ.setヘッダー1(所定疾患.get名称());
            個人用帳票データ.setヘッダー2(new RString("番号").concat("  ").concat("１段：緊急時傷病名")
                    .concat(SPACE_24).concat("治療開始年月日"));
            個人用帳票データ.setヘッダー3(SPACE_5.concat("２段：所定疾患施設療養傷病名")
                    .concat(SPACE_14).concat("療養開始年月日"));
            個人用帳票データ.setヘッダー5(new RString("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　").concat(摘要));
            個人用帳票データ.set明細1(SPACE_5.concat(所定疾患.get緊急時傷病名１())
                    .concat(SPACE_2).concat(dateFormat年月日(所定疾患.get緊急時治療開始年月日１())));
            個人用帳票データ.set明細2(SPACE_2.concat(所定疾患.get緊急時施設療養情報レコード順次番号()).concat(SPACE_1)
                    .concat(所定疾患.get緊急時傷病名２()).concat(SPACE_2).concat(dateFormat年月日(所定疾患.get緊急時治療開始年月日２())));
            個人用帳票データ.set明細3(SPACE_5.concat(所定疾患.get緊急時傷病名３())
                    .concat(SPACE_2).concat(dateFormat年月日(所定疾患.get緊急時治療開始年月日３())));
            個人用帳票データ.set明細4(SPACE_5.concat(所定疾患.get所定疾患施設療養費傷病名１())
                    .concat(SPACE_2).concat(dateFormat年月日(所定疾患.get所定疾患施設療養費開始年月日１())));
            個人用帳票データ.set明細5(SPACE_5.concat(所定疾患.get所定疾患施設療養費傷病名２())
                    .concat(SPACE_2).concat(dateFormat年月日(所定疾患.get所定疾患施設療養費開始年月日２())));
            個人用帳票データ.set明細6(SPACE_5.concat(所定疾患.get所定疾患施設療養費傷病名３())
                    .concat(SPACE_2).concat(dateFormat年月日(所定疾患.get所定疾患施設療養費開始年月日３())));
            個人用帳票データ.set明細7(new RString("緊急時治療管単位").concat(SPACE_10)
                    .concat(kingakuFormat(所定疾患.get所定疾患施設療養費単位数()))
                    .concat(SPACE_2).concat("決定後緊急時治療管単位").concat(SPACE_8)
                    .concat(kingakuFormat(所定疾患.get後所定疾患施設療養費単位数())));
            個人用帳票データ.set明細8(new RString("緊急時治療管日数").concat(SPACE_10)
                    .concat(kingakuFormat(所定疾患.get所定疾患施設療養費日数()))
                    .concat(SPACE_2).concat("決定後緊急時治療管日数").concat(SPACE_8)
                    .concat(kingakuFormat(所定疾患.get後所定疾患施設療養費日数())));
            個人用帳票データ.set明細9(new RString("緊急時治療管小計").concat(SPACE_8)
                    .concat(kingakuFormat(所定疾患.get緊急時治療管理小計())));
            個人用帳票データ.set明細10(new RString("所定疾患施設療養費単位").concat(SPACE_4)
                    .concat(kingakuFormat(所定疾患.get所定疾患施設療養費単位数())).concat(SPACE_2).concat("決定後所定疾患施設療養費単位").concat(SPACE_2)
                    .concat(kingakuFormat(所定疾患.get後所定疾患施設療養費単位数())));
            個人用帳票データ.set明細11(new RString("所定疾患施設療養費日数").concat(SPACE_4)
                    .concat(kingakuFormat(所定疾患.get所定疾患施設療養費日数())).concat(SPACE_2).concat("決定後所定疾患施設療養費日数").concat(SPACE_2)
                    .concat(kingakuFormat(所定疾患.get後所定疾患施設療養費日数())));
            個人用帳票データ.set明細12(new RString("所定疾患施設療養費小計").concat(SPACE_4)
                    .concat(kingakuFormat(所定疾患.get所定疾患施設療養費小計())));
            個人用帳票データ.set明細13(new RString("往診").concat(SPACE_1)
                    .concat(new RString(所定疾患.get往診日数())).concat("日").concat(SPACE_1).concat(決定後).concat(SPACE_1)
                    .concat(new RString(所定疾患.get後往診日数())).concat("日").concat(SPACE_2).concat(所定疾患.get往診医療機関名()));
            個人用帳票データ.set明細15(new RString("通院").concat(SPACE_1)
                    .concat(new RString(所定疾患.get通院日数())).concat("日").concat(SPACE_5).concat(new RString(所定疾患.get後通院日数()))
                    .concat("日").concat(SPACE_2).concat(所定疾患.get通院医療機関名()));
            個人用帳票データ.set明細16(SPACE_8.concat("ﾘﾊﾋﾞﾘﾃｰｼｮﾝ(点)")
                    .concat(SPACE_7).concat("処置(点))").concat(SPACE_7).concat("手術(点))").concat(SPACE_7).concat("麻酔(点))")
                    .concat(SPACE_2).concat("放射線治療(点)"));
            個人用帳票データ.set明細17(SPACE_13.concat(kingakuFormat(所定疾患.getリハビリテーション点数()))
                    .concat(SPACE_6).concat(kingakuFormat(所定疾患.get処置点数())).concat(SPACE_6).
                    concat(kingakuFormat(所定疾患.get手術点数())).concat(SPACE_6).concat(kingakuFormat(所定疾患.get麻酔点数()))
                    .concat(SPACE_7).concat(kingakuFormat(所定疾患.get放射線治療点数())));
            個人用帳票データ.set明細18(決定後.concat(SPACE_7).concat(kingakuFormat(所定疾患.get後リハビリテーション点数()))
                    .concat(SPACE_6).concat(kingakuFormat(所定疾患.get後処置点数())).concat(SPACE_6).
                    concat(kingakuFormat(所定疾患.get後手術点数())).concat(SPACE_6).concat(kingakuFormat(所定疾患.get後麻酔点数()))
                    .concat(SPACE_7).concat(kingakuFormat(所定疾患.get後放射線治療点数())));
            個人用帳票データ.set明細19(new RString("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　")
                    .concat("緊急時治療管合計").concat(SPACE_7).concat(kingakuFormat(所定疾患.get緊急時施設療養費合計点数())));
            個人用帳票データ.set明細21(new RString("再審査").concat(SPACE_2).concat(new RString(所定疾患.get再審査回数()))
                    .concat("回").concat(SPACE_4).concat("過誤").concat(SPACE_2).concat(new RString(所定疾患.get過誤回数())).concat("回")
                    .concat(SPACE_4).concat(dateFormat年月(所定疾患.get審査年月())).concat(SPACE_2).concat(dateFormat年月(所定疾患.get審査年月())));
            個人用帳票データ.set摘要1(所定疾患.get摘要１());
            個人用帳票データ.set摘要2(所定疾患.get摘要２());
            個人用帳票データ.set摘要3(所定疾患.get摘要３());
            list特定データ.add(個人用帳票データ);
        }
        return list特定データ;
    }

    private List<KojinyoTyohyoDataKomoku> set社会福祉法人軽減額の編集(List<ShakaiHukushiHouzinKeigenEntity> 社会福祉List,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        個人用帳票データ.set適用13(new RString("給付社会福祉法人軽減額"));
        個人用帳票データ.set適用14(new RString("前").concat(SPACE_2).concat("負担額").concat(SPACE_5).concat("軽減額")
                .concat(SPACE_1).concat("軽減後負担額").concat(SPACE_2).concat("軽減率").concat(SPACE_3).concat(再審査回数)
                .concat(SPACE_1).concat("過誤回数"));
        個人用帳票データ.set適用15(new RString("後").concat(SPACE_2).concat("負担額").concat(SPACE_5).concat("軽減額")
                .concat(SPACE_1).concat("軽減後負担額").concat(SPACE_2).concat("備考")
                .concat("　　　　　　　　　　　　　　　　").concat(審査年月));
        for (int i = 0; i < 社会福祉List.size(); i++) {
            ShakaiHukushiHouzinKeigenEntity 社会福祉 = 社会福祉List.get(i);
            if ((i % 2) == 0) {
                個人用帳票データ.set適用16(ServiceCategoryShurui.toValue(社会福祉.getサービス種類コード()).get名称());
                個人用帳票データ.set適用17(RString.FULL_SPACE.concat(kingakuFormat(社会福祉.get受領すべき利用者負担の総額().intValue()))
                        .concat(SPACE_2).concat(kingakuFormat(社会福祉.get軽減額().intValue())).concat(SPACE_4)
                        .concat(kingakuFormat(社会福祉.get軽減後利用者負担額().intValue())).concat(SPACE_2)
                        .concat(kingakuFormat(社会福祉.get軽減率().intValue()))
                        .concat(SPACE_4).concat(kingakuFormat(社会福祉.get再審査回数().intValue())).concat(SPACE_7)
                        .concat(kingakuFormat(社会福祉.get過誤回数().intValue())).concat("回"));
                個人用帳票データ.set適用18(RString.FULL_SPACE.concat(kingakuFormat(社会福祉.get後受領すべき利用者負担の総額().intValue()))
                        .concat(SPACE_2).concat(kingakuFormat(社会福祉.get後軽減額().intValue())).concat(SPACE_4)
                        .concat(kingakuFormat(社会福祉.get後軽減後利用者負担額().intValue())).concat(SPACE_1)
                        .concat(社会福祉.get備考())
                        .concat(SPACE_1).concat(dateFormat年月(社会福祉.get審査年月())));
                if (i == (社会福祉List.size() - 1)) {
                    list特定データ.add(個人用帳票データ);
                }
            }
            if (1 == (i % 2)) {
                個人用帳票データ.set適用19(ServiceCategoryShurui.toValue(社会福祉.getサービス種類コード()).get名称());
                個人用帳票データ.set適用20(RString.FULL_SPACE.concat(kingakuFormat(社会福祉.get受領すべき利用者負担の総額().intValue()))
                        .concat(SPACE_2).concat(kingakuFormat(社会福祉.get軽減額().intValue())).concat(SPACE_4)
                        .concat(kingakuFormat(社会福祉.get軽減後利用者負担額().intValue())).concat(SPACE_2)
                        .concat(kingakuFormat(社会福祉.get軽減率().intValue()))
                        .concat(SPACE_4).concat(kingakuFormat(社会福祉.get再審査回数().intValue())).concat(SPACE_7)
                        .concat(kingakuFormat(社会福祉.get過誤回数().intValue())).concat("回"));
                個人用帳票データ.set適用21(RString.FULL_SPACE.concat(kingakuFormat(社会福祉.get後受領すべき利用者負担の総額().intValue()))
                        .concat(SPACE_2).concat(kingakuFormat(社会福祉.get後軽減額().intValue())).concat(SPACE_4)
                        .concat(kingakuFormat(社会福祉.get後軽減後利用者負担額().intValue())).concat(SPACE_1)
                        .concat(社会福祉.get備考())
                        .concat(SPACE_1).concat(dateFormat年月(社会福祉.get審査年月())));
                list特定データ.add(個人用帳票データ);
            }
        }
        return list特定データ;
    }

    private List<KojinyoTyohyoDataKomoku> set福祉用具の編集(List<HukushiYouguEntity> 福祉用具List,
            KojinyoTyohyoDataKomoku 個人用帳票データ) {
        List<KojinyoTyohyoDataKomoku> list特定データ = new ArrayList<>();
        個人用帳票データ.setヘッダー2(new RString("サービスコード                            購入年月日  摘要                 審査年月"));
        個人用帳票データ.setヘッダー3(new RString("福祉用具商品名                                              種目"));
        個人用帳票データ.setヘッダー5(new RString("福祉用具製造業者名"));
        個人用帳票データ.setヘッダー6(new RString("福祉用具販売業者名                                      購入金額"));
        for (int i = 0; i < 福祉用具List.size(); i++) {
            if ((i % INDEX_7) == 0) {
                HukushiYouguEntity 福祉用具 = 福祉用具List.get(i);
                個人用帳票データ.setヘッダー1(福祉用具.get略称());
                個人用帳票データ.set明細1(福祉用具.getサービスコード().concat(SPACE_28)
                        .concat(dateFormat年月日(福祉用具.get福祉用具購入年月日())).concat(SPACE_2).concat(福祉用具.get摘要())
                        .concat(SPACE_17).concat(dateFormat年月(福祉用具.get審査年月())));
                if (!RString.isNullOrEmpty(福祉用具.getサービスコード())
                        && 福祉用具.getサービスコード().length() > 1) {
                    個人用帳票データ.set明細3(ServiceCategoryShurui.toValue(福祉用具.getサービスコード().substring(0, 2)).get名称());
                } else {
                    個人用帳票データ.set明細3(RString.EMPTY);
                }
                個人用帳票データ.set適用1(福祉用具.get福祉用具商品名().concat(SPACE_2).concat(福祉用具.get福祉用具種目コード()));
                個人用帳票データ.set適用2(福祉用具.get福祉用具製造事業者名());
                個人用帳票データ.set適用3(福祉用具.get福祉用具販売事業者名().concat(SPACE_2).concat(kingakuFormat(福祉用具.get購入金額().intValue())));
                if (i == (福祉用具List.size() - 1)) {
                    list特定データ.add(個人用帳票データ);
                }
            }
        }
        return list特定データ;
    }

    private RString monziForma六スペース(RString str) {
        int strLen = str.length();
        RString strNew = null;
        for (int i = 0; i < strLen; i++) {
            if (i < strLen && i < INDEX_6) {
                strNew = RString.HALF_SPACE.concat(str);
            }
        }
        return strNew;
    }

    private boolean is3411(RString 入力識別番号) {
        return 入力識別番号_3411.equals(入力識別番号)
                || 入力識別番号_3421.equals(入力識別番号);
    }

    private boolean is7131(RString 入力識別番号) {
        return 入力識別番号_7131.equals(入力識別番号)
                || 入力識別番号_2131.equals(入力識別番号)
                || 入力識別番号_7132.equals(入力識別番号)
                || 入力識別番号_2132.equals(入力識別番号);
    }

    private boolean is7143(RString 入力識別番号) {
        return 入力識別番号_7143.equals(入力識別番号)
                || 入力識別番号_2143.equals(入力識別番号)
                || 入力識別番号_7144.equals(入力識別番号)
                || 入力識別番号_2144.equals(入力識別番号)
                || 入力識別番号_7183.equals(入力識別番号)
                || 入力識別番号_2183.equals(入力識別番号);
    }

    private boolean is7155(RString 入力識別番号) {
        return 入力識別番号_7155.equals(入力識別番号)
                || 入力識別番号_2155.equals(入力識別番号)
                || 入力識別番号_7156.equals(入力識別番号)
                || 入力識別番号_2156.equals(入力識別番号);
    }

    private boolean is7164(RString 入力識別番号) {
        return 入力識別番号_7164.equals(入力識別番号)
                || 入力識別番号_2164.equals(入力識別番号)
                || 入力識別番号_7165.equals(入力識別番号)
                || 入力識別番号_2165.equals(入力識別番号);
    }

    private boolean is7171(RString 入力識別番号) {
        return 入力識別番号_7171.equals(入力識別番号)
                || 入力識別番号_2171.equals(入力識別番号)
                || 入力識別番号_7172.equals(入力識別番号)
                || 入力識別番号_2172.equals(入力識別番号)
                || 入力識別番号_7173.equals(入力識別番号)
                || 入力識別番号_2173.equals(入力識別番号)
                || 入力識別番号_7174.equals(入力識別番号)
                || 入力識別番号_2174.equals(入力識別番号)
                || 入力識別番号_7175.equals(入力識別番号)
                || 入力識別番号_2175.equals(入力識別番号)
                || 入力識別番号_7176.equals(入力識別番号)
                || 入力識別番号_2176.equals(入力識別番号)
                || 入力識別番号_7177.equals(入力識別番号)
                || 入力識別番号_2177.equals(入力識別番号)
                || 入力識別番号_8171.equals(入力識別番号)
                || 入力識別番号_21C1.equals(入力識別番号)
                || 入力識別番号_71P1.equals(入力識別番号)
                || 入力識別番号_71R1.equals(入力識別番号);
    }

    private boolean is8124(RString 入力識別番号) {
        return 入力識別番号_8124.equals(入力識別番号)
                || 入力識別番号_2184.equals(入力識別番号)
                || 入力識別番号_8125.equals(入力識別番号)
                || 入力識別番号_2185.equals(入力識別番号);
    }

    private boolean is7195(RString 入力識別番号) {
        return 入力識別番号_7195.equals(入力識別番号)
                || 入力識別番号_2195.equals(入力識別番号);
    }

    private boolean is71A3(RString 入力識別番号) {
        return 入力識別番号_71A3.equals(入力識別番号)
                || 入力識別番号_21A3.equals(入力識別番号);
    }

    private boolean is21C1(RString 入力識別番号) {
        return 入力識別番号_21C1.equals(入力識別番号)
                || 入力識別番号_21C2.equals(入力識別番号);
    }

    private boolean is21D1(RString 入力識別番号) {
        return 入力識別番号_21D1.equals(入力識別番号)
                || 入力識別番号_21D2.equals(入力識別番号);
    }

    private boolean is8161(RString 入力識別番号) {
        return 入力識別番号_8161.equals(入力識別番号);
    }

    private RString dateFormat(RString date) {
        if (RString.isNullOrEmpty(date)) {
            return RString.EMPTY;
        }
        return new RDate(date.toString()).wareki().eraType(EraType.ALPHABET).firstYear(FirstYear.GAN_NEN).
                separator(Separator.PERIOD).fillType(FillType.ZERO).toDateString();
    }

    private RString dateFormat年月(RString date) {
        if (RString.isNullOrEmpty(date)) {
            return RString.EMPTY;
        }
        return new FlexibleYearMonth(date.toString()).wareki().eraType(EraType.ALPHABET).firstYear(FirstYear.GAN_NEN).
                separator(Separator.PERIOD).fillType(FillType.ZERO).toDateString();
    }

    private RString kingakuFormat(RString date) {
        if (RString.isNullOrEmpty(date)) {
            return RString.EMPTY;
        }
        return DecimalFormatter.toコンマ区切りRString(new Decimal(date.toString()), 0);
    }

    private RString nullToEmpty(RString data) {
        if (RString.isNullOrEmpty(data)) {
            return RString.EMPTY;
        }
        return data;
    }
}
