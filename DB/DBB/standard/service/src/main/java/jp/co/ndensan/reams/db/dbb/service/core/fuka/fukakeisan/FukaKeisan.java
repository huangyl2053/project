/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.service.core.fuka.fukakeisan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.choteijiyu.ChoteiJiyuParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.choteijiyu.FukaJohoList;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.CalculateChoteiParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.FukaKokyoBatchParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.FukaKokyoParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.FukaShikakuPair;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.KoseiShoriParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.KoseiShoriResult;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.KoseiShorikoaParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.KoseiShorikoaResult;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.KoseiTaishoParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.KoseiZengoChoshuHoho;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.KoseiZengoFuka;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.NendobunFukaList;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.choteikyotsu.ChoteiKyotsu;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.choteikyotsu.ChoteiKyotsuIdentifier;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.fukajoho.FukaJoho;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.fukajoho.FukaJohoBuilder;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.kibetsu.Kibetsu;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.HokenryoDankaiHantei;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.core.TsukibetsuHokenryoDankai;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.fukakonkyo.FukaKonkyoFactory;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.fukakonkyo.FukaKonkyoParameter;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.param.FukaKonkyo;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.param.HokenryoDankaiHanteiParameter;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.param.SeigyoJoho;
import jp.co.ndensan.reams.db.dbb.business.core.kanendokoseikeisan.KoseigoFukaResult;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.HokenryoDankai;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.HokenryoDankaiList;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.KoseiTsukiHantei;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.MonthShichoson;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.NengakuHokenryo;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.NengakuHokenryoKeisan;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.param.NengakuFukaKonkyo;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.param.NengakuHokenryoKeisanParameter;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.param.NengakuSeigyoJoho;
import jp.co.ndensan.reams.db.dbb.definition.core.choshuhoho.ChoshuHohoKibetsu;
import jp.co.ndensan.reams.db.dbb.definition.core.choteijiyu.ChoteiJiyuCode;
import jp.co.ndensan.reams.db.dbb.definition.core.fuka.KozaKubun;
import jp.co.ndensan.reams.db.dbb.definition.core.fuka.KyokaisoKubun;
import jp.co.ndensan.reams.db.dbb.definition.core.fuka.ShokkenKubun;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fuka.SetaiShotokuEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajoho.fukajoho.FukaJohoRelateEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajoho.kibetsu.KibetsuEntity;
import jp.co.ndensan.reams.db.dbb.service.core.fuka.choteijiyu.ChoteiJiyuHantei;
import jp.co.ndensan.reams.db.dbb.service.core.kanendokoseikeisan.KanendoKoseiKeisan;
import jp.co.ndensan.reams.db.dbb.service.core.kanri.HokenryoDankaiSettings;
import jp.co.ndensan.reams.db.dbb.service.core.kanri.HokenryoRank;
import jp.co.ndensan.reams.db.dbx.business.core.choshuhoho.ChoshuHoho;
import jp.co.ndensan.reams.db.dbx.business.core.choshuhoho.ChoshuHohoBuilder;
import jp.co.ndensan.reams.db.dbx.business.util.NendoUtil;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBB;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.fuka.KazeiKubun;
import jp.co.ndensan.reams.db.dbx.definition.core.fuka.Tsuki;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT2001ChoshuHohoEntity;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT2002FukaEntity;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.UrT0705ChoteiKyotsuEntity;
import jp.co.ndensan.reams.db.dbx.persistence.db.basic.DbT2002FukaDac;
import jp.co.ndensan.reams.db.dbx.service.core.choshuhoho.ChoshuHohoKoshin;
import jp.co.ndensan.reams.db.dbz.business.core.HihokenshaDaicho;
import jp.co.ndensan.reams.db.dbz.business.core.basic.RoreiFukushiNenkinJukyusha;
import jp.co.ndensan.reams.db.dbz.business.core.basic.SetaiinShotoku;
import jp.co.ndensan.reams.db.dbz.business.core.hihokensha.seikatsuhogofujoshurui.SeikatsuHogoFujoShurui;
import jp.co.ndensan.reams.db.dbz.business.core.hihokensha.seikatsuhogojukyusha.SeikatsuHogoJukyusha;
import jp.co.ndensan.reams.db.dbz.business.core.kyokaisogaitosha.kyokaisogaitosha.KyokaisoGaitosha;
import jp.co.ndensan.reams.db.dbz.definition.core.honninkubun.HonninKubun;
import jp.co.ndensan.reams.dz.dzx.business.core.kiwarikeisan.KiwariKeisan;
import jp.co.ndensan.reams.dz.dzx.business.core.kiwarikeisan.KiwariKeisanInput;
import jp.co.ndensan.reams.dz.dzx.business.core.kiwarikeisan.KiwariKeisanOutput;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.Month;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.SystemException;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 賦課の計算のビジネスクラスです。
 *
 * @reamsid_L DBB-0660-030 cuilin
 */
public class FukaKeisan extends FukaKeisanFath {

    private static final int INT_1 = 1;
    private static final int INT_2 = 2;
    private static final int INT_3 = 3;
    private static final int INT_4 = 4;
    private static final int INT_5 = 5;
    private static final int INT_6 = 6;
    private static final int INT_12 = 12;
    private static final int INT_14 = 14;
    private static final int DAY = 31;
    private static final RString エラーメッセージ = new RString("賦課の情報しか存在しない");
//    private static final RString 汎用キー_通知書番号 = new RString("通知書番号");
    private static final RString ゼロ_0000 = new RString("0000");

    /**
     * にて生成した{@link FukaKeisan}のインスタンスを返します。
     *
     * @return FukaKeisan
     */
    public static FukaKeisan createInstance() {
        return InstanceProvider.create(FukaKeisan.class);
    }

    /**
     * 更正処理メソッド
     *
     * @param param KoseiShoriParameter
     * @return KoseiShoriResult
     */
    public KoseiShoriResult do全履歴更正計算(KoseiShoriParameter param) {
        List<FukaShikakuPair> 賦課と資格のペア = pair賦課With資格(param.get賦課年度(),
                param.get年度分賦課リスト(), param.get資格の情報リスト());
        KoseiTaishoParameter 更正対象パラメータ = new KoseiTaishoParameter();
        更正対象パラメータ.set賦課年度(param.get賦課年度());
        更正対象パラメータ.set賦課の情報_資格の情報ペアのリスト(賦課と資格のペア);
        更正対象パラメータ.set通知書番号(param.get通知書番号());
        更正対象パラメータ.set世帯員所得情報List(param.get世帯員所得情報List());
        更正対象パラメータ.set生保の情報のリスト(param.get生保の情報のリスト());
        更正対象パラメータ.set老福の情報のリスト(param.get老福の情報のリスト());
        更正対象パラメータ.set境界層の情報のリスト(param.get境界層の情報のリスト());
        List<FukaShikakuPair> 更正対象 = mark更正対象(更正対象パラメータ);

        KoseiShorikoaParameter 更正計算パラメータ = new KoseiShorikoaParameter();
        更正計算パラメータ.set賦課年度(param.get賦課年度());
        更正計算パラメータ.set調定日時(YMDHMS.now());
        更正計算パラメータ.set徴収方法の情報_更正前(new ChoshuHoho(param.get徴収方法の情報().toEntity()));
        更正計算パラメータ.set世帯員所得情報List(param.get世帯員所得情報List());
        更正計算パラメータ.set生保の情報のリスト(param.get生保の情報のリスト());
        更正計算パラメータ.set老福の情報のリスト(param.get老福の情報のリスト());
        更正計算パラメータ.set境界層の情報のリスト(param.get境界層の情報のリスト());
        更正計算パラメータ.set口座のリスト(param.get口座のリスト());
        更正計算パラメータ.set保険料段階リスト(param.get保険料段階リスト());

        List<KoseiZengoFuka> 更正前後賦課リスト = new ArrayList<>();
        List<ChoshuHoho> 徴収方法の情報リスト = new ArrayList<>();
        List<HihokenshaDaicho> 資格の情報リスト = new ArrayList<>();
        for (FukaShikakuPair pair : 更正対象) {
            更正計算パラメータ.set年度分賦課リスト_更正前(年度分賦課リストローン(pair.get年度分賦課リスト()));
            更正計算パラメータ.set資格の情報(new HihokenshaDaicho(pair.get資格の情報().toEntity()));

            KoseiZengoFuka 更正前後賦課 = new KoseiZengoFuka();
            更正前後賦課.set賦課年度(param.get賦課年度());
            更正前後賦課.set通知書番号(param.get通知書番号());
            更正前後賦課.set更正前(pair.get年度分賦課リスト());
            KoseiShorikoaResult 更正処理情報 = do更正計算(更正計算パラメータ);
            更正前後賦課.set更正後(更正処理情報.get年度分賦課リスト_更正後());
            更正前後賦課リスト.add(更正前後賦課);

            徴収方法の情報リスト.add(更正処理情報.get徴収方法の情報_更正後());
            資格の情報リスト.add(更正処理情報.get資格の情報());
        }
        KoseiZengoChoshuHoho 更正前後徴収方法 = new KoseiZengoChoshuHoho();
        更正前後徴収方法.set賦課年度(param.get賦課年度());
        更正前後徴収方法.set被保険者番号(null);
        更正前後徴収方法.set更正前(param.get徴収方法の情報());
        for (ChoshuHoho choshuHoho : 徴収方法の情報リスト) {
            int 履歴番号 = choshuHoho.get履歴番号();
            if (更正前後徴収方法.get更正前().get履歴番号() == 履歴番号) {
                履歴番号 = 履歴番号 + INT_1;
            }
            if (choshuHoho.hasChanged()) {
                DbT2001ChoshuHohoEntity choshuHohoEntity = choshuHoho.toEntity();
                choshuHohoEntity.setRirekiNo(履歴番号);
                choshuHohoEntity.setState(EntityDataState.Added);
                choshuHoho = new ChoshuHoho(choshuHohoEntity);
            }
            if (EntityDataState.Added.equals(choshuHoho.toEntity().getState())) {
                更正前後徴収方法.setHasChanged(true);
                更正前後徴収方法.set更正後(choshuHoho);
                break;
            }
        }
        KoseiShoriResult result = new KoseiShoriResult();
        result.set更正前後徴収方法(更正前後徴収方法);
        result.set更正前後賦課のリスト(更正前後賦課リスト);
        result.set資格の情報(資格の情報リスト);
        return result;
    }

