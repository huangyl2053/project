/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.message;

import static jp.co.ndensan.reams.db.dbz.definition.message.MessageCreateHelper.toCode;
import jp.co.ndensan.reams.uz.uza.message.ErrorMessage;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.Message;

/**
 * DBCのエラーメッセージ定義列挙型です。
 *
 * @reamsid_L DBC-9999-023 liangbc
 */
public enum DbcErrorMessages implements IMessageGettable {

    対象年月被保険者データなし(1, "対象年月時点で被保険者ではありません。"),
    設定不能状態への変更(2, "設定不能な処理状況に変更されたため登録できません。"),
    高額判定_処理状態処理前数不正(3, "処理状態が処理前または再処理前である処理年月が２件以上存在します。"),
    処理状態処理前未設定(4, "処理状態が処理前または再処理前である処理年月が存在しません。"),
    給付実績複数件取得(5, "対象の給付実績情報が複数件取得されました。"),
    未審査有りで保存不可(6, "未審査のデータがあるのため保存できません。"),
    サービス年月と不一致(7, "?にはサービス年月と同月を指定してください。"),
    住宅改修データなし(8, "住宅改修データがありません。"),
    着工日不一致(9, "着工日にはサービス年月と同一の年月を設定してください。"),
    対象住宅住所不一致(10, "対象住宅住所には同じ住所を設定してください。"),
    被保険者の高額介護サービス支給申請情報が無い(12, "指定した被保険者の、高額介護サービス支給申請情報がありません。"),
    要介護状態_事前申請不可(13, "要介護状態になっていないため、事前申請できません。"),
    高額合算支給申請検索_処理不可(14, "?は?より未来の日付を設定できません。"),
    年月と不一致(15, "?は?と同月を指定してください。"),
    取込対象ファイルが存在しない(16, "取込対象ファイルが取得できません。：?"),
    計画単位数不一致(17, "限度額対象単位および限度額対象外単位数が計画単位数と一致しません。"),
    サービス種類が登録済(18, "サービス種類が登録されています。"),
    内訳入力途中(19, "内訳入力途中です。"),
    対象期間開始日終了日不整合(20, "対象計算期間（開始）　＜＝　対象計算期間（終了）としてください。"),
    被保険者期間開始日終了日不整合(21, "被保険者期間（開始）　＜＝　被保険者期間（終了）としてください。"),
    対象計算期間被保険者期間開始日不整合(22, "対象計算期間（開始）　＜＝　被保険者期間（開始）としてください。"),
    対象計算期間被保険者期間終了日不整合(23, "被保険者期間（終了）　＜＝　対象計算期間（終了）としてください。"),
    窓口払開始日終了日不整合(24, "支払期間開始年月日　＜＝　支払期間終了年月日　としてください。"),
    対象年計算期間開始不整合(25, "対象年度と対象計算期間（開始）は同年としてください。"),
    時間不整合(26, "時間として正しい値を入力してください。"),
    窓口払支払場所不整合(27, "窓口払対象判定コードが設定されている時は、支払場所を設定してください。"),
    窓口払支払開始日不整合(28, "窓口払対象判定コードが設定されている時は、支払期間開始年月日を設定してください。"),
    窓口払支払終了日不整合(29, "窓口払対象判定コードが設定されている時は、支払期間終了年月日を設定してください。"),
    窓口払支払開始時間不整合(30, "窓口払対象判定コードが設定されている時は、支払期間開始年月日(開始時間)を設定してください。"),
    窓口払支払終了時間不整合(31, "窓口払対象判定コードが設定されている時は、支払期間終了年月日(終了時間)を設定してください。"),
    高額合算自己負担額関連１(32, "自己負担額が0円の時は、うち70～74歳の者に係る負担額は0円としてください。"),
    高額合算自己負担額関連２(33, "自己負担額が0円の時は、高額介護(予防)サービス費は0円としてください。"),
    うち70_74歳に係る負担額関連１(34, "当年度で75歳以上となる時は、うち70～74歳の者に係る負担額は全て0円としてください。"),
    うち70_74歳に係る負担額関連２(35, "該当月時点で70～74歳の時は、うち70～74歳の者に係る負担額に値を設定してください。"),
    給付実績組み合わせ不正(36, "給付実績の組み合わせが不正です。：?"),
    受給者登録なし(37, "受給者として登録されていないため、この処理はできません。"),
    うち70_74歳に係る負担額関連３(38, "自己負担額と70～74歳の者に係る負担額は、同じ値にしてください。"),
    支給決定情報補正判定Msg1(39, "指定対象年度の給付実績情報が存在しないため、処理できません。<br>新規登録する場合は、給付実績取込後に行ってください。"),
    支給決定情報補正判定Msg2(40, "この高額合算支給決定情報に対する給付実績情報が存在しません。<br>口座修正処理となります。"
            + "<br>（口座情報以外を修正する場合は給付実績取込後に行ってください）"),
    支給決定情報補正判定Msg3(41, "この高額合算支給決定情報に対する給付実績情報が存在しません。<br>照会処理となります。"
            + "<br>（削除する場合は給付実績取込後に行ってください）"),
    支給決定情報補正判定Msg4(42, "指定対象年度の計算結果連絡票情報が存在しないため、処理できません。"
            + "<br>新規登録する場合は、計算結果連絡票情報取込後に行ってください。"),
    支給決定情報補正判定Msg5(43, "この高額合算支給決定情報に対する計算結果連絡票情報が存在しません。<br>口座修正処理となります。"
            + "<br>（口座情報以外を修正する場合は計算結果連絡票情報取込後に行ってください）"),
    支給決定情報補正判定Msg6(44, "この高額合算支給決定情報に対する計算結果連絡票情報が存在しません。<br>照会処理となります。"
            + "<br>（削除する場合は計算結果連絡票情報取込後に行ってください）"),
    抽出期間不正(45, "今回開始日時には前回終了日時と同じかそれより前の日時を設定してください。"),
    年次判定未処理(46, "年次負担割合判定処理が未処理です。年次負担割合判定処理を行ってください。"),
    自己負担額確認情報取込前(47, "自己負担額確認情報取込前のため処理できません。"),
    支払開始日不正(48, "開始日は明日以降の日付を設定してください。"),
    支払終了日不正(49, "終了日は開始日の翌日以降を設定してください。"),
    帳票印刷不可(50, "?のため印刷できません。"),
    年次判定処理不可(51, "年次負担割合判定処理は、当初所得引出後に、該当年度分の処理が行えます。<br>対象は平成27年度以降です。"),
    確認情報受取年月不正(52, "入力が間違っています。"),
    サービス単位不正(53, "サービス単位小計が違います。"),
    区分支給限度額不正(54, "?行目の区分支給限度基準内単位の設定が間違っています。"),
    種類支給限度額不正(55, "?の種類限度内単位が種類支給限度基準単位を超えています。"),
    重複データサービス(56, "同事業者で同サービス・同単位データが既に登録されています。重複しての登録はできません。"),
    重複サービス(57, "同事業者で同サービスが既に登録されています。重複しての登録はできません。"),
    サービス種類不正(58, "指定サービス種類は選択できません。"),
    対象年月入力不正(59, "指定した年月時点での有効な二次予防者情報がありません。"),
    高額合算支給情報存在エラー(60, "指定されたし保険者番号＋対象年度データは存在しません。"),
    同月サービスなし世帯員(61, "同月サービスがない世帯員は選択できません。"),
    合計ボタン未押下(62, "合計ボタンを押してください。"),
    基準日被保険者データなし(63, "基準日時点で被保険者ではありません。"),
    基準日受給者_事業対象者データなし(64, "基準日時点で受給者または事業対象者ではありません。"),
    基準日負担割合変更なし(65, "基準日時点で負担割合の変更はありません。"),
    該当年度負担割合情報なし(66, "該当年度の負担割合情報がありません。"),
    適用期間_重複_空きエラー(67, "適用開始日と適用終了日の関係に不整合があります。適用期間の重複や空きがないことを確認してください。"),
    適用期間_年度エラー(68, "適用開始日と適用終了日の関係に不整合があります。適用期間が年度内であることを確認してください。"),
    郵便番号エラー(69, "郵便番号として正しい値を設定してください。"),
    給付実績_同一キーが３件以上(70, "同じキーのデータが3件以上存在します。：?"),
    給付実績_審査年月不正(71, "審査年月は2レコード中片方のみ空白でなければ処理できません。：?"),
    給付実績_給付実績情報作成区分不正(72, "給付実績情報作成区分の組み合わせが不正です。：?"),
    事業高額合算自己負担額関連１(73, "自己負担額が0円の時は、高額総合事業サービス費は0円としてください。"),
    事業高額合算自己負担額関連２(74, "自己負担額 >= 高額総合事業サービス費 としてください。"),
    高額合算自己負担額関連3(75, "自己負担額 >= 高額介護(予防)サービス費 としてください。"),
    負担割合判定_未抽出期間エラー(76, "前回終了年月日と今回開始年月日に抽出されない期間があります。"),
    支給申請書整理番号_不一致(77, "?と?の?が一致しません。"),
    事業者番号未入力(78, "事業者番号が入力されていません。"),
    事業者番号桁数不正(79, "事業者番号の桁数が不正です。"),
    受給者台帳_支給限度額情報不正(80, "受給者台帳から支給限度額情報が取得できません。：?"),
    自己作成_削除エラー(81, "全ての明細を削除することはできません。"),
    適用期間_重複_開始年月不正(82, "適用期間が重複しています。適用開始年月を確認してください。"),
    適用期間_標準額と不一致(83, "適用期間が不正です。標準額の適用開始年月以降の期間を設定してください。"),
    種類支給限度額_認定可能対象外(84, "入力された適用期間は種類支給限度額認定可能対象外です。"),
    種類支給限度額_サービス提供期間外(85, "入力された適用期間はサービス提供期間外です。"),
    種類支給限度額_要介護状態区分入力不可(86, "入力された適用期間は?を登録できません。値をクリアしてください。"),
    適用開始日_年月_変更(87, "計画適用開始日（年月）の変更はできません。<br>データ計画適用開始日：?"),
    居宅適用開始日終了日不整合(88, "計画適用開始日≦終了日になっていません。"),
    事業者サービス種類(89, "事業者コードが間違って入力されています。"),
    国保連アップロード対象ファイル不正(90, "アップロードの対象ファイルではありません。"),
    国保連データフォーマット不正(91, "データのフォーマットが違います。"),
    国保連レコード種別不正(92, "レコード種別が違います。"),
    国保連保険者番号不正(93, "保険者が違います。"),
    国保連ボリューム連番不正(94, "ボリューム通番が違います。"),
    高額対象者抽出処理中(95, "高額対象者抽出処理中のため更新できません。"),
    高額介護スケジュール変更複数不可(96, "処理状況の変更は月単位とし、<br>"
            + "複数月の状態を一括して変更することはできません。"),
    償還決定データなし(97, "対象の償還決定データが存在しません。"),
    年月範囲不正(98, "年月範囲は１年以内としてください。"),
    支払方法差止エラー(99, "支払方法変更処理において、支払一時差止の登録がされているため、支給決定通知書を発行することはできません。"),
    差額支給エラー(100, "支払方法変更処理において、滞納保険料への控除は登録されていますが、この償還支給申請書情報に反映されていないため、"
            + "支給決定通知書を発行することはできません。"),
    申立日エラー(101, "申立年月日はサービス提供年月以降を入力してください。"),
    同月審査申立理由整合性エラー(102, "「01 台帳誤りの過誤調整」については、同月審査として登録することはできません。"),
    再審査対象なしエラー(103, "再審査対象となるサービス種類がありません。"),
    再審査特定診療識別チェック１(104, "特定診療識別を選択してください。"),
    再審査特定診療識別チェック２(105, "この提供年月では、特定診療識別を選択できません。"),
    再審査サービス選択チェック(106, "特定診療識別は選択できません。"),
    高額合算支給不支給マスタデータなし(107, "対象の高額合算支給不支給マスタデータが存在しません。"),
    介護給付費単位数表標準マスタ項目数相違(108, "指定されたファイルは、介護給付費単位数表標準マスタファイルと項目数が違っています。"),
    振込指定日休日(109, "振込指定日が休日です。"),
    口座振込データ登録なし_再処理不可(110, "入力された振込指定日での口座振込データの登録がないため、再処理できません。"),
    口座振込データ登録なし_修正不可(111, "修正前の振込指定日で口座振込データの登録がありません。振込指定日を確認してください。"),
    高額対象者抽出初期チェック(112, "高額対象者抽出を行っておりません。"),
    うち70_74歳に係る負担額関連４(113, "該当月時点で70～74歳ではない時は、うち70～74歳の者に係る負担額は0円としてください。"),
    抽出期間不正１(114, "今回開始日時には前回終了日時と同じか、それより前の日時を設定してください。"),
    抽出期間不正２(115, "今回終了日時には今回開始日時以降の日時を設定してください。"),
    国保連連携スケジュール_新規設定不可(116, "直近の翌月ではないので、新規設定はできません。"),
    購入日の年月と提供_購入_年月の不一致(120, "購入日の年月と提供（購入）年月が不一致です。"),
    償還払い費支給申請決定_申請情報未入力(121, "未登録の申請情報があります。登録して下さい。"),
    サービス情報作成必要(118, "サービス情報が作成されていません。"
            + "<br>最低でも1件のサービス情報を作成する必要があります。"),
    負担限度額設定不正(122, "認定負担限度額がない場合は、9999を設定してください。"),
    受給者異動_制度改正チェック(123, "異動日が?制度改正日?です。?をクリアしてください。"),
    償還払い費支給申請決定_証明書情報未入力(124, "未登録のサービス提供証明書があります。登録して下さい。");
    private final Message message;

    /**
     * コンストラクタです。
     *
     * @param no 番号
     * @param message メッセージ
     */
    private DbcErrorMessages(int no, String message) {
        this.message = new ErrorMessage(toCode("DBCE", no), message);
    }

    @Override
    public Message getMessage() {
        return message;
    }

}
