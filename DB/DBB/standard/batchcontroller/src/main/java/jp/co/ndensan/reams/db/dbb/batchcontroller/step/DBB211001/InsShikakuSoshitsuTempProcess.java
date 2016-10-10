/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.batchcontroller.step.DBB211001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.definition.processprm.dbb211001.InsShikakuSoshitsuTempProcessParameter;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.tokuchosoufujohosakuseibatch.ShikakuSoshitsuDataEntity;
import jp.co.ndensan.reams.db.dbb.persistence.db.mapper.relate.tokuchosoufujohosakuseibatch.ITokuChoSoufuJohoSakuseiBatchMapper;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT2001ChoshuHohoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaichoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.UeT0511NenkinTokuchoKaifuJohoEntity;
import jp.co.ndensan.reams.ue.uex.definition.core.RenkeiGyomuShubetsu;
import jp.co.ndensan.reams.ue.uex.definition.core.RenkeiJohoShubetsu;
import jp.co.ndensan.reams.ue.uex.definition.core.TsuchiNaiyoCodeType;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 年金特徴回付情報追加用データ作成します。
 *
 * @reamsid_L DBB-1840-040 xuzhao
 */
public class InsShikakuSoshitsuTempProcess extends BatchProcessBase<ShikakuSoshitsuDataEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString("jp.co.ndensan.reams.db.dbb.persistence"
            + ".db.mapper.relate.tokuchosoufujohosakuseibatch.ITokuChoSoufuJohoSakuseiBatchMapper.get年金特徴回付情報追加用データ");
    private static final RString TEMP_TABLE = new RString("資格喪失等追加Temp");
    private static final RString DT各種区分_01 = new RString("01");
    private static final RString DT各種区分_02 = new RString("02");
    private static final RString DT各種区分_03 = new RString("03");
    private static final RString DT各種区分_04 = new RString("04");
    private static final RString 資格喪失事由コード_転出 = new RString("51");
    private static final RString 資格喪失事由コード_死亡 = new RString("52");
    private static final RString 資格喪失事由コード_除外者 = new RString("53");
    private static final RString 特別徴収停止事由コード_資格喪失特徴中止 = new RString("T6");
    private static final RString 各種金額_全桁0設定 = new RString("00000000000");
    private static final RString DT媒体コード_回線 = new RString("6");
    private static final RString 国保世帯コードが0 = new RString("0");

    private InsShikakuSoshitsuTempProcessParameter parameter;
    private UeT0511NenkinTokuchoKaifuJohoEntity 対象者の情報;
    private TsuchishoNo 通知書番号;
    private FlexibleYear 賦課年度;
    private FlexibleYear 調定年度;

    @BatchWriter
    private BatchEntityCreatedTempTableWriter<UeT0511NenkinTokuchoKaifuJohoEntity> 資格喪失等追加Temp;

    @Override
    protected IBatchReader createReader() {
        boolean is年金特徴回付情報が取得できない = false;
        List<RString> 通知内容コードList = new ArrayList<>();
        通知内容コードList.add(TsuchiNaiyoCodeType.特別徴収対象者情報.get通知内容コード());
        通知内容コードList.add(TsuchiNaiyoCodeType.特別徴収追加候補者情報.get通知内容コード());
        if (parameter.is処理対象月が5月_6月()) {
            ITokuChoSoufuJohoSakuseiBatchMapper mapper = getMapper(ITokuChoSoufuJohoSakuseiBatchMapper.class);
            List<ShikakuSoshitsuDataEntity> result = mapper.get年金特徴回付情報追加用データ(parameter
                    .toSelectShikakuSoshitsuMyBatisParameter(is年金特徴回付情報が取得できない, 通知内容コードList));
            if (result == null || result.isEmpty()) {
                is年金特徴回付情報が取得できない = true;
            }
        }
        return new BatchDbReader(MYBATIS_SELECT_ID, parameter
                .toSelectShikakuSoshitsuMyBatisParameter(is年金特徴回付情報が取得できない, 通知内容コードList));
    }

    @Override
    protected void createWriter() {
        資格喪失等追加Temp = new BatchEntityCreatedTempTableWriter(
                TEMP_TABLE, UeT0511NenkinTokuchoKaifuJohoEntity.class);
    }

    @Override
    protected void process(ShikakuSoshitsuDataEntity t) {
        if (!t.get賦課情報().getTsuchishoNo().equals(通知書番号)
                || !t.get賦課情報().getFukaNendo().equals(賦課年度)
                || !t.get賦課情報().getChoteiNendo().equals(調定年度)) {
            if (通知書番号 != null) {
                資格喪失等追加Temp.insert(対象者の情報);
            }
            対象者の情報 = 対象者の情報を編集(t);
        }
        通知書番号 = t.get賦課情報().getTsuchishoNo();
        賦課年度 = t.get賦課情報().getFukaNendo();
        調定年度 = t.get賦課情報().getChoteiNendo();
    }

    @Override
    protected void afterExecute() {
        if (通知書番号 != null) {
            資格喪失等追加Temp.insert(対象者の情報);
        }
    }

    private UeT0511NenkinTokuchoKaifuJohoEntity 対象者の情報を編集(ShikakuSoshitsuDataEntity t) {
        DbT2001ChoshuHohoEntity 徴収方法情報 = t.get徴収方法情報();
        DbT1001HihokenshaDaichoEntity 資格情報 = t.get資格情報();
        UeT0511NenkinTokuchoKaifuJohoEntity 対象者情報 = t.get対象者情報();
        FlexibleYear 処理年度 = new FlexibleYear(parameter.get賦課年度().toDateString());
        RString 通知内容コード = TsuchiNaiyoCodeType.資格喪失等の通知.get通知内容コード();
        FlexibleYearMonth 処理対象年月 = get処理対象年月();
        RDateTime 処理日時 = parameter.getシステム日時().getRDateTime();
        RString 連携種別 = RenkeiGyomuShubetsu.介護特別徴収.getコード()
                .concat(RenkeiJohoShubetsu.各種異動情報.getコード());
        RString dT通知内容コード = TsuchiNaiyoCodeType.資格喪失等の通知.get通知内容コード();
        RString dT作成年月日 = parameter.getシステム日時().getDate().toDateString();
        RString dT各種区分 = getDT各種区分(資格情報);
        RString dT各種年月日 = getDT各種年月日(徴収方法情報, 資格情報);
        SetaiCode 国保世帯コード = new SetaiCode(国保世帯コードが0);
        対象者情報.setShoriNendo(処理年度);
        対象者情報.setTsuchiNaiyoCode(通知内容コード);
        対象者情報.setShoriTaishoYM(処理対象年月);
        対象者情報.setShoriTimestamp(処理日時);
        対象者情報.setRenkeiShubetsu(連携種別);
        対象者情報.setDtTsuchiNaiyoCode(dT通知内容コード);
        対象者情報.setDtBaitaiCode(DT媒体コード_回線);
        対象者情報.setDtSakuseiYMD(dT作成年月日);
        対象者情報.setDtYobi1(RString.EMPTY);
        対象者情報.setDtKakushuKubun(dT各種区分);
        対象者情報.setDtShoriKekka(RString.EMPTY);
        対象者情報.setDtKokiIkanCode(RString.EMPTY);
        対象者情報.setDtKakushuYMD(dT各種年月日);
        対象者情報.setDtKakushuKingaku1(各種金額_全桁0設定);
        対象者情報.setDtKakushuKingaku2(各種金額_全桁0設定);
        対象者情報.setDtKakushuKingaku3(各種金額_全桁0設定);
        対象者情報.setDtYobi2(RString.EMPTY);
        対象者情報.setDtKyosaiNenkinshoshoKigoNo(RString.EMPTY);
        対象者情報.setShikibetsuCode(資格情報.getShikibetsuCode());
        対象者情報.setHihokenshaNo(資格情報.getHihokenshaNo().value());
        対象者情報.setKokuhoSetaiCode(国保世帯コード);
        対象者情報.setDtKakushuKingaku4(RString.EMPTY);
        対象者情報.setDtKakushuKingaku5(RString.EMPTY);
        対象者情報.setDtKakushuKingaku6(RString.EMPTY);
        対象者情報.setDtKakushuKingaku7(RString.EMPTY);
        対象者情報.setDtKakushuKingaku8(RString.EMPTY);
        対象者情報.setDtTeishiYM(RString.EMPTY);
        対象者情報.setDtYobi4Juminzei(RString.EMPTY);
        対象者情報.setDtKojinNo(RString.EMPTY);
        return 対象者情報;
    }

    private FlexibleYearMonth get処理対象年月() {
        return new FlexibleYearMonth(parameter.get賦課年度().toDateString().concat(parameter.get処理対象月()));
    }

    private RString getDT各種区分(DbT1001HihokenshaDaichoEntity 資格の情報) {

        if (資格の情報.getShikakuSoshitsuJiyuCode() != null
                && 資格喪失事由コード_転出.equals(資格の情報.getShikakuSoshitsuJiyuCode())) {
            return DT各種区分_01;
        } else if (資格の情報.getShikakuSoshitsuJiyuCode() != null
                && 資格喪失事由コード_死亡.equals(資格の情報.getShikakuSoshitsuJiyuCode())) {
            return DT各種区分_02;
        } else if (資格の情報.getShikakuSoshitsuJiyuCode() != null
                && 資格喪失事由コード_除外者.equals(資格の情報.getShikakuSoshitsuJiyuCode())) {
            return DT各種区分_04;
        } else {
            return DT各種区分_03;
        }
    }

    private RString getDT各種年月日(DbT2001ChoshuHohoEntity 徴収方法情報,
            DbT1001HihokenshaDaichoEntity 資格情報) {
        if (特別徴収停止事由コード_資格喪失特徴中止.equals(徴収方法情報.getTokuchoTeishiJiyuCode())) {
            FlexibleDate date = 資格情報.getShikakuSoshitsuYMD();
            if (date != null) {
                return new RString(date.toString());
            }
        } else {
            YMDHMS ymdhms = 徴収方法情報.getTokuchoTeishiNichiji();
            if (ymdhms != null) {
                return ymdhms.getDate().toDateString();
            }
        }
        return RString.EMPTY;
    }
}
