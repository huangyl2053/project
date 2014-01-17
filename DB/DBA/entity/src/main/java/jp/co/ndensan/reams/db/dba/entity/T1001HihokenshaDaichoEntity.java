/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.entity;

import jp.co.ndensan.reams.db.dba.business.Hihokensha;
import jp.co.ndensan.reams.ur.urz.business.shikibetsutaisho.IShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;

/**
 * T1001HihokenshaDaichoのEntityクラスです。
 *
 * @author N3327 三浦 凌
 */
public class T1001HihokenshaDaichoEntity implements IDbAccessable {

    @TableName
    public static final RString TABLE_BANE = new RString("T1001HihokennshaDaicho");
    @PrimaryKey
    private RString shichosonCd;
    @PrimaryKey
    private RString hihokenshaNo;
    /* その他 */
    private IShikibetsuCode shikibetsuCode;
    private RString shikakuIdouKubunCode;
    private RDate shikakuShutokuTodokedeDate;
    private RString shikakuShutokuJiyuCode;
    private RDate shikakuShutokuDate;
    private RDate ichigoHihokenshaNenreiTotatsuDate;
    private RString hihokenshaKubunCode;
    private RString shikakuSoshitsuJiyuCode;
    private RDate shikakuSoshitsuTodokedeDate;
    private RDate shikakuSoshitsuDate;
    private RString shikakuHenkoJiyuCode;
    private RDate shikakuHenkoTodokedeDate;
    private RDate shikakuHenkoDate;
    private RString jushochiTokureiTekiyoJiyuCode;
    private RDate tekiyoTodokedeDate;
    private RDate tekiyoDate;
    private RString jushochiTokureikaijoJiyuCode;
    private RDate kaijoTodokedeDate;
    private RDate kaijoDate;
    private boolean jushochiTokureiFlag;
    private boolean koikinaiJushochiTokureiFlag;
    private RString koikinaiTokureiSochimotoShichosonCd;
    private boolean saikofuKubun;
    private RString saikofuJiyuCode;

    public T1001HihokenshaDaichoEntity() {
    }

    public T1001HihokenshaDaichoEntity(Hihokensha 被保険者) {
        this.shichosonCd = 被保険者.get市町村コード().getValue();
        this.hihokenshaNo = 被保険者.get被保険者番号();
        this.shikibetsuCode = 被保険者.get識別コード();
        this.shikakuIdouKubunCode = 被保険者.get資格異動区分().getCode();
        this.shikakuShutokuTodokedeDate = 被保険者.get資格取得届出年月日();
        this.shikakuShutokuJiyuCode = 被保険者.get資格取得事由();
        this.shikakuShutokuDate = 被保険者.get資格取得年月日();
        this.ichigoHihokenshaNenreiTotatsuDate = 被保険者.get一号該当日();
        this.hihokenshaKubunCode = 被保険者.get被保険者区分().getCode();
        this.shikakuSoshitsuJiyuCode = 被保険者.get資格取得事由();
        this.shikakuSoshitsuTodokedeDate = 被保険者.get資格喪失届出年月日();
        this.shikakuSoshitsuDate = 被保険者.get資格喪失年月日();
        this.shikakuHenkoJiyuCode = 被保険者.get資格変更事由().getCode();
        this.shikakuHenkoTodokedeDate = 被保険者.get資格変更届出年月日();
        this.shikakuHenkoDate = 被保険者.get資格変更年月日();
        this.jushochiTokureiTekiyoJiyuCode = 被保険者.get住所地特例適用事由().getCode();
        this.tekiyoTodokedeDate = 被保険者.get住所地特例適用届出年月日();
        this.tekiyoDate = 被保険者.get住所地特例適用年月日();
        this.jushochiTokureikaijoJiyuCode = 被保険者.get住所地特例解除事由().getCode();
        this.kaijoTodokedeDate = 被保険者.get住所地特例解除届出年月日();
        this.kaijoDate = 被保険者.get住所地特例解除年月日();
        this.jushochiTokureiFlag = 被保険者.is住所地特例();
        this.koikinaiJushochiTokureiFlag = 被保険者.is広域内住所地特例();
        this.koikinaiTokureiSochimotoShichosonCd = 被保険者.get広域内住所地特例措置元_市町村コード().getValue();
        this.saikofuKubun = 被保険者.has被保険者証の再交付();
        this.saikofuJiyuCode = 被保険者.get再交付事由().getCode();
    }

    /**
     * @return 市町村コード
     */
    public RString getShichosonCd() {
        return shichosonCd;
    }

    /**
     * @return 被保険者番号
     */
    public RString getHihokenshaNo() {
        return hihokenshaNo;
    }

    /**
     * @return 識別コード
     */
    public IShikibetsuCode getShikibetsuCode() {
        return shikibetsuCode;
    }

    /**
     * @return 資格異動区分コード
     */
    public RString getShikakuIdouKubunCode() {
        return shikakuIdouKubunCode;
    }

    /**
     * @return 資格異動届出年月日
     */
    public RDate getShikakuShutokuTodokedeDate() {
        return shikakuShutokuTodokedeDate;
    }