    /**
     * 賦課と資格のペア生成メソッド
     *
     * @param 賦課年度 FlexibleYear
     * @param 年度分賦課リスト List<NendobunFukaList>
     * @param 資格の情報リスト List<HihokenshaDaicho>
     * @return List<FukaShikakuPair>
     */
    public List<FukaShikakuPair> pair賦課With資格(FlexibleYear 賦課年度, List<NendobunFukaList> 年度分賦課リスト,
            List<HihokenshaDaicho> 資格の情報リスト) {
        List<FukaShikakuPair> 賦課の情報_資格の情報ペアのリスト = new ArrayList<>();
        List<HihokenshaDaicho> 有効な資格の情報リスト = get有効な資格の情報(資格の情報リスト, 賦課年度);

        Collections.sort(有効な資格の情報リスト, new Comparator<HihokenshaDaicho>() {
            @Override
            public int compare(HihokenshaDaicho o1, HihokenshaDaicho o2) {
                if (o1.get第1号資格取得年月日().isBefore(o2.get第1号資格取得年月日())) {
                    return -1;
                } else if (o1.get第1号資格取得年月日().equals(o2.get第1号資格取得年月日())) {
                    return 0;
                }
                return 1;
            }
        });
        Collections.sort(年度分賦課リスト, new Comparator<NendobunFukaList>() {
            @Override
            public int compare(NendobunFukaList o1, NendobunFukaList o2) {
                if (o1.get賦課期日().isBefore(o2.get賦課期日())) {
                    return -1;
                } else if (o1.get賦課期日().equals(o2.get賦課期日())) {
                    return 0;
                }
                return 1;
            }
        });

        if (年度分賦課リスト.size() <= 有効な資格の情報リスト.size()) {
            for (int i = 0; i < 年度分賦課リスト.size(); i++) {
                FukaShikakuPair 賦課の情報_資格の情報ペア = new FukaShikakuPair();
                賦課の情報_資格の情報ペア.set被保険者番号(有効な資格の情報リスト.get(i).get被保険者番号());
                賦課の情報_資格の情報ペア.set識別コード(有効な資格の情報リスト.get(i).get識別コード());
                賦課の情報_資格の情報ペア.set資格の情報(有効な資格の情報リスト.get(i));
                賦課の情報_資格の情報ペア.set年度分賦課リスト(年度分賦課リスト.get(i));
                賦課の情報_資格の情報ペアのリスト.add(賦課の情報_資格の情報ペア);
            }
            for (int i = 年度分賦課リスト.size(); i < 有効な資格の情報リスト.size(); i++) {
                FukaShikakuPair 賦課の情報_資格の情報ペア = new FukaShikakuPair();
                賦課の情報_資格の情報ペア.set被保険者番号(有効な資格の情報リスト.get(i).get被保険者番号());
                賦課の情報_資格の情報ペア.set識別コード(有効な資格の情報リスト.get(i).get識別コード());
                賦課の情報_資格の情報ペア.set資格の情報(有効な資格の情報リスト.get(i));
                賦課の情報_資格の情報ペアのリスト.add(賦課の情報_資格の情報ペア);
            }
        } else {
            throw new SystemException(エラーメッセージ.toString());
        }
        return 賦課の情報_資格の情報ペアのリスト;
    }

    private NendobunFukaList 年度分賦課リストローン(NendobunFukaList 年度分賦課リスト) {
        if (年度分賦課リスト == null) {
            return null;
        }
        NendobunFukaList 年度分賦課リストローン = new NendobunFukaList();
        年度分賦課リストローン.set賦課年度(年度分賦課リスト.get賦課年度());
        年度分賦課リストローン.set通知書番号(年度分賦課リスト.get通知書番号());
        年度分賦課リストローン.set現年度(賦課の情報クローン(年度分賦課リスト.get現年度()));
        年度分賦課リストローン.set過年度1(賦課の情報クローン(年度分賦課リスト.get過年度1()));
        年度分賦課リストローン.set過年度2(賦課の情報クローン(年度分賦課リスト.get過年度2()));
        年度分賦課リストローン.set過年度3(賦課の情報クローン(年度分賦課リスト.get過年度3()));
        年度分賦課リストローン.set過年度4(賦課の情報クローン(年度分賦課リスト.get過年度4()));
        年度分賦課リストローン.set過年度5(賦課の情報クローン(年度分賦課リスト.get過年度5()));
        年度分賦課リストローン.set賦課期日(年度分賦課リスト.get賦課期日());
        年度分賦課リストローン.setHas過年度賦課(年度分賦課リスト.isHas過年度賦課());
        年度分賦課リストローン.set最新賦課の情報(賦課の情報クローン(年度分賦課リスト.get最新賦課の情報()));
        return 年度分賦課リストローン;
    }

    private List<HihokenshaDaicho> get有効な資格の情報(List<HihokenshaDaicho> 資格の情報リスト, FlexibleYear 賦課年度) {
        Collections.sort(資格の情報リスト, new Comparator<HihokenshaDaicho>() {
            @Override
            public int compare(HihokenshaDaicho o1, HihokenshaDaicho o2) {
                int flag = 0;
                if (o2.get第1号資格取得年月日().isBefore(o1.get第1号資格取得年月日())
                        && o2.get異動日().isBefore(o1.get異動日())) {
                    flag = o2.get枝番().compareTo(o1.get枝番());
                }
                return flag;
            }
        });
        List<HihokenshaDaicho> tmpList = new ArrayList<>();
        List<HihokenshaDaicho> 有効な資格の情報リスト = new ArrayList<>();
        tmpList.add(資格の情報リスト.get(0));
        for (int index = 1; index < 資格の情報リスト.size(); index++) {
            if (資格の情報リスト.get(index).get第1号資格取得年月日()
                    != 資格の情報リスト.get(index - 1).get第1号資格取得年月日()) {
                tmpList.add(資格の情報リスト.get(index));
            }
        }
        FlexibleDate 本年度開始日 = new FlexibleDate(NendoUtil.toNendoStartDate(賦課年度).toDateString());
        FlexibleDate 本年度終了日 = new FlexibleDate(賦課年度.plusYear(INT_1).getYearValue(), Month.MARCH.getValue(), DAY);
        FlexibleDate 本年度資格喪失日 = new FlexibleDate(賦課年度.getYearValue(), Month.MAY.getValue(), INT_1);
        for (HihokenshaDaicho 資格の情報 : tmpList) {
            FlexibleDate 第1号資格取得日 = 資格の情報.get第1号資格取得年月日();
            FlexibleDate 資格喪失日 = 資格の情報.get資格喪失年月日();
            if (資格喪失日 == null || 資格喪失日.isEmpty()) {
                資格喪失日 = FlexibleDate.MAX;
            }
            if (第1号資格取得日 != null && !第1号資格取得日.isEmpty()) {
                if (第1号資格取得日.isBeforeOrEquals(本年度開始日) && 本年度終了日.isBeforeOrEquals(資格喪失日)) {
                    有効な資格の情報リスト.add(資格の情報);
                } else if (本年度開始日.isBefore(第1号資格取得日) && 第1号資格取得日.isBeforeOrEquals(本年度終了日)) {
                    有効な資格の情報リスト.add(資格の情報);
                } else if (本年度資格喪失日.isBeforeOrEquals(資格喪失日) && 資格喪失日.isBeforeOrEquals(本年度終了日)) {
                    有効な資格の情報リスト.add(資格の情報);
                }
            }
        }

        return 有効な資格の情報リスト;
    }

    /**
     * 更正対象導出メソッド
     *
     * @param param KoseiTaishoParameter
     * @return List<FukaShikakuPair>
     */
    public List<FukaShikakuPair> mark更正対象(KoseiTaishoParameter param) {
        List<FukaShikakuPair> 出力用ペアリスト = new ArrayList<>();
        if (param.get賦課の情報_資格の情報ペアのリスト().isEmpty()) {
            return 出力用ペアリスト;
        }
        if (is生活保護(param) || is老齢福祉年金(param) || is境界層(param)) {
            return param.get賦課の情報_資格の情報ペアのリスト();
        }
        List<FukaShikakuPair> 賦課の情報_資格の情報ペアリスト = param.get賦課の情報_資格の情報ペアのリスト();
        for (FukaShikakuPair pair : 賦課の情報_資格の情報ペアリスト) {
            if (is状況が変化(pair.get年度分賦課リスト(), pair.get資格の情報(), param)) {
                出力用ペアリスト.add(pair);
            }
        }
        return 出力用ペアリスト;
    }

    private boolean is生活保護(KoseiTaishoParameter param) {
        for (FukaShikakuPair pair : param.get賦課の情報_資格の情報ペアのリスト()) {
            if (pair.get年度分賦課リスト() == null) {
                return false;
            }
            FukaJoho 賦課の情報 = get賦課の情報(pair.get年度分賦課リスト());
            if (賦課の情報 == null) {
                return false;
            }
            if (is受給者として賦課(賦課の情報.get生保開始日())) {
                if (!is年度内に受給期間あり_生保(param.get生保の情報のリスト(), param.get賦課年度())) {
                    return true;
                }
            } else if (is年度内に受給期間あり_生保(param.get生保の情報のリスト(), param.get賦課年度())) {
                return true;
            }

        }
        return false;
    }

    private boolean is老齢福祉年金(KoseiTaishoParameter param) {
        for (FukaShikakuPair pair : param.get賦課の情報_資格の情報ペアのリスト()) {
            if (pair.get年度分賦課リスト() == null) {
                return false;
            }
            FukaJoho 賦課の情報 = get賦課の情報(pair.get年度分賦課リスト());
            if (賦課の情報 == null) {
                return false;
            }
            if (is受給者として賦課(賦課の情報.get老年開始日())) {
                if (!is年度内に受給期間あり_福祉(param.get老福の情報のリスト(), param.get賦課年度())) {
                    return true;
                }
            } else if (is年度内に受給期間あり_福祉(param.get老福の情報のリスト(), param.get賦課年度())) {
                return true;
            }

        }
        return false;
    }

    private boolean is境界層(KoseiTaishoParameter param) {
        for (FukaShikakuPair pair : param.get賦課の情報_資格の情報ペアのリスト()) {
            if (pair.get年度分賦課リスト() == null) {
                return false;
            }
            FukaJoho 賦課の情報 = get賦課の情報(pair.get年度分賦課リスト());
            if (賦課の情報 == null) {
                return false;
            }
            if (is境界層該当として賦課(賦課の情報.get境界層区分())) {
                if (!is年度内に適用期間あり(param.get境界層の情報のリスト(), param.get賦課年度())) {
                    return true;
                }
            } else if (is年度内に適用期間あり(param.get境界層の情報のリスト(), param.get賦課年度())) {
                return true;
            }

        }
        return false;
    }

    private FukaJoho get賦課の情報(NendobunFukaList 年度分賦課リスト) {
        if (年度分賦課リスト.get過年度5() != null) {
            return 年度分賦課リスト.get過年度5();
        } else if (年度分賦課リスト.get過年度4() != null) {
            return 年度分賦課リスト.get過年度4();
        } else if (年度分賦課リスト.get過年度3() != null) {
            return 年度分賦課リスト.get過年度3();
        } else if (年度分賦課リスト.get過年度2() != null) {
            return 年度分賦課リスト.get過年度2();
        } else if (年度分賦課リスト.get過年度1() != null) {
            return 年度分賦課リスト.get過年度1();
        } else {
            return 年度分賦課リスト.get現年度();
        }
    }

    private boolean is受給者として賦課(FlexibleDate 開始日) {
        return 開始日 == null || 開始日.isEmpty();
    }

