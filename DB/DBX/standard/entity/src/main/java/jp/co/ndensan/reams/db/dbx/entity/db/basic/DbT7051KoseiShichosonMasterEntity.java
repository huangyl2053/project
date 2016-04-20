package jp.co.ndensan.reams.db.dbx.entity.db.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import java.util.Objects;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;

/**
 * 構成市町村マスタテーブルのエンティティクラスです。
 * <br/> 運用保険者単位に構成市長を管理する
 */
public class DbT7051KoseiShichosonMasterEntity extends DbTableEntityBase<DbT7051KoseiShichosonMasterEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.4.2">

    @TableName
    public static final RString TABLE_NAME = new RString("DbT7051KoseiShichosonMaster");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private RString shichosonShokibetsuID;
    private LasdecCode shichosonCode;
    private ShoKisaiHokenshaNo shoKisaiHokenshaNo;
    private RString kokuhorenKoikiShichosonNo;
    private RString shichosonMeisho;
    private RString todofukenMeisho;
    private RString gunMeisho;
    private YubinNo yubinNo;
    private AtenaJusho jusho;
    private TelNo telNo;
    private RString yusenChikuCode;
    private RString tyohyoTodoufukenHyojiUmu;
    private RString tyohyoGunHyojiUmu;
    private RString tyohyoShichosonHyojiUmu;
    private RString tyohyoJushoHenshuHouhou;
    private RString tyohyoKatagakiHyojiUmu;
    private RString gaikokujinHyojiHouhou;
    private RString rojinhokenShichosonNo;
    private RString rokenJukyushaNoTaikei;
    private RString shotokuHikidashiHoho;
    private RString nofugakuDataRenkeiHoho;
    private RString tokuchoBunpaishuyaku;
    private FlexibleDate ikoYMD;
    private FlexibleDate kanyuYMD;
    private FlexibleDate ridatsuYMD;
    private RString gappeiKyuShichosonKubun;
    private RString gappeiKyuShichosonHyojiUmu;
    private RString gappeiChiikiNo;
    private ShoKisaiHokenshaNo unyoHokenshaNo;
    private FlexibleDate unyoKaishiYMD;
    private FlexibleDate unyoShuryoYMD;
    private RString unyoKeitaiKubun;

    /**
     * insertDantaiCdのgetメソッドです。
     *
     * @return insertDantaiCd
     */
    public RString getInsertDantaiCd() {
        return insertDantaiCd;
    }

    /**
     * insertDantaiCdのsetメソッドです。
     *
     * @param insertDantaiCd insertDantaiCd
     */
    public void setInsertDantaiCd(RString insertDantaiCd) {
        this.insertDantaiCd = insertDantaiCd;
    }

    /**
     * isDeletedのgetメソッドです。
     *
     * @return isDeleted
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * isDeletedのsetメソッドです。
     *
     * @param isDeleted isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * lastUpdateReamsLoginIdのsetメソッドです。
     *
     * @param lastUpdateReamsLoginId lastUpdateReamsLoginId
     */
    public void setLastUpdateReamsLoginId(RString lastUpdateReamsLoginId) {
        this.lastUpdateReamsLoginId = lastUpdateReamsLoginId;
    }

    /**
     * 市町村識別IDのgetメソッドです。
     *
     * @return 市町村識別ID
     */
    public RString getShichosonShokibetsuID() {
        return shichosonShokibetsuID;
    }

    /**
     * 市町村識別IDのsetメソッドです。
     *
     * @param shichosonShokibetsuID 市町村識別ID
     */
    public void setShichosonShokibetsuID(@Nonnull RString shichosonShokibetsuID) {
        this.shichosonShokibetsuID = shichosonShokibetsuID;
    }

    /**
     * 市町村コードのgetメソッドです。
     *
     * @return 市町村コード
     */
    public LasdecCode getShichosonCode() {
        return shichosonCode;
    }

    /**
     * 市町村コードのsetメソッドです。
     *
     * @param shichosonCode 市町村コード
     */
    public void setShichosonCode(@Nonnull LasdecCode shichosonCode) {
        this.shichosonCode = shichosonCode;
    }

    /**
     * 証記載保険者番号のgetメソッドです。
     *
     * @return 証記載保険者番号
     */
    public ShoKisaiHokenshaNo getShoKisaiHokenshaNo() {
        return shoKisaiHokenshaNo;
    }

    /**
     * 証記載保険者番号のsetメソッドです。
     *
     * @param shoKisaiHokenshaNo 証記載保険者番号
     */
    public void setShoKisaiHokenshaNo(@Nonnull ShoKisaiHokenshaNo shoKisaiHokenshaNo) {
        this.shoKisaiHokenshaNo = shoKisaiHokenshaNo;
    }

    /**
     * 国保連広域内市町村番号のgetメソッドです。
     *
     * @return 国保連広域内市町村番号
     */
    @CheckForNull
    public RString getKokuhorenKoikiShichosonNo() {
        return kokuhorenKoikiShichosonNo;
    }

    /**
     * 国保連広域内市町村番号のsetメソッドです。
     *
     * @param kokuhorenKoikiShichosonNo 国保連広域内市町村番号
     */
    public void setKokuhorenKoikiShichosonNo(RString kokuhorenKoikiShichosonNo) {
        this.kokuhorenKoikiShichosonNo = kokuhorenKoikiShichosonNo;
    }

    /**
     * 市町村名称のgetメソッドです。
     *
     * @return 市町村名称
     */
    public RString getShichosonMeisho() {
        return shichosonMeisho;
    }

    /**
     * 市町村名称のsetメソッドです。
     *
     * @param shichosonMeisho 市町村名称
     */
    public void setShichosonMeisho(@Nonnull RString shichosonMeisho) {
        this.shichosonMeisho = shichosonMeisho;
    }

    /**
     * 都道府県名称のgetメソッドです。
     *
     * @return 都道府県名称
     */
    @CheckForNull
    public RString getTodofukenMeisho() {
        return todofukenMeisho;
    }

    /**
     * 都道府県名称のsetメソッドです。
     *
     * @param todofukenMeisho 都道府県名称
     */
    public void setTodofukenMeisho(RString todofukenMeisho) {
        this.todofukenMeisho = todofukenMeisho;
    }

    /**
     * 郡名称のgetメソッドです。
     *
     * @return 郡名称
     */
    @CheckForNull
    public RString getGunMeisho() {
        return gunMeisho;
    }

    /**
     * 郡名称のsetメソッドです。
     *
     * @param gunMeisho 郡名称
     */
    public void setGunMeisho(RString gunMeisho) {
        this.gunMeisho = gunMeisho;
    }

    /**
     * 郵便番号のgetメソッドです。
     *
     * @return 郵便番号
     */
    @CheckForNull
    public YubinNo getYubinNo() {
        return yubinNo;
    }

    /**
     * 郵便番号のsetメソッドです。
     *
     * @param yubinNo 郵便番号
     */
    public void setYubinNo(YubinNo yubinNo) {
        this.yubinNo = yubinNo;
    }

    /**
     * 住所のgetメソッドです。
     *
     * @return 住所
     */
    @CheckForNull
    public AtenaJusho getJusho() {
        return jusho;
    }

    /**
     * 住所のsetメソッドです。
     *
     * @param jusho 住所
     */
    public void setJusho(AtenaJusho jusho) {
        this.jusho = jusho;
    }

    /**
     * 電話番号のgetメソッドです。
     *
     * @return 電話番号
     */
    @CheckForNull
    public TelNo getTelNo() {
        return telNo;
    }

    /**
     * 電話番号のsetメソッドです。
     *
     * @param telNo 電話番号
     */
    public void setTelNo(TelNo telNo) {
        this.telNo = telNo;
    }

    /**
     * 最優先地区コードのgetメソッドです。
     *
     * @return 最優先地区コード
     */
    @CheckForNull
    public RString getYusenChikuCode() {
        return yusenChikuCode;
    }

    /**
     * 最優先地区コードのsetメソッドです。
     *
     * @param yusenChikuCode 最優先地区コード
     */
    public void setYusenChikuCode(RString yusenChikuCode) {
        this.yusenChikuCode = yusenChikuCode;
    }

    /**
     * 帳票用都道府県名称表示有無のgetメソッドです。
     *
     * @return 帳票用都道府県名称表示有無
     */
    public RString getTyohyoTodoufukenHyojiUmu() {
        return tyohyoTodoufukenHyojiUmu;
    }

    /**
     * 帳票用都道府県名称表示有無のsetメソッドです。
     *
     * @param tyohyoTodoufukenHyojiUmu 帳票用都道府県名称表示有無
     */
    public void setTyohyoTodoufukenHyojiUmu(@Nonnull RString tyohyoTodoufukenHyojiUmu) {
        this.tyohyoTodoufukenHyojiUmu = tyohyoTodoufukenHyojiUmu;
    }

    /**
     * 帳票用郡名称表示有無のgetメソッドです。
     *
     * @return 帳票用郡名称表示有無
     */
    public RString getTyohyoGunHyojiUmu() {
        return tyohyoGunHyojiUmu;
    }

    /**
     * 帳票用郡名称表示有無のsetメソッドです。
     *
     * @param tyohyoGunHyojiUmu 帳票用郡名称表示有無
     */
    public void setTyohyoGunHyojiUmu(@Nonnull RString tyohyoGunHyojiUmu) {
        this.tyohyoGunHyojiUmu = tyohyoGunHyojiUmu;
    }

    /**
     * 帳票用市町村名称表示有無のgetメソッドです。
     *
     * @return 帳票用市町村名称表示有無
     */
    public RString getTyohyoShichosonHyojiUmu() {
        return tyohyoShichosonHyojiUmu;
    }

    /**
     * 帳票用市町村名称表示有無のsetメソッドです。
     *
     * @param tyohyoShichosonHyojiUmu 帳票用市町村名称表示有無
     */
    public void setTyohyoShichosonHyojiUmu(@Nonnull RString tyohyoShichosonHyojiUmu) {
        this.tyohyoShichosonHyojiUmu = tyohyoShichosonHyojiUmu;
    }

    /**
     * 帳票用住所編集方法のgetメソッドです。
     *
     * @return 帳票用住所編集方法
     */
    public RString getTyohyoJushoHenshuHouhou() {
        return tyohyoJushoHenshuHouhou;
    }

    /**
     * 帳票用住所編集方法のsetメソッドです。
     *
     * @param tyohyoJushoHenshuHouhou 帳票用住所編集方法
     */
    public void setTyohyoJushoHenshuHouhou(@Nonnull RString tyohyoJushoHenshuHouhou) {
        this.tyohyoJushoHenshuHouhou = tyohyoJushoHenshuHouhou;
    }

    /**
     * 帳票用方書表示有無のgetメソッドです。
     *
     * @return 帳票用方書表示有無
     */
    public RString getTyohyoKatagakiHyojiUmu() {
        return tyohyoKatagakiHyojiUmu;
    }

    /**
     * 帳票用方書表示有無のsetメソッドです。
     *
     * @param tyohyoKatagakiHyojiUmu 帳票用方書表示有無
     */
    public void setTyohyoKatagakiHyojiUmu(@Nonnull RString tyohyoKatagakiHyojiUmu) {
        this.tyohyoKatagakiHyojiUmu = tyohyoKatagakiHyojiUmu;
    }

    /**
     * 外国人氏名表示方法のgetメソッドです。
     *
     * @return 外国人氏名表示方法
     */
    public RString getGaikokujinHyojiHouhou() {
        return gaikokujinHyojiHouhou;
    }

    /**
     * 外国人氏名表示方法のsetメソッドです。
     *
     * @param gaikokujinHyojiHouhou 外国人氏名表示方法
     */
    public void setGaikokujinHyojiHouhou(@Nonnull RString gaikokujinHyojiHouhou) {
        this.gaikokujinHyojiHouhou = gaikokujinHyojiHouhou;
    }

    /**
     * 老人保健市町村番号のgetメソッドです。
     *
     * @return 老人保健市町村番号
     */
    @CheckForNull
    public RString getRojinhokenShichosonNo() {
        return rojinhokenShichosonNo;
    }

    /**
     * 老人保健市町村番号のsetメソッドです。
     *
     * @param rojinhokenShichosonNo 老人保健市町村番号
     */
    public void setRojinhokenShichosonNo(RString rojinhokenShichosonNo) {
        this.rojinhokenShichosonNo = rojinhokenShichosonNo;
    }

    /**
     * 老人保健受給者番号体系のgetメソッドです。
     *
     * @return 老人保健受給者番号体系
     */
    @CheckForNull
    public RString getRokenJukyushaNoTaikei() {
        return rokenJukyushaNoTaikei;
    }

    /**
     * 老人保健受給者番号体系のsetメソッドです。
     *
     * @param rokenJukyushaNoTaikei 老人保健受給者番号体系
     */
    public void setRokenJukyushaNoTaikei(RString rokenJukyushaNoTaikei) {
        this.rokenJukyushaNoTaikei = rokenJukyushaNoTaikei;
    }

    /**
     * 所得引出方法のgetメソッドです。
     * <br/>
     * <br/>1:Reams.NET　3:Reams以外　4:更正なし
     *
     * @return 所得引出方法
     */
    @CheckForNull
    public RString getShotokuHikidashiHoho() {
        return shotokuHikidashiHoho;
    }

    /**
     * 所得引出方法のsetメソッドです。
     * <br/>
     * <br/>1:Reams.NET　3:Reams以外　4:更正なし
     *
     * @param shotokuHikidashiHoho 所得引出方法
     */
    public void setShotokuHikidashiHoho(RString shotokuHikidashiHoho) {
        this.shotokuHikidashiHoho = shotokuHikidashiHoho;
    }

    /**
     * 納付額データ連携方法のgetメソッドです。
     * <br/>
     * <br/>1:Reams.NET　2:Reams以外　3:Reams以外（拡張ﾌｧｲﾙ）
     *
     * @return 納付額データ連携方法
     */
    @CheckForNull
    public RString getNofugakuDataRenkeiHoho() {
        return nofugakuDataRenkeiHoho;
    }

    /**
     * 納付額データ連携方法のsetメソッドです。
     * <br/>
     * <br/>1:Reams.NET　2:Reams以外　3:Reams以外（拡張ﾌｧｲﾙ）
     *
     * @param nofugakuDataRenkeiHoho 納付額データ連携方法
     */
    public void setNofugakuDataRenkeiHoho(RString nofugakuDataRenkeiHoho) {
        this.nofugakuDataRenkeiHoho = nofugakuDataRenkeiHoho;
    }

    /**
     * 特徴分配集約のgetメソッドです。
     * <br/>
     * <br/>0：なし　1：あり（国保／後期）　2：あり（後期）
     *
     * @return 特徴分配集約
     */
    @CheckForNull
    public RString getTokuchoBunpaishuyaku() {
        return tokuchoBunpaishuyaku;
    }

    /**
     * 特徴分配集約のsetメソッドです。
     * <br/>
     * <br/>0：なし　1：あり（国保／後期）　2：あり（後期）
     *
     * @param tokuchoBunpaishuyaku 特徴分配集約
     */
    public void setTokuchoBunpaishuyaku(RString tokuchoBunpaishuyaku) {
        this.tokuchoBunpaishuyaku = tokuchoBunpaishuyaku;
    }

    /**
     * 移行日のgetメソッドです。
     *
     * @return 移行日
     */
    @CheckForNull
    public FlexibleDate getIkoYMD() {
        return ikoYMD;
    }

    /**
     * 移行日のsetメソッドです。
     *
     * @param ikoYMD 移行日
     */
    public void setIkoYMD(FlexibleDate ikoYMD) {
        this.ikoYMD = ikoYMD;
    }

    /**
     * 加入日のgetメソッドです。
     *
     * @return 加入日
     */
    public FlexibleDate getKanyuYMD() {
        return kanyuYMD;
    }

    /**
     * 加入日のsetメソッドです。
     *
     * @param kanyuYMD 加入日
     */
    public void setKanyuYMD(@Nonnull FlexibleDate kanyuYMD) {
        this.kanyuYMD = kanyuYMD;
    }

    /**
     * 離脱日のgetメソッドです。
     *
     * @return 離脱日
     */
    @CheckForNull
    public FlexibleDate getRidatsuYMD() {
        return ridatsuYMD;
    }

    /**
     * 離脱日のsetメソッドです。
     *
     * @param ridatsuYMD 離脱日
     */
    public void setRidatsuYMD(FlexibleDate ridatsuYMD) {
        this.ridatsuYMD = ridatsuYMD;
    }

    /**
     * 合併旧市町村区分のgetメソッドです。
     * <br/>
     * <br/>１：合併前の旧市町村である
     *
     * <br/>０：最新の広域構成市町村である
     *
     * @return 合併旧市町村区分
     */
    @CheckForNull
    public RString getGappeiKyuShichosonKubun() {
        return gappeiKyuShichosonKubun;
    }

    /**
     * 合併旧市町村区分のsetメソッドです。
     * <br/>
     * <br/>１：合併前の旧市町村である
     *
     * <br/>０：最新の広域構成市町村である
     *
     * @param gappeiKyuShichosonKubun 合併旧市町村区分
     */
    public void setGappeiKyuShichosonKubun(RString gappeiKyuShichosonKubun) {
        this.gappeiKyuShichosonKubun = gappeiKyuShichosonKubun;
    }

    /**
     * 合併旧市町村表示有無のgetメソッドです。
     * <br/>
     * <br/>合併旧市町村で表示を必要とする市町村について、表示設定が行われる
     *
     * <br/>１：表示する ０：表示しない
     *
     * @return 合併旧市町村表示有無
     */
    @CheckForNull
    public RString getGappeiKyuShichosonHyojiUmu() {
        return gappeiKyuShichosonHyojiUmu;
    }

    /**
     * 合併旧市町村表示有無のsetメソッドです。
     * <br/>
     * <br/>合併旧市町村で表示を必要とする市町村について、表示設定が行われる
     *
     * <br/>１：表示する ０：表示しない
     *
     * @param gappeiKyuShichosonHyojiUmu 合併旧市町村表示有無
     */
    public void setGappeiKyuShichosonHyojiUmu(RString gappeiKyuShichosonHyojiUmu) {
        this.gappeiKyuShichosonHyojiUmu = gappeiKyuShichosonHyojiUmu;
    }

    /**
     * 合併情報地域番号のgetメソッドです。
     *
     * @return 合併情報地域番号
     */
    @CheckForNull
    public RString getGappeiChiikiNo() {
        return gappeiChiikiNo;
    }

    /**
     * 合併情報地域番号のsetメソッドです。
     *
     * @param gappeiChiikiNo 合併情報地域番号
     */
    public void setGappeiChiikiNo(RString gappeiChiikiNo) {
        this.gappeiChiikiNo = gappeiChiikiNo;
    }

    /**
     * 運用保険者番号のgetメソッドです。
     *
     * @return 運用保険者番号
     */
    @CheckForNull
    public ShoKisaiHokenshaNo getUnyoHokenshaNo() {
        return unyoHokenshaNo;
    }

    /**
     * 運用保険者番号のsetメソッドです。
     *
     * @param unyoHokenshaNo 運用保険者番号
     */
    public void setUnyoHokenshaNo(ShoKisaiHokenshaNo unyoHokenshaNo) {
        this.unyoHokenshaNo = unyoHokenshaNo;
    }

    /**
     * 運用開始日のgetメソッドです。
     *
     * @return 運用開始日
     */
    @CheckForNull
    public FlexibleDate getUnyoKaishiYMD() {
        return unyoKaishiYMD;
    }

    /**
     * 運用開始日のsetメソッドです。
     *
     * @param unyoKaishiYMD 運用開始日
     */
    public void setUnyoKaishiYMD(FlexibleDate unyoKaishiYMD) {
        this.unyoKaishiYMD = unyoKaishiYMD;
    }

    /**
     * 運用終了日のgetメソッドです。
     *
     * @return 運用終了日
     */
    @CheckForNull
    public FlexibleDate getUnyoShuryoYMD() {
        return unyoShuryoYMD;
    }

    /**
     * 運用終了日のsetメソッドです。
     *
     * @param unyoShuryoYMD 運用終了日
     */
    public void setUnyoShuryoYMD(FlexibleDate unyoShuryoYMD) {
        this.unyoShuryoYMD = unyoShuryoYMD;
    }

    /**
     * 運用形態区分のgetメソッドです。
     * <br/>
     * <br/>単独
     *
     * <br/>広域連合
     *
     * <br/>一部事務組合
     *
     * @return 運用形態区分
     */
    @CheckForNull
    public RString getUnyoKeitaiKubun() {
        return unyoKeitaiKubun;
    }

    /**
     * 運用形態区分のsetメソッドです。
     * <br/>
     * <br/>単独
     *
     * <br/>広域連合
     *
     * <br/>一部事務組合
     *
     * @param unyoKeitaiKubun 運用形態区分
     */
    public void setUnyoKeitaiKubun(RString unyoKeitaiKubun) {
        this.unyoKeitaiKubun = unyoKeitaiKubun;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT7051KoseiShichosonMasterEntity}と等しいか判定します。
     *
     * @param other 比較するエンティティ
     * @return
     * 比較するエンティティが同じ主キーを持つ{@literal DbT7051KoseiShichosonMasterEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT7051KoseiShichosonMasterEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.shichosonShokibetsuID, other.shichosonShokibetsuID)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT7051KoseiShichosonMasterEntity entity) {
        this.shichosonShokibetsuID = entity.shichosonShokibetsuID;
        this.shichosonCode = entity.shichosonCode;
        this.shoKisaiHokenshaNo = entity.shoKisaiHokenshaNo;
        this.kokuhorenKoikiShichosonNo = entity.kokuhorenKoikiShichosonNo;
        this.shichosonMeisho = entity.shichosonMeisho;
        this.todofukenMeisho = entity.todofukenMeisho;
        this.gunMeisho = entity.gunMeisho;
        this.yubinNo = entity.yubinNo;
        this.jusho = entity.jusho;
        this.telNo = entity.telNo;
        this.yusenChikuCode = entity.yusenChikuCode;
        this.tyohyoTodoufukenHyojiUmu = entity.tyohyoTodoufukenHyojiUmu;
        this.tyohyoGunHyojiUmu = entity.tyohyoGunHyojiUmu;
        this.tyohyoShichosonHyojiUmu = entity.tyohyoShichosonHyojiUmu;
        this.tyohyoJushoHenshuHouhou = entity.tyohyoJushoHenshuHouhou;
        this.tyohyoKatagakiHyojiUmu = entity.tyohyoKatagakiHyojiUmu;
        this.gaikokujinHyojiHouhou = entity.gaikokujinHyojiHouhou;
        this.rojinhokenShichosonNo = entity.rojinhokenShichosonNo;
        this.rokenJukyushaNoTaikei = entity.rokenJukyushaNoTaikei;
        this.shotokuHikidashiHoho = entity.shotokuHikidashiHoho;
        this.nofugakuDataRenkeiHoho = entity.nofugakuDataRenkeiHoho;
        this.tokuchoBunpaishuyaku = entity.tokuchoBunpaishuyaku;
        this.ikoYMD = entity.ikoYMD;
        this.kanyuYMD = entity.kanyuYMD;
        this.ridatsuYMD = entity.ridatsuYMD;
        this.gappeiKyuShichosonKubun = entity.gappeiKyuShichosonKubun;
        this.gappeiKyuShichosonHyojiUmu = entity.gappeiKyuShichosonHyojiUmu;
        this.gappeiChiikiNo = entity.gappeiChiikiNo;
        this.unyoHokenshaNo = entity.unyoHokenshaNo;
        this.unyoKaishiYMD = entity.unyoKaishiYMD;
        this.unyoShuryoYMD = entity.unyoShuryoYMD;
        this.unyoKeitaiKubun = entity.unyoKeitaiKubun;
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(shichosonShokibetsuID, shichosonCode, shoKisaiHokenshaNo, kokuhorenKoikiShichosonNo, shichosonMeisho, todofukenMeisho, gunMeisho, yubinNo, jusho, telNo, yusenChikuCode, tyohyoTodoufukenHyojiUmu, tyohyoGunHyojiUmu, tyohyoShichosonHyojiUmu, tyohyoJushoHenshuHouhou, tyohyoKatagakiHyojiUmu, gaikokujinHyojiHouhou, rojinhokenShichosonNo, rokenJukyushaNoTaikei, shotokuHikidashiHoho, nofugakuDataRenkeiHoho, tokuchoBunpaishuyaku, ikoYMD, kanyuYMD, ridatsuYMD, gappeiKyuShichosonKubun, gappeiKyuShichosonHyojiUmu, gappeiChiikiNo, unyoHokenshaNo, unyoKaishiYMD, unyoShuryoYMD, unyoKeitaiKubun);
    }

// </editor-fold>
}