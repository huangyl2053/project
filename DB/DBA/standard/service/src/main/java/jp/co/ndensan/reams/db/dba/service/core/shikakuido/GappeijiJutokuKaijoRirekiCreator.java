/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.service.core.shikakuido;

import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbV1001HihokenshaDaichoEntity;
import jp.co.ndensan.reams.db.dbx.persistence.db.basic.DbV1001HihokenshaDaichoAliveDac;
import jp.co.ndensan.reams.db.dbz.business.core.HihokenshaDaicho;
import jp.co.ndensan.reams.db.dbz.definition.core.shikakuidojiyu.ShikakuHenkoJiyu;
import jp.co.ndensan.reams.db.dbz.definition.core.shikakuidojiyu.ShikakuJutokuKaijoJiyu;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaichoEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 合併による住特・広住特例の解除クラスです。
 *
 * @reamsid_L DBA-1300-030 lishengli
 */
public class GappeijiJutokuKaijoRirekiCreator {

    private static final RString フラグ = new RString("1");
    private final DbV1001HihokenshaDaichoAliveDac dac;

    /**
     * コンストラクタです。
     */
    GappeijiJutokuKaijoRirekiCreator() {
        dac = InstanceProvider.create(DbV1001HihokenshaDaichoAliveDac.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbV1001HihokenshaDaichoAliveDac}
     */
    GappeijiJutokuKaijoRirekiCreator(DbV1001HihokenshaDaichoAliveDac dac) {
        this.dac = dac;
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link GappeijiJutokuKaijoRirekiCreator}のインスタンスを戻します。
     *
     * @return {@link InstanceProvider#create}にて生成した{@link GappeijiJutokuKaijoRirekiCreator}のインスタンス
     */
    public static GappeijiJutokuKaijoRirekiCreator createInstance() {
        return InstanceProvider.create(GappeijiJutokuKaijoRirekiCreator.class);
    }

    /**
     * 合併による住特解除の処理です。
     *
     * @param 被保険者台帳履歴 被保険者台帳履歴
     * @param 合併日 合併日
     * @param 名寄せ識別コード 名寄せ識別コード
     * @param 名寄せ市町村コード 名寄せ市町村コード
     * @return List<HihokenshaDaicho> 被保険者台帳のList
     */
    public List<HihokenshaDaicho> release住所地特例By単一合併(
            HihokenshaDaicho 被保険者台帳履歴,
            FlexibleDate 合併日,
            ShikibetsuCode 名寄せ識別コード,
            LasdecCode 名寄せ市町村コード) {
        List<HihokenshaDaicho> hihokenshaDaichoList = new ArrayList<>();
        if (被保険者台帳履歴 != null) {
            DbT1001HihokenshaDaichoEntity 住所地特例解除用被保険者台帳 = 被保険者台帳履歴.toEntity();
            住所地特例解除用被保険者台帳.setIdoYMD(合併日);
            住所地特例解除用被保険者台帳.setEdaNo(new RString("0001"));
            住所地特例解除用被保険者台帳.setIdoJiyuCode(ShikakuJutokuKaijoJiyu.自特例解除.getコード());
            住所地特例解除用被保険者台帳.setJushochitokureiKaijoJiyuCode(ShikakuJutokuKaijoJiyu.自特例解除.getコード());
            住所地特例解除用被保険者台帳.setJushochitokureiKaijoYMD(合併日);
            住所地特例解除用被保険者台帳.setJushochitokureiKaijoTodokedeYMD(合併日);
            住所地特例解除用被保険者台帳.setJushochiTokureiFlag(RString.EMPTY);
            hihokenshaDaichoList.add(new HihokenshaDaicho(住所地特例解除用被保険者台帳));
            DbT1001HihokenshaDaichoEntity 合併用被保険者台帳 = 被保険者台帳履歴.toEntity();
            合併用被保険者台帳.setIdoYMD(合併日);
            合併用被保険者台帳.setEdaNo(new RString("0002"));
            合併用被保険者台帳.setIdoJiyuCode(ShikakuHenkoJiyu.合併.getコード());
            合併用被保険者台帳.setShikibetsuCode(名寄せ識別コード);
            合併用被保険者台帳.setJushochitokureiTekiyoJiyuCode(RString.EMPTY);
            合併用被保険者台帳.setJushochitokureiTekiyoYMD(FlexibleDate.EMPTY);
            合併用被保険者台帳.setJushochitokureiTekiyoTodokedeYMD(FlexibleDate.EMPTY);
            合併用被保険者台帳.setShikakuHenkoJiyuCode(ShikakuHenkoJiyu.合併.getコード());
            合併用被保険者台帳.setShikakuHenkoYMD(合併日);
            合併用被保険者台帳.setShikakuHenkoTodokedeYMD(合併日);
            合併用被保険者台帳.setJushochiTokureiFlag(RString.EMPTY);
            合併用被保険者台帳.setKyuShichosonCode(名寄せ市町村コード);
            hihokenshaDaichoList.add(new HihokenshaDaicho(合併用被保険者台帳));
        }
        return hihokenshaDaichoList;
    }

    /**
     * 合併による広住特解除の処理です。
     *
     * @param 被保険者台帳履歴 被保険者台帳履歴
     * @param 合併日 合併日
     * @param 名寄せ識別コード 名寄せ識別コード
     * @param 名寄せ市町村コード 名寄せ市町村コード
     * @return List<HihokenshaDaicho> 被保険者台帳のList
     */
    public List<HihokenshaDaicho> release広域内住所地特例By広域内合併(
            HihokenshaDaicho 被保険者台帳履歴,
            FlexibleDate 合併日,
            ShikibetsuCode 名寄せ識別コード,
            LasdecCode 名寄せ市町村コード) {
        List<HihokenshaDaicho> hihokenshaDaichoList = new ArrayList<>();
        if (被保険者台帳履歴 != null) {
            DbT1001HihokenshaDaichoEntity 広域内住所地特例解除用被保険者台帳 = 被保険者台帳履歴.toEntity();
            広域内住所地特例解除用被保険者台帳.setIdoYMD(合併日);
            広域内住所地特例解除用被保険者台帳.setEdaNo(new RString("0001"));
            広域内住所地特例解除用被保険者台帳.setIdoJiyuCode(ShikakuHenkoJiyu.広住特居住.getコード());
            広域内住所地特例解除用被保険者台帳.setShikakuHenkoJiyuCode(ShikakuHenkoJiyu.広住特居住.getコード());
            広域内住所地特例解除用被保険者台帳.setShikakuHenkoYMD(合併日);
            広域内住所地特例解除用被保険者台帳.setShikakuHenkoTodokedeYMD(合併日);
            広域内住所地特例解除用被保険者台帳.setKoikinaiJushochiTokureiFlag(RString.EMPTY);
            広域内住所地特例解除用被保険者台帳.setKoikinaiTokureiSochimotoShichosonCode(LasdecCode.EMPTY);
            hihokenshaDaichoList.add(new HihokenshaDaicho(広域内住所地特例解除用被保険者台帳));
            DbT1001HihokenshaDaichoEntity 合併用被保険者台帳 = 被保険者台帳履歴.toEntity();
            合併用被保険者台帳.setIdoYMD(合併日);
            合併用被保険者台帳.setEdaNo(new RString("0002"));
            合併用被保険者台帳.setIdoJiyuCode(ShikakuHenkoJiyu.合併.getコード());
            合併用被保険者台帳.setShikibetsuCode(名寄せ識別コード);
            合併用被保険者台帳.setShikakuHenkoJiyuCode(ShikakuHenkoJiyu.合併.getコード());
            合併用被保険者台帳.setShikakuHenkoYMD(合併日);
            合併用被保険者台帳.setShikakuHenkoTodokedeYMD(合併日);
            合併用被保険者台帳.setKoikinaiJushochiTokureiFlag(RString.EMPTY);
            合併用被保険者台帳.setKoikinaiTokureiSochimotoShichosonCode(LasdecCode.EMPTY);
            合併用被保険者台帳.setKyuShichosonCode(名寄せ市町村コード);
            hihokenshaDaichoList.add(new HihokenshaDaicho(合併用被保険者台帳));
        }
        return hihokenshaDaichoList;
    }

    /**
     * 合併による住特・広住特解除の処理です。
     *
     * @param 被保険者番号 被保険者番号
     * @param 合併日 合併日
     * @param 名寄せ識別コード 名寄せ識別コード
     * @param 名寄せ市町村コード 名寄せ市町村コード
     * @return List<HihokenshaDaicho> 被保険者台帳のList
     */
    public List<HihokenshaDaicho> release住所地特例(
            HihokenshaNo 被保険者番号,
            FlexibleDate 合併日,
            ShikibetsuCode 名寄せ識別コード,
            LasdecCode 名寄せ市町村コード) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(合併日, UrSystemErrorMessages.値がnull.getReplacedMessage("合併日"));
        requireNonNull(名寄せ識別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("名寄せ識別コード"));
        requireNonNull(名寄せ市町村コード, UrSystemErrorMessages.値がnull.getReplacedMessage("名寄せ市町村コード"));
        List<HihokenshaDaicho> hihokenshaDaichoList = new ArrayList<>();
        DbV1001HihokenshaDaichoEntity entity = dac.get最新の被保険者台帳情報(被保険者番号);
        if (entity == null) {
            throw new IllegalArgumentException();
        }
        if (フラグ.equals(entity.getKoikinaiJushochiTokureiFlag())) {
            hihokenshaDaichoList.addAll(release広域内住所地特例By広域内合併(
                    get被保険者台帳履歴(entity), 合併日, 名寄せ識別コード, 名寄せ市町村コード));
        } else if (フラグ.equals(entity.getJushochiTokureiFlag())) {
            hihokenshaDaichoList.addAll(release住所地特例By単一合併(get被保険者台帳履歴(entity), 合併日, 名寄せ識別コード, 名寄せ市町村コード));
        } else {
            throw new IllegalArgumentException();
        }
        return hihokenshaDaichoList;
    }

    private HihokenshaDaicho get被保険者台帳履歴(DbV1001HihokenshaDaichoEntity entity) {
        DbT1001HihokenshaDaichoEntity dbT1001Entity = new DbT1001HihokenshaDaichoEntity();
        dbT1001Entity.setHihokenshaNo(entity.getHihokenshaNo());
        dbT1001Entity.setIdoYMD(entity.getIdoYMD());
        dbT1001Entity.setEdaNo(entity.getEdaNo());
        dbT1001Entity.setIdoJiyuCode(entity.getIdoJiyuCode());
        dbT1001Entity.setShichosonCode(entity.getShichosonCode());
        dbT1001Entity.setShikibetsuCode(entity.getShikibetsuCode());
        dbT1001Entity.setShikakuShutokuJiyuCode(entity.getShikakuShutokuJiyuCode());
        dbT1001Entity.setShikakuShutokuYMD(entity.getShikakuShutokuYMD());
        dbT1001Entity.setShikakuShutokuTodokedeYMD(entity.getShikakuShutokuTodokedeYMD());
        dbT1001Entity.setIchigoShikakuShutokuYMD(entity.getIchigoShikakuShutokuYMD());
        dbT1001Entity.setHihokennshaKubunCode(entity.getHihokennshaKubunCode());
        dbT1001Entity.setShikakuSoshitsuJiyuCode(entity.getShikakuSoshitsuJiyuCode());
        dbT1001Entity.setShikakuSoshitsuYMD(entity.getShikakuSoshitsuYMD());
        dbT1001Entity.setShikakuSoshitsuTodokedeYMD(entity.getShikakuSoshitsuTodokedeYMD());
        dbT1001Entity.setShikakuHenkoJiyuCode(entity.getShikakuHenkoJiyuCode());
        dbT1001Entity.setShikakuHenkoYMD(entity.getShikakuHenkoYMD());
        dbT1001Entity.setShikakuHenkoTodokedeYMD(entity.getShikakuHenkoTodokedeYMD());
        dbT1001Entity.setJushochitokureiTekiyoJiyuCode(entity.getJushochitokureiTekiyoJiyuCode());
        dbT1001Entity.setJushochitokureiTekiyoYMD(entity.getJushochitokureiTekiyoYMD());
        dbT1001Entity.setJushochitokureiTekiyoTodokedeYMD(entity.getJushochitokureiTekiyoTodokedeYMD());
        dbT1001Entity.setJushochitokureiKaijoJiyuCode(entity.getJushochitokureiKaijoJiyuCode());
        dbT1001Entity.setJushochitokureiKaijoYMD(entity.getJushochitokureiKaijoYMD());
        dbT1001Entity.setJushochitokureiKaijoTodokedeYMD(entity.getJushochitokureiKaijoTodokedeYMD());
        dbT1001Entity.setJushochiTokureiFlag(entity.getJushochiTokureiFlag());
        dbT1001Entity.setKoikinaiJushochiTokureiFlag(entity.getKoikinaiJushochiTokureiFlag());
        dbT1001Entity.setKoikinaiTokureiSochimotoShichosonCode(entity.getKoikinaiTokureiSochimotoShichosonCode());
        dbT1001Entity.setKyuShichosonCode(entity.getKyuShichosonCode());
        dbT1001Entity.setLogicalDeletedFlag(entity.getLogicalDeletedFlag());
        return new HihokenshaDaicho(dbT1001Entity);
    }
}