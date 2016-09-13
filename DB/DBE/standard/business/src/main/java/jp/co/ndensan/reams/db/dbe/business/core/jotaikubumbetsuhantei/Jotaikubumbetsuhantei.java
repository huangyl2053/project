/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.jotaikubumbetsuhantei;

import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 要介護状態区分別判定件数のHeadクラスです。
 *
 * @reamsid_L DBE-1450-050 dongyabin
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class Jotaikubumbetsuhantei {

    private RString タイトル;
    private RString 合議体名称;
    private RString 開催開始年月日;
    private RString 開催終了年月日;
    private RString 開催回数;
    private RString 市町村番号;
    private RString 市町村名;
    private RDateTime 発行日時;
    private RString 二次判定非該当タイトル;
    private RString 二次判定要支援1タイトル;
    private RString 二次判定要支援2タイトル;
    private RString 二次判定要介護1タイトル;
    private RString 二次判定要介護2タイトル;
    private RString 二次判定要介護3タイトル;
    private RString 二次判定要介護4タイトル;
    private RString 二次判定要介護5タイトル;
    private RString 一次判定_計タイトル;
    private RString 一次判定非該当タイトル;
    private RString 一次判定非該当_二次判定非該当;
    private RString 一次判定非該当_二次判定要支援1;
    private RString 一次判定非該当_二次判定要支援2;
    private RString 一次判定非該当_二次判定要介護1;
    private RString 一次判定非該当_二次判定要介護2;
    private RString 一次判定非該当_二次判定要介護3;
    private RString 一次判定非該当_二次判定要介護4;
    private RString 一次判定非該当_二次判定要介護5;
    private RString 一次判定非該当_計;
    private RString 一次判定非該当_再調査二次保留分;
    private RString 一次判定非該当_判定変更者数;
    private RString 一次判定非該当_軽度変更者数;
    private RString 一次判定非該当_重度変更者数;
    private RString 一次判定非該当_判定変更割合;
    private RString 一次判定要支援1タイトル;
    private RString 一次判定要支援1_二次判定非該当;
    private RString 一次判定要支援1_二次判定要支援1;
    private RString 一次判定要支援1_二次判定要支援2;
    private RString 一次判定要支援1_二次判定要介護1;
    private RString 一次判定要支援1_二次判定要介護2;
    private RString 一次判定要支援1_二次判定要介護3;
    private RString 一次判定要支援1_二次判定要介護4;
    private RString 一次判定要支援1_二次判定要介護5;
    private RString 一次判定要支援1_計;
    private RString 一次判定要支援1_再調査二次保留分;
    private RString 一次判定要支援1_判定変更者数;
    private RString 一次判定要支援1_軽度変更者数;
    private RString 一次判定要支援1_重度変更者数;
    private RString 一次判定要支援1_判定変更割合;
    private RString 一次判定要支援2タイトル;
    private RString 一次判定要支援2_二次判定非該当;
    private RString 一次判定要支援2_二次判定要支援1;
    private RString 一次判定要支援2_二次判定要支援2;
    private RString 一次判定要支援2_二次判定要介護1;
    private RString 一次判定要支援2_二次判定要介護2;
    private RString 一次判定要支援2_二次判定要介護3;
    private RString 一次判定要支援2_二次判定要介護4;
    private RString 一次判定要支援2_二次判定要介護5;
    private RString 一次判定要支援2_計;
    private RString 一次判定要支援2_再調査二次保留分;
    private RString 一次判定要支援2_判定変更者数;
    private RString 一次判定要支援2_軽度変更者数;
    private RString 一次判定要支援2_重度変更者数;
    private RString 一次判定要支援2_判定変更割合;
    private RString 一次判定要介護1タイトル;
    private RString 一次判定要介護1_二次判定非該当;
    private RString 一次判定要介護1_二次判定要支援1;
    private RString 一次判定要介護1_二次判定要支援2;
    private RString 一次判定要介護1_二次判定要介護1;
    private RString 一次判定要介護1_二次判定要介護2;
    private RString 一次判定要介護1_二次判定要介護3;
    private RString 一次判定要介護1_二次判定要介護4;
    private RString 一次判定要介護1_二次判定要介護5;
    private RString 一次判定要介護1_計;
    private RString 一次判定要介護1_再調査二次保留分;
    private RString 一次判定要介護1_判定変更者数;
    private RString 一次判定要介護1_軽度変更者数;
    private RString 一次判定要介護1_重度変更者数;
    private RString 一次判定要介護1_判定変更割合;
    private RString 一次判定要介護2タイトル;
    private RString 一次判定要介護2_二次判定非該当;
    private RString 一次判定要介護2_二次判定要支援1;
    private RString 一次判定要介護2_二次判定要支援2;
    private RString 一次判定要介護2_二次判定要介護1;
    private RString 一次判定要介護2_二次判定要介護2;
    private RString 一次判定要介護2_二次判定要介護3;
    private RString 一次判定要介護2_二次判定要介護4;
    private RString 一次判定要介護2_二次判定要介護5;
    private RString 一次判定要介護2_計;
    private RString 一次判定要介護2_再調査二次保留分;
    private RString 一次判定要介護2_判定変更者数;
    private RString 一次判定要介護2_軽度変更者数;
    private RString 一次判定要介護2_重度変更者数;
    private RString 一次判定要介護2_判定変更割合;
    private RString 一次判定要介護3タイトル;
    private RString 一次判定要介護3_二次判定非該当;
    private RString 一次判定要介護3_二次判定要支援1;
    private RString 一次判定要介護3_二次判定要支援2;
    private RString 一次判定要介護3_二次判定要介護1;
    private RString 一次判定要介護3_二次判定要介護2;
    private RString 一次判定要介護3_二次判定要介護3;
    private RString 一次判定要介護3_二次判定要介護4;
    private RString 一次判定要介護3_二次判定要介護5;
    private RString 一次判定要介護3_計;
    private RString 一次判定要介護3_再調査二次保留分;
    private RString 一次判定要介護3_判定変更者数;
    private RString 一次判定要介護3_軽度変更者数;
    private RString 一次判定要介護3_重度変更者数;
    private RString 一次判定要介護3_判定変更割合;
    private RString 一次判定要介護4タイトル;
    private RString 一次判定要介護4_二次判定非該当;
    private RString 一次判定要介護4_二次判定要支援1;
    private RString 一次判定要介護4_二次判定要支援2;
    private RString 一次判定要介護4_二次判定要介護1;
    private RString 一次判定要介護4_二次判定要介護2;
    private RString 一次判定要介護4_二次判定要介護3;
    private RString 一次判定要介護4_二次判定要介護4;
    private RString 一次判定要介護4_二次判定要介護5;
    private RString 一次判定要介護4_計;
    private RString 一次判定要介護4_再調査二次保留分;
    private RString 一次判定要介護4_判定変更者数;
    private RString 一次判定要介護4_軽度変更者数;
    private RString 一次判定要介護4_重度変更者数;
    private RString 一次判定要介護4_判定変更割合;
    private RString 一次判定要介護5タイトル;
    private RString 一次判定要介護5_二次判定非該当;
    private RString 一次判定要介護5_二次判定要支援1;
    private RString 一次判定要介護5_二次判定要支援2;
    private RString 一次判定要介護5_二次判定要介護1;
    private RString 一次判定要介護5_二次判定要介護2;
    private RString 一次判定要介護5_二次判定要介護3;
    private RString 一次判定要介護5_二次判定要介護4;
    private RString 一次判定要介護5_二次判定要介護5;
    private RString 一次判定要介護5_計;
    private RString 一次判定要介護5_再調査二次保留分;
    private RString 一次判定要介護5_判定変更者数;
    private RString 一次判定要介護5_軽度変更者数;
    private RString 一次判定要介護5_重度変更者数;
    private RString 一次判定要介護5_判定変更割合;
    private RString 計タイトル;
    private RString 計_二次判定非該当;
    private RString 計_二次判定要支援1;
    private RString 計_二次判定要支援2;
    private RString 計_二次判定要介護1;
    private RString 計_二次判定要介護2;
    private RString 計_二次判定要介護3;
    private RString 計_二次判定要介護4;
    private RString 計_二次判定要介護5;
    private RString 計_計;
    private RString 計_再調査二次保留分;
    private RString 計_判定変更者数;
    private RString 計_軽度変更者数;
    private RString 計_重度変更者数;
    private RString 計_判定変更割合;
    private RString 変更者タイトル;
    private RString 変更者_二次判定非該当;
    private RString 変更者_二次判定要支援1;
    private RString 変更者_二次判定要支援2;
    private RString 変更者_二次判定要介護1;
    private RString 変更者_二次判定要介護2;
    private RString 変更者_二次判定要介護3;
    private RString 変更者_二次判定要介護4;
    private RString 変更者_二次判定要介護5;
    private RString 変更者_計;
    private RString 変更者_再調査二次保留分;
    private RString 変更者_判定変更者数;
    private RString 変更者_軽度変更者数;
    private RString 変更者_重度変更者数;
    private RString 変更者_判定変更割合;
    private RString 割合タイトル;
    private RString 割合_二次判定非該当;
    private RString 割合_二次判定要支援1;
    private RString 割合_二次判定要支援2;
    private RString 割合_二次判定要介護1;
    private RString 割合_二次判定要介護2;
    private RString 割合_二次判定要介護3;
    private RString 割合_二次判定要介護4;
    private RString 割合_二次判定要介護5;
    private RString 割合_計;
    private RString 割合_再調査二次保留分;
    private RString 割合_判定変更者数;
    private RString 割合_軽度変更者数;
    private RString 割合_重度変更者数;
    private RString 割合_判定変更割合;
    private RString 変更者;
    private RString 軽度;
    private RString 重度;
    private RString 帳票ID;

}