    private boolean is年度内に受給期間あり_生保(List<SeikatsuHogoJukyusha> 生保の情報リスト, FlexibleYear 賦課年度) {
        FlexibleDate 本年度開始日 = new FlexibleDate(NendoUtil.toNendoStartDate(賦課年度).toDateString());
        FlexibleDate 本年度終了日 = new FlexibleDate(賦課年度.plusYear(INT_1).getYearValue(), Month.MARCH.getValue(), DAY);
        if (生保の情報リスト == null || 生保の情報リスト.isEmpty()) {
            return false;
        }
        for (SeikatsuHogoJukyusha entity : 生保の情報リスト) {
            FlexibleDate 受給開始日 = entity.get受給開始日();
            FlexibleDate 受給廃止日 = entity.get受給廃止日();
            if (受給廃止日 == null || 受給廃止日.isEmpty()) {
                受給廃止日 = FlexibleDate.MAX;
            }
            if (受給開始日 != null && !受給開始日.isEmpty()) {
                if (受給開始日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給開始日)) {
                    return true;
                } else if (受給廃止日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給廃止日)) {
                    return true;
                } else if (受給開始日.isBefore(本年度開始日) && 本年度終了日.isBefore(受給廃止日)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean is年度内に受給期間あり_福祉(List<RoreiFukushiNenkinJukyusha> 老福の情報のリスト,
            FlexibleYear 賦課年度) {
        FlexibleDate 本年度開始日 = new FlexibleDate(NendoUtil.toNendoStartDate(賦課年度).toDateString());
        FlexibleDate 本年度終了日 = new FlexibleDate(賦課年度.plusYear(INT_1).getYearValue(), Month.MARCH.getValue(), DAY);
        if (老福の情報のリスト == null || 老福の情報のリスト.isEmpty()) {
            return false;
        }

        for (RoreiFukushiNenkinJukyusha entity : 老福の情報のリスト) {
            FlexibleDate 受給開始日 = entity.get受給開始年月日();
            FlexibleDate 受給廃止日 = entity.get受給終了年月日();
            if (受給廃止日 == null || 受給廃止日.isEmpty()) {
                受給廃止日 = FlexibleDate.MAX;
            }
            if (受給開始日 != null && !受給開始日.isEmpty()) {
                if (受給開始日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給開始日)) {
                    return true;
                } else if (受給廃止日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給廃止日)) {
                    return true;
                } else if (受給開始日.isBefore(本年度開始日) && 本年度終了日.isBefore(受給廃止日)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean is境界層該当として賦課(RString 境界層区分) {
        return KyokaisoKubun.該当.getコード().equals(境界層区分);
    }

    private boolean is年度内に適用期間あり(List<KyokaisoGaitosha> 境界層の情報のリスト,
            FlexibleYear 賦課年度) {
        FlexibleDate 本年度開始日 = new FlexibleDate(NendoUtil.toNendoStartDate(賦課年度).toDateString());
        FlexibleDate 本年度終了日 = new FlexibleDate(賦課年度.plusYear(INT_1).getYearValue(), Month.MARCH.getValue(), DAY);
        if (境界層の情報のリスト == null || 境界層の情報のリスト.isEmpty()) {
            return false;
        }
        for (KyokaisoGaitosha entity : 境界層の情報のリスト) {
            FlexibleDate 受給開始日 = entity.get適用開始年月日();
            FlexibleDate 受給廃止日 = entity.get適用終了年月日();
            if (受給廃止日 == null || 受給廃止日.isEmpty()) {
                受給廃止日 = FlexibleDate.MAX;
            }
            if (受給開始日 != null && !受給開始日.isEmpty()) {
                if (受給開始日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給開始日)) {
                    return true;
                } else if (受給廃止日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給廃止日)) {
                    return true;
                } else if (受給開始日.isBefore(本年度開始日) && 本年度終了日.isBefore(受給廃止日)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean is状況が変化(NendobunFukaList 年度分賦課リスト, HihokenshaDaicho 資格の情報, KoseiTaishoParameter param) {
        if (年度分賦課リスト == null || 年度分賦課リスト.get現年度() == null) {
            return true;
        }
        FukaJoho 賦課の情報 = 年度分賦課リスト.get現年度();
        if (賦課の情報.get通知書番号().equals(param.get通知書番号())) {
            return true;
        }
        for (SetaiinShotoku setai : param.get世帯員所得情報List()) {
            if (HonninKubun.本人.getCode().equals(setai.get本人区分())
                    && isRString変更(賦課の情報.get課税区分(), setai.get課税区分_住民税減免前())) {
                return true;
            } else if (HonninKubun.世帯構成員.getCode().equals(setai.get本人区分())
                    && isRString変更(賦課の情報.get世帯課税区分(), setai.get課税区分_住民税減免前())) {
                return true;
            }
            if (isDecimal変更(賦課の情報.get合計所得金額(), setai.get合計所得金額())
                    || isDecimal変更(賦課の情報.get公的年金収入額(), setai.get年金収入額())) {
                return true;
            }
        }
        return isFlexibleDate変更(賦課の情報.get資格取得日(), 資格の情報.get資格取得年月日())
                || isFlexibleDate変更(賦課の情報.get資格喪失日(), 資格の情報.get資格喪失年月日());
    }

    /**
     * 更正処理コアメソッド
     *
     * @param param KoseiShorikoaParameter
     * @return KoseiShorikoaResult
     */
    public KoseiShorikoaResult do更正計算(KoseiShorikoaParameter param) {
        FlexibleDate 賦課基準日 = findOut賦課基準日(param.get賦課年度(), param.get資格の情報());
        HokenryoDankaiHantei hantei = InstanceProvider.create(HokenryoDankaiHantei.class);
        HokenryoDankaiHanteiParameter 保険料段階パラメータ = new HokenryoDankaiHanteiParameter();
        保険料段階パラメータ.setFukaNendo(param.get賦課年度());

        FukaKonkyoFactory factory = InstanceProvider.create(FukaKonkyoFactory.class);
        FukaKonkyoParameter fukaKonkyoParameter = new FukaKonkyoParameter();
        fukaKonkyoParameter.set賦課基準日(賦課基準日);
        fukaKonkyoParameter.set生保の情報リスト(param.get生保の情報のリスト());
        fukaKonkyoParameter.set老齢の情報のリスト(param.get老福の情報のリスト());
        fukaKonkyoParameter.set世帯員所得情報List(param.get世帯員所得情報List());
        FukaKonkyo 賦課根拠 = factory.create(fukaKonkyoParameter);
        保険料段階パラメータ.setFukaKonkyo(賦課根拠);

        SeigyoJoho 月別保険料制御情報 = get月別保険料制御情報(param.get保険料段階リスト());
        保険料段階パラメータ.setSeigyoJoho(月別保険料制御情報);
        TsukibetsuHokenryoDankai 月別保険料段階 = hantei.determine月別保険料段階(保険料段階パラメータ);

        NengakuHokenryoKeisanParameter 年額保険料パラメータ = new NengakuHokenryoKeisanParameter();
        年額保険料パラメータ.set賦課年度(param.get賦課年度());

        List<HihokenshaDaicho> 資格 = new ArrayList<>();
        資格.add(param.get資格の情報());
        HokenryoRank rank = InstanceProvider.create(HokenryoRank.class);
        List<MonthShichoson> 月別ランク情報 = rank.get月別ランク情報(資格, param.get賦課年度());

        NengakuFukaKonkyo 年額賦課根拠 = get年額賦課根拠(賦課基準日, param.get資格の情報().get第1号資格取得年月日(),
                param.get資格の情報().get資格喪失年月日(), 月別保険料段階, 月別ランク情報);
        年額保険料パラメータ.set年額賦課根拠(年額賦課根拠);

        NengakuSeigyoJoho 年額制御情報 = get年額制御情報(param.get賦課年度());
        年額保険料パラメータ.set年額制御情報(年額制御情報);

        NengakuHokenryoKeisan 年額保険料の計算 = InstanceProvider.create(NengakuHokenryoKeisan.class);
        NengakuHokenryo 年額保険料 = 年額保険料の計算.calculate年額保険料(年額保険料パラメータ);

        FukaKokyoParameter 賦課根拠パラメータ = new FukaKokyoParameter();
        賦課根拠パラメータ.set賦課年度(param.get賦課年度());
        賦課根拠パラメータ.set資格の情報(new HihokenshaDaicho(param.get資格の情報().toEntity()));
        賦課根拠パラメータ.set世帯員所得情報List(param.get世帯員所得情報List());
        賦課根拠パラメータ.set生保の情報のリスト(param.get生保の情報のリスト());
        賦課根拠パラメータ.set老福の情報のリスト(param.get老福の情報のリスト());
        賦課根拠パラメータ.set境界層の情報のリスト(param.get境界層の情報のリスト());
        賦課根拠パラメータ.set賦課根拠パラメータ(賦課根拠);
        賦課根拠パラメータ.set月別保険料段階(月別保険料段階);
        賦課根拠パラメータ.set年額保険料(年額保険料.getHokenryoNengaku());
        賦課根拠パラメータ.set調定日時(param.get調定日時());

        CalculateChoteiParameter 調定計算パラメータ = new CalculateChoteiParameter();
        調定計算パラメータ.set賦課年度(param.get賦課年度());
        調定計算パラメータ.set調定日時(param.get調定日時());
        調定計算パラメータ.set徴収方法の情報_更正前(new ChoshuHoho(param.get徴収方法の情報_更正前().toEntity()));

        if (param.get年度分賦課リスト_更正前() != null && param.get年度分賦課リスト_更正前().get現年度() != null) {
            調定計算パラメータ.set年額保険料(param.get年度分賦課リスト_更正前().get現年度().get減免前介護保険料_年額());
        } else {
            調定計算パラメータ.set年額保険料(年額保険料.getHokenryoNengaku());
        }
        調定計算パラメータ.set資格の情報(new HihokenshaDaicho(param.get資格の情報().toEntity()));
        if (param.get年度分賦課リスト_更正前() == null) {
            return create新規の賦課処理コア(param, 賦課根拠パラメータ, 賦課基準日, 調定計算パラメータ);
        } else {
            return create既存の賦課処理コア(param, 賦課根拠パラメータ, 調定計算パラメータ, 年額保険料.getHokenryoNengaku());
        }
    }

    private KoseiShorikoaResult create新規の賦課処理コア(KoseiShorikoaParameter param, FukaKokyoParameter 賦課根拠パラメータ,
            FlexibleDate 賦課基準日, CalculateChoteiParameter 調定計算パラメータ) {
        FlexibleYear 調定年度 = new FlexibleYear(DbBusinessConfig.get(ConfigNameDBB.日付関連_調定年度,
                RDate.getNowDate(), SubGyomuCode.DBB介護賦課));
//        CountedItem saiban = Saiban.get(SubGyomuCode.DBB介護賦課, 汎用キー_通知書番号, FlexibleDate.getNowDate().getNendo());
        DbT2002FukaDac fukaDac = InstanceProvider.create(DbT2002FukaDac.class);
        List<DbT2002FukaEntity> 賦課履歴List = fukaDac.select賦課履歴On(param.get賦課年度(), param.get資格の情報().get被保険者番号());
        TsuchishoNo 通知書番号 = create通知書番号(param.get資格の情報().get被保険者番号().getColumnValue(),
                賦課履歴List);
        FukaJoho 新しい賦課の情報 = new FukaJoho(調定年度, param.get賦課年度(), 通知書番号, 0);

        賦課根拠パラメータ.set賦課の情報_設定前(新しい賦課の情報);
        FukaJoho 賦課の情報 = reflect賦課根拠(賦課根拠パラメータ);

        NendobunFukaList 調定計算用年度分賦課リスト = new NendobunFukaList();
        調定計算用年度分賦課リスト.set賦課年度(賦課の情報.get賦課年度());
        調定計算用年度分賦課リスト.set通知書番号(賦課の情報.get通知書番号());
        調定計算用年度分賦課リスト.set賦課期日(賦課基準日);
        Boolean isHas過年度賦課 = false;
        if (調定年度.equals(param.get賦課年度())) {
            調定計算用年度分賦課リスト.set現年度(賦課の情報);
        } else if (調定年度.equals(param.get賦課年度().plusYear(INT_1))) {
            isHas過年度賦課 = true;
            調定計算用年度分賦課リスト.set過年度1(賦課の情報);
        } else if (調定年度.equals(param.get賦課年度().plusYear(INT_2))) {
            isHas過年度賦課 = true;
            調定計算用年度分賦課リスト.set過年度2(賦課の情報);
        } else if (調定年度.equals(param.get賦課年度().plusYear(INT_3))) {
            isHas過年度賦課 = true;
            調定計算用年度分賦課リスト.set過年度3(賦課の情報);
        } else if (調定年度.equals(param.get賦課年度().plusYear(INT_4))) {
            isHas過年度賦課 = true;
            調定計算用年度分賦課リスト.set過年度4(賦課の情報);
        } else if (調定年度.equals(param.get賦課年度().plusYear(INT_5))) {
            isHas過年度賦課 = true;
            調定計算用年度分賦課リスト.set過年度5(賦課の情報);
        }
        調定計算用年度分賦課リスト.set最新賦課の情報(賦課の情報);
        調定計算用年度分賦課リスト.setHas過年度賦課(isHas過年度賦課);

        調定計算パラメータ.set年度分賦課リスト_更正前(調定計算用年度分賦課リスト);
        KoseiShorikoaResult 調定計算 = do調定計算(調定計算パラメータ);

        NendobunFukaList 出力用年度分賦課リスト = 調定計算.get年度分賦課リスト_更正後();
        出力用年度分賦課リスト.set現年度(edite賦課の情報(出力用年度分賦課リスト.get現年度(), param, 調定計算));
        出力用年度分賦課リスト.set過年度1(edite賦課の情報(出力用年度分賦課リスト.get過年度1(), param, 調定計算));
        出力用年度分賦課リスト.set過年度2(edite賦課の情報(出力用年度分賦課リスト.get過年度2(), param, 調定計算));
        出力用年度分賦課リスト.set過年度3(edite賦課の情報(出力用年度分賦課リスト.get過年度3(), param, 調定計算));
        出力用年度分賦課リスト.set過年度4(edite賦課の情報(出力用年度分賦課リスト.get過年度4(), param, 調定計算));
        出力用年度分賦課リスト.set過年度5(edite賦課の情報(出力用年度分賦課リスト.get過年度5(), param, 調定計算));
        出力用年度分賦課リスト.set最新賦課の情報(edite賦課の情報(出力用年度分賦課リスト.get最新賦課の情報(), param, 調定計算));

        KoseiShorikoaResult result = new KoseiShorikoaResult();
        result.set徴収方法の情報_更正後(調定計算.get徴収方法の情報_更正後());
        result.set年度分賦課リスト_更正後(出力用年度分賦課リスト);
        result.set資格の情報(調定計算.get資格の情報());
        return result;
    }

    private FukaJoho edite賦課の情報(FukaJoho 賦課の情報, KoseiShorikoaParameter param, KoseiShorikoaResult 調定計算) {
        if (賦課の情報 == null) {
            return null;
        }
        FukaJohoBuilder builder = 賦課の情報.createBuilderForEdit();
        builder.set調定日時(param.get調定日時())
                .set異動基準日時(param.get調定日時())
                .set徴収方法履歴番号(調定計算.get徴収方法の情報_更正後().get履歴番号() + INT_1);
        if (!is普徴期別金額あり(賦課の情報)) {
            builder.set口座区分(KozaKubun.現金納付.getコード());
        } else if (!param.get口座のリスト().isEmpty()) {
            builder.set口座区分(KozaKubun.口座振替.getコード());
        } else {
            builder.set口座区分(KozaKubun.現金納付.getコード());
        }
        builder.set職権区分(ShokkenKubun.非該当.getコード());
        賦課の情報 = builder.build();
        return 賦課の情報;
    }

    private TsuchishoNo create通知書番号(RString 被保険者番号, List<DbT2002FukaEntity> 賦課履歴List) {
        RStringBuilder rst = new RStringBuilder();
        if (null == 賦課履歴List || 賦課履歴List.isEmpty()) {
            rst.append(ゼロ_0000);
            rst.append(被保険者番号);
            rst.append(new RString("01"));
            return new TsuchishoNo(rst.toRString());
        } else {
            rst.append(get通知書番号(賦課履歴List));
            return new TsuchishoNo(rst.toRString());
        }
    }

    private RString get通知書番号(List<DbT2002FukaEntity> 賦課履歴List) {
        int max番号 = 0;
        TsuchishoNo max通知書番号 = null;
        for (DbT2002FukaEntity entity : 賦課履歴List) {
            if (null != entity.getTsuchishoNo() && !entity.getTsuchishoNo().isEmpty()) {
                int 下2桁の数値 = Integer.valueOf(entity.getTsuchishoNo().getColumnValue()
                        .substring(entity.getTsuchishoNo().getColumnValue().length() - 2).toString());
                if (下2桁の数値 > max番号) {
                    max番号 = 下2桁の数値;
                    max通知書番号 = entity.getTsuchishoNo();
                }
            }
        }
        if (null != max通知書番号) {
            return max通知書番号.getColumnValue().substring(0, max通知書番号.getColumnValue().length() - 2).concat(
                    new RString(max番号 + 1).padZeroToLeft(2));
        }
        return RString.EMPTY;

    }

    private KoseiShorikoaResult create既存の賦課処理コア(KoseiShorikoaParameter param, FukaKokyoParameter 賦課根拠パラメータ,
            CalculateChoteiParameter 調定計算パラメータ, Decimal 年額保険料) {
        NendobunFukaList 調定計算用年度分賦課リスト = 年度分賦課リストローン(param.get年度分賦課リスト_更正前());
        if (param.get年度分賦課リスト_更正前().get現年度() != null) {
            賦課根拠パラメータ.set賦課の情報_設定前(param.get年度分賦課リスト_更正前().get現年度());
            FukaJoho 賦課の情報 = reflect賦課根拠(賦課根拠パラメータ);
            調定計算用年度分賦課リスト.set現年度(賦課の情報);
            調定計算用年度分賦課リスト.set最新賦課の情報(賦課の情報);
        }
        if (param.get年度分賦課リスト_更正前().get過年度1() != null) {
            賦課根拠パラメータ.set賦課の情報_設定前(param.get年度分賦課リスト_更正前().get過年度1());
            FukaJoho 賦課の情報 = reflect賦課根拠(賦課根拠パラメータ);
            調定計算用年度分賦課リスト.set過年度1(賦課の情報);
            調定計算用年度分賦課リスト.set最新賦課の情報(賦課の情報);
        }
        if (param.get年度分賦課リスト_更正前().get過年度2() != null) {
            賦課根拠パラメータ.set賦課の情報_設定前(param.get年度分賦課リスト_更正前().get過年度2());
            FukaJoho 賦課の情報 = reflect賦課根拠(賦課根拠パラメータ);
            調定計算用年度分賦課リスト.set過年度2(賦課の情報);
            調定計算用年度分賦課リスト.set最新賦課の情報(賦課の情報);
        }
        if (param.get年度分賦課リスト_更正前().get過年度3() != null) {
            賦課根拠パラメータ.set賦課の情報_設定前(param.get年度分賦課リスト_更正前().get過年度3());
            FukaJoho 賦課の情報 = reflect賦課根拠(賦課根拠パラメータ);
            調定計算用年度分賦課リスト.set過年度3(賦課の情報);
            調定計算用年度分賦課リスト.set最新賦課の情報(賦課の情報);
        }
        if (param.get年度分賦課リスト_更正前().get過年度4() != null) {
            賦課根拠パラメータ.set賦課の情報_設定前(param.get年度分賦課リスト_更正前().get過年度4());
            FukaJoho 賦課の情報 = reflect賦課根拠(賦課根拠パラメータ);
            調定計算用年度分賦課リスト.set過年度4(賦課の情報);
            調定計算用年度分賦課リスト.set最新賦課の情報(賦課の情報);
        }
        if (param.get年度分賦課リスト_更正前().get過年度5() != null) {
            賦課根拠パラメータ.set賦課の情報_設定前(param.get年度分賦課リスト_更正前().get過年度5());
            FukaJoho 賦課の情報 = reflect賦課根拠(賦課根拠パラメータ);
            調定計算用年度分賦課リスト.set過年度5(賦課の情報);
            調定計算用年度分賦課リスト.set最新賦課の情報(賦課の情報);
        }

        NendobunFukaList 年度分賦課リスト_更正後 = 調定計算用年度分賦課リスト;
        ChoshuHoho 出力徴収方法の情報 = new ChoshuHoho(param.get徴収方法の情報_更正前().toEntity());
        HihokenshaDaicho 資格の情報 = param.get資格の情報();
        if ((調定計算用年度分賦課リスト.get現年度() != null
                && !年額保険料.equals(param.get年度分賦課リスト_更正前().get現年度().get減免前介護保険料_年額()))
                || (param.get徴収方法の情報_更正前().get特別徴収停止事由コード() != null
                && !param.get徴収方法の情報_更正前().get特別徴収停止事由コード().isEmpty())) {
            調定計算パラメータ.set年度分賦課リスト_更正前(調定計算用年度分賦課リスト);
            KoseiShorikoaResult 調定計算 = do調定計算(調定計算パラメータ);
            年度分賦課リスト_更正後 = 調定計算.get年度分賦課リスト_更正後();
            出力徴収方法の情報 = 調定計算.get徴収方法の情報_更正後();
            資格の情報 = 調定計算.get資格の情報();
        }
        if (調定計算用年度分賦課リスト.get現年度() != null) {
            年度分賦課リスト_更正後.set現年度(create出力対象の生成(param, param.get年度分賦課リスト_更正前().get現年度(),
                    年度分賦課リスト_更正後.get現年度(), 出力徴収方法の情報));
        }
        if (調定計算用年度分賦課リスト.get過年度1() != null) {
            年度分賦課リスト_更正後.set過年度1(create出力対象の生成(param, param.get年度分賦課リスト_更正前().get過年度1(),
                    年度分賦課リスト_更正後.get過年度1(), 出力徴収方法の情報));
        }
        if (調定計算用年度分賦課リスト.get過年度2() != null) {
            年度分賦課リスト_更正後.set過年度2(create出力対象の生成(param, param.get年度分賦課リスト_更正前().get過年度2(),
                    年度分賦課リスト_更正後.get過年度2(), 出力徴収方法の情報));
        }
        if (調定計算用年度分賦課リスト.get過年度3() != null) {
            年度分賦課リスト_更正後.set過年度3(create出力対象の生成(param, param.get年度分賦課リスト_更正前().get過年度3(),
                    年度分賦課リスト_更正後.get過年度3(), 出力徴収方法の情報));
        }
        if (調定計算用年度分賦課リスト.get過年度4() != null) {
            年度分賦課リスト_更正後.set過年度4(create出力対象の生成(param, param.get年度分賦課リスト_更正前().get過年度4(),
                    年度分賦課リスト_更正後.get過年度4(), 出力徴収方法の情報));
        }
        if (調定計算用年度分賦課リスト.get過年度5() != null) {
            年度分賦課リスト_更正後.set過年度5(create出力対象の生成(param, param.get年度分賦課リスト_更正前().get過年度5(),
                    年度分賦課リスト_更正後.get過年度5(), 出力徴収方法の情報));
        }

        KoseiShorikoaResult result = new KoseiShorikoaResult();
        result.set年度分賦課リスト_更正後(年度分賦課リスト_更正後);
        result.set徴収方法の情報_更正後(出力徴収方法の情報);
        result.set資格の情報(資格の情報);
        return result;
    }

    private FukaJoho create出力対象の生成(KoseiShorikoaParameter param, FukaJoho 賦課の情報_更正前,
            FukaJoho 賦課の情報_更正後, ChoshuHoho 出力徴収方法の情報) {
        FukaJohoBuilder builder = 賦課の情報_更正後.createBuilderForEdit();
        if (賦課の情報_更正前 == null) {
            builder.set履歴番号(0);
        } else if (is変化有り(賦課の情報_更正前, 賦課の情報_更正後)) {
            builder = get賦課の情報履歴番号採番(builder.build()).createBuilderForEdit();
        }
        builder.set調定日時(param.get調定日時());
        builder.set異動基準日時(param.get調定日時());
        builder.set徴収方法履歴番号(出力徴収方法の情報.get履歴番号() + INT_1);
        if (!is普徴期別金額あり(賦課の情報_更正後)) {
            builder.set口座区分(KozaKubun.現金納付.getコード());
        } else if (!param.get口座のリスト().isEmpty()) {
            builder.set口座区分(KozaKubun.口座振替.getコード());
        } else {
            builder.set口座区分(KozaKubun.現金納付.getコード());
        }
        builder.set職権区分(ShokkenKubun.非該当.getコード());
        賦課の情報_更正後 = builder.build();
        return 賦課の情報_更正後;
    }

    private boolean is普徴期別金額あり(FukaJoho 賦課の情報) {
        return is金額あり(賦課の情報.get普徴期別金額01())
                || is金額あり(賦課の情報.get普徴期別金額02())
                || is金額あり(賦課の情報.get普徴期別金額03())
                || is金額あり(賦課の情報.get普徴期別金額04())
                || is金額あり(賦課の情報.get普徴期別金額05())
                || is金額あり(賦課の情報.get普徴期別金額06())
                || is金額あり(賦課の情報.get普徴期別金額07())
                || is金額あり(賦課の情報.get普徴期別金額08())
                || is金額あり(賦課の情報.get普徴期別金額09())
                || is金額あり(賦課の情報.get普徴期別金額10())
                || is金額あり(賦課の情報.get普徴期別金額11())
                || is金額あり(賦課の情報.get普徴期別金額12())
                || is金額あり(賦課の情報.get普徴期別金額13())
                || is金額あり(賦課の情報.get普徴期別金額14());
    }

    private boolean is金額あり(Decimal 金額) {
        return 金額 != null && !Decimal.ZERO.equals(金額);
    }

    /**
     * 賦課基準日導出メソッド
     *
     * @param 賦課年度 FlexibleYear
     * @param 資格の情報 HihokenshaDaicho
     * @return FlexibleDate
     */
    public FlexibleDate findOut賦課基準日(FlexibleYear 賦課年度, HihokenshaDaicho 資格の情報) {
        FlexibleDate 年度_0331 = new FlexibleDate(賦課年度.plusYear(INT_1).getYearValue(), Month.MARCH.getValue(), DAY);
        FlexibleDate 年度_0401 = new FlexibleDate(NendoUtil.toNendoStartDate(賦課年度).toDateString());
        if (資格の情報 == null) {
            throw new IllegalArgumentException();
        }
        FlexibleDate 資格取得日 = 資格の情報.get第1号資格取得年月日();
        if (資格取得日 == null || 資格取得日.isEmpty()) {
            資格取得日 = FlexibleDate.MIN;
        }
        FlexibleDate 資格喪失日 = 資格の情報.get資格喪失年月日();
        if (資格喪失日 == null || 資格喪失日.isEmpty()) {
            資格喪失日 = FlexibleDate.MAX;
        }

        if (年度_0331.isBefore(資格取得日) || 資格喪失日.isBefore(年度_0401)) {
            throw new IllegalArgumentException();
        } else if (資格取得日.isBefore(年度_0401)) {
            return 年度_0401;
        } else {
            return 資格取得日;
        }
    }

    /**
     * 賦課根拠設定メソッド
     *
     * @param param FukaKokyoParameter
     * @return FukaJoho
     */
    public FukaJoho reflect賦課根拠(FukaKokyoParameter param) {
        if (param.get賦課の情報_設定前() == null) {
            return null;
        }
        FukaJoho 賦課の情報 = 賦課の情報クローン(param.get賦課の情報_設定前());
        FukaJohoBuilder builder = 賦課の情報.createBuilderForEdit();
        FlexibleDate 本年度開始日 = new FlexibleDate(NendoUtil.toNendoStartDate(賦課の情報.get賦課年度()).toDateString());
        FlexibleDate 本年度終了日 = new FlexibleDate(賦課の情報.get賦課年度().plusYear(INT_1).getYearValue(),
                Month.MARCH.getValue(), DAY);

        set生活保護(builder, param.get生保の情報のリスト(), 本年度開始日, 本年度終了日);

        set老齢福祉年金(builder, param.get老福の情報のリスト(), 本年度開始日, 本年度終了日);

        set境界層(builder, param.get境界層の情報のリスト(), 本年度開始日, 本年度終了日);

        set新しい賦課の情報(builder, param);
        賦課の情報 = builder.build();
        return 賦課の情報;
    }

    /**
     * 賦課根拠設定 (オーバロード)
     *
     * @param param FukaKokyoBatchParameter
     * @return FukaJoho
     */
    public FukaJoho reflect賦課根拠(FukaKokyoBatchParameter param) {
        if (param.get賦課の情報_設定前() == null) {
            return null;
        }
        FukaJoho 賦課の情報 = 賦課の情報クローン(param.get賦課の情報_設定前());
        FukaJohoBuilder builder = 賦課の情報.createBuilderForEdit();
        FlexibleDate 本年度開始日 = new FlexibleDate(NendoUtil.toNendoStartDate(賦課の情報.get賦課年度()).toDateString());
        FlexibleDate 本年度終了日 = new FlexibleDate(賦課の情報.get賦課年度().plusYear(INT_1).getYearValue(),
                Month.MARCH.getValue(), DAY);

        set生活保護(builder, param.get生保の情報のリスト(), 本年度開始日, 本年度終了日);

        set老齢福祉年金(builder, param.get老福の情報のリスト(), 本年度開始日, 本年度終了日);

        set境界層(builder, param.get境界層の情報のリスト(), 本年度開始日, 本年度終了日);

        set新しい賦課の情報_バッチ(builder, param);
        賦課の情報 = builder.build();
        return 賦課の情報;
    }

    private FukaJoho 賦課の情報クローン(FukaJoho 賦課の情報) {
        if (賦課の情報 == null) {
            return null;
        }
        FukaJohoRelateEntity 賦課RelateEntity = new FukaJohoRelateEntity();
        賦課RelateEntity.set介護賦課Entity(賦課の情報.toEntity());
        List<KibetsuEntity> 介護期別RelateEntity = new ArrayList<>();

        if (!賦課の情報.getKibetsuList().isEmpty()) {
            for (Kibetsu kibetsu : 賦課の情報.getKibetsuList()) {
                KibetsuEntity entity = new KibetsuEntity();
                List<UrT0705ChoteiKyotsuEntity> 調定共通Entity = new ArrayList<>();
                for (ChoteiKyotsu choteiKyotsu : kibetsu.getChoteiKyotsuList()) {
                    調定共通Entity.add(choteiKyotsu.toEntity());
                }
                entity.set介護期別Entity(kibetsu.toEntity());
                entity.set調定共通Entity(調定共通Entity);
                介護期別RelateEntity.add(entity);
            }
            賦課RelateEntity.set介護期別RelateEntity(介護期別RelateEntity);
        } else {
            for (int i = 0; i < INT_6; i++) {
                KibetsuEntity entity = new KibetsuEntity();
                Long 調定ID = create調定ID(ChoshuHohoKibetsu.特別徴収.getコード(), i + 1);
                Kibetsu kibetsu = new Kibetsu(
                        賦課の情報.get調定年度(),
                        賦課の情報.get賦課年度(),
                        賦課の情報.get通知書番号(),
                        賦課の情報.get履歴番号(),
                        ChoshuHohoKibetsu.特別徴収.getコード(),
                        調定ID.intValue());
                kibetsu = kibetsu.createBuilderForEdit().set調定ID(Decimal.ZERO).build();
                List<UrT0705ChoteiKyotsuEntity> choteiEntity = new ArrayList<>();
                ChoteiKyotsu 調定共通 = new ChoteiKyotsu(調定ID);
                調定共通 = 調定共通.createBuilderForEdit().set調定額(Decimal.ZERO).build();
                choteiEntity.add(調定共通.toEntity());
                entity.set調定共通Entity(choteiEntity);
                entity.set介護期別Entity(kibetsu.toEntity());
                介護期別RelateEntity.add(entity);
            }
            for (int i = 0; i < INT_14; i++) {
                KibetsuEntity entity = new KibetsuEntity();
                Long 調定ID = create調定ID(ChoshuHohoKibetsu.普通徴収.getコード(), i + 1);
                Kibetsu kibetsu = new Kibetsu(
                        賦課の情報.get調定年度(),
                        賦課の情報.get賦課年度(),
                        賦課の情報.get通知書番号(),
                        賦課の情報.get履歴番号(),
                        ChoshuHohoKibetsu.普通徴収.getコード(),
                        調定ID.intValue());
                kibetsu = kibetsu.createBuilderForEdit().set調定ID(Decimal.ZERO).build();
                List<UrT0705ChoteiKyotsuEntity> choteiEntity = new ArrayList<>();
                ChoteiKyotsu 調定共通 = new ChoteiKyotsu(調定ID);
                調定共通 = 調定共通.createBuilderForEdit().set調定額(Decimal.ZERO).build();
                choteiEntity.add(調定共通.toEntity());
                entity.set調定共通Entity(choteiEntity);
                entity.set介護期別Entity(kibetsu.toEntity());
                介護期別RelateEntity.add(entity);
            }
            賦課RelateEntity.set介護期別RelateEntity(介護期別RelateEntity);
        }

        return new FukaJoho(賦課RelateEntity);
    }

    private Long create調定ID(RString 徴収方法, int ki) {
        return Long.valueOf(徴収方法.concat(new RString(ki).padZeroToLeft(INT_2)).toString());
    }

    private void set生活保護(FukaJohoBuilder builder, List<SeikatsuHogoJukyusha> 生保情報のリスト,
            FlexibleDate 本年度開始日, FlexibleDate 本年度終了日) {
        if (生保情報のリスト == null || 生保情報のリスト.isEmpty()) {
            return;
        }
        List<SeikatsuHogoJukyusha> 生活保護の情報のリスト = new ArrayList<>();
        for (SeikatsuHogoJukyusha entity : 生保情報のリスト) {
            FlexibleDate 受給開始日 = entity.get受給開始日();
            FlexibleDate 受給廃止日 = entity.get受給廃止日();
            if (受給廃止日 == null || 受給廃止日.isEmpty()) {
                受給廃止日 = FlexibleDate.MAX;
            }
            if (受給開始日 != null && !受給開始日.isEmpty()) {
                if (受給開始日.isBefore(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給開始日)) {
                    生活保護の情報のリスト.add(entity);
                } else if (受給廃止日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給廃止日)) {
                    生活保護の情報のリスト.add(entity);
                } else if (受給開始日.isBefore(本年度開始日) && 本年度終了日.isBefore(受給廃止日)) {
                    生活保護の情報のリスト.add(entity);
                }
            }
        }
        if (!生活保護の情報のリスト.isEmpty()) {
            Collections.sort(生活保護の情報のリスト, new Comparator<SeikatsuHogoJukyusha>() {
                @Override
                public int compare(SeikatsuHogoJukyusha o1, SeikatsuHogoJukyusha o2) {
                    if (o2.get受給開始日().isBefore(o1.get受給開始日())) {
                        return -1;
                    } else if (o2.get受給開始日().equals(o1.get受給開始日())) {
                        return 0;
                    }
                    return 1;
                }
            });
            builder.set生活保護扶助種類(get生活保護扶助種類(生活保護の情報のリスト.get(0).getSeikatsuHogoFujoShuruiList()));
            builder.set生保開始日(生活保護の情報のリスト.get(0).get受給開始日());
            builder.set生保廃止日(生活保護の情報のリスト.get(0).get受給廃止日());
        } else {
            builder.set生活保護扶助種類(RString.EMPTY);
            builder.set生保開始日(FlexibleDate.EMPTY);
            builder.set生保廃止日(FlexibleDate.EMPTY);
        }
    }

    private RString get生活保護扶助種類(List<SeikatsuHogoFujoShurui> 扶助種類リスト) {
        if (扶助種類リスト == null || 扶助種類リスト.isEmpty()) {
            return RString.EMPTY;
        }
        List<RString> 扶助種類 = new ArrayList<>();
        for (SeikatsuHogoFujoShurui shurui : 扶助種類リスト) {
            扶助種類.add(shurui.get扶助種類コード().getColumnValue().getColumnValue());
        }
        Collections.sort(扶助種類);
        return 扶助種類.get(0);
    }

    private void set老齢福祉年金(FukaJohoBuilder builder, List<RoreiFukushiNenkinJukyusha> 老福の情報リスト,
            FlexibleDate 本年度開始日, FlexibleDate 本年度終了日) {
        if (老福の情報リスト == null || 老福の情報リスト.isEmpty()) {
            return;
        }
        List<RoreiFukushiNenkinJukyusha> 老齢福祉の情報リスト = new ArrayList<>();
        for (RoreiFukushiNenkinJukyusha entity : 老福の情報リスト) {
            FlexibleDate 受給開始日 = entity.get受給開始年月日();
            FlexibleDate 受給廃止日 = entity.get受給終了年月日();
            if (受給廃止日 == null || 受給廃止日.isEmpty()) {
                受給廃止日 = FlexibleDate.MAX;
            }
            if (受給開始日 != null && !受給開始日.isEmpty()) {
                if (受給開始日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給開始日)) {
                    老齢福祉の情報リスト.add(entity);
                } else if (受給廃止日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給廃止日)) {
                    老齢福祉の情報リスト.add(entity);
                } else if (受給開始日.isBefore(本年度開始日) && 本年度終了日.isBefore(受給廃止日)) {
                    老齢福祉の情報リスト.add(entity);
                }
            }
        }
        if (!老齢福祉の情報リスト.isEmpty()) {
            Collections.sort(老齢福祉の情報リスト, new Comparator<RoreiFukushiNenkinJukyusha>() {
                @Override
                public int compare(RoreiFukushiNenkinJukyusha o1, RoreiFukushiNenkinJukyusha o2) {
                    if (o2.get受給開始年月日().isBefore(o1.get受給開始年月日())) {
                        return -1;
                    } else if (o2.get受給開始年月日().equals(o1.get受給開始年月日())) {
                        return 0;
                    }
                    return 1;
                }
            });
            builder.set老年開始日(老齢福祉の情報リスト.get(0).get受給開始年月日());
            builder.set老年廃止日(老齢福祉の情報リスト.get(0).get受給終了年月日());
        } else {
            builder.set老年開始日(FlexibleDate.EMPTY);
            builder.set老年廃止日(FlexibleDate.EMPTY);
        }
    }

    private void set境界層(FukaJohoBuilder builder, List<KyokaisoGaitosha> 境界層の情報リスト,
            FlexibleDate 本年度開始日, FlexibleDate 本年度終了日) {
        if (境界層の情報リスト == null || 境界層の情報リスト.isEmpty()) {
            return;
        }
        List<KyokaisoGaitosha> 境界層の情報のリスト = new ArrayList<>();
        for (KyokaisoGaitosha entity : 境界層の情報リスト) {
            FlexibleDate 受給開始日 = entity.get適用開始年月日();
            FlexibleDate 受給廃止日 = entity.get適用終了年月日();
            if (受給廃止日 == null || 受給廃止日.isEmpty()) {
                受給廃止日 = FlexibleDate.MAX;
            }
            if (受給開始日 != null && !受給開始日.isEmpty()) {
                if (受給開始日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給開始日)) {
                    境界層の情報のリスト.add(entity);
                } else if (受給廃止日.isBeforeOrEquals(本年度終了日) && 本年度開始日.isBeforeOrEquals(受給廃止日)) {
                    境界層の情報のリスト.add(entity);
                } else if (受給開始日.isBefore(本年度開始日) && 本年度終了日.isBefore(受給廃止日)) {
                    境界層の情報のリスト.add(entity);
                }
            }
        }
        if (!境界層の情報のリスト.isEmpty()) {
            builder.set境界層区分(KyokaisoKubun.該当.getコード());
        } else {
            builder.set境界層区分(KyokaisoKubun.非該当.getコード());
        }
    }

    private void set新しい賦課の情報(FukaJohoBuilder builder, FukaKokyoParameter param) {
        builder.set被保険者番号(param.get資格の情報().get被保険者番号())
                .set識別コード(param.get資格の情報().get識別コード())
                .set資格取得日(param.get資格の情報().get第1号資格取得年月日())
                .set資格取得事由(param.get資格の情報().get資格取得事由コード())
                .set資格喪失日(param.get資格の情報().get資格喪失年月日())
                .set資格喪失事由(param.get資格の情報().get資格喪失事由コード());
        FlexibleDate 賦課期日 = findOut賦課基準日(param.get賦課の情報_設定前().get賦課年度(), param.get資格の情報());
        builder.set賦課期日(賦課期日);
        if (param.get世帯員所得情報List() != null) {
            for (SetaiinShotoku 世帯員 : param.get世帯員所得情報List()) {
                if (HonninKubun.本人.getCode().equals(世帯員.get本人区分())) {
                    builder.set世帯コード(new SetaiCode(世帯員.get世帯コード()))
                            .set課税区分(世帯員.get課税区分_住民税減免前())
                            .set合計所得金額(世帯員.get合計所得金額())
                            .set公的年金収入額(世帯員.get年金収入額());
                    break;
                }
            }
            builder.set世帯員数(param.get世帯員所得情報List().size() - INT_1);
        } else {
            builder.set課税区分(null).set合計所得金額(null).set公的年金収入額(null);
        }

        if (param.get賦課根拠パラメータ() != null) {
            if (param.get賦課根拠パラメータ().is世帯課税(param.get賦課根拠パラメータ().getSetaiinKazeiKubunList())) {
                builder.set世帯課税区分(KazeiKubun.課税.getコード());
            } else {
                builder.set世帯課税区分(KazeiKubun.非課税.getコード());
            }
        } else {
            builder.set世帯課税区分(null);
        }

        set保険料情報(builder, param.get賦課年度(), param.get月別保険料段階());

        if (param.get年額保険料() != null) {
            builder.set減免前介護保険料_年額(param.get年額保険料());
            builder.set確定介護保険料_年額(param.get年額保険料().subtract(param.get賦課の情報_設定前().get減免額() == null
                    ? Decimal.ZERO : param.get賦課の情報_設定前().get減免額()));
        } else {
            builder.set減免前介護保険料_年額(null).set確定介護保険料_年額(null);
        }
        KoseiTsukiHantei hantei = InstanceProvider.create(KoseiTsukiHantei.class);
        Tsuki 更正月 = hantei.find更正月(param.get調定日時().getDate()).get月();
        builder.set更正月(更正月.getコード());
        builder.set職権区分(ShokkenKubun.非該当.getコード());
    }

    private void set新しい賦課の情報_バッチ(FukaJohoBuilder builder, FukaKokyoBatchParameter param) {
        builder.set被保険者番号(param.get資格の情報().get被保険者番号())
                .set識別コード(param.get資格の情報().get識別コード())
                .set資格取得日(param.get資格の情報().get第1号資格取得年月日())
                .set資格取得事由(param.get資格の情報().get資格取得事由コード())
                .set資格喪失日(param.get資格の情報().get資格喪失年月日())
                .set資格喪失事由(param.get資格の情報().get資格喪失事由コード());

        FlexibleDate 賦課期日 = findOut賦課基準日(param.get賦課の情報_設定前().get賦課年度(), param.get資格の情報());
        builder.set賦課期日(賦課期日);
        if (param.get世帯員所得情報List() != null) {
            for (SetaiShotokuEntity 世帯員 : param.get世帯員所得情報List()) {
                if (HonninKubun.本人.getCode().equals(世帯員.getHonninKubun())) {
                    builder.set世帯コード(世帯員.getSetaiCode())
                            .set課税区分(世帯員.getKazeiKubun())
                            .set合計所得金額(世帯員.getGokeiShotokuGaku())
                            .set公的年金収入額(世帯員.getNenkiniShunyuGaku());
                    break;
                }
            }
            builder.set世帯員数(param.get世帯員所得情報List().size());
        } else {
            builder.set課税区分(null).set合計所得金額(null).set公的年金収入額(null);
        }
        if (param.get賦課根拠パラメータ() != null) {
            if (param.get賦課根拠パラメータ().is世帯課税(param.get賦課根拠パラメータ().getSetaiinKazeiKubunList())) {
                builder.set世帯課税区分(KazeiKubun.課税.getコード());
            } else {
                builder.set世帯課税区分(KazeiKubun.非課税.getコード());
            }
        } else {
            builder.set世帯課税区分(null);
        }

        set保険料情報(builder, param.get賦課年度(), param.get月別保険料段階());

        if (param.get年額保険料() != null) {
            builder.set減免前介護保険料_年額(param.get年額保険料())
                    .set確定介護保険料_年額(param.get年額保険料().subtract(param.get賦課の情報_設定前().get減免額() == null
                            ? Decimal.ZERO : param.get賦課の情報_設定前().get減免額()));
        } else {
            builder.set減免前介護保険料_年額(null).set確定介護保険料_年額(null);
        }
        KoseiTsukiHantei hantei = InstanceProvider.create(KoseiTsukiHantei.class);
        Tsuki 更正月 = hantei.find更正月(param.get調定日時().getDate()).get月();
        builder.set更正月(更正月.getコード());
        builder.set職権区分(ShokkenKubun.非該当.getコード());
    }

    private RString get段階Index(HokenryoDankaiList hokenryoDankaiList, RString 保険料段階) {

        if (RString.isNullOrEmpty(保険料段階)) {
            return RString.EMPTY;
        }
        HokenryoDankai dankai = hokenryoDankaiList.getBy段階Index(保険料段階);
        if (dankai == null) {
            return RString.EMPTY;
        }
        return dankai.get段階区分();
    }

    private void set保険料情報(FukaJohoBuilder builder, FlexibleYear 賦課年度, TsukibetsuHokenryoDankai 月別保険料段階) {
        if (月別保険料段階 == null) {
            builder.set保険料算定段階1(null).set算定年額保険料1(null).set月割開始年月1(null).set月割終了年月1(null)
                    .set保険料算定段階2(null).set算定年額保険料2(null).set月割開始年月2(null).set月割終了年月2(null)
                    .set保険料段階(null);
            return;
        }
        List<RString> dankaiList = new ArrayList<>();
        HokenryoDankaiList hokenryoDankaiList = HokenryoDankaiSettings.createInstance().get保険料段階ListIn(賦課年度);

        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階04月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階05月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階06月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階07月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階08月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階09月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階10月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階11月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階12月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階01月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階02月()));
        dankaiList.add(get段階Index(hokenryoDankaiList, 月別保険料段階.get保険料段階03月()));

        RString 保険料算定段階1 = RString.EMPTY;
        RString 保険料算定段階2 = RString.EMPTY;
        List<RString> 年月 = new ArrayList<>();
        for (int i = INT_4; i <= INT_12; i++) {
            RStringBuilder rst = new RStringBuilder();
            rst.append(賦課年度).append(new RString(i).padZeroToLeft(INT_2));
            年月.add(rst.toRString());
        }
        for (int i = INT_1; i <= INT_3; i++) {
            RStringBuilder rst = new RStringBuilder();
            rst.append(賦課年度.plusYear(INT_1)).append(new RString(i).padZeroToLeft(INT_2));
            年月.add(rst.toRString());
        }

        int count = 0;
        for (int i = 0; i < dankaiList.size(); i++) {
            count = count + INT_1;
            if (!RString.isNullOrEmpty(dankaiList.get(i))) {
                保険料算定段階1 = dankaiList.get(i);
                HokenryoDankai 保険料段階1 = hokenryoDankaiList.getBy段階区分(保険料算定段階1);
                builder.set保険料算定段階1(dankaiList.get(i))
                        .set算定年額保険料1(保険料段階1.get保険料率())
                        .set月割開始年月1(new FlexibleYearMonth(年月.get(i)));
                break;
            }
        }
        if (count == dankaiList.size()) {
            if (!RString.isNullOrEmpty(dankaiList.get(count - INT_1))) {
                builder.set月割終了年月1(new FlexibleYearMonth(年月.get(count - INT_1)));
            } else {
                builder.set保険料算定段階1(null).set算定年額保険料1(null).set月割開始年月1(null).set月割終了年月1(null);
            }
        }
        for (int i = count; i < dankaiList.size(); i++) {
            if (!dankaiList.get(count - INT_1).equals(dankaiList.get(i))) {
                builder.set月割終了年月1(new FlexibleYearMonth(年月.get(i - INT_1)));
                break;
            }
            count = count + INT_1;
        }
        if (count == dankaiList.size()) {
            builder.set月割終了年月1(new FlexibleYearMonth(年月.get(count - INT_1)));
        }
        for (int i = count; i < dankaiList.size(); i++) {
            count = count + INT_1;
            if (!RString.isNullOrEmpty(dankaiList.get(i))) {
                保険料算定段階2 = dankaiList.get(i);
                HokenryoDankai 保険料段階2 = hokenryoDankaiList.getBy段階区分(保険料算定段階2);
                builder.set保険料算定段階2(dankaiList.get(i))
                        .set算定年額保険料2(保険料段階2.get保険料率())
                        .set月割開始年月2(new FlexibleYearMonth(年月.get(i)));
                break;
            }
        }
        for (int i = count; i < dankaiList.size(); i++) {
            if (!dankaiList.get(count - INT_1).equals(dankaiList.get(i))) {
                builder.set月割終了年月2(new FlexibleYearMonth(年月.get(i - INT_1)));
                break;
            }
            count = count + INT_1;
        }
        if (count == dankaiList.size()) {
            builder.set月割終了年月2(new FlexibleYearMonth(年月.get(count - INT_1)));
        }
        if (!保険料算定段階2.isEmpty()) {
            builder.set保険料段階(保険料算定段階2);
        } else {
            builder.set保険料段階(保険料算定段階1)
                    .set保険料算定段階2(null).set算定年額保険料2(null).set月割開始年月2(null).set月割終了年月2(null);
        }
    }

