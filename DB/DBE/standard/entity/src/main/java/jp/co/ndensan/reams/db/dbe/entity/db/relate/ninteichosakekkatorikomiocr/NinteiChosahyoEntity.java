/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.ninteichosakekkatorikomiocr;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.definition.core.util.json.ObjectMapperProvider;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5202NinteichosahyoGaikyoChosaEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5203NinteichosahyoKihonChosaEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5205NinteichosahyoTokkijikoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5206GaikyoTokkiEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5207NinteichosahyoServiceJokyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5208NinteichosahyoServiceJokyoFlagEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5209NinteichosahyoKinyuItemEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5210NinteichosahyoShisetsuRiyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5211NinteichosahyoChosaItemEntity;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.SystemException;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;

/**
 * 認定調査の結果を保持します。
 */
@lombok.Setter
public class NinteiChosahyoEntity {

    @lombok.Getter
    private ShinseishoKanriNo shinseishoKanriNo;
    @lombok.Getter
    private int ninteichosaRirekiNo;
    private List<DbT5202NinteichosahyoGaikyoChosaEntity> dbT5202;
    private List<DbT5203NinteichosahyoKihonChosaEntity> dbT5203;
    private RString 調査項目;
    private RString 概況特記;
    private RString 特記情報;
    private RString サービスの状況;
    private RString サービスの状況フラグ;
    private RString 記入項目;
    private RString 施設利用;

    public NinteiChosahyoEntity() {
        this.shinseishoKanriNo = ShinseishoKanriNo.EMPTY;
        this.ninteichosaRirekiNo = 0;
        this.dbT5202 = new ArrayList<>();
        this.dbT5203 = new ArrayList<>();
    }

    private static <T extends DbTableEntityBase<T>> List<T> initMd5All(List<? extends T> entities) {
        for (T entity : entities) {
            entity.initializeMd5();
        }
        return new ArrayList<>(entities);
    }

    /**
     * @return {@link DbT5202NinteichosahyoGaikyoChosaEntity}
     */
    public List<DbT5202NinteichosahyoGaikyoChosaEntity> get概況調査() {
        if (this.dbT5202.isEmpty()) {
            return Collections.emptyList();
        }
        if (this.dbT5202.get(0).getKoroshoIfShikibetsuCode() == null) {
            return Collections.emptyList();
        }
        return initMd5All(this.dbT5202);
    }

    /**
     * 概況調査の情報をクリアします。
     */
    public void clear概況調査() {
        this.dbT5202.clear();
    }

    /**
     * @return {@link DbT5203NinteichosahyoKihonChosaEntity}
     */
    public List<DbT5203NinteichosahyoKihonChosaEntity> get基本調査() {
        if (this.dbT5203.isEmpty()) {
            return Collections.emptyList();
        }
        if (this.dbT5203.get(0).getKoroshoIfShikibetsuCode() == null) {
            return Collections.emptyList();
        }
        return initMd5All(this.dbT5203);
    }

    /**
     * @return {@link DbT5211NinteichosahyoChosaItemEntity}
     */
    public Map<Integer, DbT5211NinteichosahyoChosaItemEntity> get調査項目s() {
        try {
            Map<Integer, DbT5211NinteichosahyoChosaItemEntity> map = new HashMap<>();
            for (DbT5211NinteichosahyoChosaItemEntity entity : toDbT5211List(this.調査項目)) {
                entity.initializeMd5();
                map.put(entity.getRemban(), entity);
            }
            return map;
        } catch (IOException e) {
            throw newSystemExceptionWhenErrorInJsonDeserialization(e);
        }
    }

    private static List<DbT5211NinteichosahyoChosaItemEntity> toDbT5211List(RString 調査項目) throws IOException {
        return RString.isNullOrEmpty(調査項目)
                ? Collections.<DbT5211NinteichosahyoChosaItemEntity>emptyList()
                : new ObjectMapperProvider().get().<List<DbT5211NinteichosahyoChosaItemEntity>>readValue(調査項目.toString(),
                        new TypeReference<List<DbT5211NinteichosahyoChosaItemEntity>>() {
                        });
    }

    private SystemException newSystemExceptionWhenErrorInJsonDeserialization(IOException e) throws SystemException {
        return new SystemException(new RStringBuilder()
                .append("jsonのデシリアライズに失敗しました。")
                .append(" 申請書管理番号:").append(shinseishoKanriNo)
                .append(" 認定調査依頼履歴番号:").append(ninteichosaRirekiNo)
                .toString(), e);
    }

    /**
     * @return {@link DbT5206GaikyoTokkiEntity}
     */
    public List<DbT5206GaikyoTokkiEntity> get概況特記() {
        try {
            return toListDbT5206(this.概況特記);
        } catch (IOException e) {
            throw newSystemExceptionWhenErrorInJsonDeserialization(e);
        }
    }

    private static List<DbT5206GaikyoTokkiEntity> toListDbT5206(RString 概況特記) throws IOException {
        return RString.isNullOrEmpty(概況特記)
                ? Collections.<DbT5206GaikyoTokkiEntity>emptyList()
                : initMd5All(new ObjectMapperProvider().get()
                        .<List<DbT5206GaikyoTokkiEntity>>readValue(
                                概況特記.toString(), new TypeReference<List<DbT5206GaikyoTokkiEntity>>() {
                                })
                );
    }

    /**
     * 概況特記の情報をクリアします。
     */
    public void clear概況特記() {
        set概況特記(RString.EMPTY);
    }

    /**
     * @return {@link DbT5205NinteichosahyoTokkijikoEntity}
     */
    public List<DbT5205NinteichosahyoTokkijikoEntity> get特記情報() {
        try {
            return toListDbT5205(this.特記情報);
        } catch (IOException e) {
            throw newSystemExceptionWhenErrorInJsonDeserialization(e);
        }
    }

