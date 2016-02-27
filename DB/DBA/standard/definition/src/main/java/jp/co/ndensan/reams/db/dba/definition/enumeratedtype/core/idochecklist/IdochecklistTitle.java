/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.definition.enumeratedtype.core.idochecklist;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 異動チェックリストタイトルを表す列挙型です。
 */
public enum IdochecklistTitle {

    /**
     * 名称:対象情報タイトル_被保険者
     */
    対象情報タイトル_被保険者("データ種別：被保険者台帳"),
    /**
     * 名称:対象情報タイトル_他市町村
     */
    対象情報タイトル_他市町村("データ種別：他市町村住所地特例者台帳"),
    /**
     * 名称:対象情報タイトル_適用除外者
     */
    対象情報タイトル_適用除外者("データ種別：適用除外者台帳"),
    /**
     * 名称:対象情報タイトル_生活保護
     */
    対象情報タイトル_生活保護("データ種別：生活保護情報"),
    /**
     * 名称:対象情報タイトル_老齢福祉
     */
    対象情報タイトル_老齢福祉("データ種別：老齢福祉年金情報"),
    /**
     * 名称:開始タイトル_取得
     */
    開始タイトル_取得("取得情報"),
    /**
     * 名称:開始タイトル_適用
     */
    開始タイトル_適用("適用情報"),
    /**
     * 名称:開始タイトル_開始
     */
    開始タイトル_開始("開始情報"),
    /**
     * 名称:終了タイトル_喪失
     */
    終了タイトル_喪失("喪失情報"),
    /**
     * 名称:終了タイトル_解除
     */
    終了タイトル_解除("解除情報"),
    /**
     * 名称:終了タイトル_廃止
     */
    終了タイトル_廃止("廃止情報"),
    /**
     * 名称:終了タイトル_終了
     */
    終了タイトル_終了("終了情報"),
    /**
     * 名称:区分タイトル_資格
     */
    区分タイトル_資格("資格"),
    /**
     * 名称:異動情報タイトル4_異動
     */
    異動情報タイトル4_異動("資格"),
    /**
     * 名称:異動情報タイトル1_施設
     */
    異動情報タイトル1_施設("施設コード"),
    /**
     * 名称:異動情報タイトル1_扶助
     */
    異動情報タイトル1_扶助("扶助種類"),
    /**
     * 名称:開始年月日タイトル_入所
     */
    開始年月日タイトル_入所("入所年月日"),
    /**
     * 名称:開始年月日タイトル_開始
     */
    開始年月日タイトル_開始("開始年月日"),
    /**
     * 名称:終了年月日タイトル_退所
     */
    終了年月日タイトル_退所("退所年月日"),
    /**
     * 名称:終了年月日タイトル_終了
     */
    終了年月日タイトル_終了("終了年月日"),
    /**
     * 名称:終了年月日タイトル_廃止
     */
    終了年月日タイトル_廃止("廃止年月日");

    private final RString name;

    private IdochecklistTitle(String name) {
        this.name = new RString(name);
    }

    /**
     * 異動チェックリストタイトルの名称を返します。
     *
     * @return 異動チェックリストタイトルの名称
     */
    public RString get名称() {
        return name;
    }
}