    /**
     * 調定計算メソッド
     *
     * @param param CalculateChoteiParameter
     * @return KoseiShorikoaResult
     */
    public KoseiShorikoaResult do調定計算(CalculateChoteiParameter param) {
        FlexibleYear 調定年度 = new FlexibleYear(DbBusinessConfig.get(ConfigNameDBB.日付関連_調定年度,
                RDate.getNowDate(), SubGyomuCode.DBB介護賦課).toString());
        if (param.get賦課年度().isBefore(調定年度)) {
            return get調定計算_過年度(param, 調定年度);
        } else {
            return get調定計算_現年度(param);
        }
    }

    private KoseiShorikoaResult get調定計算_過年度(CalculateChoteiParameter param, FlexibleYear 調定年度) {
        List<FukaJoho> 賦課の情報List = new ArrayList<>();
        賦課の情報List.add(賦課の情報クローン(param.get年度分賦課リスト_更正前().get現年度()));
        賦課の情報List.add(賦課の情報クローン(param.get年度分賦課リスト_更正前().get過年度1()));
        賦課の情報List.add(賦課の情報クローン(param.get年度分賦課リスト_更正前().get過年度2()));
        賦課の情報List.add(賦課の情報クローン(param.get年度分賦課リスト_更正前().get過年度3()));
        賦課の情報List.add(賦課の情報クローン(param.get年度分賦課リスト_更正前().get過年度4()));
        賦課の情報List.add(賦課の情報クローン(param.get年度分賦課リスト_更正前().get過年度5()));
        KanendoKoseiKeisan kanendoKoseiKeisan = KanendoKoseiKeisan.createInstance();
        ChoshuHoho 徴収方法の情報_更正前 = null == param.get徴収方法の情報_更正前()
                ? new ChoshuHoho(new DbT2001ChoshuHohoEntity()) : param.get徴収方法の情報_更正前();
        KoseigoFukaResult koseigoFukaResult = kanendoKoseiKeisan.getKoseigoFuka(賦課の情報List,
                new ChoshuHoho(徴収方法の情報_更正前.toEntity()),
                調定年度, param.get調定日時());

        List<FukaJoho> 賦課の情報リスト = koseigoFukaResult.get賦課の情報リスト();
        ChoshuHoho 徴収方法の情報 = koseigoFukaResult.getChoshuHoho();

        FukaJoho 現年度 = null;
        FukaJoho 過年度 = null;
        for (FukaJoho fuka : 賦課の情報リスト) {
            if (fuka.get賦課年度().equals(fuka.get調定年度())) {
                現年度 = fuka;
            }
            if (調定年度.equals(fuka.get調定年度())) {
                過年度 = fuka;
            }
        }

        ChoteiJiyuParameter choteiJiyuParameter = new ChoteiJiyuParameter();
        choteiJiyuParameter.set現年度(param.get年度分賦課リスト_更正前().get現年度());
        choteiJiyuParameter.set更正前徴収方法(徴収方法の情報_更正前);
        choteiJiyuParameter.set更正後徴収方法(徴収方法の情報_更正前);

        List<FukaJohoList> 更正後賦課リスト = new ArrayList<>();
        FukaJohoList johoList = new FukaJohoList();
        johoList.set現年度(現年度);
        if (現年度 != null && 現年度.get減免前介護保険料_年額().compareTo(param.get年額保険料()) < 0) {
            choteiJiyuParameter.set過年度(get過年度(param.get年度分賦課リスト_更正前(), 調定年度));
            johoList.set過年度(過年度);
        }
        更正後賦課リスト.add(johoList);
        choteiJiyuParameter.set更正後賦課リスト(更正後賦課リスト);
        ChoteiJiyuHantei hantei = ChoteiJiyuHantei.createInstance();
        List<FukaJohoList> fukaJohoList = hantei.set調定事由(choteiJiyuParameter);

        KoseiShorikoaResult result = new KoseiShorikoaResult();
        NendobunFukaList 年度分賦課リスト = 年度分賦課リストローン(param.get年度分賦課リスト_更正前());
        for (FukaJohoList fukaJoho : fukaJohoList) {
            年度分賦課リスト.set現年度(fukaJoho.get現年度());
            if (fukaJoho.get過年度() != null) {
                if (fukaJoho.get過年度().get賦課年度().equals(fukaJoho.get過年度().get調定年度().minusYear(INT_1))) {
                    年度分賦課リスト.set過年度1(fukaJoho.get過年度());
                } else if (fukaJoho.get過年度().get賦課年度().equals(fukaJoho.get過年度().get調定年度().minusYear(INT_2))) {
                    年度分賦課リスト.set過年度2(fukaJoho.get過年度());
                } else if (fukaJoho.get過年度().get賦課年度().equals(fukaJoho.get過年度().get調定年度().minusYear(INT_3))) {
                    年度分賦課リスト.set過年度3(fukaJoho.get過年度());
                } else if (fukaJoho.get過年度().get賦課年度().equals(fukaJoho.get過年度().get調定年度().minusYear(INT_4))) {
                    年度分賦課リスト.set過年度4(fukaJoho.get過年度());
                } else if (fukaJoho.get過年度().get賦課年度().equals(fukaJoho.get過年度().get調定年度().minusYear(INT_5))) {
                    年度分賦課リスト.set過年度5(fukaJoho.get過年度());
                }
            }
        }
        result.set年度分賦課リスト_更正後(年度分賦課リスト);
        result.set徴収方法の情報_更正後(徴収方法の情報);
        result.set資格の情報(param.get資格の情報());
        return result;
    }

