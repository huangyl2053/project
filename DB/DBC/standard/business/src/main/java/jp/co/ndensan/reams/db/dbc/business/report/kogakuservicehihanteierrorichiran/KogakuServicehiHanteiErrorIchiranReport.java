/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.kogakuservicehihanteierrorichiran;

import java.util.List;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakuservicehihanteierrorichiran.KogakuServicehiHanteiErrorIchiranSource;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakuservicehihanteierrorlist.KogakuServicehiHanteiErrorListEntity;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 帳票設計_DBCMN41002_高額介護サービス費判定エラーリスト Report
 *
 * @reamsid_L DBC-2010-110 sunhui
 */
public class KogakuServicehiHanteiErrorIchiranReport extends Report<KogakuServicehiHanteiErrorIchiranSource> {

    private final List<KogakuServicehiHanteiErrorListEntity> entityList;
    private final Association association;
    private final RString 並び順の１件目;
    private final RString 並び順の２件目;
    private final RString 並び順の３件目;
    private final RString 並び順の４件目;
    private final RString 並び順の５件目;
    private final List<RString> 改頁項目List;

    /**
     * インスタンスを生成します。
     *
     * @param entityList List<KogakuServicehiHanteiErrorListEntity>
     * @param association Association
     * @param 並び順の１件目 RString
     * @param 並び順の２件目 RString
     * @param 並び順の３件目 RString
     * @param 並び順の４件目 RString
     * @param 並び順の５件目 RString
     * @param 改頁項目List List<RString>
     */
    public KogakuServicehiHanteiErrorIchiranReport(List<KogakuServicehiHanteiErrorListEntity> entityList,
            Association association, RString 並び順の１件目, RString 並び順の２件目, RString 並び順の３件目,
            RString 並び順の４件目, RString 並び順の５件目, List<RString> 改頁項目List) {
        this.entityList = entityList;
        this.association = association;
        this.並び順の１件目 = 並び順の１件目;
        this.並び順の２件目 = 並び順の２件目;
        this.並び順の３件目 = 並び順の３件目;
        this.並び順の４件目 = 並び順の４件目;
        this.並び順の５件目 = 並び順の５件目;
        this.改頁項目List = 改頁項目List;
    }

    @Override
    public void writeBy(ReportSourceWriter<KogakuServicehiHanteiErrorIchiranSource> reportSourceWriter) {
        IKogakuServicehiHanteiErrorIchiranEditor editor
                = new KogakuServicehiHanteiErrorIchiranEditor(entityList, association, 並び順の１件目, 並び順の２件目,
                        並び順の３件目, 並び順の４件目, 並び順の５件目, 改頁項目List);
        IKogakuServicehiHanteiErrorIchiranBuilder builder
                = new KogakuServicehiHanteiErrorIchiranBuilder(editor);
        reportSourceWriter.writeLine(builder);
    }
}
