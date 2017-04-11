/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.yokaigoninteijohoteikyoisshiki;

import jp.co.ndensan.reams.db.dbe.definition.core.yokaigoninteijohoteikyoisshiki.JohoTeikyoIsshiki;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.shujikensho.ShujiiikenshoEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.yokaigoninteijohoteikyoisshiki.YokaigoNinteiJohoTeikyoIsshikiReportSource;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;

/**
 * 要介護認定情報提供一式主治医意見書Builderクラスです。
 *
 * @author N3212 竹内 和紀
 */
public class JohoTeikyoIsshikiShujiiikenshoBuilder implements IJohoTeikyoIsshikiBuilder {

    private final ShujiiikenshoEntity item;
    private final JohoTeikyoIsshiki layout;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link ShujiiikenshoEntity}
     * @param layout layout
     */
    public JohoTeikyoIsshikiShujiiikenshoBuilder(ShujiiikenshoEntity item, JohoTeikyoIsshiki layout) {
        this.item = item;
        this.layout = layout;
    }

    @Override
    public YokaigoNinteiJohoTeikyoIsshikiReportSource build() {
        YokaigoNinteiJohoTeikyoIsshikiReportSource source = new YokaigoNinteiJohoTeikyoIsshikiReportSource();
        source.hokenshaNo = item.get保険者番号();
        source.hihokenshaNo = item.get被保険者番号();
        source.hihokenshaName = item.get被保険者氏名();
        source.shinseiGengo = item.get申請日_元号();
        source.shinseiYY = !RString.isNullOrEmpty(item.get申請日_年()) ? item.get申請日_年().substring(2) : RString.EMPTY;
        source.shinseiMM = item.get申請日_月();
        source.shinseiDD = item.get申請日_日();
        source.sakuseiGengo = item.get作成日_元号();
        source.sakuseiYY = !RString.isNullOrEmpty(item.get作成日_年()) ? item.get作成日_年().substring(2) : RString.EMPTY;
        source.sakuseiMM = item.get作成日_月();
        source.sakuseiDD = item.get作成日_日();
        source.chosaGengo = item.get調査日_元号();
        source.chosaYY = !RString.isNullOrEmpty(item.get調査日_年()) ? item.get調査日_年().substring(2) : RString.EMPTY;
        source.chosaMM = item.get調査日_月();
        source.chosaDD = item.get調査日_日();
        source.shinsaGengo = item.get審査日_元号();
        source.shinsaYY = !RString.isNullOrEmpty(item.get審査日_年()) ? item.get審査日_年().substring(2) : RString.EMPTY;
        source.shinsaMM = item.get審査日_月();
        source.shinsaDD = item.get審査日_日();
        source.imgIkensho1 = item.getイメージファイル1();
        source.imgIkensho2 = item.getイメージファイル2();
        source.識別コード = new ShikibetsuCode(item.getTemp_保険者番号().substring(0, 5).concat(item.getTemp_被保険者番号()));
        source.拡張情報 = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), item.getTemp_申請書管理番号());
        source.layout = layout.getFormGroupIndex();
        return source;
    }
}
