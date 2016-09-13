/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.entity.db.relate.kouikitenkyoresultlist;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 広域内転居結果一覧表帳票データ作成戻り結果のタイプ
 *
 * @reamsid_L DBU-1150-050 quxiaodong
 *
 */
@lombok.Setter
@lombok.Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KoikinaiTenkyoResultEntity {

    private RString 印刷日時;
    private RString 市町村コード;
    private RString 市町村名;
    private RString 被保険者番号;
    private RString 氏名カナ;
    private RString 氏名;
    private RString 旧住民コード;
    private RString 前住所;
    private RString 転出予定日;
    private RString 転出確定日;
    private RString 転出確定通知日;
    private RString 処理日;
    private RString 新住民コード;
    private RString 現住所;
    private RString 登録異動日;
    private RString 登録届出日;
    private RString 異動情報;
    private RString ページ数;

}