package jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.KyodoJukyushaIdoRenrakuhyo.KyodoJukyushaIdoRenrakuhyo;

import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.kyodoshorijukyushateiseirenrakuhyo.param.KyodoshoriyoJukyushaIdoRenrakuhyoParam;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.binding.ICommonChildDivBaseProperties;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/*
 * このコードはツールによって生成されました。
 * @reamsid_L DBC-4390-030 xupeng
 */
public interface IKyodoJukyushaIdoRenrakuhyoDiv extends ICommonChildDivBaseProperties {

    /**
     * 画面を画面初期化します。
     *
     * @param 処理モード
     * @param 被保険者番号
     * @param 異動日
     * @param 論理削除
     * @param 対象年月
     * @return KyodoshoriyoJukyushaIdoRenrakuhyoParam
     */
    public KyodoshoriyoJukyushaIdoRenrakuhyoParam initialize(RString 処理モード, HihokenshaNo 被保険者番号,
            FlexibleDate 異動日, boolean 論理削除, FlexibleYearMonth 対象年月);

    /**
     * 最新画面データ
     *
     * @return KyodoshoriyoJukyushaIdoRenrakuhyoParam
     */
    public KyodoshoriyoJukyushaIdoRenrakuhyoParam getNewデータ();

    /**
     * 一時差止日の入力チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs get一時差止日の入力チェック();

    /**
     * 一時差止日の関連チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs get一時差止日の関連チェック();

    /**
     * 基本送付情報の異動日チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 基本送付情報の異動日チェック();

    /**
     * 償還送付情報の異動日チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 償還送付情報の異動日チェック();

    /**
     * 高額送付情報の異動日チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 高額送付情報の異動日チェック();

    /**
     * 基本送付情報の異動区分チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 基本送付情報の異動区分チェック();

    /**
     * 償還送付情報の異動区分チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 償還送付情報の異動区分チェック();

    /**
     * 高額送付情報の異動区分チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 高額送付情報の異動区分チェック();

    /**
     * 基本送付情報の履歴番号チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 基本送付情報の履歴番号チェック();

    /**
     * 償還送付情報の履歴番号チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 償還送付情報の履歴番号チェック();

    /**
     * 高額送付情報の履歴番号チェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 高額送付情報の履歴番号チェック();

    /**
     * 修正有無チェック
     *
     * @param 初期化異動情報Entity
     * @param 画面項目異動情報Entity
     * @param 基本送付情報Flag
     * @param 償還送付情報変Flag
     * @param 高額送付情報Flag
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 修正有無チェック(KyodoshoriyoJukyushaIdoRenrakuhyoParam 初期化異動情報Entity,
            KyodoshoriyoJukyushaIdoRenrakuhyoParam 画面項目異動情報Entity, boolean 基本送付情報Flag,
            boolean 償還送付情報変Flag, boolean 高額送付情報Flag);

    /**
     * 「基本送付情報を追加する」チェックボックス。
     *
     * @return list
     */
    public List<RString> get基本送付情報を追加する();

    /**
     * 「償還送付情報を追加する」チェックボックス。
     *
     * @return list
     */
    public List<RString> get償還送付情報を追加する();

    /**
     * 「高額送付情報を追加する」チェックボックス。
     *
     * @return list
     */
    public List<RString> get高額送付情報を追加する();

    /**
     * 「基本送付情報を削除する」チェックボックス。
     *
     * @return list
     */
    public List<RString> get基本送付情報を削除する();

    /**
     * 「償還送付情報を削除する」チェックボックス。
     *
     * @return list
     */
    public List<RString> get償還送付情報を削除する();

    /**
     * 「高額送付情報を削除する」チェックボックス。
     *
     * @return list
     */
    public List<RString> get高額送付情報を削除する();

    /**
     * 基本送付情報の履歴番号。
     *
     * @return 履歴番号 int
     */
    public Decimal get基本送付_履歴番号();

    /**
     * 償還送付情報の履歴番号。
     *
     * @return 履歴番号 int
     */
    public Decimal get償還送付_履歴番号();

    /**
     * 高額送付情報の履歴番号。
     *
     * @return 履歴番号 int
     */
    public Decimal get高額送付_履歴番号();

    /**
     * 訂正区分。
     *
     * @return 訂正区分 RString
     */
    public RString get訂正区分();

    /**
     * 訂正年月日。
     *
     * @return 訂正年月日 RDate
     */
    public RDate get訂正年月日();

    /**
     * 基本送付情報を追加活性する。
     *
     * @return boolean
     */
    public boolean get基本送付情報を追加活性();

    /**
     * 償還送付情報を追加活性する。
     *
     * @return boolean
     */
    public boolean get償還送付情報を追加活性();

    /**
     * 高額送付情報を追加活性する。
     *
     * @return boolean
     */
    public boolean get高額送付情報を追加活性();

    /**
     * 基本送付情報の異動日。
     *
     * @return 異動日 RDate
     */
    public RDate get基本送付_異動日();

    /**
     * 償還送付情報の異動日。
     *
     * @return 異動日 RDate
     */
    public RDate get償還送付_異動日();

    /**
     * 高額送付情報の異動日。
     *
     * @return 異動日 RDate
     */
    public RDate get高額送付_異動日();
}