    /**
     * @return 資格取得事由コード
     */
    public RString getShikakuShutokuJiyuCode() {
        return shikakuShutokuJiyuCode;
    }

    /**
     * @return 資格取得年月日
     */
    public RDate getShikakuShutokuDate() {
        return shikakuShutokuDate;
    }

    /**
     * @return 一号被保険者年齢到達年月日
     */
    public RDate getIchigoHihokenshaNenreiTotatsuDate() {
        return ichigoHihokenshaNenreiTotatsuDate;
    }

    /**
     * @return 被保険者区分コード
     */
    public RString getHihokenshaKubunCode() {
        return hihokenshaKubunCode;
    }

    /**
     * @return 資格喪失事由コード
     */
    public RString getShikakuSoshitsuJiyuCode() {
        return shikakuSoshitsuJiyuCode;
    }

    /**
     * @return 資格喪失届出年月日
     */
    public RDate getShikakuSoshitsuTodokedeDate() {
        return shikakuSoshitsuTodokedeDate;
    }

    /**
     * @return 資格喪失年月日
     */
    public RDate getShikakuSoshitsuDate() {
        return shikakuSoshitsuDate;
    }

    /**
     * @return 資格変更事由コード
     */
    public RString getShikakuHenkoJiyuCode() {
        return shikakuHenkoJiyuCode;
    }

    /**
     * @return 資格変更届出年月日
     */
    public RDate getShikakuHenkoTodokedeDate() {
        return shikakuHenkoTodokedeDate;
    }

    /**
     * @return 資格変更年月日
     */
    public RDate getShikakuHenkoDate() {
        return shikakuHenkoDate;
    }

    /**
     * @return 住所地特例適用事由コード
     */
    public RString getJushochiTokureiTekiyoJiyuCode() {
        return jushochiTokureiTekiyoJiyuCode;
    }

    /**
     * @return 適用届出年月日
     */
    public RDate getTekiyoTodokedeDate() {
        return tekiyoTodokedeDate;
    }

    /**
     * @return 適用年月日
     */
    public RDate getTekiyoDate() {
        return tekiyoDate;
    }

    /**
     * @return 住所地特例解除事由コード
     */
    public RString getJushochiTokureikaijoJiyuCode() {
        return jushochiTokureikaijoJiyuCode;
    }

    /**
     * @return 解除届出年月日
     */
    public RDate getKaijoTodokedeDate() {
        return kaijoTodokedeDate;
    }

    /**
     * @return 解除年月日
     */
    public RDate getKaijoDate() {
        return kaijoDate;
    }

    /**
     * @return 住所地特例フラグ
     */
    public boolean isJushochiTokurei() {
        return jushochiTokureiFlag;
    }

    /**
     * @return 広域内住所地特例フラグ
     */
    public boolean isKoikinaiJushochiTokurei() {
        return koikinaiJushochiTokureiFlag;
    }

    /**
     * @return 広域内特例措置元市町村コード
     */
    public RString getKoikinaiTokureiSochimotoShichosonCd() {
        return koikinaiTokureiSochimotoShichosonCd;
    }

    /**
     * @return 再交付区分
     */
    public boolean hasSaikofu() {
        return saikofuKubun;
    }

    /**
     * @return 再交付事由コード
     */
    public RString getSaikofuJiyuCode() {
        return saikofuJiyuCode;
    }

    /**
     * @param shichosonCd 市町村コード
     */
    public void setShichosonCd(RString shichosonCd) {
        this.shichosonCd = shichosonCd;
    }

    /**
     * @param hihokenshaNo 被保険者番号
     */
    public void setHihokenshaNo(RString hihokenshaNo) {
        this.hihokenshaNo = hihokenshaNo;
    }

    /**
     * @param shikibetsuCode 識別コード
     */
    public void setShikibetsuCode(IShikibetsuCode shikibetsuCode) {
        this.shikibetsuCode = shikibetsuCode;
    }

    /**
     * @param shikakuIdouKubunCode 資格異動区分コード
     */
    public void setShikakuIdouKubunCode(RString shikakuIdouKubunCode) {
        this.shikakuIdouKubunCode = shikakuIdouKubunCode;
    }

    /**
     * @param shikakuShutokuTodokedeDate 資格異動届出年月日
     */
    public void setShikakuShutokuTodokedeDate(RDate shikakuShutokuTodokedeDate) {
        this.shikakuShutokuTodokedeDate = shikakuShutokuTodokedeDate;
    }

    /**
     * @param shikakuShutokuJiyuCode 資格取得事由コード
     */
    public void setShikakuShutokuJiyuCode(RString shikakuShutokuJiyuCode) {
        this.shikakuShutokuJiyuCode = shikakuShutokuJiyuCode;
    }

    /**
     * @param shikakuShutokuDate 資格取得年月日
     */
    public void setShikakuShutokuDate(RDate shikakuShutokuDate) {
        this.shikakuShutokuDate = shikakuShutokuDate;
    }

