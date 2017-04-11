/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.yokaigoninteijohoteikyoisshiki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.core.yokaigoninteijohoteikyoisshiki.JohoTeikyoIsshiki;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.tokkitext1a4.TokkiText1A4Entity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.tokkitext1a4.TokkiTextEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.yokaigoninteijohoteikyoisshiki.YokaigoNinteiJohoTeikyoIsshikiReportSource;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBE;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;

/**
 * 要介護認定情報提供一式特記事項Builderクラスです。
 *
 * @author N3212 竹内 和紀
 */
public class JohoTeikyoIsshikiTokkiImage1A4SeparateBuilder implements IJohoTeikyoIsshikiBuilder {

    private static final int 連番_0 = 0;
    private static final int 連番_1 = 1;
    private static final int 連番_2 = 2;
    private static final int 連番_3 = 3;
    private static final int 連番_4 = 4;
    private static final int 連番_5 = 5;
    private static final int 連番_6 = 6;
    private static final int 連番_7 = 7;
    private static final int 連番_8 = 8;
    private static final int 連番_9 = 9;
    private static final int 連番_10 = 10;
    private static final int 連番_11 = 11;
    private static final int 連番_12 = 12;
    private static final int 連番_13 = 13;
    private static final int 連番_14 = 14;
    private static final int フォームインデックス_判定用 = 30;
    private static final int 連番_計算用 = 15;

    private final TokkiText1A4Entity entity;
    private final List<RString> list;
    private final int count;

    /**
     * コンストラクタです。
     *
     * @param entity TokkiText1A4Entity
     * @param list list
     * @param count count
     */
    public JohoTeikyoIsshikiTokkiImage1A4SeparateBuilder(TokkiText1A4Entity entity,
            List<RString> list, int count) {
        this.entity = entity;
        this.list = list;
        this.count = count;
    }