    private List<DbT5205NinteichosahyoTokkijikoEntity> toListDbT5205(RString 特記情報) throws IOException {
        return RString.isNullOrEmpty(特記情報)
                ? Collections.<DbT5205NinteichosahyoTokkijikoEntity>emptyList()
                : initMd5All(new ObjectMapperProvider().get()
                        .<List<DbT5205NinteichosahyoTokkijikoEntity>>readValue(
                                特記情報.toString(), new TypeReference<List<DbT5205NinteichosahyoTokkijikoEntity>>() {
                                })
                );
    }

    /**
     * @return {@link DbT5207NinteichosahyoServiceJokyoEntity}
     */
    public Map<Integer, DbT5207NinteichosahyoServiceJokyoEntity> getサービスの状況() {
        try {
            Map<Integer, DbT5207NinteichosahyoServiceJokyoEntity> map = new HashMap<>();
            for (DbT5207NinteichosahyoServiceJokyoEntity entity : toDbT5207List(this.サービスの状況)) {
                entity.initializeMd5();
                map.put(entity.getRemban(), entity);
            }
            return map;
        } catch (IOException e) {
            throw newSystemExceptionWhenErrorInJsonDeserialization(e);
        }
    }

    private static List<DbT5207NinteichosahyoServiceJokyoEntity> toDbT5207List(RString サービスの状況) throws IOException {
        return RString.isNullOrEmpty(サービスの状況)
                ? Collections.<DbT5207NinteichosahyoServiceJokyoEntity>emptyList()
                : new ObjectMapperProvider().get()
                .<List<DbT5207NinteichosahyoServiceJokyoEntity>>readValue(サービスの状況.toString(),
                        new TypeReference<List<DbT5207NinteichosahyoServiceJokyoEntity>>() {
                        });
    }

    /**
     * @return {@link DbT5208NinteichosahyoServiceJokyoFlagEntity}
     */
    public Map<Integer, DbT5208NinteichosahyoServiceJokyoFlagEntity> getサービスの状況フラグ() {
        try {
            Map<Integer, DbT5208NinteichosahyoServiceJokyoFlagEntity> map = new HashMap<>();
            for (DbT5208NinteichosahyoServiceJokyoFlagEntity entity : toDbT5208List(this.サービスの状況フラグ)) {
                entity.initializeMd5();
                map.put(entity.getRemban(), entity);
            }
            return map;
        } catch (IOException e) {
            throw newSystemExceptionWhenErrorInJsonDeserialization(e);
        }
    }

    private static List<DbT5208NinteichosahyoServiceJokyoFlagEntity> toDbT5208List(RString サービスの状況フラグ) throws IOException {
        return RString.isNullOrEmpty(サービスの状況フラグ)
                ? Collections.<DbT5208NinteichosahyoServiceJokyoFlagEntity>emptyList()
                : new ObjectMapperProvider().get()
                .<List<DbT5208NinteichosahyoServiceJokyoFlagEntity>>readValue(サービスの状況フラグ.toString(),
                        new TypeReference<List<DbT5208NinteichosahyoServiceJokyoFlagEntity>>() {
                        });
    }

    /**
     * @return {@link DbT5209NinteichosahyoKinyuItemEntity}
     */
    public Map<Integer, DbT5209NinteichosahyoKinyuItemEntity> get記入項目() {
        try {
            Map<Integer, DbT5209NinteichosahyoKinyuItemEntity> map = new HashMap<>();
            for (DbT5209NinteichosahyoKinyuItemEntity entity : toDbT5209List(this.記入項目)) {
                entity.initializeMd5();
                map.put(entity.getRemban(), entity);
            }
            return map;
        } catch (IOException e) {
            throw newSystemExceptionWhenErrorInJsonDeserialization(e);
        }
    }

    private static List<DbT5209NinteichosahyoKinyuItemEntity> toDbT5209List(RString 記入項目) throws IOException {
        return RString.isNullOrEmpty(記入項目)
                ? Collections.<DbT5209NinteichosahyoKinyuItemEntity>emptyList()
                : new ObjectMapperProvider().get()
                .<List<DbT5209NinteichosahyoKinyuItemEntity>>readValue(
                        記入項目.toString(), new TypeReference<List<DbT5209NinteichosahyoKinyuItemEntity>>() {
                        });
    }

    /**
     * @return {@link DbT5210NinteichosahyoShisetsuRiyoEntity}
     */
    public Map<Integer, DbT5210NinteichosahyoShisetsuRiyoEntity> get施設利用() {
        try {
            Map<Integer, DbT5210NinteichosahyoShisetsuRiyoEntity> map = new HashMap<>();
            for (DbT5210NinteichosahyoShisetsuRiyoEntity entity : toDbT5210List(this.施設利用)) {
                entity.initializeMd5();
                map.put(entity.getRemban(), entity);
            }
            return map;
        } catch (IOException e) {
            throw newSystemExceptionWhenErrorInJsonDeserialization(e);
        }
    }

    private static List<DbT5210NinteichosahyoShisetsuRiyoEntity> toDbT5210List(RString 施設利用) throws IOException {
        return RString.isNullOrEmpty(施設利用)
                ? Collections.<DbT5210NinteichosahyoShisetsuRiyoEntity>emptyList()
                : new ObjectMapperProvider().get()
                .<List<DbT5210NinteichosahyoShisetsuRiyoEntity>>readValue(
                        施設利用.toString(), new TypeReference<List<DbT5210NinteichosahyoShisetsuRiyoEntity>>() {
                        });
    }
}
