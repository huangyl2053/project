package jp.co.ndensan.reams.db.dbz.entity.basic;

import java.util.Objects;
import java.util.UUID;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHM;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;

/**
 * DbT2002Fukaの項目定義クラスです
 *
 */
public class DbT2002FukaEntity extends DbTableEntityBase<DbT2002FukaEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.1">

    @TableName
    public static final RString TABLE_NAME = new RString("DbT2002Fuka");

    private RString insertDantaiCd;
    @PrimaryKey
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private FlexibleYear choteiNendo;
    @PrimaryKey
    private FlexibleYear fukaNendo;
    @PrimaryKey
    private TsuchishoNo tsuchishoNo;
    @PrimaryKey
    private RDateTime shoriTimestamp;
    private HihokenshaNo hihokenshaNo;
    private ShikibetsuCode shikibetsuCode;
    private SetaiCode setaiCode;
    private int setaiInsu;
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
    private YMDHM choteiYMDHM;
    private RString choteiJiyu1;
    private RString choteiJiyu2;
    private RString choteiJiyu3;
    private RString choteiJiyu4;
    private RString koseiM;
    private Decimal gemmenMaeHokenryo;
    private Decimal gemmenGaku;
    private Decimal kakuteiHokenryo;
    private RString hokenryoDankaiKarisanntei;
    private RDateTime choshuHohoShoriTimestamp;
    private RDateTime idoKijunTimestamp;

    /**
     * getInsertDantaiCd
     *
     * @return insertDantaiCd
     */
    public RString getInsertDantaiCd() {
        return insertDantaiCd;
    }

    /**
     * setInsertDantaiCd
     *
     * @param insertDantaiCd insertDantaiCd
     */
    public void setInsertDantaiCd(RString insertDantaiCd) {
        this.insertDantaiCd = insertDantaiCd;
    }

    /**
     * getIsDeleted
     *
     * @return isDeleted
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * setIsDeleted
     *
     * @param isDeleted isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * setLastUpdateReamsLoginId
     *
     * @param lastUpdateReamsLoginId lastUpdateReamsLoginId
     */
    public void setLastUpdateReamsLoginId(RString lastUpdateReamsLoginId) {
        this.lastUpdateReamsLoginId = lastUpdateReamsLoginId;
    }

    /**
     * getChoteiNendo
     *
     * @return choteiNendo
     */
    public FlexibleYear getChoteiNendo() {
        return choteiNendo;
    }

    /**
     * setChoteiNendo
     *
     * @param choteiNendo choteiNendo
     */
    public void setChoteiNendo(FlexibleYear choteiNendo) {
        this.choteiNendo = choteiNendo;
    }

    /**
     * getFukaNendo
     *
     * @return fukaNendo
     */
    public FlexibleYear getFukaNendo() {
        return fukaNendo;
    }

    /**
     * setFukaNendo
     *
     * @param fukaNendo fukaNendo
     */
    public void setFukaNendo(FlexibleYear fukaNendo) {
        this.fukaNendo = fukaNendo;
    }

    /**
     * getTsuchishoNo
     *
     * @return tsuchishoNo
     */
    public TsuchishoNo getTsuchishoNo() {
        return tsuchishoNo;
    }

    /**
     * setTsuchishoNo
     *
     * @param tsuchishoNo tsuchishoNo
     */
    public void setTsuchishoNo(TsuchishoNo tsuchishoNo) {
        this.tsuchishoNo = tsuchishoNo;
    }

    /**
     * getShoriTimestamp
     *
     * @return shoriTimestamp
     */
    public RDateTime getShoriTimestamp() {
        return shoriTimestamp;
    }

    /**
     * setShoriTimestamp
     *
     * @param shoriTimestamp shoriTimestamp
     */
    public void setShoriTimestamp(RDateTime shoriTimestamp) {
        this.shoriTimestamp = shoriTimestamp;
    }

    /**
     * getHihokenshaNo
     *
     * @return hihokenshaNo
     */
    public HihokenshaNo getHihokenshaNo() {
        return hihokenshaNo;
    }

    /**
     * setHihokenshaNo
     *
     * @param hihokenshaNo hihokenshaNo
     */
    public void setHihokenshaNo(HihokenshaNo hihokenshaNo) {
        this.hihokenshaNo = hihokenshaNo;
    }

    /**
     * getShikibetsuCode
     *
     * @return shikibetsuCode
     */
    public ShikibetsuCode getShikibetsuCode() {
        return shikibetsuCode;
    }

    /**
     * setShikibetsuCode
     *
     * @param shikibetsuCode shikibetsuCode
     */
    public void setShikibetsuCode(ShikibetsuCode shikibetsuCode) {
        this.shikibetsuCode = shikibetsuCode;
    }

    /**
     * getSetaiCode
     *
     * @return setaiCode
     */
    public SetaiCode getSetaiCode() {
        return setaiCode;
    }

    /**
     * setSetaiCode
     *
     * @param setaiCode setaiCode
     */
    public void setSetaiCode(SetaiCode setaiCode) {
        this.setaiCode = setaiCode;
    }

    /**
     * getSetaiInsu
     *
     * @return setaiInsu
     */
    public int getSetaiInsu() {
        return setaiInsu;
    }

    /**
     * setSetaiInsu
     *
     * @param setaiInsu setaiInsu
     */
    public void setSetaiInsu(int setaiInsu) {
        this.setaiInsu = setaiInsu;
    }

    /**
     * getFukaYMD
     *
     * @return fukaYMD
     */
    public FlexibleDate getFukaYMD() {
        return fukaYMD;
    }

    /**
     * setFukaYMD
     *
     * @param fukaYMD fukaYMD
     */
    public void setFukaYMD(FlexibleDate fukaYMD) {
        this.fukaYMD = fukaYMD;
    }

    /**
     * getKazeiKubun
     *
     * @return kazeiKubun
     */
    public RString getKazeiKubun() {
        return kazeiKubun;
    }

    /**
     * setKazeiKubun
     *
     * @param kazeiKubun kazeiKubun
     */
    public void setKazeiKubun(RString kazeiKubun) {
        this.kazeiKubun = kazeiKubun;
    }

    /**
     * getSetaikazeiKubun
     *
     * @return setaikazeiKubun
     */
    public RString getSetaikazeiKubun() {
        return setaikazeiKubun;
    }

    /**
     * setSetaikazeiKubun
     *
     * @param setaikazeiKubun setaikazeiKubun
     */
    public void setSetaikazeiKubun(RString setaikazeiKubun) {
        this.setaikazeiKubun = setaikazeiKubun;
    }

    /**
     * getGokeiShotokuGaku
     *
     * @return gokeiShotokuGaku
     */
    public Decimal getGokeiShotokuGaku() {
        return gokeiShotokuGaku;
    }

    /**
     * setGokeiShotokuGaku
     *
     * @param gokeiShotokuGaku gokeiShotokuGaku
     */
    public void setGokeiShotokuGaku(Decimal gokeiShotokuGaku) {
        this.gokeiShotokuGaku = gokeiShotokuGaku;
    }

    /**
     * getNenkinShunyuGaku
     *
     * @return nenkinShunyuGaku
     */
    public Decimal getNenkinShunyuGaku() {
        return nenkinShunyuGaku;
    }

    /**
     * setNenkinShunyuGaku
     *
     * @param nenkinShunyuGaku nenkinShunyuGaku
     */
    public void setNenkinShunyuGaku(Decimal nenkinShunyuGaku) {
        this.nenkinShunyuGaku = nenkinShunyuGaku;
    }

    /**
     * getHokenryoDankai
     *
     * @return hokenryoDankai
     */
    public RString getHokenryoDankai() {
        return hokenryoDankai;
    }

    /**
     * setHokenryoDankai
     *
     * @param hokenryoDankai hokenryoDankai
     */
    public void setHokenryoDankai(RString hokenryoDankai) {
        this.hokenryoDankai = hokenryoDankai;
    }

    /**
     * getHokenryoDankai1
     *
     * @return hokenryoDankai1
     */
    public RString getHokenryoDankai1() {
        return hokenryoDankai1;
    }

    /**
     * setHokenryoDankai1
     *
     * @param hokenryoDankai1 hokenryoDankai1
     */
    public void setHokenryoDankai1(RString hokenryoDankai1) {
        this.hokenryoDankai1 = hokenryoDankai1;
    }

    /**
     * getNengakuHokenryo1
     *
     * @return nengakuHokenryo1
     */
    public Decimal getNengakuHokenryo1() {
        return nengakuHokenryo1;
    }

    /**
     * setNengakuHokenryo1
     *
     * @param nengakuHokenryo1 nengakuHokenryo1
     */
    public void setNengakuHokenryo1(Decimal nengakuHokenryo1) {
        this.nengakuHokenryo1 = nengakuHokenryo1;
    }

    /**
     * getTsukiwariStartYM1
     *
     * @return tsukiwariStartYM1
     */
    public FlexibleYearMonth getTsukiwariStartYM1() {
        return tsukiwariStartYM1;
    }

    /**
     * setTsukiwariStartYM1
     *
     * @param tsukiwariStartYM1 tsukiwariStartYM1
     */
    public void setTsukiwariStartYM1(FlexibleYearMonth tsukiwariStartYM1) {
        this.tsukiwariStartYM1 = tsukiwariStartYM1;
    }

    /**
     * getTsukiwariEndYM1
     *
     * @return tsukiwariEndYM1
     */
    public FlexibleYearMonth getTsukiwariEndYM1() {
        return tsukiwariEndYM1;
    }

    /**
     * setTsukiwariEndYM1
     *
     * @param tsukiwariEndYM1 tsukiwariEndYM1
     */
    public void setTsukiwariEndYM1(FlexibleYearMonth tsukiwariEndYM1) {
        this.tsukiwariEndYM1 = tsukiwariEndYM1;
    }

    /**
     * getHokenryoDankai2
     *
     * @return hokenryoDankai2
     */
    public RString getHokenryoDankai2() {
        return hokenryoDankai2;
    }

    /**
     * setHokenryoDankai2
     *
     * @param hokenryoDankai2 hokenryoDankai2
     */
    public void setHokenryoDankai2(RString hokenryoDankai2) {
        this.hokenryoDankai2 = hokenryoDankai2;
    }

    /**
     * getNengakuHokenryo2
     *
     * @return nengakuHokenryo2
     */
    public Decimal getNengakuHokenryo2() {
        return nengakuHokenryo2;
    }

    /**
     * setNengakuHokenryo2
     *
     * @param nengakuHokenryo2 nengakuHokenryo2
     */
    public void setNengakuHokenryo2(Decimal nengakuHokenryo2) {
        this.nengakuHokenryo2 = nengakuHokenryo2;
    }

    /**
     * getTsukiwariStartYM2
     *
     * @return tsukiwariStartYM2
     */
    public FlexibleYearMonth getTsukiwariStartYM2() {
        return tsukiwariStartYM2;
    }

    /**
     * setTsukiwariStartYM2
     *
     * @param tsukiwariStartYM2 tsukiwariStartYM2
     */
    public void setTsukiwariStartYM2(FlexibleYearMonth tsukiwariStartYM2) {
        this.tsukiwariStartYM2 = tsukiwariStartYM2;
    }

    /**
     * getTsukiwariEndYM2
     *
     * @return tsukiwariEndYM2
     */
    public FlexibleYearMonth getTsukiwariEndYM2() {
        return tsukiwariEndYM2;
    }

    /**
     * setTsukiwariEndYM2
     *
     * @param tsukiwariEndYM2 tsukiwariEndYM2
     */
    public void setTsukiwariEndYM2(FlexibleYearMonth tsukiwariEndYM2) {
        this.tsukiwariEndYM2 = tsukiwariEndYM2;
    }

    /**
     * getChoteiYMDHM
     *
     * @return choteiYMDHM
     */
    public YMDHM getChoteiYMDHM() {
        return choteiYMDHM;
    }

    /**
     * setChoteiYMDHM
     *
     * @param choteiYMDHM choteiYMDHM
     */
    public void setChoteiYMDHM(YMDHM choteiYMDHM) {
        this.choteiYMDHM = choteiYMDHM;
    }

    /**
     * getChoteiJiyu1
     *
     * @return choteiJiyu1
     */
    public RString getChoteiJiyu1() {
        return choteiJiyu1;
    }

    /**
     * setChoteiJiyu1
     *
     * @param choteiJiyu1 choteiJiyu1
     */
    public void setChoteiJiyu1(RString choteiJiyu1) {
        this.choteiJiyu1 = choteiJiyu1;
    }

    /**
     * getChoteiJiyu2
     *
     * @return choteiJiyu2
     */
    public RString getChoteiJiyu2() {
        return choteiJiyu2;
    }

    /**
     * setChoteiJiyu2
     *
     * @param choteiJiyu2 choteiJiyu2
     */
    public void setChoteiJiyu2(RString choteiJiyu2) {
        this.choteiJiyu2 = choteiJiyu2;
    }

    /**
     * getChoteiJiyu3
     *
     * @return choteiJiyu3
     */
    public RString getChoteiJiyu3() {
        return choteiJiyu3;
    }

    /**
     * setChoteiJiyu3
     *
     * @param choteiJiyu3 choteiJiyu3
     */
    public void setChoteiJiyu3(RString choteiJiyu3) {
        this.choteiJiyu3 = choteiJiyu3;
    }

    /**
     * getChoteiJiyu4
     *
     * @return choteiJiyu4
     */
    public RString getChoteiJiyu4() {
        return choteiJiyu4;
    }

    /**
     * setChoteiJiyu4
     *
     * @param choteiJiyu4 choteiJiyu4
     */
    public void setChoteiJiyu4(RString choteiJiyu4) {
        this.choteiJiyu4 = choteiJiyu4;
    }

    /**
     * getKoseiM
     *
     * @return koseiM
     */
    public RString getKoseiM() {
        return koseiM;
    }

    /**
     * setKoseiM
     *
     * @param koseiM koseiM
     */
    public void setKoseiM(RString koseiM) {
        this.koseiM = koseiM;
    }

    /**
     * getGemmenMaeHokenryo
     *
     * @return gemmenMaeHokenryo
     */
    public Decimal getGemmenMaeHokenryo() {
        return gemmenMaeHokenryo;
    }

    /**
     * setGemmenMaeHokenryo
     *
     * @param gemmenMaeHokenryo gemmenMaeHokenryo
     */
    public void setGemmenMaeHokenryo(Decimal gemmenMaeHokenryo) {
        this.gemmenMaeHokenryo = gemmenMaeHokenryo;
    }

    /**
     * getGemmenGaku
     *
     * @return gemmenGaku
     */
    public Decimal getGemmenGaku() {
        return gemmenGaku;
    }

    /**
     * setGemmenGaku
     *
     * @param gemmenGaku gemmenGaku
     */
    public void setGemmenGaku(Decimal gemmenGaku) {
        this.gemmenGaku = gemmenGaku;
    }

    /**
     * getKakuteiHokenryo
     *
     * @return kakuteiHokenryo
     */
    public Decimal getKakuteiHokenryo() {
        return kakuteiHokenryo;
    }

    /**
     * setKakuteiHokenryo
     *
     * @param kakuteiHokenryo kakuteiHokenryo
     */
    public void setKakuteiHokenryo(Decimal kakuteiHokenryo) {
        this.kakuteiHokenryo = kakuteiHokenryo;
    }

    /**
     * getHokenryoDankaiKarisanntei
     *
     * @return hokenryoDankaiKarisanntei
     */
    public RString getHokenryoDankaiKarisanntei() {
        return hokenryoDankaiKarisanntei;
    }

    /**
     * setHokenryoDankaiKarisanntei
     *
     * @param hokenryoDankaiKarisanntei hokenryoDankaiKarisanntei
     */
    public void setHokenryoDankaiKarisanntei(RString hokenryoDankaiKarisanntei) {
        this.hokenryoDankaiKarisanntei = hokenryoDankaiKarisanntei;
    }

    /**
     * getChoshuHohoShoriTimestamp
     *
     * @return choshuHohoShoriTimestamp
     */
    public RDateTime getChoshuHohoShoriTimestamp() {
        return choshuHohoShoriTimestamp;
    }

    /**
     * setChoshuHohoShoriTimestamp
     *
     * @param choshuHohoShoriTimestamp choshuHohoShoriTimestamp
     */
    public void setChoshuHohoShoriTimestamp(RDateTime choshuHohoShoriTimestamp) {
        this.choshuHohoShoriTimestamp = choshuHohoShoriTimestamp;
    }

    /**
     * getIdoKijunTimestamp
     *
     * @return idoKijunTimestamp
     */
    public RDateTime getIdoKijunTimestamp() {
        return idoKijunTimestamp;
    }

    /**
     * setIdoKijunTimestamp
     *
     * @param idoKijunTimestamp idoKijunTimestamp
     */
    public void setIdoKijunTimestamp(RDateTime idoKijunTimestamp) {
        this.idoKijunTimestamp = idoKijunTimestamp;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT2002FukaEntity}と等しいか判定します。
     *
     * @param other 比較するエンティティ
     * @@return 比較するエンティティが同じ主キーを持つ{@literal DbT2002FukaEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT2002FukaEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.insertTimestamp, other.insertTimestamp)) {
            return false;
        }
        if (!Objects.equals(this.choteiNendo, other.choteiNendo)) {
            return false;
        }
        if (!Objects.equals(this.fukaNendo, other.fukaNendo)) {
            return false;
        }
        if (!Objects.equals(this.tsuchishoNo, other.tsuchishoNo)) {
            return false;
        }
        if (!Objects.equals(this.shoriTimestamp, other.shoriTimestamp)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT2002FukaEntity entity) {
        this.choteiNendo = entity.choteiNendo;
        this.fukaNendo = entity.fukaNendo;
        this.tsuchishoNo = entity.tsuchishoNo;
        this.shoriTimestamp = entity.shoriTimestamp;
        this.hihokenshaNo = entity.hihokenshaNo;
        this.shikibetsuCode = entity.shikibetsuCode;
        this.setaiCode = entity.setaiCode;
        this.setaiInsu = entity.setaiInsu;
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
        this.choteiYMDHM = entity.choteiYMDHM;
        this.choteiJiyu1 = entity.choteiJiyu1;
        this.choteiJiyu2 = entity.choteiJiyu2;
        this.choteiJiyu3 = entity.choteiJiyu3;
        this.choteiJiyu4 = entity.choteiJiyu4;
        this.koseiM = entity.koseiM;
        this.gemmenMaeHokenryo = entity.gemmenMaeHokenryo;
        this.gemmenGaku = entity.gemmenGaku;
        this.kakuteiHokenryo = entity.kakuteiHokenryo;
        this.hokenryoDankaiKarisanntei = entity.hokenryoDankaiKarisanntei;
        this.choshuHohoShoriTimestamp = entity.choshuHohoShoriTimestamp;
        this.idoKijunTimestamp = entity.idoKijunTimestamp;
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(choteiNendo, fukaNendo, tsuchishoNo, shoriTimestamp, hihokenshaNo, shikibetsuCode, setaiCode, setaiInsu, fukaYMD, kazeiKubun, setaikazeiKubun, gokeiShotokuGaku, nenkinShunyuGaku, hokenryoDankai, hokenryoDankai1, nengakuHokenryo1, tsukiwariStartYM1, tsukiwariEndYM1, hokenryoDankai2, nengakuHokenryo2, tsukiwariStartYM2, tsukiwariEndYM2, choteiYMDHM, choteiJiyu1, choteiJiyu2, choteiJiyu3, choteiJiyu4, koseiM, gemmenMaeHokenryo, gemmenGaku, kakuteiHokenryo, hokenryoDankaiKarisanntei, choshuHohoShoriTimestamp, idoKijunTimestamp);
    }

// </editor-fold>
}
