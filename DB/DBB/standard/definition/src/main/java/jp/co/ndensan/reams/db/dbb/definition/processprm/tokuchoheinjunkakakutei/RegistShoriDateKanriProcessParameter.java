/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.definition.processprm.tokuchoheinjunkakakutei;

import java.util.List;
import jp.co.ndensan.reams.db.dbb.definition.batchprm.tokuchoheinjunkakakutei.ShichosonJouhouResult;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 処理日付管理マスタ登録を取得のパラメタ。
 *
 * @reamsid_L DBB-1650-040 lijunjun
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class RegistShoriDateKanriProcessParameter implements IBatchProcessParameter {

    private RString 導入形態コード;
    private FlexibleYear 処理年度;
    private YMDHMS 抽出期間開始日時;
    private YMDHMS 抽出期間終了日時;
    private LasdecCode 市町村コード;
    private RString 市町村識別ID;
    private FlexibleDate 開始年月日;
    private FlexibleDate 終了年月日;
    private RString 開始時刻;
    private RString 終了時刻;
    private List<ShichosonJouhouResult> 市町村情報リスト;

    /**
     * コンストラクタです。
     *
     * @param 導入形態コード RString
     * @param 処理年度 FlexibleYear
     * @param 抽出期間開始日時 YMDHMS
     * @param 抽出期間終了日時 YMDHMS
     * @param 市町村コード LasdecCode
     * @param 市町村識別ID RString
     * @param 開始年月日 FlexibleDate
     * @param 終了年月日 FlexibleDate
     * @param 開始時刻 RString
     * @param 終了時刻 RString
     * @param 市町村情報リスト List<ShichosonJouhouResult>
     */
    public RegistShoriDateKanriProcessParameter(RString 導入形態コード,
            FlexibleYear 処理年度,
            YMDHMS 抽出期間開始日時,
            YMDHMS 抽出期間終了日時,
            LasdecCode 市町村コード,
            RString 市町村識別ID,
            FlexibleDate 開始年月日,
            FlexibleDate 終了年月日,
            RString 開始時刻,
            RString 終了時刻,
            List<ShichosonJouhouResult> 市町村情報リスト) {
        this.導入形態コード = 導入形態コード;
        this.処理年度 = 処理年度;
        this.抽出期間開始日時 = 抽出期間開始日時;
        this.抽出期間終了日時 = 抽出期間終了日時;
        this.市町村コード = 市町村コード;
        this.市町村情報リスト = 市町村情報リスト;
        this.開始年月日 = 開始年月日;
        this.終了年月日 = 終了年月日;
        this.開始時刻 = 開始時刻;
        this.終了時刻 = 終了時刻;
    }
}