    private KoseiShorikoaResult get調定計算_現年度(CalculateChoteiParameter param) {
        KiwariKeisanInput inputEntity = new KiwariKeisanInput();
        setInputEntity(inputEntity, param);
        KiwariKeisan kiwariKeisan = new KiwariKeisan();
        KiwariKeisanOutput kiwariKeisanOutputEntity = kiwariKeisan.getKibetsuGaku(inputEntity);
        List<Decimal> 特徴期別金額 = kiwariKeisanOutputEntity.get調定年度期別クラス().get(0).get特徴期別額();
        List<Decimal> 普徴期別金額 = kiwariKeisanOutputEntity.get調定年度期別クラス().get(0).get普徴期別額();

        FukaJoho 更正前 = param.get年度分賦課リスト_更正前().get現年度();
        FukaJohoRelateEntity fukaJohoRelateEntity = new FukaJohoRelateEntity();
        fukaJohoRelateEntity.set介護賦課Entity(更正前.toEntity());
        List<KibetsuEntity> 介護期別RelateEntity = new ArrayList<>();
        List<Kibetsu> kibetsuList = 更正前.getKibetsuList();
        for (Kibetsu kibetsu : kibetsuList) {
            if (ChoshuHohoKibetsu.特別徴収.getコード().equals(kibetsu.get徴収方法())) {
                set特徴期別金額(kibetsu, 特徴期別金額, 介護期別RelateEntity);
            } else if (ChoshuHohoKibetsu.普通徴収.getコード().equals(kibetsu.get徴収方法())) {
                set普徴期別金額(kibetsu, 普徴期別金額, 介護期別RelateEntity);
            }
        }
        fukaJohoRelateEntity.set介護期別RelateEntity(介護期別RelateEntity);
        FukaJoho 現年度 = new FukaJoho(fukaJohoRelateEntity);

        RString 特徴停止事由コード = ChoteiJiyuCode.保険料額の減額変更.getコード();
        ChoshuHoho 出力用徴収方法の情報 = get出力用徴収方法の情報(更正前, 現年度, param, param.get徴収方法の情報_更正前(),
                特徴期別金額, 特徴停止事由コード);

        ChoteiJiyuParameter choteiJiyuParameter = new ChoteiJiyuParameter();
        choteiJiyuParameter.set現年度(更正前);
        choteiJiyuParameter.set更正前徴収方法(param.get徴収方法の情報_更正前());
        choteiJiyuParameter.set更正後徴収方法(出力用徴収方法の情報);

        List<FukaJohoList> 更正後賦課リスト = new ArrayList<>();
        FukaJohoList johoList = new FukaJohoList();
        johoList.set現年度(現年度);
        更正後賦課リスト.add(johoList);

        choteiJiyuParameter.set更正後賦課リスト(更正後賦課リスト);
        ChoteiJiyuHantei hantei = ChoteiJiyuHantei.createInstance();
        List<FukaJohoList> fukaJohoList = hantei.set調定事由(choteiJiyuParameter);
        KoseiShorikoaResult result = new KoseiShorikoaResult();
        NendobunFukaList 年度分賦課リスト = 年度分賦課リストローン(param.get年度分賦課リスト_更正前());
        for (FukaJohoList fukaJoho : fukaJohoList) {
            年度分賦課リスト.set現年度(fukaJoho.get現年度());
        }
        result.set年度分賦課リスト_更正後(年度分賦課リスト);
        result.set徴収方法の情報_更正後(出力用徴収方法の情報);
        result.set資格の情報(param.get資格の情報());
        return result;
    }

