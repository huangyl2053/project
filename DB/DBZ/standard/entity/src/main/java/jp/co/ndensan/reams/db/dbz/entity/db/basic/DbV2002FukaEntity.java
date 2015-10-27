package jp.co.ndensan.reams.db.dbz.entity.db.basic;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;

/**
 * DbV2002Fukaの項目定義クラスです
 *
 */
public class DbV2002FukaEntity extends DbTableEntityBase<DbV2002FukaEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.9">

    @TableName
    public static final RString TABLE_NAME = new RString("DbV2002Fuka");

    private FlexibleYear choteiNendo;
    private FlexibleYear fukaNendo;
    private TsuchishoNo tsuchishoNo;
    private int rirekiNo;
    private HihokenshaNo hihokenshaNo;
    private ShikibetsuCode shikibetsuCode;
    private SetaiCode setaiCode;
    private int setaiInsu;
    private FlexibleDate shikakuShutokuYMD;
    private RString shikakuShutokuJiyu;
    private FlexibleDate shikakuSoshitsuYMD;
    private RString shikakuSoshitsuJiyu;
    private RString seihofujoShurui;
    private FlexibleDate seihoKaishiYMD;
    private FlexibleDate seihoHaishiYMD;
    private FlexibleDate ronenKaishiYMD;
    private FlexibleDate ronenHaishiYMD;
    private FlexibleDate fukaYMD;
    private RString kazeiKubun;
    private RString setaikazeiKubun;
    private Decimal gokeiShotokuGaku;
    private Decimal nenkinShunyuGaku;
    private RString hokenryoDankai;
    private RString hokenryoDankai1;
    private Decimal nengakuHokenryo1;
    private FlexibleYearMonth tsukiwariStartYM1;
    private FlexibleYearMonth tsukiwariEndYM1;
    private RString hokenryoDankai2;
    private Decimal nengakuHokenryo2;
    private FlexibleYearMonth tsukiwariStartYM2;
    private FlexibleYearMonth tsukiwariEndYM2;
    private RDateTime choteiTimestamp;
    private RString choteiJiyu1;
    private RString choteiJiyu2;
    private RString choteiJiyu3;
    private RString choteiJiyu4;
    private RString koseiM;
    private Decimal gemmenMaeHokenryo;
    private Decimal gemmenGaku;
    private Decimal kakuteiHokenryo;
    private RString hokenryoDankaiKarisanntei;
    private int choshuHohoRirekiNo;
    private RDateTime idoKijunTimestamp;
    private RString kozaKubun;
    private RString kyokaisoKubun;
    private RString shokkenKubun;
    private LasdecCode fukaShichosonCode;

    /**
     * choteiNendoのgetメソッドです。
     *
     * @return choteiNendo
     */
    public FlexibleYear getChoteiNendo() {
        return choteiNendo;
    }

    /**
     * choteiNendoのsetメソッドです。
     *
     * @param choteiNendo choteiNendo
     */
    public void setChoteiNendo(FlexibleYear choteiNendo) {
        this.choteiNendo = choteiNendo;
    }

    /**
     * fukaNendoのgetメソッドです。
     *
     * @return fukaNendo
     */
    public FlexibleYear getFukaNendo() {
        return fukaNendo;
    }

    /**
     * fukaNendoのsetメソッドです。
     *
     * @param fukaNendo fukaNendo
     */
    public void setFukaNendo(FlexibleYear fukaNendo) {
        this.fukaNendo = fukaNendo;
    }

    /**
     * tsuchishoNoのgetメソッドです。
     *
     * @return tsuchishoNo
     */
    public TsuchishoNo getTsuchishoNo() {
        return tsuchishoNo;
    }

    /**
     * tsuchishoNoのsetメソッドです。
     *
     * @param tsuchishoNo tsuchishoNo
     */
    public void setTsuchishoNo(TsuchishoNo tsuchishoNo) {
        this.tsuchishoNo = tsuchishoNo;
    }

    /**
     * rirekiNoのgetメソッドです。
     *
     * @return rirekiNo
     */
    public int getRirekiNo() {
        return rirekiNo;
    }

    /**
     * rirekiNoのsetメソッドです。
     *
     * @param rirekiNo rirekiNo
     */
    public void setRirekiNo(int rirekiNo) {
        this.rirekiNo = rirekiNo;
    }

    /**
     * hihokenshaNoのgetメソッドです。
     *
     * @return hihokenshaNo
     */
    public HihokenshaNo getHihokenshaNo() {
        return hihokenshaNo;
    }

    /**
     * hihokenshaNoのsetメソッドです。
     *
     * @param hihokenshaNo hihokenshaNo
     */
    public void setHihokenshaNo(HihokenshaNo hihokenshaNo) {
        this.hihokenshaNo = hihokenshaNo;
    }

    /**
     * shikibetsuCodeのgetメソッドです。
     *
     * @return shikibetsuCode
     */
    public ShikibetsuCode getShikibetsuCode() {
        return shikibetsuCode;
    }

    /**
     * shikibetsuCodeのsetメソッドです。
     *
     * @param shikibetsuCode shikibetsuCode
     */
    public void setShikibetsuCode(ShikibetsuCode shikibetsuCode) {
        this.shikibetsuCode = shikibetsuCode;
    }

    /**
     * setaiCodeのgetメソッドです。
     *
     * @return setaiCode
     */
    public SetaiCode getSetaiCode() {
        return setaiCode;
    }

    /**
     * setaiCodeのsetメソッドです。
     *
     * @param setaiCode setaiCode
     */
    public void setSetaiCode(SetaiCode setaiCode) {
        this.setaiCode = setaiCode;
    }

    /**
     * setaiInsuのgetメソッドです。
     *
     * @return setaiInsu
     */
    public int getSetaiInsu() {
        return setaiInsu;
    }

    /**
     * setaiInsuのsetメソッドです。
     *
     * @param setaiInsu setaiInsu
     */
    public void setSetaiInsu(int setaiInsu) {
        this.setaiInsu = setaiInsu;
    }

    /**
     * shikakuShutokuYMDのgetメソッドです。
     *
     * @return shikakuShutokuYMD
     */
    public FlexibleDate getShikakuShutokuYMD() {
        return shikakuShutokuYMD;
    }

    /**
     * shikakuShutokuYMDのsetメソッドです。
     *
     * @param shikakuShutokuYMD shikakuShutokuYMD
     */
    public void setShikakuShutokuYMD(FlexibleDate shikakuShutokuYMD) {
        this.shikakuShutokuYMD = shikakuShutokuYMD;
    }

    /**
     * shikakuShutokuJiyuのgetメソッドです。
     *
     * @return shikakuShutokuJiyu
     */
    public RString getShikakuShutokuJiyu() {
        return shikakuShutokuJiyu;
    }

    /**
     * shikakuShutokuJiyuのsetメソッドです。
     *
     * @param shikakuShutokuJiyu shikakuShutokuJiyu
     */
    public void setShikakuShutokuJiyu(RString shikakuShutokuJiyu) {
        this.shikakuShutokuJiyu = shikakuShutokuJiyu;
    }

    /**
     * shikakuSoshitsuYMDのgetメソッドです。
     *
     * @return shikakuSoshitsuYMD
     */
    public FlexibleDate getShikakuSoshitsuYMD() {
        return shikakuSoshitsuYMD;
    }

    /**
     * shikakuSoshitsuYMDのsetメソッドです。
     *
     * @param shikakuSoshitsuYMD shikakuSoshitsuYMD
     */
    public void setShikakuSoshitsuYMD(FlexibleDate shikakuSoshitsuYMD) {
        this.shikakuSoshitsuYMD = shikakuSoshitsuYMD;
    }

    /**
     * shikakuSoshitsuJiyuのgetメソッドです。
     *
     * @return shikakuSoshitsuJiyu
     */
    public RString getShikakuSoshitsuJiyu() {
        return shikakuSoshitsuJiyu;
    }

    /**
     * shikakuSoshitsuJiyuのsetメソッドです。
     *
     * @param shikakuSoshitsuJiyu shikakuSoshitsuJiyu
     */
    public void setShikakuSoshitsuJiyu(RString shikakuSoshitsuJiyu) {
        this.shikakuSoshitsuJiyu = shikakuSoshitsuJiyu;
    }

    /**
     * seihofujoShuruiのgetメソッドです。
     *
     * @return seihofujoShurui
     */
    public RString getSeihofujoShurui() {
        return seihofujoShurui;
    }

    /**
     * seihofujoShuruiのsetメソッドです。
     *
     * @param seihofujoShurui seihofujoShurui
     */
    public void setSeihofujoShurui(RString seihofujoShurui) {
        this.seihofujoShurui = seihofujoShurui;
    }

    /**
     * seihoKaishiYMDのgetメソッドです。
     *
     * @return seihoKaishiYMD
     */
    public FlexibleDate getSeihoKaishiYMD() {
        return seihoKaishiYMD;
    }

    /**
     * seihoKaishiYMDのsetメソッドです。
     *
     * @param seihoKaishiYMD seihoKaishiYMD
     */
    public void setSeihoKaishiYMD(FlexibleDate seihoKaishiYMD) {
        this.seihoKaishiYMD = seihoKaishiYMD;
    }

    /**
     * seihoHaishiYMDのgetメソッドです。
     *
     * @return seihoHaishiYMD
     */
    public FlexibleDate getSeihoHaishiYMD() {
        return seihoHaishiYMD;
    }

    /**
     * seihoHaishiYMDのsetメソッドです。
     *
     * @param seihoHaishiYMD seihoHaishiYMD
     */
    public void setSeihoHaishiYMD(FlexibleDate seihoHaishiYMD) {
        this.seihoHaishiYMD = seihoHaishiYMD;
    }

    /**
     * ronenKaishiYMDのgetメソッドです。
     *
     * @return ronenKaishiYMD
     */
    public FlexibleDate getRonenKaishiYMD() {
        return ronenKaishiYMD;
    }

    /**
     * ronenKaishiYMDのsetメソッドです。
     *
     * @param ronenKaishiYMD ronenKaishiYMD
     */
    public void setRonenKaishiYMD(FlexibleDate ronenKaishiYMD) {
        this.ronenKaishiYMD = ronenKaishiYMD;
    }

    /**
     * ronenHaishiYMDのgetメソッドです。
     *
     * @return ronenHaishiYMD
     */
    public FlexibleDate getRonenHaishiYMD() {
        return ronenHaishiYMD;
    }

    /**
     * ronenHaishiYMDのsetメソッドです。
     *
     * @param ronenHaishiYMD ronenHaishiYMD
     */
    public void setRonenHaishiYMD(FlexibleDate ronenHaishiYMD) {
        this.ronenHaishiYMD = ronenHaishiYMD;
    }

    /**
     * fukaYMDのgetメソッドです。
     *
     * @return fukaYMD
     */
    public FlexibleDate getFukaYMD() {
        return fukaYMD;
    }

    /**
     * fukaYMDのsetメソッドです。
     *
     * @param fukaYMD fukaYMD
     */
    public void setFukaYMD(FlexibleDate fukaYMD) {
        this.fukaYMD = fukaYMD;
    }

    /**
     * kazeiKubunのgetメソッドです。
     *
     * @return kazeiKubun
     */
    public RString getKazeiKubun() {
        return kazeiKubun;
    }

    /**
     * kazeiKubunのsetメソッドです。
     *
     * @param kazeiKubun kazeiKubun
     */
    public void setKazeiKubun(RString kazeiKubun) {
        this.kazeiKubun = kazeiKubun;
    }

    /**
     * setaikazeiKubunのgetメソッドです。
     *
     * @return setaikazeiKubun
     */
    public RString getSetaikazeiKubun() {
        return setaikazeiKubun;
    }

    /**
     * setaikazeiKubunのsetメソッドです。
     *
     * @param setaikazeiKubun setaikazeiKubun
     */
    public void setSetaikazeiKubun(RString setaikazeiKubun) {
        this.setaikazeiKubun = setaikazeiKubun;
    }

    /**
     * gokeiShotokuGakuのgetメソッドです。
     *
     * @return gokeiShotokuGaku
     */
    public Decimal getGokeiShotokuGaku() {
        return gokeiShotokuGaku;
    }

    /**
     * gokeiShotokuGakuのsetメソッドです。
     *
     * @param gokeiShotokuGaku gokeiShotokuGaku
     */
    public void setGokeiShotokuGaku(Decimal gokeiShotokuGaku) {
        this.gokeiShotokuGaku = gokeiShotokuGaku;
    }

    /**
     * nenkinShunyuGakuのgetメソッドです。
     *
     * @return nenkinShunyuGaku
     */
    public Decimal getNenkinShunyuGaku() {
        return nenkinShunyuGaku;
    }

    /**
     * nenkinShunyuGakuのsetメソッドです。
     *
     * @param nenkinShunyuGaku nenkinShunyuGaku
     */
    public void setNenkinShunyuGaku(Decimal nenkinShunyuGaku) {
        this.nenkinShunyuGaku = nenkinShunyuGaku;
    }

    /**
     * hokenryoDankaiのgetメソッドです。
     *
     * @return hokenryoDankai
     */
    public RString getHokenryoDankai() {
        return hokenryoDankai;
    }

    /**
     * hokenryoDankaiのsetメソッドです。
     *
     * @param hokenryoDankai hokenryoDankai
     */
    public void setHokenryoDankai(RString hokenryoDankai) {
        this.hokenryoDankai = hokenryoDankai;
    }

    /**
     * hokenryoDankai1のgetメソッドです。
     *
     * @return hokenryoDankai1
     */
    public RString getHokenryoDankai1() {
        return hokenryoDankai1;
    }

    /**
     * hokenryoDankai1のsetメソッドです。
     *
     * @param hokenryoDankai1 hokenryoDankai1
     */
    public void setHokenryoDankai1(RString hokenryoDankai1) {
        this.hokenryoDankai1 = hokenryoDankai1;
    }

    /**
     * nengakuHokenryo1のgetメソッドです。
     *
     * @return nengakuHokenryo1
     */
    public Decimal getNengakuHokenryo1() {
        return nengakuHokenryo1;
    }

    /**
     * nengakuHokenryo1のsetメソッドです。
     *
     * @param nengakuHokenryo1 nengakuHokenryo1
     */
    public void setNengakuHokenryo1(Decimal nengakuHokenryo1) {
        this.nengakuHokenryo1 = nengakuHokenryo1;
    }

    /**
     * tsukiwariStartYM1のgetメソッドです。
     *
     * @return tsukiwariStartYM1
     */
    public FlexibleYearMonth getTsukiwariStartYM1() {
        return tsukiwariStartYM1;
    }

    /**
     * tsukiwariStartYM1のsetメソッドです。
     *
     * @param tsukiwariStartYM1 tsukiwariStartYM1
     */
    public void setTsukiwariStartYM1(FlexibleYearMonth tsukiwariStartYM1) {
        this.tsukiwariStartYM1 = tsukiwariStartYM1;
    }

    /**
     * tsukiwariEndYM1のgetメソッドです。
     *
     * @return tsukiwariEndYM1
     */
    public FlexibleYearMonth getTsukiwariEndYM1() {
        return tsukiwariEndYM1;
    }

    /**
     * tsukiwariEndYM1のsetメソッドです。
     *
     * @param tsukiwariEndYM1 tsukiwariEndYM1
     */
    public void setTsukiwariEndYM1(FlexibleYearMonth tsukiwariEndYM1) {
        this.tsukiwariEndYM1 = tsukiwariEndYM1;
    }

    /**
     * hokenryoDankai2のgetメソッドです。
     *
     * @return hokenryoDankai2
     */
    public RString getHokenryoDankai2() {
        return hokenryoDankai2;
    }

    /**
     * hokenryoDankai2のsetメソッドです。
     *
     * @param hokenryoDankai2 hokenryoDankai2
     */
    public void setHokenryoDankai2(RString hokenryoDankai2) {
        this.hokenryoDankai2 = hokenryoDankai2;
    }

    /**
     * nengakuHokenryo2のgetメソッドです。
     *
     * @return nengakuHokenryo2
     */
    public Decimal getNengakuHokenryo2() {
        return nengakuHokenryo2;
    }

    /**
     * nengakuHokenryo2のsetメソッドです。
     *
     * @param nengakuHokenryo2 nengakuHokenryo2
     */
    public void setNengakuHokenryo2(Decimal nengakuHokenryo2) {
        this.nengakuHokenryo2 = nengakuHokenryo2;
    }

    /**
     * tsukiwariStartYM2のgetメソッドです。
     *
     * @return tsukiwariStartYM2
     */
    public FlexibleYearMonth getTsukiwariStartYM2() {
        return tsukiwariStartYM2;
    }

    /**
     * tsukiwariStartYM2のsetメソッドです。
     *
     * @param tsukiwariStartYM2 tsukiwariStartYM2
     */
    public void setTsukiwariStartYM2(FlexibleYearMonth tsukiwariStartYM2) {
        this.tsukiwariStartYM2 = tsukiwariStartYM2;
    }

    /**
     * tsukiwariEndYM2のgetメソッドです。
     *
     * @return tsukiwariEndYM2
     */
    public FlexibleYearMonth getTsukiwariEndYM2() {
        return tsukiwariEndYM2;
    }

    /**
     * tsukiwariEndYM2のsetメソッドです。
     *
     * @param tsukiwariEndYM2 tsukiwariEndYM2
     */
    public void setTsukiwariEndYM2(FlexibleYearMonth tsukiwariEndYM2) {
        this.tsukiwariEndYM2 = tsukiwariEndYM2;
    }

    /**
     * choteiTimestampのgetメソッドです。
     *
     * @return choteiTimestamp
     */
    public RDateTime getChoteiTimestamp() {
        return choteiTimestamp;
    }

    /**
     * choteiTimestampのsetメソッドです。
     *
     * @param choteiTimestamp choteiTimestamp
     */
    public void setChoteiTimestamp(RDateTime choteiTimestamp) {
        this.choteiTimestamp = choteiTimestamp;
    }

    /**
     * choteiJiyu1のgetメソッドです。
     *
     * @return choteiJiyu1
     */
    public RString getChoteiJiyu1() {
        return choteiJiyu1;
    }

    /**
     * choteiJiyu1のsetメソッドです。
     *
     * @param choteiJiyu1 choteiJiyu1
     */
    public void setChoteiJiyu1(RString choteiJiyu1) {
        this.choteiJiyu1 = choteiJiyu1;
    }

    /**
     * choteiJiyu2のgetメソッドです。
     *
     * @return choteiJiyu2
     */
    public RString getChoteiJiyu2() {
        return choteiJiyu2;
    }

    /**
     * choteiJiyu2のsetメソッドです。
     *
     * @param choteiJiyu2 choteiJiyu2
     */
    public void setChoteiJiyu2(RString choteiJiyu2) {
        this.choteiJiyu2 = choteiJiyu2;
    }

    /**
     * choteiJiyu3のgetメソッドです。
     *
     * @return choteiJiyu3
     */
    public RString getChoteiJiyu3() {
        return choteiJiyu3;
    }

    /**
     * choteiJiyu3のsetメソッドです。
     *
     * @param choteiJiyu3 choteiJiyu3
     */
    public void setChoteiJiyu3(RString choteiJiyu3) {
        this.choteiJiyu3 = choteiJiyu3;
    }

    /**
     * choteiJiyu4のgetメソッドです。
     *
     * @return choteiJiyu4
     */
    public RString getChoteiJiyu4() {
        return choteiJiyu4;
    }

    /**
     * choteiJiyu4のsetメソッドです。
     *
     * @param choteiJiyu4 choteiJiyu4
     */
    public void setChoteiJiyu4(RString choteiJiyu4) {
        this.choteiJiyu4 = choteiJiyu4;
    }

    /**
     * koseiMのgetメソッドです。
     *
     * @return koseiM
     */
    public RString getKoseiM() {
        return koseiM;
    }

    /**
     * koseiMのsetメソッドです。
     *
     * @param koseiM koseiM
     */
    public void setKoseiM(RString koseiM) {
        this.koseiM = koseiM;
    }

    /**
     * gemmenMaeHokenryoのgetメソッドです。
     *
     * @return gemmenMaeHokenryo
     */
    public Decimal getGemmenMaeHokenryo() {
        return gemmenMaeHokenryo;
    }

    /**
     * gemmenMaeHokenryoのsetメソッドです。
     *
     * @param gemmenMaeHokenryo gemmenMaeHokenryo
     */
    public void setGemmenMaeHokenryo(Decimal gemmenMaeHokenryo) {
        this.gemmenMaeHokenryo = gemmenMaeHokenryo;
    }

    /**
     * gemmenGakuのgetメソッドです。
     *
     * @return gemmenGaku
     */
    public Decimal getGemmenGaku() {
        return gemmenGaku;
    }

    /**
     * gemmenGakuのsetメソッドです。
     *
     * @param gemmenGaku gemmenGaku
     */
    public void setGemmenGaku(Decimal gemmenGaku) {
        this.gemmenGaku = gemmenGaku;
    }

    /**
     * kakuteiHokenryoのgetメソッドです。
     *
     * @return kakuteiHokenryo
     */
    public Decimal getKakuteiHokenryo() {
        return kakuteiHokenryo;
    }

    /**
     * kakuteiHokenryoのsetメソッドです。
     *
     * @param kakuteiHokenryo kakuteiHokenryo
     */
    public void setKakuteiHokenryo(Decimal kakuteiHokenryo) {
        this.kakuteiHokenryo = kakuteiHokenryo;
    }

    /**
     * hokenryoDankaiKarisannteiのgetメソッドです。
     *
     * @return hokenryoDankaiKarisanntei
     */
    public RString getHokenryoDankaiKarisanntei() {
        return hokenryoDankaiKarisanntei;
    }

    /**
     * hokenryoDankaiKarisannteiのsetメソッドです。
     *
     * @param hokenryoDankaiKarisanntei hokenryoDankaiKarisanntei
     */
    public void setHokenryoDankaiKarisanntei(RString hokenryoDankaiKarisanntei) {
        this.hokenryoDankaiKarisanntei = hokenryoDankaiKarisanntei;
    }

    /**
     * choshuHohoRirekiNoのgetメソッドです。
     *
     * @return choshuHohoRirekiNo
     */
    public int getChoshuHohoRirekiNo() {
        return choshuHohoRirekiNo;
    }

    /**
     * choshuHohoRirekiNoのsetメソッドです。
     *
     * @param choshuHohoRirekiNo choshuHohoRirekiNo
     */
    public void setChoshuHohoRirekiNo(int choshuHohoRirekiNo) {
        this.choshuHohoRirekiNo = choshuHohoRirekiNo;
    }

    /**
     * idoKijunTimestampのgetメソッドです。
     *
     * @return idoKijunTimestamp
     */
    public RDateTime getIdoKijunTimestamp() {
        return idoKijunTimestamp;
    }

    /**
     * idoKijunTimestampのsetメソッドです。
     *
     * @param idoKijunTimestamp idoKijunTimestamp
     */
    public void setIdoKijunTimestamp(RDateTime idoKijunTimestamp) {
        this.idoKijunTimestamp = idoKijunTimestamp;
    }

    /**
     * kozaKubunのgetメソッドです。
     *
     * @return kozaKubun
     */
    public RString getKozaKubun() {
        return kozaKubun;
    }

    /**
     * kozaKubunのsetメソッドです。
     *
     * @param kozaKubun kozaKubun
     */
    public void setKozaKubun(RString kozaKubun) {
        this.kozaKubun = kozaKubun;
    }

    /**
     * kyokaisoKubunのgetメソッドです。
     *
     * @return kyokaisoKubun
     */
    public RString getKyokaisoKubun() {
        return kyokaisoKubun;
    }

    /**
     * kyokaisoKubunのsetメソッドです。
     *
     * @param kyokaisoKubun kyokaisoKubun
     */
    public void setKyokaisoKubun(RString kyokaisoKubun) {
        this.kyokaisoKubun = kyokaisoKubun;
    }

    /**
     * shokkenKubunのgetメソッドです。
     *
     * @return shokkenKubun
     */
    public RString getShokkenKubun() {
        return shokkenKubun;
    }

    /**
     * shokkenKubunのsetメソッドです。
     *
     * @param shokkenKubun shokkenKubun
     */
    public void setShokkenKubun(RString shokkenKubun) {
        this.shokkenKubun = shokkenKubun;
    }

    /**
     * fukaShichosonCodeのgetメソッドです。
     *
     * @return fukaShichosonCode
     */
    public LasdecCode getFukaShichosonCode() {
        return fukaShichosonCode;
    }

    /**
     * fukaShichosonCodeのsetメソッドです。
     *
     * @param fukaShichosonCode fukaShichosonCode
     */
    public void setFukaShichosonCode(LasdecCode fukaShichosonCode) {
        this.fukaShichosonCode = fukaShichosonCode;
    }

    /**
     * このエンティティの主キーが他の{@literal DbV2002FukaEntity}と等しいか判定します。
     *
     * @param other 比較するエンティティ
     * @@return 比較するエンティティが同じ主キーを持つ{@literal DbV2002FukaEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbV2002FukaEntity other) {
        if (other == null) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbV2002FukaEntity entity) {
        this.choteiNendo = entity.choteiNendo;
        this.fukaNendo = entity.fukaNendo;
        this.tsuchishoNo = entity.tsuchishoNo;
        this.rirekiNo = entity.rirekiNo;
        this.hihokenshaNo = entity.hihokenshaNo;
        this.shikibetsuCode = entity.shikibetsuCode;
        this.setaiCode = entity.setaiCode;
        this.setaiInsu = entity.setaiInsu;
        this.shikakuShutokuYMD = entity.shikakuShutokuYMD;
        this.shikakuShutokuJiyu = entity.shikakuShutokuJiyu;
        this.shikakuSoshitsuYMD = entity.shikakuSoshitsuYMD;
        this.shikakuSoshitsuJiyu = entity.shikakuSoshitsuJiyu;
        this.seihofujoShurui = entity.seihofujoShurui;
        this.seihoKaishiYMD = entity.seihoKaishiYMD;
        this.seihoHaishiYMD = entity.seihoHaishiYMD;
        this.ronenKaishiYMD = entity.ronenKaishiYMD;
        this.ronenHaishiYMD = entity.ronenHaishiYMD;
        this.fukaYMD = entity.fukaYMD;
        this.kazeiKubun = entity.kazeiKubun;
        this.setaikazeiKubun = entity.setaikazeiKubun;
        this.gokeiShotokuGaku = entity.gokeiShotokuGaku;
        this.nenkinShunyuGaku = entity.nenkinShunyuGaku;
        this.hokenryoDankai = entity.hokenryoDankai;
        this.hokenryoDankai1 = entity.hokenryoDankai1;
        this.nengakuHokenryo1 = entity.nengakuHokenryo1;
        this.tsukiwariStartYM1 = entity.tsukiwariStartYM1;
        this.tsukiwariEndYM1 = entity.tsukiwariEndYM1;
        this.hokenryoDankai2 = entity.hokenryoDankai2;
        this.nengakuHokenryo2 = entity.nengakuHokenryo2;
        this.tsukiwariStartYM2 = entity.tsukiwariStartYM2;
        this.tsukiwariEndYM2 = entity.tsukiwariEndYM2;
        this.choteiTimestamp = entity.choteiTimestamp;
        this.choteiJiyu1 = entity.choteiJiyu1;
        this.choteiJiyu2 = entity.choteiJiyu2;
        this.choteiJiyu3 = entity.choteiJiyu3;
        this.choteiJiyu4 = entity.choteiJiyu4;
        this.koseiM = entity.koseiM;
        this.gemmenMaeHokenryo = entity.gemmenMaeHokenryo;
        this.gemmenGaku = entity.gemmenGaku;
        this.kakuteiHokenryo = entity.kakuteiHokenryo;
        this.hokenryoDankaiKarisanntei = entity.hokenryoDankaiKarisanntei;
        this.choshuHohoRirekiNo = entity.choshuHohoRirekiNo;
        this.idoKijunTimestamp = entity.idoKijunTimestamp;
        this.kozaKubun = entity.kozaKubun;
        this.kyokaisoKubun = entity.kyokaisoKubun;
        this.shokkenKubun = entity.shokkenKubun;
        this.fukaShichosonCode = entity.fukaShichosonCode;
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(choteiNendo, fukaNendo, tsuchishoNo, rirekiNo, hihokenshaNo, shikibetsuCode, setaiCode, setaiInsu, shikakuShutokuYMD, shikakuShutokuJiyu, shikakuSoshitsuYMD, shikakuSoshitsuJiyu, seihofujoShurui, seihoKaishiYMD, seihoHaishiYMD, ronenKaishiYMD, ronenHaishiYMD, fukaYMD, kazeiKubun, setaikazeiKubun, gokeiShotokuGaku, nenkinShunyuGaku, hokenryoDankai, hokenryoDankai1, nengakuHokenryo1, tsukiwariStartYM1, tsukiwariEndYM1, hokenryoDankai2, nengakuHokenryo2, tsukiwariStartYM2, tsukiwariEndYM2, choteiTimestamp, choteiJiyu1, choteiJiyu2, choteiJiyu3, choteiJiyu4, koseiM, gemmenMaeHokenryo, gemmenGaku, kakuteiHokenryo, hokenryoDankaiKarisanntei, choshuHohoRirekiNo, idoKijunTimestamp, kozaKubun, kyokaisoKubun, shokkenKubun, fukaShichosonCode);
    }

// </editor-fold>
}