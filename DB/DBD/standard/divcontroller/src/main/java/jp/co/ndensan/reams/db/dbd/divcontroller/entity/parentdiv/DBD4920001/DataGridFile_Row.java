package jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD4920001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Mon Sep 05 15:19:40 CST 2016 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;


/**
 * DataGridFile_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class DataGridFile_Row extends DataRow {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-21_20-30-14">

    private RString fileFormat;
    private RString meisho;
    private RString total;
    private RString fileName;
    private Button sansho;

    public DataGridFile_Row() {
        super();
        this.fileFormat = RString.EMPTY;
        this.meisho = RString.EMPTY;
        this.total = RString.EMPTY;
        this.fileName = RString.EMPTY;
        this.sansho = new Button();
        this.setOriginalData("fileFormat", fileFormat);
        this.setOriginalData("meisho", meisho);
        this.setOriginalData("total", total);
        this.setOriginalData("fileName", fileName);
        this.setOriginalData("sansho", sansho);
    }

    public DataGridFile_Row(RString fileFormat, RString meisho, RString total, RString fileName, Button sansho) {
        super();
        this.setOriginalData("fileFormat", fileFormat);
        this.setOriginalData("meisho", meisho);
        this.setOriginalData("total", total);
        this.setOriginalData("fileName", fileName);
        this.setOriginalData("sansho", sansho);
        this.fileFormat = fileFormat;
        this.meisho = meisho;
        this.total = total;
        this.fileName = fileName;
        this.sansho = sansho;
    }

    public RString getFileFormat() {
        return fileFormat;
    }

    public RString getMeisho() {
        return meisho;
    }

    public RString getTotal() {
        return total;
    }

    public RString getFileName() {
        return fileName;
    }

    public Button getSansho() {
        return sansho;
    }

    public void setFileFormat(RString fileFormat) {
        this.setOriginalData("fileFormat", fileFormat);
        this.fileFormat = fileFormat;
    }

    public void setMeisho(RString meisho) {
        this.setOriginalData("meisho", meisho);
        this.meisho = meisho;
    }

    public void setTotal(RString total) {
        this.setOriginalData("total", total);
        this.total = total;
    }

    public void setFileName(RString fileName) {
        this.setOriginalData("fileName", fileName);
        this.fileName = fileName;
    }

    public void setSansho(Button sansho) {
        this.setOriginalData("sansho", sansho);
        this.sansho = sansho;
    }

    // </editor-fold>
}