    @Override
    public YokaigoNinteiJohoTeikyoIsshikiReportSource build() {
        YokaigoNinteiJohoTeikyoIsshikiReportSource source = new YokaigoNinteiJohoTeikyoIsshikiReportSource();
        source.hokenshaNo = entity.get保険者番号();
        source.hihokenshaNo = entity.get被保険者番号();
        source.hihokenshaName = entity.get被保険者氏名();
        source.shinseiGengo = entity.get申請日_元号();
        source.shinseiYY = !RString.isNullOrEmpty(entity.get申請日_年()) ? entity.get申請日_年().substring(2) : RString.EMPTY;
        source.shinseiMM = entity.get申請日_月();
        source.shinseiDD = entity.get申請日_日();
        source.sakuseiGengo = entity.get作成日_元号();
        source.sakuseiYY = !RString.isNullOrEmpty(entity.get作成日_年()) ? entity.get作成日_年().substring(2) : RString.EMPTY;
        source.sakuseiMM = entity.get作成日_月();
        source.sakuseiDD = entity.get作成日_日();
        source.chosaGengo = entity.get調査日_元号();
        source.chosaYY = !RString.isNullOrEmpty(entity.get調査日_年()) ? entity.get調査日_年().substring(2) : RString.EMPTY;
        source.chosaMM = entity.get調査日_月();
        source.chosaDD = entity.get調査日_日();
        source.shinsaGengo = entity.get審査日_元号();
        source.shinsaYY = !RString.isNullOrEmpty(entity.get審査日_年()) ? entity.get審査日_年().substring(2) : RString.EMPTY;
        source.shinsaMM = entity.get審査日_月();
        source.shinsaDD = entity.get審査日_日();
        setレイアウトインデックス(source);
        if (entity.get特記事項全イメージリスト() != null && !entity.get特記事項全イメージリスト().isEmpty()) {
            source.tokkiImg = getイメージ03(entity.get特記事項全イメージリスト(), count);
        }
        source.gaikyotokkiText = entity.get概況調査特記事項();
        source.gaikyotokkiImg = entity.get概況調査特記事項イメージ();
        if (entity.get特記事項リスト() != null && !entity.get特記事項リスト().isEmpty()) {
            set特記事項リスト(source);
        }
        if (entity.get特記事項イメージリスト() != null && !entity.get特記事項イメージリスト().isEmpty()) {
            source.listChosa_1 = getイメージ01();
            source.tokkiImg1 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_0);
            source.tokkiImg2 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_1);
            source.tokkiImg3 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_2);
            source.tokkiImg4 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_3);
            source.tokkiImg5 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_4);
            source.tokkiImg6 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_5);
            source.tokkiImg7 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_6);
            source.tokkiImg8 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_7);
            source.tokkiImg9 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_8);
            source.tokkiImg10 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_9);
            source.tokkiImg11 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_10);
            source.tokkiImg12 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_11);
            source.tokkiImg13 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_12);
            source.tokkiImg14 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_13);
            source.tokkiImg15 = getイメージ03(entity.get特記事項イメージリスト(), (count / 30) * 15 + 連番_14);
        }
        if (entity.get特記事項リスト() != null && !entity.get特記事項リスト().isEmpty()) {
            source.listChosa1_1 = getイメージ01();
            source.tokkiText1 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_0);
            source.tokkiText2 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_1);
            source.tokkiText3 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_2);
            source.tokkiText4 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_3);
            source.tokkiText5 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_4);
            source.tokkiText6 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_5);
            source.tokkiText7 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_6);
            source.tokkiText8 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_7);
            source.tokkiText9 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_8);
            source.tokkiText10 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_9);
            source.tokkiText11 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_10);
            source.tokkiText12 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_11);
            source.tokkiText13 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_12);
            source.tokkiText14 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_13);
            source.tokkiText15 = getイメージ04(entity.get特記事項リスト(), (count / 30) * 15 + 連番_14);
        }
        source.識別コード = new ShikibetsuCode(entity.getTemp_保険者番号().substring(0, 5).concat(entity.getTemp_被保険者番号()));
        source.拡張情報 = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), entity.getTemp_申請書管理番号());
        return source;
    }

    private void setレイアウトインデックス(YokaigoNinteiJohoTeikyoIsshikiReportSource source) {
        if (count < フォームインデックス_判定用) {
            source.layout = JohoTeikyoIsshiki.TokkiImageSeparate1.getFormGroupIndex();
        } else {
            source.layout = JohoTeikyoIsshiki.TokkiImageSeparate2.getFormGroupIndex();
        }
    }

    private void set特記事項リスト(YokaigoNinteiJohoTeikyoIsshikiReportSource source) throws NumberFormatException {
        RStringBuilder builder = new RStringBuilder();
        int 最大表示行数 = Integer.parseInt(DbBusinessConfig.get(ConfigNameDBE.特記事項最大表示行数, RDate.getNowDate(), SubGyomuCode.DBE認定支援).toString());
        int listIndex = count == 0 ? count : count * 最大表示行数;
        int maxIndex = entity.get特記事項リスト().size() <= listIndex + 最大表示行数 ? entity.get特記事項リスト().size() - 1 : listIndex + 最大表示行数;
        for (int index = listIndex; index < maxIndex; index++) {
            builder.append(entity.get特記事項リスト().get(index).get特記事項番号());
            builder.append("-");
            builder.append(entity.get特記事項リスト().get(index).get特記事項連番());
            builder.append(entity.get特記事項リスト().get(index).get特記事項名称());
            builder.append("　　");
            builder.append(entity.get特記事項リスト().get(index).get特記事項());
            builder.append(System.lineSeparator());
        }
        source.tokkiText = builder.toRString();
    }

    private void set特記事項リスト(List<RString> 特記事項, YokaigoNinteiJohoTeikyoIsshikiReportSource source) {
        int tokkijikoIndex = count / フォームインデックス_判定用;
        int setIndex = 0;
        if (0 < tokkijikoIndex) {
            setIndex = tokkijikoIndex * 連番_計算用;
        }
        for (int num = 0; num < 連番_計算用; num++) {
            if (setIndex + num < 特記事項.size()) {
                set特記事項List(特記事項.get(setIndex + num), num, source);
            } else {
                break;
            }
        }
    }

    private void set特記事項List(RString item, int index, YokaigoNinteiJohoTeikyoIsshikiReportSource source) {
        int remban = index % 連番_計算用;
        if (remban == 連番_0) {
            source.tokkiText1 = item;
        }
        if (remban == 連番_1) {
            source.tokkiText2 = item;
        }
        if (remban == 連番_2) {
            source.tokkiText3 = item;
        }
        if (remban == 連番_3) {
            source.tokkiText4 = item;
        }
        if (remban == 連番_4) {
            source.tokkiText5 = item;
        }
        if (remban == 連番_5) {
            source.tokkiText6 = item;
        }
        if (remban == 連番_6) {
            source.tokkiText7 = item;
        }
        if (remban == 連番_7) {
            source.tokkiText8 = item;
        }
        if (remban == 連番_8) {
            source.tokkiText9 = item;
        }
        if (remban == 連番_9) {
            source.tokkiText10 = item;
        }
        if (remban == 連番_10) {
            source.tokkiText11 = item;
        }
        if (remban == 連番_11) {
            source.tokkiText12 = item;
        }
        if (remban == 連番_12) {
            source.tokkiText13 = item;
        }
        if (remban == 連番_13) {
            source.tokkiText14 = item;
        }
        if (remban == 連番_14) {
            source.tokkiText15 = item;
        }
    }

    private RString getイメージ01() {
        if (count < list.size()) {
            return list.get(count);
        }
        return RString.EMPTY;
    }

    private RString getイメージ02() {
        List<RString> result = new ArrayList<>();
        for (RString rString : list) {
            if (Collections.frequency(result, rString) < 1) {
                result.add(rString);
            }
        }
        if (count < result.size()) {
            return result.get(count);
        }
        return RString.EMPTY;
    }

    private RString getイメージ03(List<TokkiTextEntity> 特記事項イメージリスト, int 連番) {
        if (連番 < 特記事項イメージリスト.size()) {
            return 特記事項イメージリスト.get(連番).get特記事項イメージ();
        }
        return RString.EMPTY;
    }

    private RString getイメージ04(List<TokkiTextEntity> 特記事項イメージリスト, int 連番) {
        if (連番 < 特記事項イメージリスト.size()) {
            return 特記事項イメージリスト.get(連番).get特記事項();
        }
        return RString.EMPTY;
    }
}
