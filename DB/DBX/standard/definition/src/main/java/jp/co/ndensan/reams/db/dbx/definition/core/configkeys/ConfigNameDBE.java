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
 * @reamsid_L DBE-9999-021 sunhaidi
 */
public enum ConfigNameDBE {

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
     * 意見書用紙タイプ
     */
    意見書用紙タイプ("意見書用紙タイプ"),
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
     * 審査結果取込用データ_モバイル_パス
     */
    審査結果取込用データ_モバイル_パス("審査結果取込用データ_モバイル_パス"),
    /**
     * 審査結果取込用データ_モバイル
     */
    審査結果取込用データ_モバイル("審査結果取込用データ_モバイル");

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
