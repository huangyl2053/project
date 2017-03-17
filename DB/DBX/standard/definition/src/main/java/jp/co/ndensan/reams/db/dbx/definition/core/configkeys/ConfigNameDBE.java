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
     * 認定調査依頼一覧表_宛先敬称
     */
    認定調査依頼一覧表_宛先敬称("認定調査依頼一覧表_宛先敬称"),
    /**
     * 認定調査票_デザイン用紙_出力有無
     */
    認定調査票_デザイン用紙_出力有無("認定調査票_デザイン用紙_出力有無"),
    /**
     * 認定調査票_特記事項_デザイン用紙_出力有無
     */
    認定調査票_特記事項_デザイン用紙_出力有無("認定調査票_特記事項_デザイン用紙_出力有無"),
    /**
     * 認定調査票_OCR_出力有無
     */
    認定調査票_OCR_出力有無("認定調査票_OCR_出力有無"),
    /**
     * 認定調査票_特記事項_OCR_出力有無
     */
    認定調査票_特記事項_OCR_出力有無("認定調査票_特記事項_OCR_出力有無"),
    /**
     * 認定調査票_特記事項_項目有り_出力有無
     */
    認定調査票_特記事項_項目有り_出力有無("認定調査票_特記事項_項目有り_出力有無"),
    /**
     * 認定調査票_特記事項_項目無し_出力有無
     */
    認定調査票_特記事項_項目無し_出力有無("認定調査票_特記事項_項目無し_出力有無"),
    /**
     * 認定調査票_特記事項_フリータイプ_出力有無
     */
    認定調査票_特記事項_フリータイプ_出力有無("認定調査票_特記事項_フリータイプ_出力有無"),
    /**
     * 認定調査差異チェック票_出力有無
     */
    認定調査差異チェック票_出力有無("認定調査差異チェック票_出力有無"),
    /**
     * 認定調査票_概況特記_出力有無
     */
    認定調査票_概況特記_出力有無("認定調査票_概況特記_出力有無"),
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
     * コード:無し 名称:概特記事項テキストイメージ区分 略称:定義なし
     */
    特記事項テキストイメージ区分("特記事項テキストイメージ区分"),
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
     * 要介護認定取消通知書
     */
    要介護認定取消通知書("要介護認定取消通知書"),
    /**
     * 一次判定用データ取込ファイル名
     */
    認定ソフト一次判定用データ取込ファイル名("認定ソフト一次判定用データ取込ファイル名"),
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
     * 介護保険診断命令書_出力有無
     */
    介護保険診断命令書_出力有無("介護保険診断命令書_出力有無"),
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
     * 介護認定審査会開催のお知らせ_宛先敬称
     */
    介護認定審査会開催のお知らせ_宛先敬称("介護認定審査会開催のお知らせ_宛先敬称"),
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
    情報提供資料の特記事項編集パターン("情報提供資料の特記事項編集パターン"),
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
     * 認定ソフト審査会結果データファイル名
     */
    認定ソフト審査会結果データファイル名("認定ソフト審査会結果データファイル名"),
    /**
     * モバイル審査会結果データ審査委員取込みファイル名
     */
    モバイル審査会結果データ審査委員取込みファイル名("モバイル審査会結果データ審査委員取込みファイル名"),
    /**
     * モバイル審査会結果データ審査結果取込みファイル名
     */
    モバイル審査会結果データ審査結果取込みファイル名("モバイル審査会結果データ審査結果取込みファイル名"),
    /**
     * モバイル審査会結果データ審査結果取込みファイル名
     */
    モバイル審査会結果データ審査会情報取込みファイル名("モバイル審査会結果データ審査会情報取込みファイル名"),
    /**
     * 審査結果取込用データ_モバイル審査委員
     */
    審査結果取込用データ_モバイル審査委員("審査結果取込用データ_モバイル審査委員"),
    /**
     * 審査結果取込用データ_モバイル審査委員
     */
    審査結果取込用データ_モバイル審査会情報("審査結果取込用データ_モバイル審査会情報"),
    /**
     * 審査結果取込用データ_モバイル審査結果
     */
    審査結果取込用データ_モバイル審査結果("審査結果取込用データ_モバイル審査結果"),
    /**
     * 認定ソフト審査会結果データ取込みファイル名
     */
    認定ソフト審査会結果データ取込みファイル名("認定ソフト審査会結果データ取込みファイル名"),
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
     * 要介護認定申請連携データ取込みファイル名旧
     */
    要介護認定申請連携データ取込みファイル名("要介護認定申請連携データ取込みファイル名"),
    /**
     * 要介護認定申請連携データ取込みファイル名新
     */
    要介護認定申請連携データ取込みファイル名_新("要介護認定申請連携データ取込みファイル名_新"),
    /**
     * 認定調査委託先データ取込みファイル名旧
     */
    認定調査委託先データ取込みファイル名("認定調査委託先データ取込みファイル名"),
    /**
     * 認定調査委託先データ取込みファイル名新
     */
    認定調査委託先データ取込みファイル名_新("認定調査委託先データ取込みファイル名_新"),
    /**
     * 認定調査員データ取込みファイル名旧
     */
    認定調査員データ取込みファイル名("認定調査員データ取込みファイル名"),
    /**
     * 認定調査員データ取込みファイル名新
     */
    認定調査員データ取込みファイル名_新("認定調査員データ取込みファイル名_新"),
    /**
     * 主治医医療機関データ取込みファイル名旧
     */
    主治医医療機関データ取込みファイル名("主治医医療機関データ取込みファイル名"),
    /**
     * 主治医医療機関データ取込みファイル名新
     */
    主治医医療機関データ取込みファイル名_新("主治医医療機関データ取込みファイル名_新"),
    /**
     * 主治医データ取込みファイル名旧
     */
    主治医データ取込みファイル名("主治医データ取込みファイル名"),
    /**
     * 主治医データ取込みファイル名新
     */
    主治医データ取込みファイル名_新("主治医データ取込みファイル名_新"),
    /**
     * 認定申請IF種類
     */
    認定申請IF種類("認定申請IF種類"),
    /**
     * 四マスタIF種類
     */
    四マスタIF種類("四マスタIF種類"),
    /**
     * 認定ソフト一次判定用データ送信ファイル名09B
     */
    認定ソフト一次判定用データ送信ファイル名09B("認定ソフト一次判定用データ送信ファイル名09B"),
    /**
     * 日次進捗データ送信ファイル名新
     */
    日次進捗データ送信ファイル名_新("日次進捗データ送信ファイル名_新"),
    /**
     * 日次進捗データ送信ファイル名旧
     */
    日次進捗データ送信ファイル名_旧("日次進捗データ送信ファイル名_旧"),
    /**
     * 要介護認定結果連携データ送信ファイル名新
     */
    要介護認定結果連携データ送信ファイル名_新("要介護認定結果連携データ送信ファイル名_新"),
    /**
     * 要介護認定結果連携データ送信ファイル名旧
     */
    要介護認定結果連携データ送信ファイル名_旧("要介護認定結果連携データ送信ファイル名_旧"),
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
    主治医意見書作成料支払内訳確認_宛先敬称書("主治医意見書作成料支払内訳確認_宛先敬称書"),
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
     * NCI242ファイル名称
     */
    NCI242ファイル名称("NCI242ファイル名称"),
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
     * 主治医意見書作成依頼_手動_主治医意見書記入用紙_デザイン用紙
     */
    主治医意見書作成依頼_手動_主治医意見書記入用紙_デザイン用紙("主治医意見書作成依頼_手動_主治医意見書記入用紙_デザイン用紙"),
    /**
     * 主治医意見書作成依頼_意見書作成依頼書_出力有無
     */
    主治医意見書作成依頼_意見書作成依頼書_出力有無("主治医意見書作成依頼_意見書作成依頼書_出力有無"),
    /**
     * 主治医意見書作成依頼_記入用紙_出力有無
     */
    主治医意見書作成依頼_記入用紙_出力有無("主治医意見書作成依頼_記入用紙_出力有無"),
    /**
     * 主治医意見書作成依頼_記入用紙OCR_出力有無
     */
    主治医意見書作成依頼_記入用紙OCR_出力有無("主治医意見書作成依頼_記入用紙OCR_出力有無"),
    /**
     * 主治医意見書作成依頼_作成料請求書_出力有無
     */
    主治医意見書作成依頼_作成料請求書_出力有無("主治医意見書作成依頼_作成料請求書_出力有無"),
    /**
     * 主治医意見書作成依頼_デザイン用紙_出力有無
     */
    主治医意見書作成依頼_デザイン用紙_出力有無("主治医意見書作成依頼_デザイン用紙_出力有無"),
    /**
     * 主治医意見書作成依頼_提出意見書_出力有無
     */
    主治医意見書作成依頼_提出意見書_出力有無("主治医意見書作成依頼_提出意見書_出力有無"),
    /**
     * 主治医意見書作成依頼_介護保険診断命令書_出力有無
     */
    主治医意見書作成依頼_介護保険診断命令書_出力有無("主治医意見書作成依頼_介護保険診断命令書_出力有無"),
    /**
     * 主治医意見書作成依頼_意見書作成依頼一覧表_出力有無
     */
    主治医意見書作成依頼_意見書作成依頼一覧表_出力有無("主治医意見書作成依頼_意見書作成依頼一覧表_出力有無"),
    /**
     * 主治医意見書作成依頼_依頼該当者履歴一覧_出力有無
     */
    主治医意見書作成依頼_依頼該当者履歴一覧_出力有無("主治医意見書作成依頼_依頼該当者履歴一覧_出力有無"),
    /**
     * 主治医意見書作成依頼_依頼書発行履歴一覧表_出力有無
     */
    主治医意見書作成依頼_依頼書発行履歴一覧表_出力有無("主治医意見書作成依頼_依頼書発行履歴一覧表_出力有無"),
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
     * 認定調査依頼_手動_認定調査票
     */
    認定調査依頼_手動_認定調査票("認定調査依頼_手動_認定調査票"),
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
     * 認定調査依頼_手動_認定調査票_特記事項_項目有り
     */
    認定調査依頼_手動_認定調査票_特記事項_項目有り("認定調査依頼_手動_認定調査票_特記事項_項目有り"),
    /**
     * 認定調査依頼_手動_認定調査票_特記事項_項目無し
     */
    認定調査依頼_手動_認定調査票_特記事項_項目無し("認定調査依頼_手動_認定調査票_特記事項_項目無し"),
    /**
     * 認定調査依頼_手動_認定調査票_特記事項_フリー様式
     */
    認定調査依頼_手動_認定調査票_特記事項_フリー様式("認定調査依頼_手動_認定調査票_特記事項_フリー様式"),
    /**
     * 認定調査依頼_手動_認定調査票OCR
     */
    認定調査依頼_手動_認定調査票OCR("認定調査依頼_手動_認定調査票OCR"),
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
     * 認定ソフト審査会資料作成用データ送信ファイル名09A
     */
    認定ソフト審査会資料作成用データ送信ファイル名09A("認定ソフト審査会資料作成用データ送信ファイル名09A"),
    /**
     * 認定ソフト審査会資料作成用データ送信ファイル名09B
     */
    認定ソフト審査会資料作成用データ送信ファイル名09B("認定ソフト審査会資料作成用データ送信ファイル名09B"),
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
    OCRアップロード用ファイル格納パス("OCRアップロード用ファイル格納パス"),
    /**
     * 経過日数
     */
    経過日数("経過日数"),
    /**
     * 要介護認定延期通知書
     */
    要介護認定延期通知書("要介護認定延期通知書"),
    /**
     * 調査員調査可能人数
     */
    調査員調査可能人数("調査員調査可能人数"),
    /**
     * 認定調査依頼予定年月日
     */
    認定調査依頼予定年月日("認定調査依頼予定年月日"),
    /**
     * 認定調査予定年月日
     */
    認定調査予定年月日("認定調査予定年月日"),
    /**
     * 主治医意見書作成依頼予定年月日
     */
    主治医意見書作成依頼予定年月日("主治医意見書作成依頼予定年月日"),
    /**
     * 主治医意見書登録予定年月日
     */
    主治医意見書登録予定年月日("主治医意見書登録予定年月日"),
    /**
     * 要介護認定一次判定予定年月日
     */
    要介護認定一次判定予定年月日("要介護認定一次判定予定年月日"),
    /**
     * 認定審査会割当予定年月日
     */
    認定審査会割当予定年月日("認定審査会割当予定年月日"),
    /**
     * 認定審査会予定年月日
     */
    認定審査会予定年月日("認定審査会予定年月日"),
    /**
     * センター送信予定年月日
     */
    センター送信予定年月日("センター送信予定年月日"),
    /**
     * 会社コード
     */
    会社コード("会社コード"),
    /**
     * 会社名
     */
    会社名("会社名"),
    /**
     * 仕向銀行番号
     */
    仕向銀行番号("仕向銀行番号"),
    /**
     * 仕向銀行名
     */
    仕向銀行名("仕向銀行名"),
    /**
     * 仕向支店番号
     */
    仕向支店番号("仕向支店番号"),
    /**
     * 仕向支店名
     */
    仕向支店名("仕向支店名"),
    /**
     * 預金種別
     */
    預金種別("預金種別"),
    /**
     * 口座番号1
     */
    口座番号("口座番号"),
    /**
     * 審査結果入力用データ_モバイル審査委員
     */
    審査結果入力用データ_モバイル審査委員("審査結果入力用データ_モバイル審査委員"),
    /**
     * 審査結果入力用データ_モバイル審査結果
     */
    審査結果入力用データ_モバイル審査結果("審査結果入力用データ_モバイル審査結果"),
    /**
     * 日次進捗データ連携
     */
    日次進捗データ連携("日次進捗データ連携"),
    /**
     * 認定調査委託先データ送信ファイル名_新
     */
    認定調査委託先データ送信ファイル名_新("認定調査委託先データ送信ファイル名_新"),
    /**
     * 認定調査員データ送信ファイル名_新
     */
    認定調査員データ送信ファイル名_新("認定調査員データ送信ファイル名_新"),
    /**
     * 主治医医療機関データ送信ファイル名_新
     */
    主治医医療機関データ送信ファイル名_新("主治医医療機関データ送信ファイル名_新"),
    /**
     * 主治医データ送信ファイル名_新
     */
    主治医データ送信ファイル名_新("主治医データ送信ファイル名_新"),
    /**
     * 資格喪失_死亡_データ送信ファイル名_新
     */
    資格喪失_死亡_データ送信ファイル名_新("資格喪失_死亡_データ送信ファイル名_新"),
    /**
     * 資格喪失_死亡_データ送信ファイル名_旧
     */
    資格喪失_死亡_データ送信ファイル名_旧("資格喪失_死亡_データ送信ファイル名_旧"),
    /**
     * 構成市町村マスタ市町村コード重複種別
     */
    構成市町村マスタ市町村コード重複種別("構成市町村マスタ市町村コード重複種別"),
    /**
     * 構成市町村マスタ市町村コード重複種別
     */
    四マスタ優先表示市町村識別ID("四マスタ優先表示市町村識別ID"),
    /**
     * 意見書印刷フォームデザインシート両面
     */
    意見書印刷フォームデザインシート両面("意見書印刷フォームデザインシート両面"),
    /**
     * 意見書印刷フォーム白紙カラー両面
     */
    意見書印刷フォーム白紙カラー両面("意見書印刷フォーム白紙カラー両面"),
    /**
     * 意見書印刷フォーム白紙カラー片面
     */
    意見書印刷フォーム白紙カラー片面("意見書印刷フォーム白紙カラー片面"),
    /**
     * 意見書印刷フォーム白紙モノクロ両面
     */
    意見書印刷フォーム白紙モノクロ両面("意見書印刷フォーム白紙モノクロ両面"),
    /**
     * 意見書印刷フォーム白紙モノクロ片面
     */
    意見書印刷フォーム白紙モノクロ片面("意見書印刷フォーム白紙モノクロ片面"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目
     */
    認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目("認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー片面1枚目
     */
    認定調査票_基本調査_印刷フォーム白紙カラー片面2枚目("認定調査票_基本調査_印刷フォーム白紙カラー片面2枚目"),
    /**
     * 認定調査票_基本調査_印刷フォーム白紙カラー両面
     */
    認定調査票_基本調査_印刷フォーム白紙カラー両面("認定調査票_基本調査_印刷フォーム白紙カラー両面"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート片面1枚目
     */
    認定調査票_基本調査_印刷フォームデザインシート片面1枚目("認定調査票_基本調査_印刷フォームデザインシート片面1枚目"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート片面2枚目
     */
    認定調査票_基本調査_印刷フォームデザインシート片面2枚目("認定調査票_基本調査_印刷フォームデザインシート片面2枚目"),
    /**
     * 認定調査票_基本調査_印刷フォームデザインシート両面
     */
    認定調査票_基本調査_印刷フォームデザインシート両面("認定調査票_基本調査_印刷フォームデザインシート両面"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙カラー片面
     */
    認定調査票_特記事項_印刷フォーム白紙カラー片面("認定調査票_特記事項_印刷フォーム白紙カラー片面"),
    /**
     * 認定調査票_特記事項_印刷フォーム白紙モノクロ片面
     */
    認定調査票_特記事項_印刷フォーム白紙モノクロ片面("認定調査票_特記事項_印刷フォーム白紙モノクロ片面"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自両面
     */
    認定調査票_特記事項_印刷フォーム独自両面("認定調査票_特記事項_印刷フォーム独自両面"),
    /**
     * 認定調査票_特記事項_印刷フォーム独自片面1
     */
    認定調査票_特記事項_印刷フォーム独自片面("認定調査票_特記事項_印刷フォーム独自片面"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート両面
     */
    認定調査票_特記事項_印刷フォームデザインシート両面("認定調査票_特記事項_印刷フォームデザインシート両面"),
    /**
     * 認定調査票_特記事項_印刷フォームデザインシート片面
     */
    認定調査票_特記事項_印刷フォームデザインシート片面("認定調査票_特記事項_印刷フォームデザインシート片面"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目
     */
    認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目("認定調査票_概況調査_印刷フォーム白紙カラー片面1枚目"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー片面2枚目
     */
    認定調査票_概況調査_印刷フォーム白紙カラー片面2枚目("認定調査票_概況調査_印刷フォーム白紙カラー片面2枚目"),
    /**
     * 認定調査票_概況調査_印刷フォーム白紙カラー両面
     */
    認定調査票_概況調査_印刷フォーム白紙カラー両面("認定調査票_概況調査_印刷フォーム白紙カラー両面"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート片面1枚目
     */
    認定調査票_概況調査_印刷フォームデザインシート片面1枚目("認定調査票_概況調査_印刷フォームデザインシート片面1枚目"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート片面2枚目
     */
    認定調査票_概況調査_印刷フォームデザインシート片面2枚目("認定調査票_概況調査_印刷フォームデザインシート片面2枚目"),
    /**
     * 認定調査票_概況調査_印刷フォームデザインシート両面
     */
    認定調査票_概況調査_印刷フォームデザインシート両面("認定調査票_概況調査_印刷フォームデザインシート両面"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙カラー片面
     */
    認定調査票_特記事項フリー_印刷フォーム白紙カラー片面("認定調査票_特記事項フリー_印刷フォーム白紙カラー片面"),
    /**
     * 認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面
     */
    認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面("認定調査票_特記事項フリー_印刷フォーム白紙モノクロ片面"),
    /**
     * 基本運用＿対象者一覧表示区分
     */
    基本運用_対象者一覧表示区分("基本運用_対象者一覧表示区分"),
    /**
     * 特記と意見書の見開き印刷有無
     */
    特記と意見書の見開き印刷有無("特記と意見書の見開き印刷有無"),
    /**
     * 依頼業務照会_申請日_照会可能期間
     */
    依頼業務照会_申請日_照会可能期間("依頼業務照会_申請日_照会可能期間"),
    /**
     * 広域連合保険者番号
     */
    広域連合保険者番号("広域連合保険者番号"),
    /**
     * 広域業務範囲コード
     */
    広域業務範囲コード("広域業務範囲コード"),
    /**
     * 特記事項判定日
     */
    特記事項判定日("特記事項判定日"),
    /**
     * 依頼書期限設定
     */
    依頼書期限設定("依頼書期限設定"),
    /**
     * 概況特記登録ボタン_表示有無
     */
    概況特記登録ボタン_表示有無("概況特記登録ボタン_表示有無"),
    /**
     * 認定調査依頼_依頼件数集計月数
     */
    認定調査依頼_依頼件数集計月数("認定調査依頼_依頼件数集計月数"),
    /**
     * 認定調査票_印刷タイプ
     */
    認定調査票_印刷タイプ("認定調査票_印刷タイプ"),
    /**
     * 認定調査票_用紙タイプ
     */
    認定調査票_用紙タイプ("認定調査票_用紙タイプ"),
    /**
     * 認定調査票_特記事項_調査項目出力有無
     */
    認定調査票_特記事項_調査項目出力有無("認定調査票_特記事項_調査項目出力有無"),
    /**
     * 認定調査依頼_一括_調査依頼書_出力有無
     */
    認定調査依頼_一括_調査依頼書_出力有無("認定調査依頼_一括_調査依頼書_出力有無"),
    /**
     * 認定調査依頼_一括_認定調査票_概況基本_出力有無
     */
    認定調査依頼_一括_認定調査票_概況基本_出力有無("認定調査依頼_一括_認定調査票_概況基本_出力有無"),
    /**
     * 認定調査依頼_一括_認定調査票_特記事項_出力有無
     */
    認定調査依頼_一括_認定調査票_特記事項_出力有無("認定調査依頼_一括_認定調査票_特記事項_出力有無"),
    /**
     * 認定調査依頼_一括_差異チェック票_出力有無
     */
    認定調査依頼_一括_差異チェック票_出力有無("認定調査依頼_一括_差異チェック票_出力有無"),
    /**
     * 認定調査依頼_一括_特記事項_出力有無
     */
    認定調査依頼_一括_特記事項_出力有無("認定調査依頼_一括_特記事項_出力有無"),
    /**
     * 認定調査依頼_初期選択_調査依頼書
     */
    認定調査依頼_初期選択_調査依頼書("認定調査依頼_初期選択_調査依頼書"),
    /**
     * 認定調査依頼_初期選択_認定調査票_概況基本
     */
    認定調査依頼_初期選択_認定調査票_概況基本("認定調査依頼_初期選択_認定調査票_概況基本"),
    /**
     * 認定調査依頼_初期選択_認定調査票_特記事項
     */
    認定調査依頼_初期選択_認定調査票_特記事項("認定調査依頼_初期選択_認定調査票_特記事項"),
    /**
     * 認定調査依頼_初期選択_概況特記
     */
    認定調査依頼_初期選択_概況特記("認定調査依頼_初期選択_概況特記"),
    /**
     * 認定調査依頼_初期選択_差異チェック票
     */
    認定調査依頼_初期選択_差異チェック票("認定調査依頼_初期選択_差異チェック票"),
    /**
     * 認定調査依頼_初期選択_発行一覧表
     */
    認定調査依頼_初期選択_発行一覧表("認定調査依頼_初期選択_発行一覧表"),
    /**
     * 認定調査依頼_初期選択_履歴一覧表
     */
    認定調査依頼_初期選択_履歴一覧表("認定調査依頼_初期選択_履歴一覧表"),
    /**
     * 認定調査票_概況基本_帳票ID_表
     */
    認定調査票_概況基本_帳票ID_表("認定調査票_概況基本_帳票ID_表"),
    /**
     * 認定調査票_概況基本_帳票ID_裏
     */
    認定調査票_概況基本_帳票ID_裏("認定調査票_概況基本_帳票ID_裏"),
    /**
     * 認定調査票_特記事項_帳票ID_表
     */
    認定調査票_特記事項_帳票ID_表("認定調査票_特記事項_帳票ID_表"),
    /**
     * 認定調査票_特記事項_帳票ID_裏
     */
    認定調査票_特記事項_帳票ID_裏("認定調査票_特記事項_帳票ID_裏"),
    /**
     * 認定調査票_特記事項_調査群記載あり_帳票ID
     */
    認定調査票_特記事項_調査群記載あり_帳票ID("認定調査票_特記事項_調査群記載あり_帳票ID"),
    /**
     * 認定調査票_特記事項_フリー様式_帳票ID
     */
    認定調査票_特記事項_フリー様式_帳票ID("認定調査票_特記事項_フリー様式_帳票ID"),
    /**
     * 主治医意見書作成依頼_一括_作成依頼書_出力有無
     */
    主治医意見書作成依頼_一括_作成依頼書_出力有無("主治医意見書作成依頼_一括_作成依頼書_出力有無"),
    /**
     * 主治医意見書作成依頼_一括_記入用紙_出力有無
     */
    主治医意見書作成依頼_一括_記入用紙_出力有無("主治医意見書作成依頼_一括_記入用紙_出力有無"),
    /**
     * 主治医意見書作成依頼_一括_請求書_出力有無
     */
    主治医意見書作成依頼_一括_請求書_出力有無("主治医意見書作成依頼_一括_請求書_出力有無"),
    /**
     * 主治医意見書作成依頼_初期選択_作成依頼書
     */
    主治医意見書作成依頼_初期選択_作成依頼書("主治医意見書作成依頼_初期選択_作成依頼書"),
    /**
     * 主治医意見書作成依頼_初期選択_記入用紙
     */
    主治医意見書作成依頼_初期選択_記入用紙("主治医意見書作成依頼_初期選択_記入用紙"),
    /**
     * 主治医意見書作成依頼_初期選択_請求書
     */
    主治医意見書作成依頼_初期選択_請求書("主治医意見書作成依頼_初期選択_請求書"),
    /**
     * 主治医意見書作成依頼_初期選択_診断命令書
     */
    主治医意見書作成依頼_初期選択_診断命令書("主治医意見書作成依頼_初期選択_診断命令書"),
    /**
     * 主治医意見書作成依頼_初期選択_請求一覧表
     */
    主治医意見書作成依頼_初期選択_請求一覧表("主治医意見書作成依頼_初期選択_請求一覧表"),
    /**
     * 主治医意見書作成依頼_初期選択_発行一覧表
     */
    主治医意見書作成依頼_初期選択_発行一覧表("主治医意見書作成依頼_初期選択_発行一覧表"),
    /**
     * 主治医意見書作成依頼_初期選択_履歴一覧表
     */
    主治医意見書作成依頼_初期選択_履歴一覧表("主治医意見書作成依頼_初期選択_履歴一覧表"),
    /**
     * 主治医意見書_帳票ID_表
     */
    主治医意見書_帳票ID_表("主治医意見書_帳票ID_表"),
    /**
     * 主治医意見書_帳票ID_裏
     */
    主治医意見書_帳票ID_裏("主治医意見書_帳票ID_裏"),
    /**
     * 主治医意見書作成請求書連動印刷
     */
    主治医意見書作成請求書連動印刷("主治医意見書作成請求書連動印刷"),
    /**
     * 認定調査取込_一次判定済みの申請者_処理方法
     */
    認定調査取込_一次判定済みの申請者_処理方法("認定調査取込_一次判定済みの申請者_処理方法"),
    /**
     * 認定調査取込_依頼時と実施時での調査員の不一致_処理方法
     */
    認定調査取込_依頼時と実施時での調査員の不一致_処理方法("認定調査取込_依頼時と実施時での調査員の不一致_処理方法"),
    /**
     * 認定調査取込_特記事項連番_以前の取込結果との重複_処理方法
     */
    認定調査取込_特記事項連番_以前の取込結果との重複_処理方法("認定調査取込_特記事項連番_以前の取込結果との重複_処理方法"),
    /**
     * イメージ取込_一次判定済みの申請者_処理方法
     */
    イメージ取込_一次判定済みの申請者_処理方法("イメージ取込_一次判定済みの申請者_処理方法"),
    /**
     * イメージ取込_依頼時と実施時での医師の不一致_処理方法
     */
    イメージ取込_依頼時と実施時での医師の不一致_処理方法("イメージ取込_依頼時と実施時での医師の不一致_処理方法"),
    /**
     * センター送信_運用有無
     */
    センター送信_運用有無("センター送信_運用有無"),
    /**
     * 認定調査結果入力用ZIPファイル名称
     */
    認定調査結果入力用ZIPファイル名称("認定調査結果入力用ZIPファイル名称"),
    /**
     * 認定調査票特記事項_様式切替日
     */
    認定調査票特記事項_様式切替日("認定調査票特記事項_様式切替日"),
    /**
     * 介護保険診断命令書連動印刷
     */
    介護保険診断命令書連動印刷("介護保険診断命令書連動印刷"),
    /**
     * 認定調査票特記事項最大入力文字数
     */
    認定調査票特記事項最大入力文字数("認定調査票特記事項最大入力文字数"),
    /**
     * 審査員単価パターン
     */
    審査員単価パターン("審査員単価パターン"),
    /**
     * 審査会委員実績照会_医師範囲_歯科医師
     */
    審査会委員実績照会_医師範囲_歯科医師("審査会委員実績照会_医師範囲_歯科医師"),
    /**
     * 保険者情報_保険者番号
     */
    保険者情報_保険者番号("保険者情報_保険者番号"),
    /**
     * 情報提供_同意有無_初期設定
     */
    情報提供_同意有無_初期設定("情報提供_同意有無_初期設定"),
    /**
     * 介護認定審査会結果入力用ZIPファイル名称
     */
    介護認定審査会結果入力用ZIPファイル名称("介護認定審査会結果入力用ZIPファイル名称"),
    /**
     * 審査会順序_表示用
     */
    審査会順序_表示用("審査会順序_表示用"),
    /**
     * 審査会最低定員数
     */
    審査会最低定員数("審査会最低定員数"),
    /**
     * 認定調査結果入手_必須調査票
     */
    認定調査結果入手_必須調査票("認定調査結果入手_必須調査票"),
    /**
     * 主治医意見書依頼_追加完了条件
     */
    主治医意見書依頼_追加完了条件("主治医意見書依頼_追加完了条件"),
    /**
     * 認定審査会受付予定年月日
     */
    認定審査会受付予定年月日("認定審査会受付予定年月日"),
    /**
     * 判定一覧出力帳票フラグ
     */
    判定一覧出力帳票フラグ("判定一覧出力帳票フラグ"),
    /**
     * 審査会議事録出力フラグ
     */
    審査会議事録出力帳票フラグ("審査会議事録出力帳票フラグ"),
    /**
     * 初期選択_介護認定審査会判定結果鑑
     */
    初期選択_介護認定審査会判定結果鑑("初期選択_介護認定審査会判定結果鑑"),
    /**
     * 初期選択_要介護認定結果通知一覧
     */
    初期選択_要介護認定結果通知一覧("初期選択_要介護認定結果通知一覧"),
    /**
     * 審査会自動割付使用有無
     */
    審査会自動割付使用有無("審査会自動割付使用有無"),
    /**
     * 主治医意見書作成料請求書_作成料_印字有無
     */
    主治医意見書作成料請求書_作成料_印字有無("主治医意見書作成料請求書_作成料_印字有無"),
    /**
     * 介護認定審査会結果登録_判定結果初期表示
     */
    介護認定審査会結果登録_判定結果初期表示("介護認定審査会結果登録_判定結果初期表示"),
    /**
     * センター送信_完了日登録方法
     */
    センター送信_完了日登録方法("センター送信_完了日登録方法");

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
