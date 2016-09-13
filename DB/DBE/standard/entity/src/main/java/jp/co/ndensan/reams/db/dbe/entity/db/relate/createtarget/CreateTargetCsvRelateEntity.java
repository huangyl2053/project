/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.createtarget;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * センター送信CSVデータ出力のEntityです。
 *
 * @reamsid_L DBE-1680-010 zhangzhiming
 */
@Setter
@Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class CreateTargetCsvRelateEntity {

    private RString 申請書管理番号;
    private RString シーケンシャル番号;
    private RString 機能コード;
    private RString 識別コード;
    private RString 保険者番号;
    private RString 被保険者番号;
    private RString 認定申請日;
    private RString 枝番;
    private RString 申請区分法令コード;
    private RString 申請区分申請時コード;
    private RString 取下区分コード;
    private RString 被保険者区分コード;
    private RString 申請代行区分コード;
    private RString 生年月日;
    private RString 年齢;
    private RString 性別コード;
    private RString 被保険者ｶﾅ氏名;
    private RString 被保険者漢字氏名;
    private RString 郵便番号;
    private RString 住所;
    private RString 電話番号;
    private RString 病院施設等の名称;
    private RString 病院施設等の所在地;
    private RString 前回の認定審査会結果;
    private RString 前回の認定有効期間開始;
    private RString 前回の認定有効期間終了;
    private RString 主治医医療機関番号;
    private RString 主治医番号;
    private RString 意見書依頼日;
    private RString 意見書入手日;
    private RString 意見書短期記憶;
    private RString 意見書認知能力;
    private RString 意見書伝達能力;
    private RString 意見書食事行為;
    private RString 意見書認知症高齢者の日常生活自立度;
    private RString 調査依頼日;
    private RString 調査実施日;
    private RString 指定居宅介護支援事業者等番号;
    private RString 委託区分;
    private RString 認定調査員番号;
    private RString 認定調査員資格コード;
    private RString 一次判定日;
    private RString 一次判定結果;
    private RString 一次判定結果認知症加算;
    private RString 要介護認定等基準時間;
    private RString 要介護認定等基準時間食事;
    private RString 要介護認定等基準時間排泄;
    private RString 要介護認定等基準時間移動;
    private RString 要介護認定等基準時間清潔保持;
    private RString 要介護認定等基準時間間接ケア;
    private RString 要介護認定等基準時間BPSD関連;
    private RString 要介護認定等基準時間機能訓練;
    private RString 要介護認定等基準時間医療関連;
    private RString 要介護認定等基準時間認知症加算;
    private RString 中間評価項目得点第１群;
    private RString 中間評価項目得点第２群;
    private RString 中間評価項目得点第３群;
    private RString 中間評価項目得点第４群;
    private RString 中間評価項目得点第５群;
    private RString 一次判定警告配列コード;
    private RString 状態の安定性;
    private RString 認知症自立度Ⅱ以上の蓋然性;
    private RString 認知機能及び状態安定性から推定される給付区分;
    private RString 認定審査会資料作成日;
    private RString 認定審査会予定日;
    private RString 合議体番号;
    private RString 審査会資料番号;
    private RString 二次判定日;
    private RString 二次判定結果;
    private RString 認定有効期間開始;
    private RString 認定有効期間終了;
    private RString 特定疾病コード;
    private RString 要介護１の場合の状態像;
    private RString 現在のサービス区分コード;
    private RString 現在の状況;
    private RString 訪問介護ホームヘルプサービス;
    private RString 訪問入浴介護;
    private RString 訪問看護;
    private RString 訪問リハビリテーション;
    private RString 居宅療養管理指導;
    private RString 通所介護デイサービス;
    private RString 通所リハビリテーション;
    private RString 短期入所生活介護ショートステイ;
    private RString 短期入所療養介護;
    private RString 特定施設入居者生活介護;
    private RString 福祉用具貸与;
    private RString 特定福祉用具販売;
    private RString 住宅改修介護給付;
    private RString 夜間対応型訪問介護;
    private RString 認知症対応型通所介護;
    private RString 小規模多機能型居宅介護;
    private RString 認知症対応型共同生活介護グループホーム;
    private RString 地域密着型特定施設入居者生活介護;
    private RString 地域密着型介護老人福祉施設入所者生活介護;
    private RString 定期巡回随時対応型訪問介護看護;
    private RString 複合型サービス;
    private RString 介護予防訪問介護ホームヘルプサービス;
    private RString 介護予防訪問入浴介護;
    private RString 介護予防訪問看護;
    private RString 介護予防訪問リハビリテーション;
    private RString 介護予防居宅療養管理指導;
    private RString 介護予防通所介護デイサービス;
    private RString 介護予防短期入所生活介護ショートステイ;
    private RString 介護予防通所リハビリテーション;
    private RString 介護予防短期入所療養介護;
    private RString 介護予防特定施設入居者生活介護;
    private RString 介護予防福祉用具貸与;
    private RString 特定介護予防福祉用具販売;
    private RString 住宅改修予防給付;
    private RString 介護予防認知症対応型通所介護;
    private RString 介護予防小規模多機能型居宅介護;
    private RString 介護予防認知症対応型共同生活介護グループホーム;
    private RString 麻痺左上肢;
    private RString 麻痺右上肢;
    private RString 麻痺左下肢;
    private RString 麻痺右下肢;
    private RString 麻痺その他;
    private RString 拘縮肩関節;
    private RString 拘縮股関節;
    private RString 拘縮膝関節;
    private RString 拘縮その他;
    private RString 寝返り;
    private RString 起き上がり;
    private RString 座位保持;
    private RString 両足での立位;
    private RString 歩行;
    private RString 立ち上がり;
    private RString 片足での立位;
    private RString 洗身;
    private RString つめ切り;
    private RString 視力;
    private RString 聴力;
    private RString 移乗;
    private RString 移動;
    private RString えん下;
    private RString 食事摂取;
    private RString 排尿;
    private RString 排便;
    private RString 口腔清潔;
    private RString 洗顔;
    private RString 整髪;
    private RString 上衣の着脱;
    private RString ズボン等の着脱;
    private RString 外出頻度;
    private RString 意思の伝達;
    private RString 毎日の日課を理解;
    private RString 生年月日をいう;
    private RString 短期記憶;
    private RString 自分の名前をいう;
    private RString 今の季節を理解;
    private RString 場所の理解;
    private RString 徘徊;
    private RString 外出して戻れない;
    private RString 被害的;
    private RString 作話;
    private RString 感情が不安定;
    private RString 昼夜逆転;
    private RString 同じ話をする;
    private RString 大声を出す;
    private RString 介護に抵抗;
    private RString 落ち着きなし;
    private RString 一人で出たがる;
    private RString 収集癖;
    private RString 物や衣類を壊す;
    private RString ひどい物忘れ;
    private RString 独り言独り笑い;
    private RString 自分勝手に行動する;
    private RString 話がまとまらない;
    private RString 薬の内服;
    private RString 金銭の管理;
    private RString 日常の意思決定;
    private RString 集団への不適応;
    private RString 買い物;
    private RString 簡単な調理;
    private RString 点滴の管理;
    private RString 中心静脈栄養;
    private RString 透析;
    private RString ストーマの処置;
    private RString 酸素療法;
    private RString レスピレーター;
    private RString 気管切開の処置;
    private RString 疼痛の看護;
    private RString 経管栄養;
    private RString モニター測定;
    private RString じょくそうの処置;
    private RString カテーテル;
    private RString 障害高齢者自立度;
    private RString 認知症高齢者自立度;
    private RString 前回結果_麻痺左上肢;
    private RString 前回結果_麻痺右上肢;
    private RString 前回結果_麻痺左下肢;
    private RString 前回結果_麻痺右下肢;
    private RString 前回結果_麻痺その他;
    private RString 前回結果_拘縮肩関節;
    private RString 前回結果_拘縮股関節;
    private RString 前回結果_拘縮膝関節;
    private RString 前回結果_拘縮その他;
    private RString 前回結果_寝返り;
    private RString 前回結果_起き上がり;
    private RString 前回結果_座位保持;
    private RString 前回結果_両足での立位;
    private RString 前回結果_歩行;
    private RString 前回結果_立ち上がり;
    private RString 前回結果_片足での立位;
    private RString 前回結果_洗身;
    private RString 前回結果_つめ切り;
    private RString 前回結果_視力;
    private RString 前回結果_聴力;
    private RString 前回結果_移乗;
    private RString 前回結果_移動;
    private RString 前回結果_えん下;
    private RString 前回結果_食事摂取;
    private RString 前回結果_排尿;
    private RString 前回結果_排便;
    private RString 前回結果_口腔清潔;
    private RString 前回結果_洗顔;
    private RString 前回結果_整髪;
    private RString 前回結果_上衣の着脱;
    private RString 前回結果_ズボン等の着脱;
    private RString 前回結果_外出頻度;
    private RString 前回結果_意思の伝達;
    private RString 前回結果_毎日の日課を理解;
    private RString 前回結果_生年月日をいう;
    private RString 前回結果_短期記憶;
    private RString 前回結果_自分の名前をいう;
    private RString 前回結果_今の季節を理解;
    private RString 前回結果_場所の理解;
    private RString 前回結果_徘徊;
    private RString 前回結果_外出して戻れない;
    private RString 前回結果_被害的;
    private RString 前回結果_作話;
    private RString 前回結果_感情が不安定;
    private RString 前回結果_昼夜逆転;
    private RString 前回結果_同じ話をする;
    private RString 前回結果_大声を出す;
    private RString 前回結果_介護に抵抗;
    private RString 前回結果_落ち着きなし;
    private RString 前回結果_一人で出たがる;
    private RString 前回結果_収集癖;
    private RString 前回結果_物や衣類を壊す;
    private RString 前回結果_ひどい物忘れ;
    private RString 前回結果_独り言独り笑い;
    private RString 前回結果_自分勝手に行動する;
    private RString 前回結果_話がまとまらない;
    private RString 前回結果_薬の内服;
    private RString 前回結果_金銭の管理;
    private RString 前回結果_日常の意思決定;
    private RString 前回結果_集団への不適応;
    private RString 前回結果_買い物;
    private RString 前回結果_簡単な調理;
    private RString 前回結果_点滴の管理;
    private RString 前回結果_中心静脈栄養;
    private RString 前回結果_透析;
    private RString 前回結果_ストーマの処置;
    private RString 前回結果_酸素療法;
    private RString 前回結果_レスピレーター;
    private RString 前回結果_気管切開の処置;
    private RString 前回結果_疼痛の看護;
    private RString 前回結果_経管栄養;
    private RString 前回結果_モニター測定;
    private RString 前回結果_じょくそうの処置;
    private RString 前回結果_カテーテル;
    private RString 前回結果_障害高齢者自立度;
    private RString 前回結果_認知症高齢者自立度;
    private RString 前回結果_一次判定結果;
    private RString 前回結果_一次判定結果認知症加算;
    private RString 前回結果_要介護認定等基準時間;
    private RString 前回結果_要介護認定等基準時間食事;
    private RString 前回結果_要介護認定等基準時間排泄;
    private RString 前回結果_要介護認定等基準時間移動;
    private RString 前回結果_要介護認定等基準時間清潔保持;
    private RString 前回結果_要介護認定等基準時間間接ケア;
    private RString 前回結果_要介護認定等基準時間BPSD_関連;
    private RString 前回結果_要介護認定等基準時間機能訓練;
    private RString 前回結果_要介護認定等基準時間医療関連;
    private RString 前回結果_要介護認定等基準時間認知症加算;
    private RString 前回結果_中間評価項目得点_第１群;
    private RString 前回結果_中間評価項目得点_第２群;
    private RString 前回結果_中間評価項目得点_第３群;
    private RString 前回結果_中間評価項目得点_第４群;
    private RString 前回結果_中間評価項目得点_第５群;
    private RString 前回結果_一次判定警告コード;
    private RString 前回結果_状態の安定性;
    private RString 前回結果_認知症自立度Ⅱ以上の蓋然性;
    private RString 前回結果_認知機能及び状態安定性から推定される給付区分;
    private RString 前回結果_申請日;
    private RString 前回結果_二次判定日;
    private RString 前回結果_現在のサービス区分コード;
    private RString 前回結果_現在の状況;
    private RString 前回結果_訪問介護ホームヘルプサービス;
    private RString 前回結果_訪問入浴介護;
    private RString 前回結果_訪問看護;
    private RString 前回結果_訪問リハビリテーション;
    private RString 前回結果_居宅療養管理指導;
    private RString 前回結果_通所介護デイサービス;
    private RString 前回結果_通所リハビリテーション;
    private RString 前回結果_短期入所生活介護ショートステイ;
    private RString 前回結果_短期入所療養介護;
    private RString 前回結果_特定施設入居者生活介護;
    private RString 前回結果_福祉用具貸与;
    private RString 前回結果_特定福祉用具販売;
    private RString 前回結果_住宅改修介護給付;
    private RString 前回結果_夜間対応型訪問介護;
    private RString 前回結果_認知症対応型通所介護;
    private RString 前回結果_小規模多機能型居宅介護;
    private RString 前回結果_認知症対応型共同生活介護グループホーム;
    private RString 前回結果_地域密着型特定施設入居者生活介護;
    private RString 前回結果_地域密着型介護老人福祉施設入所者生活介護;
    private RString 前回結果_定期巡回随時対応型訪問介護看護;
    private RString 前回結果_複合型サービス;
    private RString 前回結果_介護予防訪問介護ホームヘルプサービス;
    private RString 前回結果_介護予防訪問入浴介護;
    private RString 前回結果_介護予防訪問看護;
    private RString 前回結果_介護予防訪問リハビリテーション;
    private RString 前回結果_介護予防居宅療養管理指導;
    private RString 前回結果_介護予防通所介護デイサービス;
    private RString 前回結果_介護予防通所リハビリテーション;
    private RString 前回結果_介護予防短期入所生活介護ショートステイ;
    private RString 前回結果_介護予防短期入所療養介護;
    private RString 前回結果_介護予防特定施設入居者生活介護;
    private RString 前回結果_介護予防福祉用具貸与;
    private RString 前回結果_特定介護予防福祉用具販売;
    private RString 前回結果_住宅改修予防給付;
    private RString 前回結果_介護予防認知症対応型通所介護;
    private RString 前回結果_介護予防小規模多機能型居宅介護;
    private RString 前回結果_介護予防認知症対応型共同生活介護グループホーム;
    private RString 前回識別コード;
    private RString 認定審査会意見等;
}