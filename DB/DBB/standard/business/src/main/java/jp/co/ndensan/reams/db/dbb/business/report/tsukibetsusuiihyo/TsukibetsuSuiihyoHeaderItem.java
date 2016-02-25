/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.tsukibetsusuiihyo;

import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;

/**
 *
 * 月別推移表ヘッダのITEMです。
 */
@Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class TsukibetsuSuiihyoHeaderItem {

    private final RString 合計 = new RString("合計");
    private final RString printTimeStamp;
    private final RString gengo;
    private final RString nendo;
    private final RString hokenshaNo;
    private final RString hokenshaName;
    private final RString choshuHouhouTitle;
    private final RString ninsuGokeiTitle;
    private final RString kingakuGokeiTitle;

    /**
     * インスタンスを生成します。
     *
     * @param gengo 元号
     * @param nendo 年度
     * @param hokenshaNo 保険者番号
     * @param hokenshaName 保険者名称
     * @param choshuHouhouTitle 徴収方法Title
     */
    public TsukibetsuSuiihyoHeaderItem(
            RString gengo,
            RString nendo,
            RString hokenshaNo,
            RString hokenshaName,
            RString choshuHouhouTitle
    ) {
        this.printTimeStamp = RDate.getNowDate().toDateString();
        this.gengo = gengo;
        this.nendo = nendo;
        this.hokenshaNo = hokenshaNo;
        this.hokenshaName = hokenshaName;
        this.choshuHouhouTitle = choshuHouhouTitle;
        this.ninsuGokeiTitle = 合計;
        this.kingakuGokeiTitle = 合計;
    }
}
