package jp.co.ndensan.reams.db.dbc.divcontroller.controller.dbc0700011;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.JutakuKaishuShinseiDetailInput.JutakuKaishuDetailInputDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.JutakuKaishuShinseiDetailInput.dgJutakuKaishuDetail_Row;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.dbc0700011.JutakuKaishuJizenShinseiContentsPanelDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.dbc0700011.JutakuKaishuJizenShinseiShinsaResultPanelDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;

/**
 * 住宅改修費事前申請登録　事前申請内容のパネルです。
 *
 * @author n8223 朴
 */
public class JutakuKaishuJizenShinseiContentsPanel {

    private final List<HashMap> targetSource = YamlLoader.DBC.loadAsList(new RString("dbc0700011/JutakuData.yml"));

    /**
     * 住宅改修費事前申請登録 事前申請内容の情報を表示する。
     *
     * @param contentsPanel 住宅改修事前申請panel
     * @param resultPanel 住宅改修事前申請結果panel
     * @return ResponseData
     */
    public ResponseData<JutakuKaishuJizenShinseiContentsPanelDiv> onLoad(JutakuKaishuJizenShinseiContentsPanelDiv contentsPanel) {
        ResponseData<JutakuKaishuJizenShinseiContentsPanelDiv> response = new ResponseData<>();

        //住宅所有者・被保険者との関係　
        setJutakuOwnerData(contentsPanel);
        //住宅改修明細 　　　　　　　　　
        setZizenShinseiDetailInput(contentsPanel);
        //申請者情報　初期化設定　　　　　　
        setShinseishaInfo(contentsPanel);
        //住宅改修理由書
        setShinseiReason(contentsPanel);
        //口座振替申請情報（UR)
        setShinseiKozaInfo(contentsPanel);

        response.data = contentsPanel;
        return response;

    }

    /*
     住宅所有者・被保険者との関係　の初期値をセットします。
     */
    private void setJutakuOwnerData(JutakuKaishuJizenShinseiContentsPanelDiv panel) {

        /////////////////////////////////////////////////////////////////////////////////////////
        //JutakuData.xml Read　②
        String jutakuOwner = targetSource.get(2).get("jutakuOwner").toString();
        String relationWithHihokensha = targetSource.get(2).get("relationWithHihokensha").toString();
       /////////////////////////////////////////////////////////////////////////////////////////

        //TO DO  JutakuData.xml Write　③
        //初期値を設定したいものに値を入れる。値をセットしなければ空欄
        panel.getTxtJutakuOwner().setValue(new RString(jutakuOwner));
        panel.getTxtRelationWithHihokensha().setValue(new RString(relationWithHihokensha));

    }

    /*
     /住宅改修明細の初期値をセットします。
     */
    private void setZizenShinseiDetailInput(JutakuKaishuJizenShinseiContentsPanelDiv panel) {

        /////////////////////////////////////////////////////////////////////////////////////////
        //JutakuData.xml Read　②
        String kaishuContents = targetSource.get(3).get("kaishuContents").toString();
        String kaishuJigyoshaName = targetSource.get(3).get("kaishuJigyoshaName").toString();
        String kaishuTaishoAddress1 = targetSource.get(3).get("kaishuTaishoAddress").toString();
        String chakkoDueDate = targetSource.get(3).get("chakkoDueDate").toString();
        String kanseiDueDate = targetSource.get(3).get("kanseiDueDate").toString();
        String estimatedAmount = targetSource.get(3).get("estimatedAmount").toString();
        /////////////////////////////////////////////////////////////////////////////////////////

        //TO DO  JutakuData.xml Write　③
        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKaishuContents().setValue(new RString(kaishuContents));

        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKaishuJigyoshaName().setValue(new RString(kaishuJigyoshaName));

        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKaishuTaishoAddress().setValue(new RString(kaishuTaishoAddress1));
        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtChakkoDueDate().setValue(new RDate(chakkoDueDate));

        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKanseiDueDate().setValue(new RDate(kanseiDueDate));

        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtEstimatedAmount().setValue(new Decimal(estimatedAmount));
    }

