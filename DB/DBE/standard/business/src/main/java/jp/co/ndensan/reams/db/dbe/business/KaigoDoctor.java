/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business;

import jp.co.ndensan.reams.ur.urz.business.IDoctor;
import jp.co.ndensan.reams.ur.urz.definition.Messages;
import jp.co.ndensan.reams.ur.urz.business.IIryoKikanCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.KaigoDoctorCode;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.KaigoIryoKikanCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShichosonCode;
import jp.co.ndensan.reams.ur.urz.business.IJusho;
import jp.co.ndensan.reams.ur.urz.business.IYubinNo;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;

/**
 * 介護医師の情報を扱うクラスです。
 *
 * @author N8156 宮本 康
 */
public class KaigoDoctor {

    private final IDoctor 医師;
    private final IShujii 主治医;
    private final KaigoIryoKikan 介護医療機関;

    /**
     * インスタンスを生成します。
     *
     * @param 医師 医師
     * @param 主治医 主治医
     * @param 介護医療機関 介護医療機関
     */
    public KaigoDoctor(IDoctor 医師, IShujii 主治医, KaigoIryoKikan 介護医療機関) {
        this.医師 = requireNonNull(医師, Messages.E00001.replace("医師").getMessage());
        this.主治医 = requireNonNull(主治医, Messages.E00001.replace("主治医").getMessage());
        this.介護医療機関 = requireNonNull(介護医療機関, Messages.E00001.replace("介護医療機関").getMessage());
    }

    /**
     * 医師を返します。
     *
     * @return 医師
     */
    public IDoctor get医師() {
        return 医師;
    }

    /**
     * 主治医を返します。
     *
     * @return 主治医
     */
    public IShujii get主治医() {
        return 主治医;
    }

    /**
     * 介護医療機関を返します。
     *
     * @return 介護医療機関
     */
    public KaigoIryoKikan get介護医療機関() {
        return 介護医療機関;
    }

    /**
     * 医師識別番号を返します。
     *
     * @return 医師識別番号
     */
    public RString get医師識別番号() {
        return 医師.get医師識別番号();
    }

    /**
     * 医師氏名を返します。
     *
     * @return 医師氏名
     */
    public AtenaMeisho get医師氏名() {
        return 医師.get医師氏名();
    }

    /**
     * 所属医療機関コードを返します。
     *
     * @return 所属医療機関コード
     */
    public IIryoKikanCode get所属医療機関コード() {
        return 医師.get所属医療機関コード();
    }

    /**
     * 医師区分を返します。
     *
     * @return 医師区分
     */
    public RString get医師区分() {
        return 医師.get医師区分();
    }

    /**
     * 所属診療科を返します。
     *
     * @return 所属診療科
     */
    public RString get所属診療科() {
        return 医師.get所属診療科();
    }

    /**
     * 医師が主治医かどうか判定して結果を返します。
     *
     * @return true:主治医 false:主治医ではない
     */
    public boolean is主治医() {
        return 医師.is主治医();
    }

    /**
     * 医師が指定医かどうか判定して結果を返します。
     *
     * @return true:指定医 false:指定医ではない
     */
    public boolean is指定医() {
        return 医師.is指定医();
    }

    /**
     * 医師が学校医かどうか判定して結果を返します。
     *
     * @return true:学校医 false:学校医ではない
     */
    public boolean is学校医() {
        return 医師.is学校医();
    }

    /**
     * 市町村コードを返します。
     *
     * @return 市町村コード
     */
    public ShichosonCode get市町村コード() {
        return 主治医.get市町村コード();
    }

    /**
     * 介護医療機関コードを返します。
     *
     * @return 介護医療機関コード
     */
    public KaigoIryoKikanCode get介護医療機関コード() {
        return 主治医.get介護医療機関コード();
    }

    /**
     * 介護医師コードを返します。
     *
     * @return 介護医師コード
     */
    public KaigoDoctorCode get介護医師コード() {
        return 主治医.get介護医師コード();
    }

    /**
     * 医療機関コードを返します。
     *
     * @return 医療機関コード
     */
    public IIryoKikanCode get医療機関コード() {
        return 主治医.get医療機関コード();
    }

    /**
     * 医師の状況が有効かどうかを判定します。
     *
     * @return 有効の場合はtrueを返します。
     */
    public boolean is有効() {
        return 主治医.is有効();
    }

    /**
     * 郵便番号を返します。
     *
     * @return 郵便番号
     */
    public IYubinNo get郵便番号() {
        return 主治医.get郵便番号();
    }

    /**
     * 住所を返します。
     *
     * @return 住所
     */
    public IJusho get住所() {
        return 主治医.get住所();
    }

    /**
     * 電話番号を返します。
     *
     * @return 電話番号
     */
    public RString get電話番号() {
        return 主治医.get電話番号();
    }

    /**
     * FAX番号を返します。
     *
     * @return FAX番号
     */
    public RString getFAX番号() {
        return 主治医.getFAX番号();
    }
}
