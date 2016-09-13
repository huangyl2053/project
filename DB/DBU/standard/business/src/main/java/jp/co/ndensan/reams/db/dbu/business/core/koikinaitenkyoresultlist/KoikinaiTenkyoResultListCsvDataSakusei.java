/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.business.core.koikinaitenkyoresultlist;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbu.entity.db.relate.kouikitenkyoresultlist.KoikinaiTenkyoCSVDataEntity;
import jp.co.ndensan.reams.db.dbu.entity.db.relate.kouikitenkyoresultlist.KoikinaiTenkyoEntity;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;

/**
 * 広域内転居結果一覧表CSVデータ作成
 *
 * @reamsid_L DBU-1150-030 xuhao
 */
public class KoikinaiTenkyoResultListCsvDataSakusei {

    /**
     * 広域内転居結果一覧表バッチから取った入力パラメータにより、CSVデータを作成する
     *
     * @param 広域内転居結果リスト 広域内転居結果リスト
     * @return List<KoikinaiTenkyoCSVDataEntity>
     */
    public List<KoikinaiTenkyoCSVDataEntity> getKoikinaiTenkyoResultListCsvData(
            List<KoikinaiTenkyoEntity> 広域内転居結果リスト) {
        List<KoikinaiTenkyoCSVDataEntity> tenkyoCSVDataEntityList = new ArrayList<>();
        if (広域内転居結果リスト == null || 広域内転居結果リスト.isEmpty()) {
            return tenkyoCSVDataEntityList;
        }
        for (KoikinaiTenkyoEntity koikinaiTenkyoEntity : 広域内転居結果リスト) {
            KoikinaiTenkyoCSVDataEntity entity = new KoikinaiTenkyoCSVDataEntity();
            if (koikinaiTenkyoEntity.get被保険者番号() != null) {
                entity.set被保険者番号(koikinaiTenkyoEntity.get被保険者番号().value());
            }
            if (koikinaiTenkyoEntity.get氏名カナ() != null) {
                entity.set氏名カナ(new RString(koikinaiTenkyoEntity.get氏名カナ().toString()));
            }
            if (koikinaiTenkyoEntity.get氏名() != null) {
                entity.set氏名(new RString(koikinaiTenkyoEntity.get氏名().toString()));
            }
            if (koikinaiTenkyoEntity.get旧住民コード() != null) {
                entity.set旧住民コード(new RString(koikinaiTenkyoEntity.get旧住民コード().toString()));
            }
            if (koikinaiTenkyoEntity.get前住所() != null) {
                entity.set前住所(koikinaiTenkyoEntity.get前住所());
            }
            if (koikinaiTenkyoEntity.get転出予定日() != null) {

                entity.set転出予定日(koikinaiTenkyoEntity.get転出予定日().wareki().eraType(EraType.KANJI_RYAKU).
                        firstYear(FirstYear.GAN_NEN).separator(Separator.PERIOD).fillType(FillType.BLANK).toDateString());
            }
            if (koikinaiTenkyoEntity.get転出確定日() != null) {
                entity.set転出確定日(koikinaiTenkyoEntity.get転出確定日().wareki().eraType(EraType.KANJI_RYAKU).
                        firstYear(FirstYear.GAN_NEN).separator(Separator.PERIOD).fillType(FillType.BLANK).toDateString());
            }
            if (koikinaiTenkyoEntity.get転出確定通知日() != null) {

                entity.set転出確定通知日(koikinaiTenkyoEntity.get転出確定通知日().wareki().eraType(
                        EraType.KANJI_RYAKU).firstYear(FirstYear.GAN_NEN).separator(Separator.PERIOD).
                        fillType(FillType.BLANK).toDateString());
            }
            if (koikinaiTenkyoEntity.get処理日() != null) {
                entity.set処理日(koikinaiTenkyoEntity.get処理日().wareki().eraType(EraType.KANJI_RYAKU).
                        firstYear(FirstYear.GAN_NEN).separator(Separator.PERIOD).fillType(FillType.BLANK).toDateString());
            }
            if (koikinaiTenkyoEntity.get新住民コード() != null) {
                entity.set新住民コード(new RString(koikinaiTenkyoEntity.get新住民コード().toString()));
            }
            if (koikinaiTenkyoEntity.get現住所() != null) {
                entity.set現住所(koikinaiTenkyoEntity.get現住所());
            }
            if (koikinaiTenkyoEntity.get登録異動日() != null) {
                entity.set登録異動日(koikinaiTenkyoEntity.get登録異動日().wareki().eraType(EraType.KANJI_RYAKU).
                        firstYear(FirstYear.GAN_NEN).separator(Separator.PERIOD).fillType(FillType.BLANK).toDateString());
            }
            if (koikinaiTenkyoEntity.get登録届出日() != null) {
                entity.set登録届出日(koikinaiTenkyoEntity.get登録届出日().wareki().eraType(EraType.KANJI_RYAKU).
                        firstYear(FirstYear.GAN_NEN).separator(Separator.PERIOD).fillType(FillType.BLANK).toDateString());
            }
            if (koikinaiTenkyoEntity.get異動情報() != null) {
                entity.set異動情報(koikinaiTenkyoEntity.get異動情報());
            }
            tenkyoCSVDataEntityList.add(entity);
        }
        return tenkyoCSVDataEntityList;
    }
}