    /*
     申請者情報の初期値をセットします。
     */
    private void setShinseishaInfo(JutakuKaishuJizenShinseiContentsPanelDiv panel) {

        panel.getJutakuKaishuJizenShinseisha().getTxtJigyoshaNo().setDisabled(true);
        /////////////////////////////////////////////////////////////////////////////////////////
        //JutakuData.xml Read　②
        String shinseiYMD = targetSource.get(5).get("shinseiYMD").toString();
        String uketsukeYMD = targetSource.get(5).get("uketsukeYMD").toString();
        String shinseishaName = targetSource.get(5).get("shinseishaName").toString();
        String yubinNo = targetSource.get(5).get("yubinNo").toString();
        String address = targetSource.get(5).get("address").toString();
        String telNo = targetSource.get(5).get("telNo").toString();
        String jigyoshaNo = targetSource.get(5).get("jigyoshaNo").toString();
       /////////////////////////////////////////////////////////////////////////////////////////

        //TO DO  JutakuData.xml Write　③
        //初期値を設定したいものに値を入れる。値をセットしなければ空欄
        panel.getJutakuKaishuJizenShinseisha().getTxtShinseiDate().setValue(new RDate(shinseiYMD));
        panel.getJutakuKaishuJizenShinseisha().getTxtUketsukeDate().setValue(new RDate(uketsukeYMD));
        panel.getJutakuKaishuJizenShinseisha().getTxtShinseishaName().setValue(new RString(shinseishaName));
        panel.getJutakuKaishuJizenShinseisha().getTxtYubinNo().setValue(new YubinNo(yubinNo));
        panel.getJutakuKaishuJizenShinseisha().getTxtAddress().setValue(new RString(address));
        panel.getJutakuKaishuJizenShinseisha().getTxtTelNo().setValue(new RString(telNo));
        panel.getJutakuKaishuJizenShinseisha().getTxtJigyoshaNo().setValue(new RString(jigyoshaNo));
    }

    /*
     住宅改修理由書の初期値をセットします。
     */
    private void setShinseiReason(JutakuKaishuJizenShinseiContentsPanelDiv panel) {

        /////////////////////////////////////////////////////////////////////////////////////////
        //JutakuData.xml Read　②
        String createDate = targetSource.get(6).get("createDate").toString();
        String creationJigyoshaNo = targetSource.get(6).get("creationJigyoshaNo").toString();
        String creationJigyoshaName = targetSource.get(6).get("creationJigyoshaName").toString();
        String creatorKanaName = targetSource.get(6).get("creatorKanaName").toString();
        String creatorName = targetSource.get(6).get("creatorName").toString();
       /////////////////////////////////////////////////////////////////////////////////////////

        //TO DO  JutakuData.xml Write　③
        //初期値を設定したいものに値を入れる。値をセットしなければ空欄
        panel.getJutakuKaishuJizenShinseiReason().getTxtCreateDate().setValue(new RDate(createDate));
        panel.getJutakuKaishuJizenShinseiReason().getTxtCreationJigyoshaNo().setValue(new RString(creationJigyoshaNo));
        panel.getJutakuKaishuJizenShinseiReason().getTxtCreationJigyoshaName().setValue(new RString(creationJigyoshaName));
        panel.getJutakuKaishuJizenShinseiReason().getTxtCreatorKanaName().setValue(new RString(creatorKanaName));
        panel.getJutakuKaishuJizenShinseiReason().getTxtCreatorName().setValue(new RString(creatorName));

    }