    private ChoshuHoho get出力用徴収方法の情報(FukaJoho 更正前, FukaJoho 現年度, CalculateChoteiParameter param,
            ChoshuHoho 徴収方法の情報, List<Decimal> 特徴期別金額, RString 特徴停止事由コード) {
        ChoshuHoho 出力用徴収方法の情報 = new ChoshuHoho(徴収方法の情報.toEntity());
        if (!Tsuki._3月.getコード().equals(get算定月(param.get調定日時()))) {
            Decimal 更正前の特別徴収額 = Decimal.ZERO;
            if (更正前.get特徴期別金額01() != null) {
                更正前の特別徴収額 = 更正前の特別徴収額.add(更正前.get特徴期別金額01());
            }
            if (更正前.get特徴期別金額02() != null) {
                更正前の特別徴収額 = 更正前の特別徴収額.add(更正前.get特徴期別金額02());
            }
            if (更正前.get特徴期別金額03() != null) {
                更正前の特別徴収額 = 更正前の特別徴収額.add(更正前.get特徴期別金額03());
            }
            if (更正前.get特徴期別金額04() != null) {
                更正前の特別徴収額 = 更正前の特別徴収額.add(更正前.get特徴期別金額04());
            }
            if (更正前.get特徴期別金額05() != null) {
                更正前の特別徴収額 = 更正前の特別徴収額.add(更正前.get特徴期別金額05());
            }
            if (更正前.get特徴期別金額06() != null) {
                更正前の特別徴収額 = 更正前の特別徴収額.add(更正前.get特徴期別金額06());
            }
            Decimal 更正後の特別徴収額 = Decimal.ZERO;
            for (Decimal decimal : 特徴期別金額) {
                更正後の特別徴収額.add(decimal);
            }
            if (更正前の特別徴収額.compareTo(更正後の特別徴収額) > 0) {
                ChoshuHohoBuilder builder = 出力用徴収方法の情報.createBuilderForEdit();
                builder.set特別徴収停止事由コード(特徴停止事由コード)
                        .set特別徴収停止日時(param.get調定日時());
                出力用徴収方法の情報 = builder.build();
                ChoshuHohoKoshin choshuHohoKoshin = ChoshuHohoKoshin.createInstance();
                出力用徴収方法の情報 = choshuHohoKoshin.getChoshuHohoKoshinData(出力用徴収方法の情報,
                        param.get調定日時(), 現年度.get資格取得日(), 現年度.get資格喪失日());
            }
        }
        return 出力用徴収方法の情報;
    }

