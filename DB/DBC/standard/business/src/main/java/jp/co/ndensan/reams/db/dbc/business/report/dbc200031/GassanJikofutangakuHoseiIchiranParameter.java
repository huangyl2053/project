/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.dbc200031;

import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc200031.GassanJikofutangakuHoseiIchiranEntity;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 帳票設計_DBCMN62002_高額合算自己負担額補正結果一覧表帳票のパラメータです。
 *
 * @reamsid_L DBC-2320-040 jiangxiaolong
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class GassanJikofutangakuHoseiIchiranParameter {

    private GassanJikofutangakuHoseiIchiranEntity 高額合算自己負担額補正一覧表;
    private RString 市町村コード;
    private RString 市町村名称;
    private RDateTime 作成日時;
    private RString 出力順1;
    private RString 出力順2;
    private RString 出力順3;
    private RString 出力順4;
    private RString 出力順5;
    private RString 改頁1;
    private RString 改頁2;
    private RString 改頁3;
    private RString 改頁4;
    private RString 改頁5;

}