    /*
     口座振替申請情報（UR)の初期値をセットします。
     */
    private void setShinseiKozaInfo(JutakuKaishuJizenShinseiContentsPanelDiv panel) {

        /////////////////////////////////////////////////////////////////////////////////////////
        //JutakuData.xml Read　②
        String kinyuKikanCode = targetSource.get(7).get("kinyuKikanCode").toString();
        String kinyuKikanName = targetSource.get(7).get("kinyuKikanName").toString();
        String kinyuBranchCode = targetSource.get(7).get("kinyuBranchCode").toString();
        String kinyuBranchName = targetSource.get(7).get("kinyuBranchName").toString();
        String kozaMeigininKanaName = targetSource.get(7).get("kozaMeigininKanaName").toString();
        String kozaMeigininName = targetSource.get(7).get("kozaMeigininName").toString();
        /////////////////////////////////////////////////////////////////////////////////////////

        //TO DO  JutakuData.xml Write　③
        //初期値を設定したいものに値を入れる。値をセットしなければ空欄
        panel.getJutakuKaishuJizenShinseiKoza().getTxtKinyuKikanCode().setValue(new RString(kinyuKikanCode));
        panel.getJutakuKaishuJizenShinseiKoza().getTxtKinyuKikanName().setValue(new RString(kinyuKikanName));
        panel.getJutakuKaishuJizenShinseiKoza().getTxtKinyuKikanBrunchCode().setValue(new RString(kinyuBranchCode));
        panel.getJutakuKaishuJizenShinseiKoza().getTxtKinyuKikanBrunchName().setValue(new RString(kinyuBranchName));
        panel.getJutakuKaishuJizenShinseiKoza().getTxtKozaMeigininKana().setValue(new RString(kozaMeigininKanaName));
        panel.getJutakuKaishuJizenShinseiKoza().getTxtKozaMeiginin().setValue(new RString(kozaMeigininName));
    }

    /**
     * 住宅改修費事前申請登録 明細を追加するボタンを押下後、住宅改修明細を表示する。
     *
     * @param contentsPanel 申請panel
     * @return ResponseData
     */
    public ResponseData<JutakuKaishuJizenShinseiContentsPanelDiv> onClick_btnModifyDetail(
            JutakuKaishuJizenShinseiContentsPanelDiv contentsPanel) {
        ResponseData<JutakuKaishuJizenShinseiContentsPanelDiv> response = new ResponseData<>();

        //住宅改修明細
        contentsPanel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getDgJutakuKaishuDetail().setDataSource(
                        getShikyuShinseiInputData(contentsPanel.getJutakuKaishuZizenShinseiDetail()
                                .getJutakuJizenShinseiDetailInput().getJutakuKaishuDetailInput()));

        //クリア設定
        setJutakuKaishuJizenShinseiDetailInput(contentsPanel);

        response.data = contentsPanel;
        return response;

    }

    private List<dgJutakuKaishuDetail_Row> getShikyuShinseiInputData(JutakuKaishuDetailInputDiv div) {

        List<dgJutakuKaishuDetail_Row> list = new ArrayList<>();

        TextBoxDate chakkoDate = new TextBoxDate();
        chakkoDate.setValue(div.getTxtChakkoDueDate().getValue());

        TextBoxDate kanseiDate = new TextBoxDate();
        kanseiDate.setValue(div.getTxtKanseiDueDate().getValue());

        TextBoxNum amount = new TextBoxNum();
        amount.setValue(div.getTxtEstimatedAmount().getValue());

        dgJutakuKaishuDetail_Row row = new dgJutakuKaishuDetail_Row(
                chakkoDate,
                kanseiDate,
                amount,
                div.getTxtKaishuJigyoshaName().getValue(),
                div.getTxtKaishuTaishoAddress().getValue(),
                div.getTxtKaishuContents().getValue()
        );
        list.add(row);
        return list;
    }

    /*
     クリア設定
     */
    private void setJutakuKaishuJizenShinseiDetailInput(JutakuKaishuJizenShinseiContentsPanelDiv panel) {

        //改修の内容をクリア
        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKaishuContents().clearValue();

        //事業者の内容をクリア
        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKaishuJigyoshaName().clearValue();
        //着・完成日内容をクリア
        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKaishuTaishoAddress().clearValue();
        //着・完成日内容をクリア
        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtChakkoDueDate().clearValue();
        //見積額をクリア
        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtKanseiDueDate().clearValue();

        panel.getJutakuKaishuZizenShinseiDetail().getJutakuJizenShinseiDetailInput().
                getJutakuKaishuDetailInput().getTxtEstimatedAmount().clearValue();
    }
}
