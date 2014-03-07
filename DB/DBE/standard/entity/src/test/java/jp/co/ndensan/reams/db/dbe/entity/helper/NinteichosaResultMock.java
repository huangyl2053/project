/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.helper;

import java.util.EnumMap;
import java.util.Map;
import jp.co.ndensan.reams.db.dbe.business.ninteichosa.Ninteichosahyo;
import jp.co.ndensan.reams.db.dbe.business.ninteichosa.NinteichosahyoFactory;
import jp.co.ndensan.reams.db.dbe.business.ninteichosa.NinteichosaResultOfItem;
import jp.co.ndensan.reams.db.dbe.business.ninteichosa.NinteichosaResult;
import jp.co.ndensan.reams.db.dbe.business.ninteichosa.NinteichosaResultOfKihon;
import jp.co.ndensan.reams.db.dbe.business.ninteichosa.NinteichosaResultOfGaikyo;
import jp.co.ndensan.reams.db.dbe.business.ninteichosa.NinteichosaResultOfGaikyoKihon;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ChosaIraiKubun;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ChosaKubun;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ShinsakaiFuriwakeKubun;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.NinteichosaItemGroup;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.NinteichosaItemKubun;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.NinteichosaItem;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.NinteichosaIraiRirekiNo;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.ShinseishoKanriNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.Choice.*;
import static jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.NinteichosaItemKubun.*;
import static org.mockito.Mockito.spy;

/**
 * NinteichosaResultを生成するMockです。
 *
 * @author N8156 宮本 康
 */
public class NinteichosaResultMock {

    private static final int NENDO_2009 = 2009;

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private NinteichosaResultMock() {
    }

    /**
     * NinteichosaResultを生成して返します。
     *
     * @return NinteichosaResult
     */
    public static NinteichosaResult getSpiedNinteichosaResultInstance() {
        return spy(new NinteichosaResult(getSpiedNinteichosaResultGaikyoInstance(), getSpiedNinteichosaResultKihonInstance()));
    }

    /**
     * NinteichosaResultGaikyoを生成して返します。
     *
     * @return NinteichosaResultOfGaikyo
     */
    public static NinteichosaResultOfGaikyo getSpiedNinteichosaResultGaikyoInstance() {
        Map<NinteichosaItemKubun, NinteichosaResultOfItem> map = new EnumMap<>(NinteichosaItemKubun.class);
        Ninteichosahyo chosahyo = NinteichosahyoFactory.createサービス状況Instance(NENDO_2009);
        setMap(map, chosahyo, NinteichosaItemKubun.サービス区分コード, ServiceKubun.介護.getCode());
        setMap(map, chosahyo, NinteichosaItemKubun.訪問介護, 0);
        setMap(map, chosahyo, NinteichosaItemKubun.訪問入浴介護, 1);
        setMap(map, chosahyo, NinteichosaItemKubun.訪問看護, 2);
        setMap(map, chosahyo, NinteichosaItemKubun.訪問リハビリ, 3);
        setMap(map, chosahyo, NinteichosaItemKubun.居宅療養管理指導, 4);
        setMap(map, chosahyo, NinteichosaItemKubun.通所介護, 5);
        setMap(map, chosahyo, NinteichosaItemKubun.通所リハビリテーション, 6);
        setMap(map, chosahyo, NinteichosaItemKubun.短期入所生活介護, 7);
        setMap(map, chosahyo, NinteichosaItemKubun.短期入所療養介護, 8);
        setMap(map, chosahyo, NinteichosaItemKubun.特定施設入居者生活介護, 9);
        setMap(map, chosahyo, NinteichosaItemKubun.福祉用具貸与, 0);
        setMap(map, chosahyo, NinteichosaItemKubun.特定福祉用具販売, 1);
        setMap(map, chosahyo, NinteichosaItemKubun.住宅改修, 2);
        setMap(map, chosahyo, NinteichosaItemKubun.夜間対応型訪問介護, 3);
        setMap(map, chosahyo, NinteichosaItemKubun.認知症対応型通所介護, 4);
        setMap(map, chosahyo, NinteichosaItemKubun.小規模多機能型居宅介護, 5);
        setMap(map, chosahyo, NinteichosaItemKubun.認知症対応型共同生活介護, 6);
        setMap(map, chosahyo, NinteichosaItemKubun.地域密着型特定施設入居者生活介護, 7);
        setMap(map, chosahyo, NinteichosaItemKubun.地域密着型介護老人福祉施設入所者生活介護, 8);
        setMap(map, chosahyo, NinteichosaItemKubun.定期巡回_随時対応型訪問介護看護, 9);
        setMap(map, chosahyo, NinteichosaItemKubun.複合型サービス, 0);
        setMap(map, chosahyo, NinteichosaItemKubun.市町村特別給付, new RString("市町村特別給付"));
        setMap(map, chosahyo, NinteichosaItemKubun.介護保険給付以外の在宅サービス, new RString("介護保険給付以外の在宅サービス"));
        setMap(map, chosahyo, NinteichosaItemKubun.利用施設コード, new RString("利用施設コード"));
        setMap(map, chosahyo, NinteichosaItemKubun.利用施設名, new RString("利用施設名"));
        setMap(map, chosahyo, NinteichosaItemKubun.利用施設住所, new RString("利用施設住所"));
        setMap(map, chosahyo, NinteichosaItemKubun.利用施設電話番号, new RString("利用施設電話番号"));
        setMap(map, chosahyo, NinteichosaItemKubun.利用施設郵便番号, new RString("利用施設郵便番号"));
        setMap(map, chosahyo, NinteichosaItemKubun.概況特記事項, new RString("概況特記事項"));
        return spy(new NinteichosaResultOfGaikyo(
                new ShinseishoKanriNo(new RString("1234567890")),
                new NinteichosaIraiRirekiNo(0),
                NENDO_2009,
                new NinteichosaResultOfGaikyoKihon(
                new FlexibleDate("20140101"),
                ChosaIraiKubun.初回,
                new RString("12345678"),
                new RString("認定調査実施場所名称"),
                ChosaKubun.新規調査,
                ShinsakaiFuriwakeKubun.希望無し),
                new Ninteichosahyo(map, NinteichosaItemGroup.Of2009.values())));
    }

