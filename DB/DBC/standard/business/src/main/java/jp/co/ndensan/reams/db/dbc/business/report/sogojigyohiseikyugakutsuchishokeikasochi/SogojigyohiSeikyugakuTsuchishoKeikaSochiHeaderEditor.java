/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.sogojigyohiseikyugakutsuchishokeikasochi;

import jp.co.ndensan.reams.db.dbc.entity.csv.dbc120230.DbWT1511SeikyugakuTsuchishoTempEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.source.SogojigyohiSeiDoIchiranhyoSakusei.SogojigyohiSeikyugakuTsuchishoKeikaSochiSource;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;
import jp.co.ndensan.reams.uz.uza.util.db.IDbColumnMappable;

/**
 * 総合事業費（経過措置）請求額通知書一覧表帳票HeaderIEditorクラスです。
 *
 * @reamsid_L DBC-2480-031 jiangxiaolong
 */
public class SogojigyohiSeikyugakuTsuchishoKeikaSochiHeaderEditor implements ISogojigyohiSeikyugakuTsuchishoKeikaSochiEditor {

    private final DbWT1511SeikyugakuTsuchishoTempEntity 帳票出力対象データ;
    private final RDateTime 作成日時;
    private static final RString SAKUSEI = new RString("作成");
    private final RString 総合計 = new RString("＊＊　総合計　＊＊");
    private final RString コード_99 = new RString("99");

    /**
     * コンストラクタです
     *
     * @param 帳票出力対象データ DbWT1511SeikyugakuTsuchishoEntity
     * @param 作成日時 RDateTime
     */
    public SogojigyohiSeikyugakuTsuchishoKeikaSochiHeaderEditor(
            DbWT1511SeikyugakuTsuchishoTempEntity 帳票出力対象データ, RDateTime 作成日時) {
        this.帳票出力対象データ = 帳票出力対象データ;
        this.作成日時 = 作成日時;
    }

    @Override
    public SogojigyohiSeikyugakuTsuchishoKeikaSochiSource edit(
            SogojigyohiSeikyugakuTsuchishoKeikaSochiSource source) {
        RString 作成日 = 作成日時.getDate().wareki().eraType(EraType.KANJI)
                .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        RString 作成時 = 作成日時.getTime()
                .toFormattedTimeString(DisplayTimeFormat.HH時mm分ss秒).concat(RString.HALF_SPACE).concat(SAKUSEI);
        source.printTimeStamp = 作成日.concat(RString.HALF_SPACE).concat(作成時);
        source.shinsaYM = 帳票出力対象データ.get審査年月()
                .wareki().eraType(EraType.KANJI_RYAKU).firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        source.hokenshaNo = getColumnValue(帳票出力対象データ.get保険者番号());
        source.hokenshaName = 帳票出力対象データ.get保険者名();
        if (コード_99.equals(帳票出力対象データ.get款コード())) {
            source.kanName = 帳票出力対象データ.get款名();
        } else {
            source.kanName = 総合計;
        }
        if (コード_99.equals(帳票出力対象データ.get項コード())) {
            source.kouName = 帳票出力対象データ.get項名();
        } else {
            source.kouName = RString.EMPTY;
        }
        source.kokuhorenName = 帳票出力対象データ.get国保連合会名();
        source.shoKisaiHokenshaNo = getColumnValue(帳票出力対象データ.get証記載保険者番号());

        return source;
    }

    private RString getColumnValue(IDbColumnMappable entity) {
        if (null != entity) {
            return entity.getColumnValue();
        }
        return RString.EMPTY;
    }
}
