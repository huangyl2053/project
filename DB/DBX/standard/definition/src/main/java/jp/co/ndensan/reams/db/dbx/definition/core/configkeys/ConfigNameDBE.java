/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.definition.core.configkeys;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * コンフィグ名称(DBE)を表す列挙型です。
 *
 * @reamsid_L DBX-9999-021 sunhaidi
 */
public enum ConfigNameDBE {

    /**
     * 一次判定IF文字コード
     */
    一次判定IF文字コード("一次判定IF文字コード"),
    /**
     * 要支援認定結果
     */
    要支援認定結果("要支援認定結果"),
    /**
     * 認定調査期限設定方法
     */
    認定調査期限設定方法("認定調査期限設定方法"),
    /**
     * 調査票提出期限
     */
    調査票提出期限("調査票提出期限"),
    /**
     * 認定調査期限日数
     */
    認定調査期限日数("認定調査期限日数"),
    /**
     * 合議体最大委員数
     */
    合議体最大委員数("合議体最大委員数"),
    /**
     * 主治医意見書督促期限日数
     */
    主治医意見書督促期限日数("主治医意見書督促期限日数"),
    /**
     * 主治医意見書作成期限設定方法
     */
    主治医意見書作成期限設定方法("主治医意見書作成期限設定方法"),
    /**
     * 主治医意見書作成期限日数
     */
    主治医意見書作成期限日数("主治医意見書作成期限日数"),
    /**
     * 調査スケジュール時間枠1
     */
    調査スケジュール時間枠1("調査スケジュール時間枠1"),
    /**
     * 調査スケジュール時間枠2
     */
    調査スケジュール時間枠2("調査スケジュール時間枠2"),
    /**
     * 調査スケジュール時間枠3
     */
    調査スケジュール時間枠3("調査スケジュール時間枠3"),
    /**
     * 調査スケジュール時間枠4
     */
    調査スケジュール時間枠4("調査スケジュール時間枠4"),
    /**
     * 調査スケジュール時間枠5
     */
    調査スケジュール時間枠5("調査スケジュール時間枠5"),
    /**
     * 調査スケジュール時間枠6
     */
    調査スケジュール時間枠6("調査スケジュール時間枠6"),
    /**
     * 調査スケジュール時間枠7
     */
    調査スケジュール時間枠7("調査スケジュール時間枠7"),
    /**
     * 調査スケジュール時間枠8
     */
    調査スケジュール時間枠8("調査スケジュール時間枠8"),
    /**
     * 調査スケジュール時間枠9
     */
    調査スケジュール時間枠9("調査スケジュール時間枠9"),
    /**
     * 調査スケジュール時間枠10
     */
    調査スケジュール時間枠10("調査スケジュール時間枠10"),
    /**
     * 調査スケジュール最大時間枠
     */
    調査スケジュール最大時間枠("調査スケジュール最大時間枠"),
    /**
     * 審査会スケジュール時間枠1
     */
    審査会スケジュール時間枠1("審査会スケジュール時間枠1"),
    /**
     * 審査会スケジュール時間枠2
     */
    審査会スケジュール時間枠2("審査会スケジュール時間枠2"),
    /**
     * 審査会スケジュール時間枠3
     */
    審査会スケジュール時間枠3("審査会スケジュール時間枠3"),
    /**
     * 審査会スケジュール時間枠4
     */
    審査会スケジュール時間枠4("審査会スケジュール時間枠4"),
    /**
     * 審査会スケジュール時間枠5
     */
    審査会スケジュール時間枠5("審査会スケジュール時間枠5"),
    /**
     * 審査会スケジュール時間枠6
     */
    審査会スケジュール時間枠6("審査会スケジュール時間枠6"),
    /**
     * 審査会スケジュール時間枠7
     */
    審査会スケジュール時間枠7("審査会スケジュール時間枠7"),
    /**
     * 審査会スケジュール時間枠8
     */
    審査会スケジュール時間枠8("審査会スケジュール時間枠8"),
    /**
     * 審査会スケジュール時間枠9
     */
    審査会スケジュール時間枠9("審査会スケジュール時間枠9"),
    /**
     * 審査会スケジュール時間枠10
     */
    審査会スケジュール時間枠10("審査会スケジュール時間枠10"),
    /**
     * 審査会開催最大数
     */
    審査会開催最大数("審査会開催最大数"),
    /**
     * データ出力件数閾値
     */
    データ出力件数閾値("データ出力件数閾値"),
    /**
     * 認定調査前回結果表示
     */
    認定調査前回結果表示("認定調査前回結果表示"),
    /**
     * コード:無し 名称:概況調査テキストイメージ区分 略称:定義なし
     */
    概況調査テキストイメージ区分("概況調査テキストイメージ区分"),
    /**
     * コード:無し 名称:認定支援センター送信ファイル名 略称:定義なし
     */
    認定支援センター送信ファイル名("認定支援センター送信ファイル名"),
    /**
     * 主治医意見書作成依頼書_宛先敬称
     */
    主治医意見書作成依頼書_宛先敬称("主治医意見書作成依頼書_宛先敬称"),
    /**
     * 認定調査票_基本調査_用紙タイプ
     */
    認定調査票_基本調査_用紙タイプ("認定調査票_基本調査_用紙タイプ"),
    /**
     * 認定調査票_基本調査_印刷タイプ
     */
    認定調査票_基本調査_印刷タイプ("認定調査票_基本調査_印刷タイプ"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目1
     */
    認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目1("認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目1"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目2
     */
    認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目2("認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目2"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目3
     */
    認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目3("認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目3"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー両面1
     */
    認定調査票_基本調査_印刷フォーム白紙カラー両面1("認定調査票_基本調査_印刷フォーム白紙カラー両面1"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー両面2
     */
    認定調査票_基本調査_印刷フォーム白紙カラー両面2("認定調査票_基本調査_印刷フォーム白紙カラー両面2"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー両面3
     */
    認定調査票_基本調査_印刷フォーム白紙カラー両面3("認定調査票_基本調査_印刷フォーム白紙カラー両面3"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート片面1枚目1
     */
    認定調査票_基本調査_印刷フォームデザインシート片面1枚目1("認定調査票_基本調査_印刷フォームデザインシート片面1枚目1"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート片面1枚目2
     */
    認定調査票_基本調査_印刷フォームデザインシート片面1枚目2("認定調査票_基本調査_印刷フォームデザインシート片面1枚目2"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート片面1枚目3
     */
    認定調査票_基本調査_印刷フォームデザインシート片面1枚目3("認定調査票_基本調査_印刷フォームデザインシート片面1枚目3"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート両面1
     */
    認定調査票_基本調査_印刷フォームデザインシート両面1("認定調査票_基本調査_印刷フォームデザインシート両面1"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート両面2
     */
    認定調査票_基本調査_印刷フォームデザインシート両面2("認定調査票_基本調査_印刷フォームデザインシート両面2"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート両面3
     */
    認定調査票_基本調査_印刷フォームデザインシート両面3("認定調査票_基本調査_印刷フォームデザインシート両面3"),
    /**
     * 認定調査票_特記事項_用紙タイプ
     */
    認定調査票_特記事項_用紙タイプ("認定調査票_特記事項_用紙タイプ"),
    /**
     * 認定調査票_特記事項_印刷タイプ
     */
    認定調査票_特記事項_印刷タイプ("認定調査票_特記事項_印刷タイプ"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙カラー片面1
     */
    認定調査票_特記事項_印刷フォーム白紙カラー片面1("認定調査票_特記事項_印刷フォーム白紙カラー片面1"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙カラー片面2
     */
    認定調査票_特記事項_印刷フォーム白紙カラー片面2("認定調査票_特記事項_印刷フォーム白紙カラー片面2"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙カラー片面3
     */
    認定調査票_特記事項_印刷フォーム白紙カラー片面3("認定調査票_特記事項_印刷フォーム白紙カラー片面3"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙モノクロ片面1
     */
    認定調査票_特記事項_印刷フォーム白紙モノクロ片面1("認定調査票_特記事項_印刷フォーム白紙モノクロ片面1"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙モノクロ片面2
     */
    認定調査票_特記事項_印刷フォーム白紙モノクロ片面2("認定調査票_特記事項_印刷フォーム白紙モノクロ片面2"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙モノクロ片面3
     */
    認定調査票_特記事項_印刷フォーム白紙モノクロ片面3("認定調査票_特記事項_印刷フォーム白紙モノクロ片面3"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自両面1
     */
    認定調査票_特記事項_印刷フォーム独自両面1("認定調査票_特記事項_印刷フォーム独自両面1"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自両面2
     */
    認定調査票_特記事項_印刷フォーム独自両面2("認定調査票_特記事項_印刷フォーム独自両面2"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自両面3
     */
    認定調査票_特記事項_印刷フォーム独自両面3("認定調査票_特記事項_印刷フォーム独自両面3"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自片面1
     */
    認定調査票_特記事項_印刷フォーム独自片面1("認定調査票_特記事項_印刷フォーム独自片面1"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自片面2
     */
    認定調査票_特記事項_印刷フォーム独自片面2("認定調査票_特記事項_印刷フォーム独自片面2"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自片面3
     */
    認定調査票_特記事項_印刷フォーム独自片面3("認定調査票_特記事項_印刷フォーム独自片面3"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート両面1
     */
    認定調査票_特記事項_印刷フォームデザインシート両面1("認定調査票_特記事項_印刷フォームデザインシート両面1"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート両面2
     */
    認定調査票_特記事項_印刷フォームデザインシート両面2("認定調査票_特記事項_印刷フォームデザインシート両面2"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート両面3
     */
    認定調査票_特記事項_印刷フォームデザインシート両面3("認定調査票_特記事項_印刷フォームデザインシート両面3"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート片面1
     */
    認定調査票_特記事項_印刷フォームデザインシート片面1("認定調査票_特記事項_印刷フォームデザインシート片面1"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート片面2
     */
    認定調査票_特記事項_印刷フォームデザインシート片面2("認定調査票_特記事項_印刷フォームデザインシート片面2"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート片面3
     */
    認定調査票_特記事項_印刷フォームデザインシート片面3("認定調査票_特記事項_印刷フォームデザインシート片面3"),
    /**
     * 認定調査票_概況調査_用紙タイプ
     */
    認定調査票_概況調査_用紙タイプ("認定調査票_概況調査_用紙タイプ"),
    /**
     * 認定調査票_概況調査_印刷タイプ
     */
    認定調査票_概況調査_印刷タイプ("認定調査票_概況調査_印刷タイプ"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目1
     */
    認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目1("認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目1"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目2
     */
    認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目2("認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目2"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目3
     */
    認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目3("認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目3"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー両面1
     */
    認定調査票_概況調査_印刷フォーム白紙カラー両面1("認定調査票_概況調査_印刷フォーム白紙カラー両面1"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー両面2
     */
    認定調査票_概況調査_印刷フォーム白紙カラー両面2("認定調査票_概況調査_印刷フォーム白紙カラー両面2"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー両面3
     */
    認定調査票_概況調査_印刷フォーム白紙カラー両面3("認定調査票_概況調査_印刷フォーム白紙カラー両面3"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート片面1枚目1
     */
    認定調査票_概況調査_印刷フォームデザインシート片面1枚目1("認定調査票_概況調査_印刷フォームデザインシート片面1枚目1"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート片面1枚目2
     */
    認定調査票_概況調査_印刷フォームデザインシート片面1枚目2("認定調査票_概況調査_印刷フォームデザインシート片面1枚目2"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート片面1枚目3
     */
    認定調査票_概況調査_印刷フォームデザインシート片面1枚目3("認定調査票_概況調査_印刷フォームデザインシート片面1枚目3"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート両面1
     */
    認定調査票_概況調査_印刷フォームデザインシート両面1("認定調査票_概況調査_印刷フォームデザインシート両面1"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート両面2
     */
    認定調査票_概況調査_印刷フォームデザインシート両面2("認定調査票_概況調査_印刷フォームデザインシート両面2"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート両面3
     */
    認定調査票_概況調査_印刷フォームデザインシート両面3("認定調査票_概況調査_印刷フォームデザインシート両面3"),
    /**
     * 認定調査票_特記事項フリー_用紙タイプ
     */
    認定調査票_特記事項フリー_用紙タイプ("認定調査票_特記事項フリー_用紙タイプ"),
    /**
     * 認定調査票_特記事項フリー_印刷タイプ
     */
    認定調査票_特記事項フリー_印刷タイプ("認定調査票_特記事項フリー_印刷タイプ"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙カラー片面1
     */
    認定調査票_特記事項フリー_印刷フォーム白紙カラー片面1("認定調査票_特記事項フリー_印刷フォーム白紙カラー片面1"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙カラー片面2
     */
    認定調査票_特記事項フリー_印刷フォーム白紙カラー片面2("認定調査票_特記事項フリー_印刷フォーム白紙カラー片面2"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙カラー片面3
     */
    認定調査票_特記事項フリー_印刷フォーム白紙カラー片面3("認定調査票_特記事項フリー_印刷フォーム白紙カラー片面3"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙カラー両面1
     */
    認定調査票_特記事項フリー_印刷フォーム白紙カラー両面1("認定調査票_特記事項フリー_印刷フォーム白紙カラー両面1"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙カラー両面2
     */
    認定調査票_特記事項フリー_印刷フォーム白紙カラー両面2("認定調査票_特記事項フリー_印刷フォーム白紙カラー両面2"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙カラー両面3
     */
    認定調査票_特記事項フリー_印刷フォーム白紙カラー両面3("認定調査票_特記事項フリー_印刷フォーム白紙カラー両面3"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面1
     */
    認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面1("認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面1"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面2
     */
    認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面2("認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面2"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面3
     */
    認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面3("認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面3"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面1
     */
    認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面1("認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面1"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面2
     */
    認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面2("認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面2"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面3
     */
    認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面3("認定調査票_特記事項フリー_印刷フォーム白紙モノクロ両面3"),
    /**
     * 意見書用紙タイプ
     */
    意見書用紙タイプ("意見書用紙タイプ"),
    /**
     * 意見書印刷タイプ
     */
    意見書印刷タイプ("意見書印刷タイプ"),
    /**
     * 意見書印刷フォームデザインシート片面1
     */
    意見書印刷フォームデザインシート片面1("意見書印刷フォームデザインシート片面1"),
    /**
     * 意見書印刷フォームデザインシート片面2
     */
    意見書印刷フォームデザインシート片面2("意見書印刷フォームデザインシート片面2"),
    /**
     * 意見書印刷フォームデザインシート片面3
     */
    意見書印刷フォームデザインシート片面3("意見書印刷フォームデザインシート片面3"),
    /**
     * 意見書印刷フォームデザインシート両面1
     */
    意見書印刷フォームデザインシート両面1("意見書印刷フォームデザインシート両面1"),
    /**
     * 意見書印刷フォームデザインシート両面2
     */
    意見書印刷フォームデザインシート両面2("意見書印刷フォームデザインシート両面2"),
    /**
     * 意見書印刷フォームデザインシート両面3
     */
    意見書印刷フォームデザインシート両面3("意見書印刷フォームデザインシート両面3"),
    /**
     * 意見書印刷フォーム白紙カラー片面1枚目1
     */
    意見書印刷フォーム白紙カラー片面1枚目1("意見書印刷フォーム白紙カラー片面1枚目1"),
    /**
     * 意見書印刷フォーム白紙カラー片面1枚目2
     */
    意見書印刷フォーム白紙カラー片面1枚目2("意見書印刷フォーム白紙カラー片面1枚目2"),
    /**
     * 意見書印刷フォーム白紙カラー片面1枚目3
     */
    意見書印刷フォーム白紙カラー片面1枚目3("意見書印刷フォーム白紙カラー片面1枚目3"),
    /**
     * 意見書印刷フォーム白紙カラー片面2枚目1
     */
    意見書印刷フォーム白紙カラー片面2枚目1("意見書印刷フォーム白紙カラー片面2枚目1"),
    /**
     * 意見書印刷フォーム白紙カラー片面2枚目2
     */
    意見書印刷フォーム白紙カラー片面2枚目2("意見書印刷フォーム白紙カラー片面2枚目2"),
    /**
     * 意見書印刷フォーム白紙カラー片面2枚目3
     */
    意見書印刷フォーム白紙カラー片面2枚目3("意見書印刷フォーム白紙カラー片面2枚目3"),
    /**
     * 意見書印刷フォーム白紙カラー両面1
     */
    意見書印刷フォーム白紙カラー両面1("意見書印刷フォーム白紙カラー両面1"),
    /**
     * 意見書印刷フォーム白紙カラー両面2
     */
    意見書印刷フォーム白紙カラー両面2("意見書印刷フォーム白紙カラー両面2"),
    /**
     * 意見書印刷フォーム白紙カラー両面3
     */
    意見書印刷フォーム白紙カラー両面3("意見書印刷フォーム白紙カラー両面3"),
    /**
     * 意見書印刷フォーム白紙モノクロ片面1枚目1
     */
    意見書印刷フォーム白紙モノクロ片面1枚目1("意見書印刷フォーム白紙モノクロ片面1枚目1"),
    /**
     * 意見書印刷フォーム白紙モノクロ片面1枚目2
     */
    意見書印刷フォーム白紙モノクロ片面1枚目2("意見書印刷フォーム白紙モノクロ片面1枚目2"),
    /**
     * 意見書印刷フォーム白紙モノクロ片面1枚目3
     */
    意見書印刷フォーム白紙モノクロ片面1枚目3("意見書印刷フォーム白紙モノクロ片面1枚目3"),
    /**
     * 意見書印刷フォーム白紙モノクロ片面2枚目1
     */
    意見書印刷フォーム白紙モノクロ片面2枚目1("意見書印刷フォーム白紙モノクロ片面2枚目1"),
    /**
     * 意見書印刷フォーム白紙モノクロ片面2枚目2
     */
    意見書印刷フォーム白紙モノクロ片面2枚目2("意見書印刷フォーム白紙モノクロ片面2枚目2"),
    /**
     * 意見書印刷フォーム白紙モノクロ片面2枚目3
     */
    意見書印刷フォーム白紙モノクロ片面2枚目3("意見書印刷フォーム白紙モノクロ片面2枚目3"),
    /**
     * 意見書印刷フォーム白紙モノクロ両面1
     */
    意見書印刷フォーム白紙モノクロ両面1("意見書印刷フォーム白紙モノクロ両面1"),
    /**
     * 意見書印刷フォーム白紙モノクロ両面2
     */
    意見書印刷フォーム白紙モノクロ両面2("意見書印刷フォーム白紙モノクロ両面2"),
    /**
     * 意見書印刷フォーム白紙モノクロ両面3
     */
    意見書印刷フォーム白紙モノクロ両面3("意見書印刷フォーム白紙モノクロ両面3"),
    /**
     * 認定調査票差異チェック票_印刷タイプ
     */
    認定調査票差異チェック票_印刷タイプ("認定調査票差異チェック票_印刷タイプ"),
    /**
     * 介護認定審査会スケジュール表鑑
     */
    介護認定審査会スケジュール表鑑("介護認定審査会スケジュール表鑑"),
    /**
     * 介護認定審査会スケジュール表鏡_宛先敬称
     */
    介護認定審査会スケジュール表鏡_宛先敬称("介護認定審査会スケジュール表鏡_宛先敬称"),
    /**
     * 認定調査督促状_宛先敬称
     */
    認定調査督促状_宛先敬称("認定調査督促状_宛先敬称"),
    /**
     * 要介護認定調査督促状
     */
    要介護認定調査督促状("要介護認定調査督促状"),
    /**
     * オブザーバーチェック
     */
    オブザーバーチェック("オブザーバーチェック"),
    /**
     * マスキングチェックタイミング
     */
    マスキングチェックタイミング("マスキングチェックタイミング"),
    /**
     * 県報告資料ファイル名称
     */
    県報告資料ファイル名称("県報告資料ファイル名称"),
    /**
     * 主治医意見書作成依頼書
     */
    主治医意見書作成依頼書("主治医意見書作成依頼書"),
    /**
     * 判定結果情報出力_広域連合名称
     */
    判定結果情報出力_広域連合名称("判定結果情報出力_広域連合名称"),
    /**
     * 認定調査依頼書
     */
    認定調査依頼書("認定調査依頼書"),
    /**
     * 認定調査依頼書_宛先敬称
     */
    認定調査依頼書_宛先敬称("認定調査依頼書_宛先敬称"),
    /**
     * 審査会結果OCR使用有無
     */
    審査会結果OCR使用有無("審査会結果OCR使用有無"),
    /**
     * モバイル審査会使用有無
     */
    モバイル審査会使用有無("モバイル審査会使用有無"),
    /**
     * モバイル調査使用有無
     */
    モバイル調査使用有無("モバイル調査使用有無"),
    /**
     * 調査入力用データ_モバイル_パス
     */
    調査入力用データ_モバイル_パス("調査入力用データ_モバイル_パス"),
    /**
     * 調査入力用データ_モバイル
     */
    調査入力用データ_モバイル("調査入力用データ_モバイル"),
    /**
     * 調査取込用データ_モバイル_パス
     */
    調査取込用データ_モバイル_パス("調査取込用データ_モバイル_パス"),
    /**
     * 調査取込用データ_モバイル
     */
    調査取込用データ_モバイル("調査取込用データ_モバイル"),
    /**
     * 認定調査自動割付
     */
    認定調査自動割付("認定調査自動割付"),
    /**
     * 総合事業開始区分
     */
    総合事業開始区分("総合事業開始区分"),
    /**
     * 介護認定審査会資料出力スタイル
     */
    介護認定審査会資料出力スタイル("介護認定審査会資料出力スタイル"),
    /**
     * 介護認定審査会資料印刷タイプ
     */
    介護認定審査会資料印刷タイプ("介護認定審査会資料印刷タイプ"),
    /**
     * 介護認定審査会資料部数_事務局
     */
    介護認定審査会資料部数_事務局("介護認定審査会資料部数_事務局"),
    /**
     * 介護認定審査会資料部数_委員
     */
    介護認定審査会資料部数_委員("介護認定審査会資料部数_委員"),
    /**
     * 介護認定審査会資料印刷帳票_事務局
     */
    介護認定審査会資料印刷帳票_事務局("介護認定審査会資料印刷帳票_事務局"),
    /**
     * 介護認定審査会資料印刷帳票_委員
     */
    介護認定審査会資料印刷帳票_委員("介護認定審査会資料印刷帳票_委員"),
    /**
     * 介護認定審査会資料概況特記一覧
     */
    介護認定審査会資料概況特記一覧("介護認定審査会資料概況特記一覧"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_審査会対象者一覧
     */
    介護認定審査会資料印刷帳票_事務局_審査会対象者一覧("介護認定審査会資料印刷帳票_事務局_審査会対象者一覧"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_審査会資料
     */
    介護認定審査会資料印刷帳票_事務局_審査会資料("介護認定審査会資料印刷帳票_事務局_審査会資料"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_特記事項
     */
    介護認定審査会資料印刷帳票_事務局_特記事項("介護認定審査会資料印刷帳票_事務局_特記事項"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_一次判定結果票
     */
    介護認定審査会資料印刷帳票_事務局_一次判定結果票("介護認定審査会資料印刷帳票_事務局_一次判定結果票"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_特記事項_一次判定結果票
     */
    介護認定審査会資料印刷帳票_事務局_特記事項_一次判定結果票("介護認定審査会資料印刷帳票_事務局_特記事項_一次判定結果票"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_主治医意見書
     */
    介護認定審査会資料印刷帳票_事務局_主治医意見書("介護認定審査会資料印刷帳票_事務局_主治医意見書"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_概況特記
     */
    介護認定審査会資料印刷帳票_事務局_概況特記("介護認定審査会資料印刷帳票_事務局_概況特記"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_予備判定記入表
     */
    介護認定審査会資料印刷帳票_事務局_予備判定記入表("介護認定審査会資料印刷帳票_事務局_予備判定記入表"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_概況特記一覧
     */
    介護認定審査会資料印刷帳票_事務局_概況特記一覧("介護認定審査会資料印刷帳票_事務局_概況特記一覧"),
    /**
     * 介護認定審査会資料印刷帳票_委員_開催通知書
     */
    介護認定審査会資料印刷帳票_委員_開催通知書("介護認定審査会資料印刷帳票_委員_開催通知書"),
    /**
     * 介護認定審査会資料印刷帳票_委員_審査会対象者一覧
     */
    介護認定審査会資料印刷帳票_委員_審査会対象者一覧("介護認定審査会資料印刷帳票_委員_審査会対象者一覧"),
    /**
     * 介護認定審査会資料印刷帳票_委員_審査会資料
     */
    介護認定審査会資料印刷帳票_委員_審査会資料("介護認定審査会資料印刷帳票_委員_審査会資料"),
    /**
     * 介護認定審査会資料印刷帳票_委員_特記事項
     */
    介護認定審査会資料印刷帳票_委員_特記事項("介護認定審査会資料印刷帳票_委員_特記事項"),
    /**
     * 介護認定審査会資料印刷帳票_委員_一次判定結果票
     */
    介護認定審査会資料印刷帳票_委員_一次判定結果票("介護認定審査会資料印刷帳票_委員_一次判定結果票"),
    /**
     * 介護認定審査会資料印刷帳票_委員_特記事項_一次判定結果票
     */
    介護認定審査会資料印刷帳票_委員_特記事項_一次判定結果票("介護認定審査会資料印刷帳票_委員_特記事項_一次判定結果票"),
    /**
     * 介護認定審査会資料印刷帳票_委員_主治医意見書
     */
    介護認定審査会資料印刷帳票_委員_主治医意見書("介護認定審査会資料印刷帳票_委員_主治医意見書"),
    /**
     * 介護認定審査会資料印刷帳票_委員_予備判定記入表
     */
    介護認定審査会資料印刷帳票_委員_予備判定記入表("介護認定審査会資料印刷帳票_委員_予備判定記入表"),
    /**
     * 介護認定審査会資料印刷帳票_事務局_その他資料
     */
    介護認定審査会資料印刷帳票_事務局_その他資料("介護認定審査会資料印刷帳票_事務局_その他資料"),
    /**
     * 介護認定審査会資料印刷帳票_委員_その他資料
     */
    介護認定審査会資料印刷帳票_委員_その他資料("介護認定審査会資料印刷帳票_委員_その他資料"),
    /**
     * 審査結果取込用データ_モバイル_パス
     */
    審査結果取込用データ_モバイル_パス("審査結果取込用データ_モバイル_パス"),
    /**
     * 審査結果取込用データ_モバイル
     */
    審査結果取込用データ_モバイル("審査結果取込用データ_モバイル"),
    /**
     * 介護認定審査判定結果_鑑
     */
    介護認定審査判定結果_鑑("介護認定審査判定結果_鑑"),
    /**
     * 広域連合名称
     */
    広域連合名称("広域連合名称"),
    /**
     * 介護保険診断命令書
     */
    介護保険診断命令書("介護保険診断命令書"),
    /**
     * 介護認定審査会資料出力順
     */
    介護認定審査会資料出力順("介護認定審査会資料出力順"),
    /**
     * 要介護・要支援認定結果の情報提供について
     */
    要介護認定結果情報提供票_主治医("要介護認定結果情報提供票_主治医"),
    /**
     * Reamsへの切り替え日
     */
    Reamsへの切り替え日("Reamsへの切り替え日"),
    /**
     * 主治医意見書作成報酬支払通知書
     */
    主治医意見書作成報酬支払通知書("主治医意見書作成報酬支払通知書"),
    /**
     * 認定調査報酬支払通知書
     */
    認定調査報酬支払通知書("認定調査報酬支払通知書"),
    /**
     * 主治医意見書作成報酬請求書
     */
    主治医意見書作成報酬請求書("主治医意見書作成報酬請求書"),
    /**
     * 主治医意見書作成報酬支払明細書
     */
    主治医意見書作成報酬支払明細書("主治医意見書作成報酬支払明細書"),
    /**
     * 主治医意見書作成料支払内訳確認書
     */
    主治医意見書作成料支払内訳確認書("主治医意見書作成料支払内訳確認書"),
    /**
     * 介護認定審査会開催のお知らせ
     */
    介護認定審査会開催のお知らせ("介護認定審査会開催のお知らせ"),
    /**
     * 特記事項符号印刷有無
     */
    特記事項符号印刷有無("特記事項符号印刷有無"),
    /**
     * 認定調査情報票
     */
    認定調査情報票("認定調査情報票"),
    /**
     * 認定調査前回結果印刷有無
     */
    認定調査前回結果印刷有無("認定調査前回結果印刷有無"),
    /**
     * 情報提供資料の特記事項イメージパターン
     */
    特記事項イメージ("情報提供資料の特記事項イメージパターン"),
    /**
     * 情報提供資料の特記事項イメージパターン
     */
    特記事項編集("情報提供資料の特記事項編集パターン"),
    /**
     * 前回との結果比較印刷有無
     */
    前回との結果比較印刷有無("前回との結果比較印刷有無"),
    /**
     * 今回基本調査項目結果の正常選択肢印刷有無
     */
    今回基本調査項目結果の正常選択肢印刷有無("今回基本調査項目結果の正常選択肢印刷有無"),
    /**
     * 今回前回比較で変化有で前回正常選択肢表示印刷有無
     */
    今回前回比較で変化有で前回正常選択肢表示印刷有無("今回前回比較で変化有で前回正常選択肢表示印刷有無"),
    /**
     * 認定調査と主治医意見書の結果比較印刷有無
     */
    認定調査と主治医意見書の結果比較印刷有無("認定調査と主治医意見書の結果比較印刷有無"),
    /**
     * 介護保険診断命令書_宛先敬称
     */
    介護保険診断命令書_宛先敬称("介護保険診断命令書_宛先敬称"),
    /**
     * 要介護認定結果情報提供票_主治医__宛先敬称
     */
    要介護認定結果情報提供票_主治医__宛先敬称("要介護認定結果情報提供票_主治医__宛先敬称"),
    /**
     * 主治医意見書報酬基準日
     */
    主治医意見書報酬基準日("主治医意見書報酬基準日"),
    /**
     * 介護認定審査会委員報酬支払明細書
     */
    介護認定審査会委員報酬支払明細書("介護認定審査会委員報酬支払明細書"),
    /**
     * 認定調査報酬支払通知書_宛先敬称
     */
    認定調査報酬支払通知書_宛先敬称("認定調査報酬支払通知書_宛先敬称"),
    /**
     * 審査会意見12
     */
    審査会意見12("審査会意見12"),
    /**
     * 審査会意見24
     */
    審査会意見24("審査会意見24"),
    /**
     * 更新申請有効期間
     */
    更新申請有効期間("更新申請有効期間"),
    /**
     * 新規申請有効期間
     */
    新規申請有効期間("新規申請有効期間"),
    /**
     * 区分変更申請有効期間
     */
    区分変更申請有効期間("区分変更申請有効期間"),
    /**
     * 要介護認定申請連携データ取込みファイル名
     */
    要介護認定申請連携データ取込みファイル名("要介護認定申請連携データ取込みファイル名"),
    /**
     * 認定調査委託先データ取込みファイル名
     */
    認定調査委託先データ取込みファイル名("認定調査委託先データ取込みファイル名"),
    /**
     * 認定調査員データ取込みファイル名
     */
    認定調査員データ取込みファイル名("認定調査員データ取込みファイル名"),
    /**
     * 主治医医療機関データ取込みファイル名
     */
    主治医医療機関データ取込みファイル名("主治医医療機関データ取込みファイル名"),
    /**
     * 主治医データ取込みファイル名
     */
    主治医データ取込みファイル名("主治医データ取込みファイル名"),
    /**
     * 認定申請IF種類
     */
    認定申請IF種類("認定申請IF種類"),
    /**
     * マスタIF種類
     */
    マスタIF種類("4マスタIF種類"),
    /**
     * 認定ソフト一次判定用データ送信ファイル名09B
     */
    認定ソフト一次判定用データ送信ファイル名09B("認定ソフト一次判定用データ送信ファイル名09B"),
    /**
     * 日次進捗データ送信ファイル名新
     */
    日次進捗データ送信ファイル名新("日次進捗データ送信ファイル名（新）"),
    /**
     * 要介護認定結果連携データ送信ファイル名新
     */
    要介護認定結果連携データ送信ファイル名新("要介護認定結果連携データ送信ファイル名（新）"),
    /**
     * 連携文字コード
     */
    連携文字コード("連携文字コード"),
    /**
     * 認定調査報酬支払明細書
     */
    認定調査報酬支払明細書("認定調査報酬支払明細書"),
    /**
     * 主治医意見書作成報酬支払通知書_宛先敬称
     */
    主治医意見書作成報酬支払通知書_宛先敬称("主治医意見書作成報酬支払通知書_宛先敬称"),
    /**
     * 主治医意見書作成料支払内訳確認_宛先敬称
     */
    主治医意見書作成料支払内訳確認_宛先敬称("主治医意見書作成料支払内訳確認_宛先敬称"),
    /**
     * 介護認定審査会委員報酬支払通知書_宛先敬称
     */
    介護認定審査会委員報酬支払通知書_宛先敬称("介護認定審査会委員報酬支払通知書_宛先敬称"),
    /**
     * 介護認定審査会委員報酬支払通知書
     */
    介護認定審査会委員報酬支払通知書("介護認定審査会委員報酬支払通知書"),
    /**
     * 認定申請連携データ出力先
     */
    認定申請連携データ出力先("認定申請連携データ出力先"),
    /**
     * NCI201ファイル名称
     */
    NCI201ファイル名称("NCI201ファイル名称"),
    /**
     * NCI101ファイル名称
     */
    NCI101ファイル名称("NCI101ファイル名称"),
    /**
     * NCI111ファイル名称
     */
    NCI111ファイル名称("NCI111ファイル名称"),
    /**
     * NCI121ファイル名称
     */
    NCI121ファイル名称("NCI121ファイル名称"),
    /**
     * NCI131ファイル名称
     */
    NCI131ファイル名称("NCI131ファイル名称"),
    /**
     * 主治医意見書作成依頼_手動_意見書作成依頼書
     */
    主治医意見書作成依頼_手動_意見書作成依頼書("主治医意見書作成依頼_手動_意見書作成依頼書"),
    /**
     * 主治医意見書作成依頼_手動_意見書作成依頼一覧表
     */
    主治医意見書作成依頼_手動_意見書作成依頼一覧表("主治医意見書作成依頼_手動_意見書作成依頼一覧表"),
    /**
     * 主治医意見書作成依頼_手動_依頼書発行履歴一覧表
     */
    主治医意見書作成依頼_手動_依頼書発行履歴一覧表("主治医意見書作成依頼_手動_依頼書発行履歴一覧表"),
    /**
     * 主治医意見書作成依頼_手動_主治医意見書記入用紙
     */
    主治医意見書作成依頼_手動_主治医意見書記入用紙("主治医意見書作成依頼_手動_主治医意見書記入用紙"),
    /**
     * 主治医意見書作成依頼_手動_主治医意見書記入用紙OCR
     */
    主治医意見書作成依頼_手動_主治医意見書記入用紙OCR("主治医意見書作成依頼_手動_主治医意見書記入用紙OCR"),
    /**
     * 主治医意見書作成依頼_手動_主治医意見書作成料請求書
     */
    主治医意見書作成依頼_手動_主治医意見書作成料請求書("主治医意見書作成依頼_手動_主治医意見書作成料請求書"),
    /**
     * 主治医意見書作成依頼_手動_介護保険診断命令書
     */
    主治医意見書作成依頼_手動_介護保険診断命令書("主治医意見書作成依頼_手動_介護保険診断命令書"),
    /**
     * 主治医意見書作成依頼_手動_介護保険指定医依頼兼主治医意見書提出意見書
     */
    主治医意見書作成依頼_手動_介護保険指定医依頼兼主治医意見書提出意見書("主治医意見書作成依頼_手動_介護保険指定医依頼兼主治医意見書提出意見書"),
    /**
     * 認定調査依頼_手動_認定調査依頼書
     */
    認定調査依頼_手動_認定調査依頼書("認定調査依頼_手動_認定調査依頼書"),
    /**
     * 認定調査依頼_手動_認定調査票_概況調査
     */
    認定調査依頼_手動_認定調査票_概況調査("認定調査依頼_手動_認定調査票_概況調査"),
    /**
     * 認定調査依頼_手動_認定調査票_基本調査
     */
    認定調査依頼_手動_認定調査票_基本調査("認定調査依頼_手動_認定調査票_基本調査"),
    /**
     * 認定調査依頼_手動_認定調査票_特記事項
     */
    認定調査依頼_手動_認定調査票_特記事項("認定調査依頼_手動_認定調査票_特記事項"),
    /**
     * 認定調査依頼_手動_認定調査票_特記事項_フリー様式
     */
    認定調査依頼_手動_認定調査票_特記事項_フリー様式("認定調査依頼_手動_認定調査票_特記事項_フリー様式"),
    /**
     * 認定調査依頼_手動_認定調査票OCR_概況調査
     */
    認定調査依頼_手動_認定調査票OCR_概況調査("認定調査依頼_手動_認定調査票OCR_概況調査"),
    /**
     * 認定調査依頼_手動_認定調査票OCR_基本調査
     */
    認定調査依頼_手動_認定調査票OCR_基本調査("認定調査依頼_手動_認定調査票OCR_基本調査"),
    /**
     * 認定調査依頼_手動_認定調査票OCR_特記事項
     */
    認定調査依頼_手動_認定調査票OCR_特記事項("認定調査依頼_手動_認定調査票OCR_特記事項"),
    /**
     * 認定調査依頼_手動_調査特記_概況特記
     */
    認定調査依頼_手動_調査特記_概況特記("認定調査依頼_手動_調査特記_概況特記"),
    /**
     * 認定調査依頼_手動_調査特記OCR_概況特記
     */
    認定調査依頼_手動_調査特記OCR_概況特記("認定調査依頼_手動_調査特記OCR_概況特記"),
    /**
     * 認定調査依頼_手動_認定調査票差異チェック票
     */
    認定調査依頼_手動_認定調査票差異チェック票("認定調査依頼_手動_認定調査票差異チェック票"),
    /**
     * 認定調査依頼_手動_認定調査依頼該当者履歴一覧
     */
    認定調査依頼_手動_認定調査依頼該当者履歴一覧("認定調査依頼_手動_認定調査依頼該当者履歴一覧"),
    /**
     * 主治医意見書作成依頼_手動_主治医意見書依頼該当者履歴一覧
     */
    主治医意見書作成依頼_手動_主治医意見書依頼該当者履歴一覧("主治医意見書作成依頼_手動_主治医意見書依頼該当者履歴一覧"),
    /**
     * 介護保険指定医依頼兼主治医意見書提出依頼書_宛先敬称
     */
    介護保険指定医依頼兼主治医意見書提出依頼書_宛先敬称("介護保険指定医依頼兼主治医意見書提出依頼書_宛先敬称"),
    /**
     * 介護保険指定医依頼兼主治医意見書提出依頼書
     */
    介護保険指定医依頼兼主治医意見書提出依頼書("介護保険指定医依頼兼主治医意見書提出依頼書"),
    /**
     * 特記事項文字サイズ
     */
    特記事項文字サイズ("特記事項文字サイズ"),
    /**
     * 特記事項行最大文字数
     */
    特記事項行最大文字数("特記事項行最大文字数"),
    /**
     * 特記事項最大表示行数
     */
    特記事項最大表示行数("特記事項最大表示行数"),
    /**
     * 審査会資料調査特記パターン
     */
    審査会資料調査特記パターン("審査会資料調査特記パターン"),
    /**
     * 認定調査委託先割付定員
     */
    認定調査委託先割付定員("認定調査委託先割付定員"),
    /**
     * OCRアップロード用ファイル格納パス
     */
    OCRアップロード用ファイル格納パス("OCRアップロード用ファイル格納パス");

    private final RString fullName;

    private ConfigNameDBE(String fullname) {
        this.fullName = new RString(fullname);
    }

    /**
     * コンフィグ名称(DBE)の名称を返します。
     *
     * @return コンフィグ名称(DBE)の名称
     */
    public RString get名称() {
        return fullName;
    }
}
