/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.business.report.hihokenshadaicho;

import jp.co.ndensan.reams.db.dba.business.core.hihokenshadaichosakusei.HihokenshaDaichoSakusei;
import jp.co.ndensan.reams.db.dba.entity.report.hihokenshadaicho.HihokenshaDaichoReportSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 被保険者台帳Editorです。
 */
public class HihokenshaDaichoEditor implements IHihokenshaDaichoEditor {

    private final HihokenshaDaichoSakusei joho;

    /**
     * コンストラクタです。
     *
     * @param joho 被保険者台帳リストです
     */
    public HihokenshaDaichoEditor(HihokenshaDaichoSakusei joho) {
        this.joho = joho;
    }

    /**
     * 被保険者台帳ReportSourceを作成します。
     *
     * @param source 被保険者台帳ReportSource
     * @return 被保険者台帳ReportSource
     */
    @Override
    public HihokenshaDaichoReportSource edit(HihokenshaDaichoReportSource source) {
        return editBody(source);
    }

    private HihokenshaDaichoReportSource editBody(HihokenshaDaichoReportSource source) {
        source.printTimeStamp = joho.get印刷日時();
        source.title = joho.getタイトル();
        source.shichosonCode = joho.get市町村コード() == null ? RString.EMPTY : joho.get市町村コード().value();
        source.shichosonName = joho.get市町村名称();
        source.hihokenshaNoTitle = joho.get被保険者番号タイトル();
        source.hihokenshaNo = joho.get被保険者番号() == null ? RString.EMPTY : joho.get被保険者番号().value();
        source.shimeiKana = joho.get氏名カナ() == null ? RString.EMPTY : joho.get氏名カナ().value();
        source.birthYMD = joho.get生年月日();
        source.seibetsu = joho.get性別();
        source.setaiCode = joho.get世帯コード() == null ? RString.EMPTY : joho.get世帯コード().value();
        source.shikibetsuCode = joho.get識別コード() == null ? RString.EMPTY : joho.get識別コード().value();
        source.shimei = joho.get氏名() == null ? RString.EMPTY : joho.get氏名().value();
        source.chiku1CodeTitle = joho.get地区タイトル1();
        source.chiku1Code = joho.get地区コード1() == null ? RString.EMPTY : joho.get地区コード1().value();
        source.jotai = joho.get状態();
        source.telNoTitle = joho.get電話番号タイトル();
        source.jusho = joho.get住所();
        source.chiku2CodeTitle = joho.get地区タイトル2();
        source.chiku2Code = joho.get地区コード2() == null ? RString.EMPTY : joho.get地区コード2().value();
        source.telNo1 = joho.get電話番号１();
        source.jushoTitle = joho.get住所タイトル();
        source.telNo2 = joho.get電話番号２();
        source.chiku3CodeTitle = joho.get地区タイトル3();
        source.chiku3Code = joho.get地区コード3() == null ? RString.EMPTY : joho.get地区コード3().value();
        source.gyoseikuCode = joho.get行政区コード() == null ? RString.EMPTY : joho.get行政区コード().value();
        source.gyoseikuTitle = joho.get行政区タイトル();
        source.jushoCode = joho.get住所コード() == null ? RString.EMPTY : joho.get住所コード().value();
        source.jigyoshaNo = joho.get事業者番号();
        source.jigyoshaName = joho.get事業者名称() == null ? RString.EMPTY : joho.get事業者名称().value();
        source.kigoNo = joho.get記号番号();
        source.iryohokenShubetsu = joho.get医療保険種別();
        source.iryohokenshaName = joho.get医療保険者名称();
        source.sochiHokensha = joho.get措置保険者タイトル();
        source.kyuHokensha = joho.get旧保険者タイトル();
        return source;
    }
}
