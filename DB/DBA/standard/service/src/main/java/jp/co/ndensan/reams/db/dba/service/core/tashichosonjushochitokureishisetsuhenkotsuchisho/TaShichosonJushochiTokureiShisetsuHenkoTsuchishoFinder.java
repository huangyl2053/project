/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.service.core.tashichosonjushochitokureishisetsuhenkotsuchisho;

import java.util.List;
import jp.co.ndensan.reams.db.dba.definition.mybatis.param.tashihenkotsuchisho.TaShichosonJushochiTokureiShisetsuHenkoTsuchishoMybatisParameter;
import jp.co.ndensan.reams.db.dba.entity.TatokuKanrenChohyoHenkoTsuchishoEntity;
import jp.co.ndensan.reams.db.dba.entity.TatokuKanrenChohyoShijiDataEntity;
import jp.co.ndensan.reams.db.dba.entity.db.relate.TaShichosonJushochiTokureiShisetsuHenkoTsuchishoRelateEntity;
import jp.co.ndensan.reams.db.dba.persistence.mapper.tashihenkotsuchisho.ITaShichosonJushochiTokureiShisetsuHenkoTsuchishoMapper;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.kyotsu.NinshoshaDenshikoinshubetsuCode;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1005KaigoJogaiTokureiTaishoShisetsuEntity;
import jp.co.ndensan.reams.db.dbz.service.core.MapperProvider;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoPSMSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.KensakuYusenKubun;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.psm.DataShutokuKubun;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoPSMSearchKey;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.ninshosha.Ninshosha;
import jp.co.ndensan.reams.ur.urz.business.report.parts.ninshosha.INinshoshaSourceBuilder;
import jp.co.ndensan.reams.ur.urz.business.report.parts.ninshosha.NinshoshaSourceBuilderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.association.IAssociationFinder;
import jp.co.ndensan.reams.ur.urz.service.core.ninshosha.INinshoshaManager;
import jp.co.ndensan.reams.ur.urz.service.core.ninshosha.NinshoshaFinderFactory;
import jp.co.ndensan.reams.ux.uxx.business.core.tsuchishoteikeibun.TsuchishoTeikeibunInfo;
import jp.co.ndensan.reams.ux.uxx.service.core.tsuchishoteikeibun.TsuchishoTeikeibunManager;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.KamokuCode;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.report.util.barcode.CustomerBarCode;
import jp.co.ndensan.reams.uz.uza.report.util.barcode.CustomerBarCodeResult;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 介護保険住所地特例施設変更通知書のビジネスクラスです。
 *
 */
public class TaShichosonJushochiTokureiShisetsuHenkoTsuchishoFinder {

    private final MapperProvider mapperProvider;
    private static final int INT1 = 1;
    private static final int INT2 = 2;
    private static final int INT3 = 3;
    private static final int INT4 = 4;
    private static final int INT5 = 5;
    private static final int INT6 = 6;
    private static final int INT7 = 7;
    private static final int INT8 = 8;
    private static final int INT9 = 9;
    private static final int INT10 = 10;
    private static final int INT100 = 100;