    /**
     * @param ichigoHihokenshaNenreiTotatsuDate 一号被保険者年齢到達年月日
     *
     */
    public void setIchigoHihokenshaNenreiTotatsuDate(RDate ichigoHihokenshaNenreiTotatsuDate) {
        this.ichigoHihokenshaNenreiTotatsuDate = ichigoHihokenshaNenreiTotatsuDate;
    }

    /**
     * @param hihokennshaKubunCode 被保険者区分コード
     */
    public void setHihokenshaKubunCode(RString hihokennshaKubunCode) {
        this.hihokenshaKubunCode = hihokennshaKubunCode;
    }

    /**
     * @param shikakuSoshitsuJiyuCode 資格喪失事由コード
     */
    public void setShikakuSoshitsuJiyuCode(RString shikakuSoshitsuJiyuCode) {
        this.shikakuSoshitsuJiyuCode = shikakuSoshitsuJiyuCode;
    }

    /**
     * @param shikakuSoshitsuTodokedeDate 資格喪失届出年月日
     */
    public void setShikakuSoshitsuTodokedeDate(RDate shikakuSoshitsuTodokedeDate) {
        this.shikakuSoshitsuTodokedeDate = shikakuSoshitsuTodokedeDate;
    }

    /**
     * @param shikakuSoshitsuDate 資格喪失年月日
     */
    public void setShikakuSoshitsuDate(RDate shikakuSoshitsuDate) {
        this.shikakuSoshitsuDate = shikakuSoshitsuDate;
    }

    /**
     * @param shikakuHenkoJiyuCode 資格変更事由コード
     */
    public void setShikakuHenkoJiyuCode(RString shikakuHenkoJiyuCode) {
        this.shikakuHenkoJiyuCode = shikakuHenkoJiyuCode;
    }

    /**
     * @param shikakuHenkoTodokedeDate 資格変更届出年月日
     */
    public void setShikakuHenkoTodokedeDate(RDate shikakuHenkoTodokedeDate) {
        this.shikakuHenkoTodokedeDate = shikakuHenkoTodokedeDate;
    }

    /**
     * @param shikakuHenkoDate 資格変更年月日
     */
    public void setShikakuHenkoDate(RDate shikakuHenkoDate) {
        this.shikakuHenkoDate = shikakuHenkoDate;
    }

    /**
     * @param jushochiTokureiTekiyoJiyuCode 住所地特例適用事由コード set
     */
    public void setJushochiTokureiTekiyoJiyuCode(RString jushochiTokureiTekiyoJiyuCode) {
        this.jushochiTokureiTekiyoJiyuCode = jushochiTokureiTekiyoJiyuCode;
    }

    /**
     * @param tekiyoTodokedeDate 適用届出年月日
     */
    public void setTekiyoTodokedeDate(RDate tekiyoTodokedeDate) {
        this.tekiyoTodokedeDate = tekiyoTodokedeDate;
    }

    /**
     * @param tekiyoDate 適用年月日
     */
    public void setTekiyoDate(RDate tekiyoDate) {
        this.tekiyoDate = tekiyoDate;
    }

    /**
     * @param jushochiTokureikaijoJiyuCode 住所地特例解除事由コード
     */
    public void setJushochiTokureikaijoJiyuCode(RString jushochiTokureikaijoJiyuCode) {
        this.jushochiTokureikaijoJiyuCode = jushochiTokureikaijoJiyuCode;
    }

    /**
     * @param kaijoTodokedeDate 解除届出年月日
     */
    public void setKaijoTodokedeDate(RDate kaijoTodokedeDate) {
        this.kaijoTodokedeDate = kaijoTodokedeDate;
    }

    /**
     * @param kaijoDate 解除年月日
     */
    public void setKaijoDate(RDate kaijoDate) {
        this.kaijoDate = kaijoDate;
    }

    /**
     * @param jushochiTokureiFlag 住所地特例フラグ
     */
    public void setJushochiTokureiFlag(boolean jushochiTokureiFlag) {
        this.jushochiTokureiFlag = jushochiTokureiFlag;
    }

    /**
     * @param koikinaiJushochiTokureiFlag 広域内住所地特例フラグ
     */
    public void setKoikinaiJushochiTokureiFlag(boolean koikinaiJushochiTokureiFlag) {
        this.koikinaiJushochiTokureiFlag = koikinaiJushochiTokureiFlag;
    }

    /**
     * @param koikinaiTokureiSochimotoShichosonCd 広域内特例措置元市町村コード
     */
    public void setKoikinaiTokureiSochimotoShichosonCd(RString koikinaiTokureiSochimotoShichosonCd) {
        this.koikinaiTokureiSochimotoShichosonCd = koikinaiTokureiSochimotoShichosonCd;
    }

    /**
     * @param saikofuKubun 再交付区分
     */
    public void setSaikofuKubun(boolean saikofuKubun) {
        this.saikofuKubun = saikofuKubun;
    }

    /**
     * @param saikofuJiyuCode 再交付事由コード
     */
    public void setSaikofuJiyuCode(RString saikofuJiyuCode) {
        this.saikofuJiyuCode = saikofuJiyuCode;
    }
}
