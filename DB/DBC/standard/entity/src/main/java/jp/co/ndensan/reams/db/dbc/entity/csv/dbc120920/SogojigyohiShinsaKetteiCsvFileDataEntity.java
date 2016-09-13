/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.csv.dbc120920;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * 審査決定請求明細表情報取込共通処理（CSVファイル取込）のCsvFileDataクラスです
 *
 * @reamsid_L DBC-2500-013 jiangxiaolong
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class SogojigyohiShinsaKetteiCsvFileDataEntity {

    private SogojigyohiShinsaKetteiCsvFileHeadRecordEntity headRecordEntity;
    private List<SogojigyohiShinsaKetteiCsvFileMeisaiEntity> listMeisaiEntity;
    private SogojigyohiShinsaKetteiCsvFileToreraRecode1AEntity toreraRecord1AEntity;
    private SogojigyohiShinsaKetteiCsvFileToreraRecode1BEntity toreraRecord1BEntity;
    private SogojigyohiShinsaKetteiCsvFileToreraRecode2Entity toreraRecord2Entity;
}