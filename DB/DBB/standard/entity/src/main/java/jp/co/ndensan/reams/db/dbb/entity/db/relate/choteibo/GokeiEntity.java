/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.entity.db.relate.choteibo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.definition.core.choteibo.DankaiShokei;
import jp.co.ndensan.reams.db.dbb.definition.core.choteibo.KibetsuShokei;

/**
 *
 * 合計用RelateEntityクラスです。
 *
 * @reamsid_L DBB-0770-030 zhangrui
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class GokeiEntity implements Cloneable, Serializable {

    private List<KibetsuShokei> 期別小計Parameter;
    private List<DankaiShokei> 段階小計Parameter;

    /**
     * コンストラクタです。
     */
    public GokeiEntity() {
        期別小計Parameter = new ArrayList<>();
        段階小計Parameter = new ArrayList<>();
    }
}