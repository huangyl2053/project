/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.tokubetsuchoshuiraikin;

import jp.co.ndensan.reams.db.dbb.business.core.kanri.HokenryoDankai;
import jp.co.ndensan.reams.db.dbb.business.report.tokubetsuchoshuiraikin.param.TokubetsuChoshuIraikingakuMeisaiIchiranInputParam;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajohotoroku.DbT2002FukaJohoTempTableEntity;
import jp.co.ndensan.reams.db.dbb.entity.report.tokubetsuchoshuiraikin.TokubetsuChoshuIraikingakuMeisaiIchiranSource;
import jp.co.ndensan.reams.db.dbx.business.core.choshuhoho.ChoshuHoho;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.business.core.kanri.JushoHenshu;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ue.uex.business.core.NenkinTokuchoKaifuJoho;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.IDbColumnMappable;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 * 帳票設計_DBBRP44002_特別徴収依頼金額明細一覧表のBodyEditor
 *
 * @reamsid_L DBB-0880-080 zhangrui
 */
public class TokubetsuChoshuIraikingakuMeisaiIchiranBodyEditor
        implements ITokubetsuChoshuIraikingakuMeisaiIchiranEditor {

    private final DbT2002FukaJohoTempTableEntity 賦課の情報一時Entity;
    private final IKojin 宛名;
    private final ChoshuHoho 徴収方法;
    private final NenkinTokuchoKaifuJoho 年金特徴回付情報;
    private final HokenryoDankai 保険料段階;
    private final ChohyoSeigyoKyotsu 帳票制御共通;
    private final boolean 本算定Flag;
    private final Association 地方公共団体;
    private static final RString 特徴開始月4 = new RString("4月");
    private static final RString 特徴開始月8 = new RString("8月");

    /**
     * インスタンスを生成します。
     *
     * @param inputEntity
     * {@link TokubetsuChoshuIraikingakuMeisaiIchiranInputParam}
     */
    public TokubetsuChoshuIraikingakuMeisaiIchiranBodyEditor(
            TokubetsuChoshuIraikingakuMeisaiIchiranInputParam inputEntity) {
        this.賦課の情報一時Entity = inputEntity.get賦課の情報一時Entity();
        this.宛名 = inputEntity.get宛名();
        this.徴収方法 = inputEntity.get徴収方法();
        this.年金特徴回付情報 = inputEntity.get年金特徴回付情報();
        this.保険料段階 = inputEntity.get保険料段階();
        this.帳票制御共通 = inputEntity.get帳票制御共通();
        this.本算定Flag = inputEntity.is本算定Flag();
        this.地方公共団体 = inputEntity.get地方公共団体();

    }

    @Override
    public TokubetsuChoshuIraikingakuMeisaiIchiranSource edit(TokubetsuChoshuIraikingakuMeisaiIchiranSource source) {
        if (賦課の情報一時Entity != null) {
            source.listUpper_1 = getColumnValue(賦課の情報一時Entity.getTsuchishoNo());
            source.listUpper_2 = getColumnValue(賦課の情報一時Entity.getShikibetsuCode());
            source.listUpper_3 = getColumnValue(賦課の情報一時Entity.getShikibetsuCode());
            if (保険料段階 != null) {
                source.listCenter_1 = 保険料段階.get表記();
                source.listCenter_2 = doカンマ編集(保険料段階.get保険料率());
            }
            source.listCenter_6 = doカンマ編集(賦課の情報一時Entity.getTkKibetsuGaku03());
            source.listLower_1 = getColumnValue(賦課の情報一時Entity.getHihokenshaNo());
            source.listLower_2 = getColumnValue(賦課の情報一時Entity.getSetaiCode());
        }
        if (宛名 != null) {
            source.listUpper_3 = getColumnValue(宛名.get行政区画().getGyoseiku().getコード());
            RString 住所編集 = JushoHenshu.editJusho(帳票制御共通, 宛名,
                    地方公共団体);
            source.listUpper_5 = 住所編集;
            source.listLower_3 = getColumnValue(宛名.get住所().get町域コード());
            if (宛名.get名称() != null) {
                source.listLower_5 = new RString(宛名.get名称().toString());
            }
        }
        if (徴収方法 != null) {
            if (本算定Flag) {
                source.listUpper_4 = 徴収方法.get本徴収_年金コード();
                source.listLower_4 = 徴収方法.get本徴収_基礎年金番号();
                source.listLower_6 = 徴収方法.get本徴収_年金コード();
            } else {
                source.listUpper_4 = 徴収方法.get仮徴収_年金コード();
                source.listLower_4 = 徴収方法.get仮徴収_基礎年金番号();
                source.listLower_6 = 徴収方法.get仮徴収_年金コード();
            }
        }
        if (年金特徴回付情報 != null) {
            source.listUpper_6 = getColumnValue(年金特徴回付情報.getDT特別徴収義務者コード());
        }
        if (本算定Flag) {
            source.listCenter_5 = 特徴開始月4;
        } else {
            source.listCenter_5 = 特徴開始月8;
        }
        source.listCenter_7 = RString.EMPTY;
        source.keisanHoho = RString.EMPTY;

        return source;
    }

    private RString getColumnValue(IDbColumnMappable entity) {
        if (null != entity) {
            return entity.getColumnValue();
        }
        return RString.EMPTY;
    }

    private RString doカンマ編集(Decimal number) {
        if (null == number) {
            return RString.EMPTY;
        }
        return DecimalFormatter.toコンマ区切りRString(number, 0);
    }

}
