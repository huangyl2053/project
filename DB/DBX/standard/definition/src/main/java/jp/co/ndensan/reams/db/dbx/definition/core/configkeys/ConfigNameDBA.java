/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.definition.core.configkeys;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * コンフィグ名称(DBA)を表す列挙型です。
 *
 * @reamsid_L DBX-9999-023 wangchao
 */
public enum ConfigNameDBA {

    /**
     * コード:無し 名称:被保険者番号付番方法_カスタマイズ付番_付番元情報 略称:定義なし
     */
    被保険者番号付番方法_カスタマイズ付番_付番元情報("被保険者番号付番方法_カスタマイズ付番_付番元情報"),
    /**
     * コード:無し 名称:被保険者番号付番方法_カスタマイズ付番_付番元情報_有効桁数 略称:定義なし
     */
    被保険者番号付番方法_カスタマイズ付番_付番元情報_有効桁数("被保険者番号付番方法_カスタマイズ付番_付番元情報_有効桁数"),
    /**
     * コード:無し 名称:被保険者番号付番方法_カスタマイズ付番_付番元情報_開始位置 略称:定義なし
     */
    被保険者番号付番方法_カスタマイズ付番_付番元情報_開始位置("被保険者番号付番方法_カスタマイズ付番_付番元情報_開始位置"),
    /**
     * コード:無し 名称:被保険者番号付番方法_カスタマイズ付番_前付与番号 略称:定義なし
     */
    被保険者番号付番方法_カスタマイズ付番_前付与番号("被保険者番号付番方法_カスタマイズ付番_前付与番号"),
    /**
     * コード:無し 名称:被保険者番号付番方法_カスタマイズ付番_前付与番号_桁数 略称:定義なし
     */
    被保険者番号付番方法_カスタマイズ付番_前付与番号_桁数("被保険者番号付番方法_カスタマイズ付番_前付与番号_桁数"),
    /**
     * コード:無し 名称:被保険者番号付番方法_カスタマイズ付番_後付与番号 略称:定義なし
     */
    被保険者番号付番方法_カスタマイズ付番_後付与番号("被保険者番号付番方法_カスタマイズ付番_後付与番号"),
    /**
     * コード:無し 名称:被保険者番号付番方法_カスタマイズ付番_後付与番号_桁数 略称:定義なし
     */
    被保険者番号付番方法_カスタマイズ付番_後付与番号_桁数("被保険者番号付番方法_カスタマイズ付番_後付与番号_桁数"),
    /**
     * コード:無し 名称:被保険者番号付番方法_付番方法 略称:定義なし
     */
    被保険者番号付番方法_付番方法("被保険者番号付番方法_付番方法"),
    /**
     * コード:無し 名称:被保険者番号付番方法_付番方法_変更可否区分 略称:定義なし
     */
    被保険者番号付番方法_付番方法_変更可否区分("被保険者番号付番方法_付番方法_変更可否区分"),
    /**
     * コード:無し 名称:被保険者番号付番方法_自動連番付番_付番元情報 略称:定義なし
     */
    被保険者番号付番方法_自動連番付番_付番元情報("被保険者番号付番方法_自動連番付番_付番元情報"),
    /**
     * コード:無し 名称:被保険者証表示方法_合併前印刷時_有効期限 略称:定義なし
     */
    被保険者証表示方法_合併前印刷時_有効期限("被保険者証表示方法_合併前印刷時_有効期限"),
    /**
     * コード:無し 名称:被保険者証表示方法_委託代行業者_表示有無 略称:定義なし
     */
    被保険者証表示方法_委託代行業者_表示有無("被保険者証表示方法_委託代行業者_表示有無"),
    /**
     * コード:無し 名称:被保険者証表示方法_委託代行業者_表示終了文言 略称:定義なし
     */
    被保険者証表示方法_委託代行業者_表示終了文言("被保険者証表示方法_委託代行業者_表示終了文言"),
    /**
     * コード:無し 名称:被保険者証表示方法_委託代行業者_表示開始文言 略称:定義なし
     */
    被保険者証表示方法_委託代行業者_表示開始文言("被保険者証表示方法_委託代行業者_表示開始文言"),
    /**
     * コード:無し 名称:被保険者証表示方法_居宅支援事業者届出日_適用開始日切替表示区分 略称:定義なし
     */
    被保険者証表示方法_居宅支援事業者届出日_適用開始日切替表示区分("被保険者証表示方法_居宅支援事業者届出日_適用開始日切替表示区分"),
    /**
     * コード:無し 名称:被保険者証表示方法_居宅支援事業者履歴_表示方法 略称:定義なし
     */
    被保険者証表示方法_居宅支援事業者履歴_表示方法("被保険者証表示方法_居宅支援事業者履歴_表示方法"),
    /**
     * コード:無し 名称:被保険者証表示方法_居宅支援事業者適用切れ_表示有無 略称:定義なし
     */
    被保険者証表示方法_居宅支援事業者適用切れ_表示有無("被保険者証表示方法_居宅支援事業者適用切れ_表示有無"),
    /**
     * コード:無し 名称:被保険者証表示方法_被保険者番号表示書式 略称:定義なし
     */
    被保険者証表示方法_被保険者番号表示書式("被保険者証表示方法_被保険者番号表示書式"),
    /**
     * コード:無し 名称:被保険者証表示方法_要介護認定期限切れ_表示有無 略称:定義なし
     */
    被保険者証表示方法_要介護認定期限切れ_表示有無("被保険者証表示方法_要介護認定期限切れ_表示有無"),
    /**
     * コード:無し 名称:被保険者証表示方法_証表示タイプ 略称:定義なし
     */
    被保険者証表示方法_証表示タイプ("被保険者証表示方法_証表示タイプ"),
    /**
     * コード:無し 名称:被保険者証表示方法_郵便番号表示有無 略称:定義なし
     */
    被保険者証表示方法_郵便番号表示有無("被保険者証表示方法_郵便番号表示有無"),
    /**
     * コード:無し 名称:連動管理_連動時引き渡しファイル_ファイル名 略称:定義なし
     */
    連動管理_連動時引き渡しファイル_ファイル名("連動管理_連動時引き渡しファイル_ファイル名"),
    /**
     * コード:無し 名称:連動管理_連動時引き渡しファイル_書式区分 略称:定義なし
     */
    連動管理_連動時引き渡しファイル_書式区分("連動管理_連動時引き渡しファイル_書式区分");

    private final RString fullName;

    private ConfigNameDBA(String fullname) {
        this.fullName = new RString(fullname);
    }

    /**
     * コンフィグ名称(DBA)の名称を返します。
     *
     * @return コンフィグ名称(DBA)の名称
     */
    public RString get名称() {
        return fullName;
    }

}
