package jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.shisetsunyutaishorirekikanri;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Fri Nov 14 13:05:24 JST 2014 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxFlexibleDate;


/**
 * dgShisetsuNyutaishoRireki_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgShisetsuNyutaishoRireki_Row extends DataRow {

    private RString state;
    private TextBoxFlexibleDate nyushoDate;
    private TextBoxFlexibleDate taishoDate;
    private RString shisetsuCode;
    private RString shisetsuMeisho;
    private RString shisetsu;
    private RString daichoShubetsuKey;
    private RString daichoShubetsu;
    private RString shisetsuShuruiKey;
    private RString shisetsuShurui;

    public dgShisetsuNyutaishoRireki_Row() {
        super();
        this.state = RString.EMPTY;
        this.nyushoDate = new TextBoxFlexibleDate();
        this.taishoDate = new TextBoxFlexibleDate();
        this.shisetsuCode = RString.EMPTY;
        this.shisetsuMeisho = RString.EMPTY;
        this.shisetsu = RString.EMPTY;
        this.daichoShubetsuKey = RString.EMPTY;
        this.daichoShubetsu = RString.EMPTY;
        this.shisetsuShuruiKey = RString.EMPTY;
        this.shisetsuShurui = RString.EMPTY;
    }

    public dgShisetsuNyutaishoRireki_Row(RString state, TextBoxFlexibleDate nyushoDate, TextBoxFlexibleDate taishoDate, RString shisetsuCode, RString shisetsuMeisho, RString shisetsu, RString daichoShubetsuKey, RString daichoShubetsu, RString shisetsuShuruiKey, RString shisetsuShurui) {
        super();
        this.setOriginalData("state", state);
        this.setOriginalData("nyushoDate", nyushoDate);
        this.setOriginalData("taishoDate", taishoDate);
        this.setOriginalData("shisetsuCode", shisetsuCode);
        this.setOriginalData("shisetsuMeisho", shisetsuMeisho);
        this.setOriginalData("shisetsu", shisetsu);
        this.setOriginalData("daichoShubetsuKey", daichoShubetsuKey);
        this.setOriginalData("daichoShubetsu", daichoShubetsu);
        this.setOriginalData("shisetsuShuruiKey", shisetsuShuruiKey);
        this.setOriginalData("shisetsuShurui", shisetsuShurui);
        this.state = state;
        this.nyushoDate = nyushoDate;
        this.taishoDate = taishoDate;
        this.shisetsuCode = shisetsuCode;
        this.shisetsuMeisho = shisetsuMeisho;
        this.shisetsu = shisetsu;
        this.daichoShubetsuKey = daichoShubetsuKey;
        this.daichoShubetsu = daichoShubetsu;
        this.shisetsuShuruiKey = shisetsuShuruiKey;
        this.shisetsuShurui = shisetsuShurui;
    }

    public RString getState() {
        return state;
    }

    public TextBoxFlexibleDate getNyushoDate() {
        return nyushoDate;
    }

    public TextBoxFlexibleDate getTaishoDate() {
        return taishoDate;
    }

    public RString getShisetsuCode() {
        return shisetsuCode;
    }

    public RString getShisetsuMeisho() {
        return shisetsuMeisho;
    }

    public RString getShisetsu() {
        return shisetsu;
    }

    public RString getDaichoShubetsuKey() {
        return daichoShubetsuKey;
    }

    public RString getDaichoShubetsu() {
        return daichoShubetsu;
    }

    public RString getShisetsuShuruiKey() {
        return shisetsuShuruiKey;
    }

    public RString getShisetsuShurui() {
        return shisetsuShurui;
    }

    public void setState(RString state) {
        this.setOriginalData("state", state);
        this.state = state;
    }

    public void setNyushoDate(TextBoxFlexibleDate nyushoDate) {
        this.setOriginalData("nyushoDate", nyushoDate);
        this.nyushoDate = nyushoDate;
    }

    public void setTaishoDate(TextBoxFlexibleDate taishoDate) {
        this.setOriginalData("taishoDate", taishoDate);
        this.taishoDate = taishoDate;
    }

    public void setShisetsuCode(RString shisetsuCode) {
        this.setOriginalData("shisetsuCode", shisetsuCode);
        this.shisetsuCode = shisetsuCode;
    }

    public void setShisetsuMeisho(RString shisetsuMeisho) {
        this.setOriginalData("shisetsuMeisho", shisetsuMeisho);
        this.shisetsuMeisho = shisetsuMeisho;
    }

    public void setShisetsu(RString shisetsu) {
        this.setOriginalData("shisetsu", shisetsu);
        this.shisetsu = shisetsu;
    }

    public void setDaichoShubetsuKey(RString daichoShubetsuKey) {
        this.setOriginalData("daichoShubetsuKey", daichoShubetsuKey);
        this.daichoShubetsuKey = daichoShubetsuKey;
    }

    public void setDaichoShubetsu(RString daichoShubetsu) {
        this.setOriginalData("daichoShubetsu", daichoShubetsu);
        this.daichoShubetsu = daichoShubetsu;
    }

    public void setShisetsuShuruiKey(RString shisetsuShuruiKey) {
        this.setOriginalData("shisetsuShuruiKey", shisetsuShuruiKey);
        this.shisetsuShuruiKey = shisetsuShuruiKey;
    }

    public void setShisetsuShurui(RString shisetsuShurui) {
        this.setOriginalData("shisetsuShurui", shisetsuShurui);
        this.shisetsuShurui = shisetsuShurui;
    }

}