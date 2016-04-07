/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.service.core.nyutaishoshakanri;

import jp.co.ndensan.reams.db.dba.definition.mybatisprm.nyutaishoshakanri.NyutaishoshaKanriMapperParameter;
import jp.co.ndensan.reams.db.dba.persistence.db.mapper.relate.nyutaishoshakanri.INyutaishoshaKanriMapper;
import jp.co.ndensan.reams.db.dbz.service.core.MapperProvider;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 介護保険施設入退所者管理の履歴期間重複チェックです。
 *
 * @reamsid_L DBA-0360-010 duanzhanli
 *
 */
public class NyutaishoshaKanriFinder {

    private static final RString 介護保険施設 = new RString("11");
    private static final RString 住所地特例対象施設 = new RString("12");
    private static final RString 適用除外施設 = new RString("21");
    private final MapperProvider mapperProvider;

    /**
     * コンストラクタです。
     */
    public NyutaishoshaKanriFinder() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link NyutaishoshaKanriFinder}のインスタンスを返します。
     *
     * @return NyutaishoshaKanriFinder
     */
    public static NyutaishoshaKanriFinder createInstance() {
        return InstanceProvider.create(NyutaishoshaKanriFinder.class);
    }

    /**
     * 単体テスト用のコンストラクタです。
     *
     * @param mapperProvider mapperProvider
     */
    NyutaishoshaKanriFinder(MapperProvider mapperProvider) {
        this.mapperProvider = mapperProvider;
    }

    /**
     * 介護保険施設情報件数を取得する
     *
     * @param 入所年月日 入所年月日
     * @param 退所年月日 退所年月日
     * @param 入所施設種類 入所施設種類
     * @return rirekiKikanJufukuFlag
     */
    @Transaction
    public Boolean isRirekiKikanJufukuFlag(FlexibleDate 入所年月日, FlexibleDate 退所年月日, RString 入所施設種類) {
        int count = 0;
        INyutaishoshaKanriMapper mapper = mapperProvider.create(INyutaishoshaKanriMapper.class);
        NyutaishoshaKanriMapperParameter parameter;
        switch (入所施設種類.toString()) {
            case "11":
                parameter = NyutaishoshaKanriMapperParameter.createSelectByKeyParam(入所年月日, 退所年月日, 介護保険施設);
                count = mapper.getHihokenshaDaichoCount(parameter);
                break;
            case "21":
                parameter = NyutaishoshaKanriMapperParameter.createSelectByKeyParam(入所年月日, 退所年月日, 適用除外施設);
                count = mapper.getTekiyoJogaishaCount(parameter);
                break;
            case "12":
                parameter = NyutaishoshaKanriMapperParameter.createSelectByKeyParam(入所年月日, 退所年月日, 住所地特例対象施設);
                count = mapper.getTashichosonJushochiTokureiCount(parameter);
                break;
            default:
                break;
        }
        return 2 <= count;
    }
}
