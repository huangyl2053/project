/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business;

import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaKanaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * @author n9606
 */
public class RenrakusakiJoho {

    private final AtenaMeisho 氏名;
    private final AtenaKanaMeisho 氏名カナ;
    private final TelNo 電話番号;
    private final TelNo 携帯番号;
    private final YubinNo 郵便番号;
    private final AtenaJusho 住所;
    private final RString 続柄;
    private final RString 連絡先区分番号;
    private final RString 保険者番号;
    private final RString 被保険者番号;

    /**
     * インスタンスを生成します。
     *
     * @param 氏名 AtenaMeisho
     * @param 氏名カナ AtenaKanaMeisho
     * @param 電話番号 TelNo
     * @param 携帯番号 TelNo
     * @param 郵便番号 YubinNo
     * @param 住所 AtenaJusho
     * @param 続柄 RString
     * @param 連絡先区分番号 RString
     * @param 保険者番号 RString
     * @param 被保険者番号 RString
     */
    public RenrakusakiJoho(AtenaMeisho 氏名, AtenaKanaMeisho 氏名カナ,
            TelNo 電話番号, TelNo 携帯番号, YubinNo 郵便番号, AtenaJusho 住所,
            RString 続柄, RString 連絡先区分番号, RString 保険者番号, RString 被保険者番号) {

        this.氏名 = 氏名;
        this.氏名カナ = 氏名カナ;
        this.電話番号 = 電話番号;
        this.携帯番号 = 携帯番号;
        this.郵便番号 = 郵便番号;
        this.住所 = 住所;
        this.続柄 = 続柄;
        this.連絡先区分番号 = 連絡先区分番号;
        this.保険者番号 = 保険者番号;
        this.被保険者番号 = 被保険者番号;

    }

    /**
     * 氏名を取得します。
     *
     * @return 氏名
     */
    public AtenaMeisho get氏名() {
        return 氏名;
    }

    /**
     * 氏名カナを取得します。
     *
     * @return 氏名カナ
     */
    public AtenaKanaMeisho get氏名カナ() {
        return 氏名カナ;
    }

    /**
     * 電話番号を取得します。
     *
     * @return 電話番号
     */
    public TelNo get電話番号() {
        return 電話番号;
    }

    /**
     * 携帯番号を取得します。
     *
     * @return 携帯番号
     */
    public TelNo get携帯番号() {
        return 携帯番号;
    }

    /**
     * 郵便番号を取得します。
     *
     * @return 郵便番号
     */
    public YubinNo get郵便番号() {
        return 郵便番号;
    }

    /**
     * 住所を取得します。
     *
     * @return 住所
     */
    public AtenaJusho get住所() {
        return 住所;
    }

    /**
     * 続柄を取得します。
     *
     * @return 続柄
     */
    public RString get続柄() {
        return 続柄;
    }

    /**
     * 連絡先区分番号を取得します。
     *
     * @return 連絡先区分番号
     */
    public RString get連絡先区分番号() {
        return 連絡先区分番号;
    }

    /**
     * 保険者番号を取得します。
     *
     * @return 保険者番号
     */
    public RString get保険者番号() {
        return 保険者番号;
    }

    /**
     * 被保険者番号を取得します。
     *
     * @return 被保険者番号
     */
    public RString get被保険者番号() {
        return 被保険者番号;
    }
}
