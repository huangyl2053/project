package jp.co.ndensan.reams.db.dbc.entity.euc.hanyolistsaishinsakekka;

import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.JuminJotai;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.idojiyu.IIdoJiyu;
import jp.co.ndensan.reams.uz.uza.biz.AtenaKanaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.ChikuCode;
import jp.co.ndensan.reams.uz.uza.biz.ChugakkokuCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.TsuzukigaraCode;
import jp.co.ndensan.reams.uz.uza.biz.ZenkokuJushoCode;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.OnNextSchema;

/**
 * 汎用リスト 再審査結果情報連番連番がなしCSV用データEntityです。
 *
 * @reamsid_L DBC-3105-020 yaodongsheng
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
@lombok.Setter
@OnNextSchema("rgdb")
public class HanyoListSaishinsaKekkaRenbanNashiEUCEntity implements IHanyoListSaishinsaKekkaEUCEntity {

    @CsvField(order = 1, name = "識別コード")
    private ShikibetsuCode 識別コード;
    @CsvField(order = 2, name = "住民種別")
    private JuminJotai 住民種別;
    @CsvField(order = 3, name = "氏名")
    private AtenaMeisho 氏名;
    @CsvField(order = 4, name = "氏名カナ")
    private AtenaKanaMeisho 氏名カナ;
    @CsvField(order = 5, name = "生年月日")
    private RString 生年月日;
    @CsvField(order = 6, name = "年齢")
    private RString 年齢;
    @CsvField(order = 7, name = "性別")
    private RString 性別;
    @CsvField(order = 8, name = "続柄コード")
    private TsuzukigaraCode 続柄コード;
    @CsvField(order = 9, name = "世帯コード")
    private SetaiCode 世帯コード;
    @CsvField(order = 10, name = "世帯主名")
    private AtenaMeisho 世帯主名;
    @CsvField(order = 11, name = "住所コード")
    private ZenkokuJushoCode 住所コード;
    @CsvField(order = 12, name = "郵便番号")
    private RString 郵便番号;
    @CsvField(order = 13, name = "住所＋番地＋方書")
    private RString 住所番地方書;
    @CsvField(order = 14, name = "住所")
    private RString 住所;
    @CsvField(order = 15, name = "番地")
    private RString 番地;
    @CsvField(order = 16, name = "方書")
    private RString 方書;
    @CsvField(order = 17, name = "行政区コード")
    private ChugakkokuCode 行政区コード;
    @CsvField(order = 18, name = "行政区名")
    private RString 行政区名;
    @CsvField(order = 19, name = "地区１")
    private ChikuCode 地区１;
    @CsvField(order = 20, name = "地区２")
    private ChikuCode 地区２;
    @CsvField(order = 21, name = "地区３")
    private ChikuCode 地区３;
    @CsvField(order = 22, name = "連絡先１")
    private TelNo 連絡先１;
    @CsvField(order = 23, name = "連絡先２")
    private TelNo 連絡先２;
    @CsvField(order = 24, name = "登録異動日")
    private RString 登録異動日;
    @CsvField(order = 25, name = "登録事由")
    private IIdoJiyu 登録事由;
    @CsvField(order = 26, name = "登録届出日")
    private RString 登録届出日;
    @CsvField(order = 27, name = "住定異動日")
    private RString 住定異動日;
    @CsvField(order = 28, name = "住定事由")
    private IIdoJiyu 住定事由;
    @CsvField(order = 29, name = "住定届出日")
    private RString 住定届出日;
    @CsvField(order = 30, name = "消除異動日")
    private RString 消除異動日;
    @CsvField(order = 31, name = "消除事由")
    private IIdoJiyu 消除事由;
    @CsvField(order = 32, name = "消除届出日")
    private RString 消除届出日;
    @CsvField(order = 33, name = "転出入理由")
    private RString 転出入理由;
    @CsvField(order = 34, name = "前住所郵便番号")
    private RString 前住所郵便番号;
    @CsvField(order = 35, name = "前住所＋番地＋方書")
    private RString 前住所番地方書;
    @CsvField(order = 36, name = "前住所")
    private RString 前住所;
    @CsvField(order = 37, name = "前住所番地")
    private RString 前住所番地;
    @CsvField(order = 38, name = "前住所方書")
    private RString 前住所方書;
    @CsvField(order = 39, name = "市町村コード")
    private LasdecCode 市町村コード;
    @CsvField(order = 40, name = "市町村名")
    private RString 市町村名;
    @CsvField(order = 41, name = "保険者コード")
    private LasdecCode 保険者コード;
    @CsvField(order = 42, name = "保険者名")
    private RString 保険者名;
    @CsvField(order = 43, name = "空白")
    private RString 空白;
    @CsvField(order = 44, name = "被保険者番号")
    private RString 被保険者番号;
    @CsvField(order = 45, name = "資格取得事由")
    private RString 資格取得事由;
    @CsvField(order = 46, name = "資格取得日")
    private RString 資格取得日;
    @CsvField(order = 47, name = "資格取得届出日")
    private RString 資格取得届出日;
    @CsvField(order = 48, name = "喪失事由")
    private RString 喪失事由;
    @CsvField(order = 49, name = "資格喪失日")
    private RString 資格喪失日;
    @CsvField(order = 50, name = "資格喪失届日")
    private RString 資格喪失届日;
    @CsvField(order = 51, name = "資格区分")
    private RString 資格区分;
    @CsvField(order = 52, name = "住所地特例状態")
    private RString 住所地特例状態;
    @CsvField(order = 53, name = "（資格）証記載保険者番号")
    private RString 資格証記載保険者番号;
    @CsvField(order = 54, name = "取扱年月")
    private RString 取扱年月;
    @CsvField(order = 55, name = "保険者区分")
    private RString 保険者区分;
    @CsvField(order = 56, name = "サービス提供年月")
    private RString サービス提供年月;
    @CsvField(order = 57, name = "再審査事業者番号")
    private RString 再審査事業者番号;
    @CsvField(order = 58, name = "再審査事業者名")
    private RString 再審査事業者名;
    @CsvField(order = 59, name = "サービス種類")
    private RString サービス種類;
    @CsvField(order = 60, name = "サービス種類名")
    private RString サービス種類名;
    @CsvField(order = 61, name = "申立事由コード")
    private RString 申立事由コード;
    @CsvField(order = 62, name = "申立事由")
    private RString 申立事由;
    @CsvField(order = 63, name = "再審査結果コード")
    private RString 再審査結果コード;
    @CsvField(order = 64, name = "再審査結果")
    private RString 再審査結果;
    @CsvField(order = 65, name = "当初請求件数")
    private RString 当初請求件数;
    @CsvField(order = 66, name = "原審単位数")
    private RString 原審単位数;
    @CsvField(order = 67, name = "申立単位数")
    private RString 申立単位数;
    @CsvField(order = 68, name = "決定単位数")
    private RString 決定単位数;
    @CsvField(order = 69, name = "調整単位数")
    private RString 調整単位数;
    @CsvField(order = 70, name = "保険者負担額")
    private RString 保険者負担額;
    @CsvField(order = 71, name = "公費受給者番号")
    private RString 公費受給者番号;
    @CsvField(order = 72, name = "（給付）証記載保険者番号")
    private RString 給付証記載保険者番号;
    @CsvField(order = 73, name = "受給申請事由")
    private RString 受給申請事由;
    @CsvField(order = 74, name = "受給申請日")
    private RString 受給申請日;
    @CsvField(order = 75, name = "受給要介護度")
    private RString 受給要介護度;
    @CsvField(order = 76, name = "受給認定開始日")
    private RString 受給認定開始日;
    @CsvField(order = 77, name = "受給認定終了日")
    private RString 受給認定終了日;
    @CsvField(order = 78, name = "受給認定日")
    private RString 受給認定日;
    @CsvField(order = 79, name = "受給旧措置")
    private RString 受給旧措置;
    @CsvField(order = 80, name = "受給みなし更新認定")
    private RString 受給みなし更新認定;
    @CsvField(order = 81, name = "受給直近事由")
    private RString 受給直近事由;

}