    /**
     * コンストラクタです。
     */
    public TaShichosonJushochiTokureiShisetsuHenkoTsuchishoFinder() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * 他住特施設変更通知書データ作成
     *
     * @param inEntity 他市町村住所地特例者関連帳票発行指示データEntity
     * @return 他住特施設変更通知書データEntity
     */
    public TatokuKanrenChohyoHenkoTsuchishoEntity setTatokuKanrenChohyoTaishoTsuchisho(TatokuKanrenChohyoShijiDataEntity inEntity) {
        TatokuKanrenChohyoHenkoTsuchishoEntity outEntity = new TatokuKanrenChohyoHenkoTsuchishoEntity();
        outEntity.set保険者郵便番号(inEntity.get保険者郵便番号().getEditedYubinNo());
        outEntity.set文書番号(inEntity.get文書番号());
        outEntity.set保険者住所(inEntity.get保険者住所());
        outEntity.set発行年月日(inEntity.get発行年月日().
                wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString());
        outEntity.set保険者名(inEntity.get保険者名());
        outEntity.set保険者名敬称(inEntity.get保険者名敬称());
        outEntity.set担当部署名(inEntity.get担当部署名());
        outEntity.set担当部署名敬称(inEntity.get担当部署名敬称());

        CustomerBarCode barCode = new CustomerBarCode();
        if (inEntity.get保険者郵便番号() != null && inEntity.get保険者住所() != null) {
            CustomerBarCodeResult result = barCode.convertCustomerBarCode(
                    new RString(inEntity.get保険者郵便番号().toString()), inEntity.get保険者住所());
            if (result != null) {
                outEntity.setバーコード情報(result.getCustomerBarCode());
            }
        }

        TsuchishoTeikeibunManager tsuchishoTeikeibunManager = new TsuchishoTeikeibunManager();
        TsuchishoTeikeibunInfo tsuchishoTeikeibunInfo = tsuchishoTeikeibunManager.get通知書定形文検索(
                SubGyomuCode.DBA介護資格,
                new ReportId("DBA100006_JushochitokureiShisetsuHenkoTsuchisho"),
                KamokuCode.EMPTY,
                1,
                1,
                new FlexibleDate(RDate.getNowDate().toDateString()));
        outEntity.set見出し(tsuchishoTeikeibunInfo.getUrT0126TsuchishoTeikeibunEntity().getSentence());

        RString 被保険者番号 = inEntity.get被保険者番号();
        if (被保険者番号 != null && INT10 <= 被保険者番号.length()) {
            outEntity.set被保険者番号１(被保険者番号.substring(0, INT1));
            outEntity.set被保険者番号２(被保険者番号.substring(INT1, INT2));
            outEntity.set被保険者番号３(被保険者番号.substring(INT2, INT3));
            outEntity.set被保険者番号４(被保険者番号.substring(INT3, INT4));
            outEntity.set被保険者番号５(被保険者番号.substring(INT4, INT5));
            outEntity.set被保険者番号６(被保険者番号.substring(INT5, INT6));
            outEntity.set被保険者番号７(被保険者番号.substring(INT6, INT7));
            outEntity.set被保険者番号８(被保険者番号.substring(INT7, INT8));
            outEntity.set被保険者番号９(被保険者番号.substring(INT8, INT9));
            outEntity.set被保険者番号１０(被保険者番号.substring(INT9, INT10));
        }

        ShikibetsuTaishoPSMSearchKeyBuilder builder = new ShikibetsuTaishoPSMSearchKeyBuilder(GyomuCode.DB介護保険, KensakuYusenKubun.住登外優先);
        builder.setデータ取得区分(DataShutokuKubun.基準日時点の最新のレコード);
        builder.set基準日(inEntity.get入所年月日());
        builder.set識別コード(inEntity.get識別コード());
        IShikibetsuTaishoPSMSearchKey shikibetsuTaishoPSMSearchKey = builder.build();
        TaShichosonJushochiTokureiShisetsuHenkoTsuchishoMybatisParameter params
                = new TaShichosonJushochiTokureiShisetsuHenkoTsuchishoMybatisParameter(shikibetsuTaishoPSMSearchKey);
        params.setPsmShikibetsuTaisho(new RString(params.toString()));
        ITaShichosonJushochiTokureiShisetsuHenkoTsuchishoMapper mapper
                = this.mapperProvider.create(ITaShichosonJushochiTokureiShisetsuHenkoTsuchishoMapper.class);
        TaShichosonJushochiTokureiShisetsuHenkoTsuchishoRelateEntity pSMEntity
                = mapper.selectTaShichosonJushochiTokureiShisetsuHenkoTsuchishoMybatis(params);
        if (pSMEntity != null) {
            outEntity.set対象者名カナ(pSMEntity.getカナ名称());
            outEntity.set対象者名(pSMEntity.get名称());
            outEntity.set誕生日(pSMEntity.get生年月日().
                    wareki().eraType(EraType.KANJI).
                    firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString());
            outEntity.set性別(pSMEntity.get性別コード());
        }

        outEntity.set変更年月日(inEntity.get入所年月日().
                wareki().eraType(EraType.KANJI).
                firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString());
        ITaShichosonJushochiTokureiShisetsuHenkoTsuchishoMapper henkoTsuchishoMapper
                = this.mapperProvider.create(ITaShichosonJushochiTokureiShisetsuHenkoTsuchishoMapper.class);
        List<DbT1005KaigoJogaiTokureiTaishoShisetsuEntity> entityList
                = henkoTsuchishoMapper.getTaShichosonJushochiTokureiShisetsuHenkoTsuchisho(inEntity);
        if (entityList.size() >= 0 && entityList.get(0) != null) {
            outEntity.set変更前施設名称(entityList.get(0).getJigyoshaMeisho());
            outEntity.set変更前施設電話番号(entityList.get(0).getTelNo());
            outEntity.set変更前施設FAX番号(entityList.get(0).getFaxNo());
            outEntity.set変更前施設郵便番号(entityList.get(0).getYubinNo());
            outEntity.set変更前施設住所(entityList.get(0).getJigyoshaJusho());
        }
        if (entityList.size() >= 1 && entityList.get(1) != null) {
            outEntity.set変更後施設名称(entityList.get(1).getJigyoshaMeisho());
            outEntity.set変更後施設電話番号(entityList.get(1).getTelNo());
            outEntity.set変更後施設FAX番号(entityList.get(1).getFaxNo());
            outEntity.set変更後施設郵便番号(entityList.get(1).getYubinNo());
            outEntity.set変更後施設住所(entityList.get(1).getJigyoshaJusho());
        }

        IAssociationFinder finder = AssociationFinderFactory.createInstance();
        Association association = finder.getAssociation();
        INinshoshaManager iNinshoshaManager = NinshoshaFinderFactory.createInstance();
        Ninshosha ninshosha = iNinshoshaManager.get帳票認証者(GyomuCode.DB介護保険, NinshoshaDenshikoinshubetsuCode.保険者印.getコード());
        INinshoshaSourceBuilder iNinshoshaSourceBuilder
                = NinshoshaSourceBuilderFactory.createInstance(ninshosha, association, RString.EMPTY, RDate.getNowDate(), INT100);
        outEntity.set電子公印(iNinshoshaSourceBuilder.buildSource().denshiKoin);
        if (iNinshoshaSourceBuilder.buildSource().ninshoshaShimeiKakenai.isEmpty()) {
            outEntity.set首長名(iNinshoshaSourceBuilder.buildSource().ninshoshaShimeiKakeru);
        } else {
            outEntity.set首長名(iNinshoshaSourceBuilder.buildSource().ninshoshaShimeiKakenai);
        }
        outEntity.set市町村名(association.get市町村名());
        outEntity.set公印省略(iNinshoshaSourceBuilder.buildSource().koinShoryaku);
        return outEntity;
    }
}
