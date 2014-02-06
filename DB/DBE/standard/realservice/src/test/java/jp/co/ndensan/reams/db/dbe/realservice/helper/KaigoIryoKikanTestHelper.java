/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.realservice.helper;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.KaigoIryoKikan;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.IryoKikanJokyo;
import jp.co.ndensan.reams.db.dbe.definition.IryoKikanKubun;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.KaigoIryoKikanCode;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT7011ShujiiIryoKikanJohoEntity;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShichosonCode;
import jp.co.ndensan.reams.ur.urz.business.IIryoKikanCode;
import jp.co.ndensan.reams.ur.urz.business.IKoza;
import jp.co.ndensan.reams.ur.urz.business._IryoKikanCode;
import jp.co.ndensan.reams.ur.urz.entity.IryoKikanEntity;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.mockito.Mockito.mock;

/**
 * 主治医医療機関関連のテストの補助クラスです。
 *
 * @author n8178 城間篤人
 */
public final class KaigoIryoKikanTestHelper {

    public static RString 識別コード = new RString("S02B00001");
    public static RString 医療機関名称 = new RString("介護病院");
    public static RString 医療機関略称 = new RString("介護病院");
    public static RString 医療機関カナ略称 = new RString("カイゴビョウイン");
    public static RString 郵便番号 = new RString("903-1111");
    public static RString 住所 = new RString("A町B1-12-123");
    public static RString カナ住所 = new RString("エーマチ");
    public static RString 会員区分 = new RString("会員");
    public static boolean 指定自立支援医療機関flag = true;
    public static RDate 新設年月日 = new RDate("19991212");
    public static RDate 廃止年月日 = new RDate("20091212");
    public static RString 休止区分 = new RString("休止");
    public static RString 異動事由 = new RString("疲れのため");
    public static RDate 異動年月日 = new RDate("20051212");
    public static ShichosonCode 市町村コード = new ShichosonCode(new RString("A001"));
    public static KaigoIryoKikanCode 介護医療機関コード = new KaigoIryoKikanCode(new RString("B001"));
    public static IIryoKikanCode 医療機関コード = new _IryoKikanCode(new RString("C00000001"));
    public static IryoKikanJokyo 医療機関状況 = IryoKikanJokyo.有効;
    public static IryoKikanKubun 医療機関区分 = new IryoKikanKubun(new RString("ABC"), new RString("名称"), new RString("略称"));

    private KaigoIryoKikanTestHelper() {
    }

    public static IryoKikanEntity create医療機関Entity() {
        IryoKikanEntity entity = new IryoKikanEntity();
        entity.setIryokikanCode(医療機関コード.getValue());
        entity.setShikibetsuCode(識別コード);
        entity.setIryokikanRyakusho(医療機関略称);
        entity.setIryokikanKanaRyakusho(医療機関カナ略称);
        entity.setYubinNo(郵便番号);
        entity.setJusho(住所);
        entity.setKanaJusho(カナ住所);
        entity.setKaiinKbn(会員区分);
        entity.setJiritsushienIryoKikan(指定自立支援医療機関flag);
        entity.setShinsetsuYMD(新設年月日);
        entity.setHaishiYMD(廃止年月日);
        entity.setKyushiKubun(休止区分);
        entity.setIdoJiyu(異動事由);
        entity.setIdoYMD(異動年月日);
        return entity;
    }

    public static DbT7011ShujiiIryoKikanJohoEntity create主治医医療機関Entity() {
        DbT7011ShujiiIryoKikanJohoEntity entity = new DbT7011ShujiiIryoKikanJohoEntity();
        entity.setShichosonCode(市町村コード);
        entity.setKaigoIryokikanCode(介護医療機関コード);
        entity.setIryokikanCode(医療機関コード.getValue());
        entity.setIryokikanJokyo(医療機関状況.is有効());
        entity.setKikanKubunCode(医療機関区分.getCode());
        return entity;
    }

    public static List<IKoza> create口座List(int 口座件数) {
        List<IKoza> kozaList = new ArrayList<>();
        for (int i = 0; i < 口座件数; i++) {
            kozaList.add(mock(IKoza.class));
        }
        return kozaList;
    }
}
