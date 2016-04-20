package jp.co.ndensan.reams.db.dbd.definition.enumeratedtype.core;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 一次判定警告コード09を表す列挙型です。
 *
 * @author LDNS
 */
public enum IchijiHanteiKeikoku {

    /**
     * コード:01 名称:「寝返り」が「3.できない」にもかかわらず、「洗身」が「1.自立」 略称:定義なし
     */
    _寝返り_が_3_できない_にもかかわらず_洗身_が_1_自立("01", "「寝返り」が「3.できない」にもかかわらず、「洗身」が「1.自立」"),
    /**
     * コード:02 名称:「起き上がり」が「3.できない」にもかかわらず、「立ち上がり」が「1.できる」 略称:定義なし
     */
    _起き上がり_が_3_できない_にもかかわらず_立ち上がり_が_1_できる("02", "「起き上がり」が「3.できない」にもかかわらず、「立ち上がり」が「1.できる」"),
    /**
     * コード:03 名称:「起き上がり」が「3.できない」にもかかわらず、「洗身」が「1.自立」 略称:定義なし
     */
    _起き上がり_が_3_できない_にもかかわらず_洗身_が_1_自立("03", "「起き上がり」が「3.できない」にもかかわらず、「洗身」が「1.自立」"),
    /**
     * コード:04 名称:「座位保持」が「3.支えが必要」にもかかわらず、「片足での立位」が「1.できる」 略称:定義なし
     */
    _座位保持_が_3_支えが必要_にもかかわらず_片足での立位_が_1_できる("04", "「座位保持」が「3.支えが必要」にもかかわらず、「片足での立位」が「1.できる」"),
    /**
     * コード:05 名称:「座位保持」が「4.できない」にもかかわらず、「両足での立位」が「1.できる」 略称:定義なし
     */
    _座位保持_が_4_できない_にもかかわらず_両足での立位_が_1_できる("05", "「座位保持」が「4.できない」にもかかわらず、「両足での立位」が「1.できる」"),
    /**
     * コード:06 名称:「座位保持」が「4.できない」にもかかわらず、「歩行」が「1.できる」 略称:定義なし
     */
    _座位保持_が_4_できない_にもかかわらず_歩行_が_1_できる("06", "「座位保持」が「4.できない」にもかかわらず、「歩行」が「1.できる」"),
    /**
     * コード:07 名称:「座位保持」が「4.できない」にもかかわらず、「立ち上がり」が「1.できる」 略称:定義なし
     */
    _座位保持_が_4_できない_にもかかわらず_立ち上がり_が_1_できる("07", "「座位保持」が「4.できない」にもかかわらず、「立ち上がり」が「1.できる」"),
    /**
     * コード:08 名称:「座位保持」が「4.できない」にもかかわらず、「片足での立位」が「1.できる」 略称:定義なし
     */
    _座位保持_が_4_できない_にもかかわらず_片足での立位_が_1_できる("08", "「座位保持」が「4.できない」にもかかわらず、「片足での立位」が「1.できる」"),
    /**
     * コード:09 名称:「座位保持」が「4.できない」にもかかわらず、「洗身」が「1.自立」 略称:定義なし
     */
    _座位保持_が_4_できない_にもかかわらず_洗身_が_1_自立("09", "「座位保持」が「4.できない」にもかかわらず、「洗身」が「1.自立」"),
    /**
     * コード:10 名称:「両足での立位」が「4.できない」にもかかわらず、「歩行」が「1.できる」 略称:定義なし
     */
    _両足での立位_が_4_できない_にもかかわらず_歩行_が_1_できる("10", "「両足での立位」が「4.できない」にもかかわらず、「歩行」が「1.できる」"),
    /**
     * コード:11 名称:「両足での立位」が「4.できない」にもかかわらず、「立ち上がり」が「1.できる」 略称:定義なし
     */
    _両足での立位_が_4_できない_にもかかわらず_立ち上がり_が_1_できる("11", "「両足での立位」が「4.できない」にもかかわらず、「立ち上がり」が「1.できる」"),
    /**
     * コード:12 名称:「両足での立位」が「4.できない」にもかかわらず、「片足での立位」が「1.できる」 略称:定義なし
     */
    _両足での立位_が_4_できない_にもかかわらず_片足での立位_が_1_できる("12", "「両足での立位」が「4.できない」にもかかわらず、「片足での立位」が「1.できる」"),
    /**
     * コード:13 名称:「歩行」が「1.できる」にもかかわらず、「移乗」が「4.全介助」 略称:定義なし
     */
    _歩行_が_1_できる_にもかかわらず_移乗_が_4_全介助("13", "「歩行」が「1.できる」にもかかわらず、「移乗」が「4.全介助」"),
    /**
     * コード:14 名称:「歩行」が「3.できない」にもかかわらず、「片足での立位」が「1.できる」 略称:定義なし
     */
    _歩行_が_3_できない_にもかかわらず_片足での立位_が_1_できる("14", "「歩行」が「3.できない」にもかかわらず、「片足での立位」が「1.できる」"),
    /**
     * コード:15 名称:「移乗」が「4.全介助」にもかかわらず、「片足での立位」が「1.できる」 略称:定義なし
     */
    _移乗_が_4_全介助_にもかかわらず_片足での立位_が_1_できる("15", "「移乗」が「4.全介助」にもかかわらず、「片足での立位」が「1.できる」"),
    /**
     * コード:16 名称:「立ち上がり」が「3.できない」にもかかわらず、「片足での立位」が「1.できる」 略称:定義なし
     */
    _立ち上がり_が_3_できない_にもかかわらず_片足での立位_が_1_できる("16", "「立ち上がり」が「3.できない」にもかかわらず、「片足での立位」が「1.できる」"),
    /**
     * コード:17 名称:「えん下」が「3.できない」にもかかわらず、「食事摂取」が「1.自立」 略称:定義なし
     */
    _えん下_が_3_できない_にもかかわらず_食事摂取_が_1_自立("17", "「えん下」が「3.できない」にもかかわらず、「食事摂取」が「1.自立」"),
    /**
     * コード:18 名称:「えん下」が「3.できない」にもかかわらず、「薬の内服」が「1.自立」 略称:定義なし
     */
    _えん下_が_3_できない_にもかかわらず_薬の内服_が_1_自立("18", "「えん下」が「3.できない」にもかかわらず、「薬の内服」が「1.自立」"),
    /**
     * コード:19 名称:「つめ切り」が「1.自立」にもかかわらず、「物や衣類を壊す」が「3.ある」 略称:定義なし
     */
    _つめ切り_が_1_自立_にもかかわらず_物や衣類を壊す_が_3_ある("19", "「つめ切り」が「1.自立」にもかかわらず、「物や衣類を壊す」が「3.ある」"),
    /**
     * コード:20 名称:「薬の内服」が「1.自立」にもかかわらず、「物や衣類を壊す」が「3.ある」 略称:定義なし
     */
    _薬の内服_が_1_自立_にもかかわらず_物や衣類を壊す_が_3_ある("20", "「薬の内服」が「1.自立」にもかかわらず、「物や衣類を壊す」が「3.ある」"),
    /**
     * コード:21 名称:「金銭の管理」が「1.自立」にもかかわらず、「徘徊」が「3.ある」 略称:定義なし
     */
    _金銭の管理_が_1_自立_にもかかわらず_徘徊_が_3_ある("21", "「金銭の管理」が「1.自立」にもかかわらず、「徘徊」が「3.ある」"),
    /**
     * コード:22 名称:「金銭の管理」が「1.自立」にもかかわらず、「一人で出たがる」が「3.ある」 略称:定義なし
     */
    _金銭の管理_が_1_自立_にもかかわらず_一人で出たがる_が_3_ある("22", "「金銭の管理」が「1.自立」にもかかわらず、「一人で出たがる」が「3.ある」"),
    /**
     * コード:23 名称:「金銭の管理」が「1.自立」にもかかわらず、「収集癖」が「3.ある」 略称:定義なし
     */
    _金銭の管理_が_1_自立_にもかかわらず_収集癖_が_3_ある("23", "「金銭の管理」が「1.自立」にもかかわらず、「収集癖」が「3.ある」"),
    /**
     * コード:24 名称:「金銭の管理」が「1.自立」にもかかわらず、「物や衣類を壊す」が「3.ある」 略称:定義なし
     */
    _金銭の管理_が_1_自立_にもかかわらず_物や衣類を壊す_が_3_ある("24", "「金銭の管理」が「1.自立」にもかかわらず、「物や衣類を壊す」が「3.ある」"),
    /**
     * コード:25 名称:「視力」が「5.判断不能」にもかかわらず、「意思の伝達」が「1.できる」 略称:定義なし
     */
    _視力_が_5_判断不能_にもかかわらず_意思の伝達_が_1_できる("25", "「視力」が「5.判断不能」にもかかわらず、「意思の伝達」が「1.できる」"),
    /**
     * コード:26 名称:「聴力」が「5.判断不能」にもかかわらず、「意思の伝達」が「1.できる」 略称:定義なし
     */
    _聴力_が_5_判断不能_にもかかわらず_意思の伝達_が_1_できる("26", "「聴力」が「5.判断不能」にもかかわらず、「意思の伝達」が「1.できる」"),
    /**
     * コード:27 名称:「視力」が「5.判断不能」にもかかわらず、第3群の2～7番目の項目がいずれも「1.できる」 略称:定義なし
     */
    _視力_が_5_判断不能_にもかかわらず第3群の2_7番目の項目がいずれも_1_できる("27", "「視力」が「5.判断不能」にもかかわらず、第3群の2～7番目の項目がいずれも「1.できる」"),
    /**
     * コード:28 名称:「聴力」が「5.判断不能」にもかかわらず、第3群の2～7番目の項目がいずれも「1.できる」 略称:定義なし
     */
    _聴力_が_5_判断不能_にもかかわらず第3群の2_7番目の項目がいずれも_1_できる("28", "「聴力」が「5.判断不能」にもかかわらず、第3群の2～7番目の項目がいずれも「1.できる」"),
    /**
     * コード:29 名称:「聴力」が「5.判断不能」にもかかわらず、「日常の意思決定」が「1.できる」 略称:定義なし
     */
    _聴力_が_5_判断不能_にもかかわらず_日常の意思決定_が_1_できる("29", "「聴力」が「5.判断不能」にもかかわらず、「日常の意思決定」が「1.できる」"),
    /**
     * コード:30 名称:「視力」が「5.判断不能」にもかかわらず、「日常の意思決定」が「1.できる」 略称:定義なし
     */
    _視力_が_5_判断不能_にもかかわらず_日常の意思決定_が_1_できる("30", "「視力」が「5.判断不能」にもかかわらず、「日常の意思決定」が「1.できる」"),
    /**
     * コード:31 名称:「聴力」が「5.判断不能」にもかかわらず、「排便」が「1.自立」 略称:定義なし
     */
    _聴力_が_5_判断不能_にもかかわらず_排便_が_1_自立("31", "「聴力」が「5.判断不能」にもかかわらず、「排便」が「1.自立」"),
    /**
     * コード:32 名称:「意思の伝達」が「4.できない」にもかかわらず、「日常の意思決定」が「1.できる」 略称:定義なし
     */
    _意思の伝達_が_4_できない_にもかかわらず_日常の意思決定_が_1_できる("32", "「意思の伝達」が「4.できない」にもかかわらず、「日常の意思決定」が「1.できる」"),
    /**
     * コード:33 名称:「聴力」が「5.判断不能」にもかかわらず、「排尿」が「1.自立」 略称:定義なし
     */
    _聴力_が_5_判断不能_にもかかわらず_排尿_が_1_自立("33", "「聴力」が「5.判断不能」にもかかわらず、「排尿」が「1.自立」"),
    /**
     * コード:34 名称:「聴力」が「5.判断不能」にもかかわらず、「移動」が「1.自立」 略称:定義なし
     */
    _聴力_が_5_判断不能_にもかかわらず_移動_が_1_自立("34", "「聴力」が「5.判断不能」にもかかわらず、「移動」が「1.自立」"),
    /**
     * コード:35 名称:「物や衣類を壊す」が「3.ある」にもかかわらず、「日常の意思決定」が「1.できる」 略称:定義なし
     */
    _物や衣類を壊す_が_3_ある_にもかかわらず_日常の意思決定_が_1_できる("35", "「物や衣類を壊す」が「3.ある」にもかかわらず、「日常の意思決定」が「1.できる」"),
    /**
     * コード:36 名称:「自分の名前をいう」が「2.できない」にもかかわらず、「日常の意思決定」が「1.できる」 略称:定義なし
     */
    _自分の名前をいう_が_2_できない_にもかかわらず_日常の意思決定_が_1_できる("36", "「自分の名前をいう」が「2.できない」にもかかわらず、「日常の意思決定」が「1.できる」"),
    /**
     * コード:37 名称:「視力」が「5.判断不能」にもかかわらず、「排便」が「1.自立」 略称:定義なし
     */
    _視力_が_5_判断不能_にもかかわらず_排便_が_1_自立("37", "「視力」が「5.判断不能」にもかかわらず、「排便」が「1.自立」"),
    /**
     * コード:38 名称:「視力」が「5.判断不能」にもかかわらず、「排尿」が「1.自立」 略称:定義なし
     */
    _視力_が_5_判断不能_にもかかわらず_排尿_が_1_自立("38", "「視力」が「5.判断不能」にもかかわらず、「排尿」が「1.自立」"),
    /**
     * コード:39 名称:「視力」が「5.判断不能」にもかかわらず、「移動」が「1.自立」 略称:定義なし
     */
    _視力_が_5_判断不能_にもかかわらず_移動_が_1_自立("39", "「視力」が「5.判断不能」にもかかわらず、「移動」が「1.自立」"),
    /**
     * コード:40 名称:「座位保持」が「4.できない」にもかかわらず、「買い物」が「1.できる」 略称:定義なし
     */
    _座位保持_が_4_できない_にもかかわらず_買い物_が_1_できる("40", "「座位保持」が「4.できない」にもかかわらず、「買い物」が「1.できる」"),
    /**
     * コード:41 名称:「洗顔」が「3.全介助」にもかかわらず、「簡単な調理」が「1.できる」 略称:定義なし
     */
    _洗顔_が_3_全介助_にもかかわらず_簡単な調理_が_1_できる("41", "「洗顔」が「3.全介助」にもかかわらず、「簡単な調理」が「1.できる」"),
    /**
     * コード:42 名称:「整髪」が「3.全介助」にもかかわらず、「簡単な調理」が「1.できる」 略称:定義なし
     */
    _整髪_が_3_全介助_にもかかわらず_簡単な調理_が_1_できる("42", "「整髪」が「3.全介助」にもかかわらず、「簡単な調理」が「1.できる」"),
    /**
     * コード:43 名称:「金銭の管理」が「3.全介助」にもかかわらず、「買い物」が「1.できる」 略称:定義なし
     */
    _金銭の管理_が_3_全介助_にもかかわらず_買い物_が_1_できる("43", "「金銭の管理」が「3.全介助」にもかかわらず、「買い物」が「1.できる」"),
    /**
     * コード:44 名称:「日常の意思決定」が「4.できない」にもかかわらず、「買い物」が「1.できる」 略称:定義なし
     */
    _日常の意思決定_が_4_できない_にもかかわらず_買い物_が_1_できる("44", "「日常の意思決定」が「4.できない」にもかかわらず、「買い物」が「1.できる」"),
    /**
     * コード:45 名称:「意思の伝達」が「4.できない」にもかかわらず、「買い物」が「1.できる」 略称:定義なし
     */
    _意思の伝達_が_4_できない_にもかかわらず_買い物_が_1_できる("45", "「意思の伝達」が「4.できない」にもかかわらず、「買い物」が「1.できる」"),
    /**
     * コード:46 名称:「物や衣類を壊す」が「3.ある」にもかかわらず、「自分勝手に行動する」が「1.ない」 略称:定義なし
     */
    _物や衣類を壊す_が_3_ある_にもかかわらず_自分勝手に行動する_が_1_ない("46", "「物や衣類を壊す」が「3.ある」にもかかわらず、「自分勝手に行動する」が「1.ない」"),
    /**
     * コード:47 名称:「寝返り」が「3.できない」にもかかわらず、「起き上がり」が「1.できる」 略称:定義なし
     */
    _寝返り_が_3_できない_にもかかわらず_起き上がり_が_1_できる("47", "「寝返り」が「3.できない」にもかかわらず、「起き上がり」が「1.できる」"),
    /**
     * コード:48 名称:「寝返り」が「3.できない」にもかかわらず、「立ち上がり」が「1.できる」 略称:定義なし
     */
    _寝返り_が_3_できない_にもかかわらず_立ち上がり_が_1_できる("48", "「寝返り」が「3.できない」にもかかわらず、「立ち上がり」が「1.できる」"),
    /**
     * コード:49 名称:「起き上がり」が「1.できる」にもかかわらず、「座位保持」が「4.できない」 略称:定義なし
     */
    _起き上がり_が_1_できる_にもかかわらず_座位保持_が_4_できない("49", "「起き上がり」が「1.できる」にもかかわらず、「座位保持」が「4.できない」"),
    /**
     * コード:50 名称:「歩行」が「1.できる」にもかかわらず、「移動」が「4.全介助」 略称:定義なし
     */
    _歩行_が_1_できる_にもかかわらず_移動_が_4_全介助("50", "「歩行」が「1.できる」にもかかわらず、「移動」が「4.全介助」"),
    /**
     * コード:51 名称:「移乗」が「4.全介助」にもかかわらず、「立ち上がり」が「1.できる」 略称:定義なし
     */
    _移乗_が_4_全介助_にもかかわらず_立ち上がり_が_1_できる("51", "「移乗」が「4.全介助」にもかかわらず、「立ち上がり」が「1.できる」"),
    /**
     * コード:52 名称:「洗身」が「1.自立」にもかかわらず、「洗顔」が「3.全介助」 略称:定義なし
     */
    _洗身_が_1_自立_にもかかわらず_洗顔_が_3_全介助("52", "「洗身」が「1.自立」にもかかわらず、「洗顔」が「3.全介助」"),
    /**
     * コード:53 名称:「洗身」が「1.自立」にもかかわらず、「上衣の着脱」が「4.全介助」 略称:定義なし
     */
    _洗身_が_1_自立_にもかかわらず_上衣の着脱_が_4_全介助("53", "「洗身」が「1.自立」にもかかわらず、「上衣の着脱」が「4.全介助」"),
    /**
     * コード:54 名称:「洗身」が「1.自立」にもかかわらず、「ズボン等の着脱」が「4.全介助」 略称:定義なし
     */
    _洗身_が_1_自立_にもかかわらず_ズボン等の着脱_が_4_全介助("54", "「洗身」が「1.自立」にもかかわらず、「ズボン等の着脱」が「4.全介助」"),
    /**
     * コード:55 名称:「洗顔」が「3.全介助」にもかかわらず、「つめ切り」が「1.自立」 略称:定義なし
     */
    _洗顔_が_3_全介助_にもかかわらず_つめ切り_が_1_自立("55", "「洗顔」が「3.全介助」にもかかわらず、「つめ切り」が「1.自立」"),
    /**
     * コード:56 名称:「つめ切り」が「1.自立」にもかかわらず、「視力」が「5.判断不能」 略称:定義なし
     */
    _つめ切り_が_1_自立_にもかかわらず_視力_が_5_判断不能("56", "「つめ切り」が「1.自立」にもかかわらず、「視力」が「5.判断不能」"),
    /**
     * コード:57 名称:「上衣の着脱」が「4.全介助」にもかかわらず、「ズボン等の着脱」が「1.自立」 略称:定義なし
     */
    _上衣の着脱_が_4_全介助_にもかかわらず_ズボン等の着脱_が_1_自立("57", "「上衣の着脱」が「4.全介助」にもかかわらず、「ズボン等の着脱」が「1.自立」");

    private final RString code;
    private final RString fullName;

    private IchijiHanteiKeikoku(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 一次判定警告コード09のコードを返します。
     *
     * @return 一次判定警告コード09のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 一次判定警告コード09の名称を返します。
     *
     * @return 一次判定警告コード09の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 一次判定警告コード09のコードと一致する内容を探します。
     *
     * @param code 一次判定警告コード09のコード
     * @return {@code code} に対応する一次判定警告コード09
     */
    public static IchijiHanteiKeikoku toValue(RString code) {

        for (IchijiHanteiKeikoku ichijiHanteiKeikoku : IchijiHanteiKeikoku.values()) {
            if (ichijiHanteiKeikoku.code.equals(code)) {
                return ichijiHanteiKeikoku;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("一次判定警告コード09"));
    }
}