    private FukaJoho get過年度(NendobunFukaList 年度分賦課リスト, FlexibleYear 調定年度) {
        if (年度分賦課リスト.get現年度() != null
                && 調定年度.equals(年度分賦課リスト.get現年度().get調定年度())) {
            return 年度分賦課リスト.get現年度();
        }
        if (年度分賦課リスト.get過年度1() != null
                && 調定年度.equals(年度分賦課リスト.get過年度1().get調定年度())) {
            return 年度分賦課リスト.get過年度1();
        }
        if (年度分賦課リスト.get過年度2() != null
                && 調定年度.equals(年度分賦課リスト.get過年度2().get調定年度())) {
            return 年度分賦課リスト.get過年度2();
        }
        if (年度分賦課リスト.get過年度3() != null
                && 調定年度.equals(年度分賦課リスト.get過年度3().get調定年度())) {
            return 年度分賦課リスト.get過年度3();
        }
        if (年度分賦課リスト.get過年度4() != null
                && 調定年度.equals(年度分賦課リスト.get過年度4().get調定年度())) {
            return 年度分賦課リスト.get過年度4();
        }
        if (年度分賦課リスト.get過年度5() != null && 調定年度.equals(年度分賦課リスト.get過年度5().get調定年度())) {
            return 年度分賦課リスト.get過年度5();
        }
        return null;
    }