    /**
     * NinteichosaResultOfKihonを生成して返します。
     *
     * @return NinteichosaResultOfKihon
     */
    public static NinteichosaResultOfKihon getSpiedNinteichosaResultKihonInstance() {
        Map<NinteichosaItemKubun, NinteichosaResultOfItem> map = new EnumMap<>(NinteichosaItemKubun.class);
        Ninteichosahyo chosahyo = NinteichosahyoFactory.create基本情報Instance(NENDO_2009);
        setMap(map, chosahyo, 麻痺等の有無_左上肢, NaiAru.ない.getCode());
        setMap(map, chosahyo, 麻痺等の有無_右上肢, NaiAru.ある.getCode());
        setMap(map, chosahyo, 麻痺等の有無_左下肢, NaiAru.ない.getCode());
        setMap(map, chosahyo, 麻痺等の有無_右下肢, NaiAru.ある.getCode());
        setMap(map, chosahyo, 麻痺等の有無_その他, NaiAru.ない.getCode());
        setMap(map, chosahyo, 関節の動く範囲の制限_肩関節, NaiAru.ない.getCode());
        setMap(map, chosahyo, 関節の動く範囲の制限_股関節, NaiAru.ある.getCode());
        setMap(map, chosahyo, 関節の動く範囲の制限_膝関節, NaiAru.ない.getCode());
        setMap(map, chosahyo, 関節の動く範囲の制限_その他, NaiAru.ある.getCode());
        setMap(map, chosahyo, 寝返り, DekiruDekinai3.できる.getCode());
        setMap(map, chosahyo, 起き上がり, DekiruDekinai3.できない.getCode());
        setMap(map, chosahyo, 座位保持, DekiruDekinai6.できる.getCode());
        setMap(map, chosahyo, 両足での立位, DekiruDekinai5.できない.getCode());
        setMap(map, chosahyo, 歩行, DekiruDekinai3.できる.getCode());
        setMap(map, chosahyo, 立ち上がり, DekiruDekinai3.できない.getCode());
        setMap(map, chosahyo, 片足での立位, DekiruDekinai5.できる.getCode());
        setMap(map, chosahyo, 洗身, Kaijo2.自立.getCode());
        setMap(map, chosahyo, つめ切り, Kaijo.全介助.getCode());
        setMap(map, chosahyo, 視力, Shiryoku.普通.getCode());
        setMap(map, chosahyo, 聴力, Choryoku.判断不能.getCode());
        setMap(map, chosahyo, 移乗, Kaijo3.自立.getCode());
        setMap(map, chosahyo, 移動, Kaijo3.全介助.getCode());
        setMap(map, chosahyo, 嚥下, DekiruDekinai4.できる.getCode());
        setMap(map, chosahyo, 食事摂取, Kaijo3.自立.getCode());
        setMap(map, chosahyo, 排尿, Kaijo3.全介助.getCode());
        setMap(map, chosahyo, 排便, Kaijo3.自立.getCode());
        setMap(map, chosahyo, 口腔清潔, Kaijo.全介助.getCode());
        setMap(map, chosahyo, 洗顔, Kaijo.自立.getCode());
        setMap(map, chosahyo, 整髪, Kaijo.全介助.getCode());
        setMap(map, chosahyo, 上衣の着脱, Kaijo3.自立.getCode());
        setMap(map, chosahyo, ズボン等の着脱, Kaijo3.全介助.getCode());
        setMap(map, chosahyo, 外出頻度, Gaishutsu.月１回以上.getCode());
        setMap(map, chosahyo, 意思の伝達, DekiruDekinai2.できる.getCode());
        setMap(map, chosahyo, 毎日の日課を理解, DekiruDekinai.できない.getCode());
        setMap(map, chosahyo, 生年月日をいう, DekiruDekinai.できる.getCode());
        setMap(map, chosahyo, 短期記憶, DekiruDekinai.できない.getCode());
        setMap(map, chosahyo, 自分の名前をいう, DekiruDekinai.できる.getCode());
        setMap(map, chosahyo, 今の季節を理解, DekiruDekinai.できない.getCode());
        setMap(map, chosahyo, 場所の理解, DekiruDekinai.できる.getCode());
        setMap(map, chosahyo, 常時の徘徊, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 外出して戻れない, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 被害的, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 作話, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 感情が不安定, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 昼夜逆転, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 同じ話をする, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 大声を出す, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 介護に抵抗, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 落ち着きなし, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 一人で出たがる, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 収集癖, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 物や衣類を壊す, NaiAru2.ない.getCode());
        setMap(map, chosahyo, ひどい物忘れ, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 独り言_独り笑, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 自分勝手に行動する, NaiAru2.ある.getCode());
        setMap(map, chosahyo, 話がまとまらない, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 薬の内服, Kaijo.自立.getCode());
        setMap(map, chosahyo, 金銭の管理, Kaijo.全介助.getCode());
        setMap(map, chosahyo, 日常の意思決定, DekiruDekinai7.できる.getCode());
        setMap(map, chosahyo, 集団への不適応, NaiAru2.ない.getCode());
        setMap(map, chosahyo, 買い物, Kaijo3.自立.getCode());
        setMap(map, chosahyo, 簡単な調理, Kaijo3.全介助.getCode());
        setMap(map, chosahyo, 点滴の管理, NaiAru.ない.getCode());
        setMap(map, chosahyo, 中心静脈栄養, NaiAru.ある.getCode());
        setMap(map, chosahyo, 透析, NaiAru.ない.getCode());
        setMap(map, chosahyo, ストーマの処置, NaiAru.ある.getCode());
        setMap(map, chosahyo, 酸素療法, NaiAru.ない.getCode());
        setMap(map, chosahyo, レスピレーター, NaiAru.ある.getCode());
        setMap(map, chosahyo, 気管切開, NaiAru.ない.getCode());
        setMap(map, chosahyo, 疼痛の看護, NaiAru.ある.getCode());
        setMap(map, chosahyo, 経管栄養, NaiAru.ない.getCode());
        setMap(map, chosahyo, モニター測定, NaiAru.ある.getCode());
        setMap(map, chosahyo, じょくそうの処置, NaiAru.ない.getCode());
        setMap(map, chosahyo, カテーテル, NaiAru.ある.getCode());
        setMap(map, chosahyo, 障害高齢者の日常生活自立度, ShogaiJiritsu.Ａ１.getCode());
        setMap(map, chosahyo, 認知症高齢者の日常生活自立度, NinchishoJiritsu.Ⅱａ.getCode());
        return new NinteichosaResultOfKihon(new ShinseishoKanriNo(new RString("1234567890")), new NinteichosaIraiRirekiNo(0),
                NENDO_2009, new Ninteichosahyo(map, NinteichosaItemGroup.Of2009.values()));
    }

    private static void setMap(Map<NinteichosaItemKubun, NinteichosaResultOfItem> map, Ninteichosahyo 調査票,
            NinteichosaItemKubun 調査項目区分, RString 調査結果) {
        NinteichosaItem item = (NinteichosaItem) 調査票.get調査項目(調査項目区分);
        if (item != null) {
            map.put(調査項目区分, new NinteichosaResultOfItem(item, 調査結果));
        }
    }

    private static void setMap(Map<NinteichosaItemKubun, NinteichosaResultOfItem> map, Ninteichosahyo 調査票,
            NinteichosaItemKubun 調査項目区分, int 調査結果) {
        setMap(map, 調査票, 調査項目区分, new RString(String.valueOf(調査結果)));
    }
}