    private FukaJoho get賦課の情報履歴番号採番(FukaJoho 賦課の情報) {
        FukaJohoBuilder fukaJohoBuilder = new FukaJoho(
                賦課の情報.get調定年度(),
                賦課の情報.get賦課年度(),
                賦課の情報.get通知書番号(),
                賦課の情報.get履歴番号() + INT_1).createBuilderForEdit().
                set被保険者番号(賦課の情報.get被保険者番号()).
                set識別コード(賦課の情報.get識別コード()).
                set世帯コード(賦課の情報.get世帯コード()).
                set世帯員数(賦課の情報.get世帯員数()).
                set資格取得日(賦課の情報.get資格取得日()).
                set資格取得事由(賦課の情報.get資格取得事由()).
                set資格喪失日(賦課の情報.get資格喪失日()).
                set資格喪失事由(賦課の情報.get資格喪失事由()).
                set生活保護扶助種類(賦課の情報.get生活保護扶助種類()).
                set生保開始日(賦課の情報.get生保開始日()).
                set生保廃止日(賦課の情報.get生保廃止日()).
                set老年開始日(賦課の情報.get老年開始日()).
                set老年廃止日(賦課の情報.get老年廃止日()).
                set賦課期日(賦課の情報.get賦課期日()).
                set課税区分(賦課の情報.get課税区分()).
                set世帯課税区分(賦課の情報.get世帯課税区分()).
                set合計所得金額(賦課の情報.get合計所得金額()).
                set公的年金収入額(賦課の情報.get公的年金収入額()).
                set保険料段階(賦課の情報.get保険料段階()).
                set保険料算定段階1(賦課の情報.get保険料算定段階1()).
                set算定年額保険料1(賦課の情報.get算定年額保険料1()).
                set月割開始年月1(賦課の情報.get月割開始年月1()).
                set月割終了年月1(賦課の情報.get月割終了年月1()).
                set保険料算定段階2(賦課の情報.get保険料算定段階2()).
                set算定年額保険料2(賦課の情報.get算定年額保険料2()).
                set月割開始年月2(賦課の情報.get月割開始年月2()).
                set月割終了年月2(賦課の情報.get月割終了年月2()).
                set調定日時(賦課の情報.get調定日時()).
                set調定事由1(賦課の情報.get調定事由1()).
                set調定事由2(賦課の情報.get調定事由2()).
                set調定事由3(賦課の情報.get調定事由3()).
                set調定事由4(賦課の情報.get調定事由4()).
                set更正月(賦課の情報.get更正月()).
                set減免前介護保険料_年額(賦課の情報.get減免前介護保険料_年額()).
                set減免額(賦課の情報.get減免額()).
                set確定介護保険料_年額(賦課の情報.get確定介護保険料_年額()).
                set保険料段階_仮算定時(賦課の情報.get保険料段階_仮算定時()).
                set徴収方法履歴番号(賦課の情報.get徴収方法履歴番号()).
                set異動基準日時(賦課の情報.get異動基準日時()).
                set口座区分(賦課の情報.get口座区分()).
                set境界層区分(賦課の情報.get境界層区分()).
                set職権区分(賦課の情報.get職権区分()).
                set賦課市町村コード(賦課の情報.get賦課市町村コード()).
                set特徴歳出還付額(賦課の情報.get特徴歳出還付額()).
                set普徴歳出還付額(賦課の情報.get普徴歳出還付額());
        List<Kibetsu> kibetsuList = 賦課の情報.getKibetsuList();
        for (Kibetsu kibetsu : kibetsuList) {
            ChoteiKyotsuIdentifier identifier = new ChoteiKyotsuIdentifier(kibetsu.get調定ID().longValue());
            Kibetsu 介護期別 = new Kibetsu(
                    kibetsu.get調定年度(),
                    kibetsu.get賦課年度(),
                    kibetsu.get通知書番号(),
                    kibetsu.get履歴番号() + INT_1,
                    kibetsu.get徴収方法(),
                    kibetsu.get期()).createBuilderForEdit().
                    set調定ID(kibetsu.get調定ID()).
                    setKibetsu(kibetsu.getChoteiKyotsu(identifier)).build();
            fukaJohoBuilder.setKibetsu(介護期別);
        }
        return fukaJohoBuilder.build();
    }
}
