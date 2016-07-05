/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.definition.core.configkeys;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * コンフィグ名称(DBC)を表す列挙型です。
 *
 * @reamsid_L DBX-9999-023 liangbc
 */
public enum ConfigNameDBC {

    /**
     * 国保連共同処理受託区分_事業高額
     */
    国保連共同処理受託区分_事業高額("国保連共同処理受託区分_事業高額"),
    /**
     * 国保連共同処理受託区分_高額
     */
    国保連共同処理受託区分_高額("国保連共同処理受託区分_高額"),
    /**
     * 初期表示_給付率。
     */
    初期表示_給付率("初期表示_償還支給申請登録初期"),
    /**
     * 償還支給申請書_審査方法初期表示。
     */
    償還支給申請書_審査方法初期表示("償還支給申請書_審査方法初期表示"),
    /**
     * 初期表示_償還支給申請登録初期。
     */
    初期表示_償還支給申請登録初期("初期表示_償還支給申請登録初期"),
    /**
     * 第1段階_高額介護サービス費支給_201504以降_自己負担上限月額
     */
    第1段階_高額介護サービス費支給_201504以降_自己負担上限月額("第1段階_高額介護サービス費支給_201504以降_自己負担上限月額"),
    /**
     * 第1段階_高額介護サービス費支給_自己負担上限月額
     */
    第1段階_高額介護サービス費支給_自己負担上限月額("第1段階_高額介護サービス費支給_自己負担上限月額"),
    /**
     * 第2段階_高額介護サービス費支給_201504以降_自己負担上限月額
     */
    第2段階_高額介護サービス費支給_201504以降_自己負担上限月額("第2段階_高額介護サービス費支給_201504以降_自己負担上限月額"),
    /**
     * 第2段階_高額介護サービス費支給_自己負担上限月額
     */
    第2段階_高額介護サービス費支給_自己負担上限月額("第2段階_高額介護サービス費支給_自己負担上限月額"),
    /**
     * 第3段階_高額介護サービス費支給_201504以降_自己負担上限月額
     */
    第3段階_高額介護サービス費支給_201504以降_自己負担上限月額("第3段階_高額介護サービス費支給_201504以降_自己負担上限月額"),
    /**
     * 第3段階_高額介護サービス費支給_自己負担上限月額
     */
    第3段階_高額介護サービス費支給_自己負担上限月額("第3段階_高額介護サービス費支給_自己負担上限月額"),
    /**
     * 第4段階_高額介護サービス費支給_201504以降_自己負担上限月額
     */
    第4段階_高額介護サービス費支給_201504以降_自己負担上限月額("第4段階_高額介護サービス費支給_201504以降_自己負担上限月額"),
    /**
     * 国保連共同処理受託区分_償還
     */
    国保連共同処理受託区分_償還("国保連共同処理受託区分_償還"),
    /**
     * 国保連取込_取込ファイル_保管日数
     */
    国保連取込_取込ファイル_保管日数("国保連取込_取込ファイル_保管日数"),
    /**
     * 償還払支給不支給決定通知書一括作成_初期選択抽出条件
     */
    償還払支給不支給決定通知書一括作成_初期選択抽出条件("償還払支給不支給決定通知書一括作成_初期選択抽出条件"),
    /**
     * 利用者負担割合判定基準_本人未申告区分
     */
    利用者負担割合判定基準_本人未申告区分("利用者負担割合判定基準_本人未申告区分"),
    /**
     * 利用者負担割合判定基準_本人所得調査中区分
     */
    利用者負担割合判定基準_本人所得調査中区分("利用者負担割合判定基準_本人所得調査中区分"),
    /**
     * 利用者負担割合判定管理_年次負担割合処理済年度
     */
    利用者負担割合判定管理_年次負担割合処理済年度("利用者負担割合判定管理_年次負担割合処理済年度"),
    /**
     * 利用者負担割合判定管理_年次負担割合処理状態
     */
    利用者負担割合判定管理_年次負担割合処理状態("利用者負担割合判定管理_年次負担割合処理状態");

    private final RString fullName;

    private ConfigNameDBC(String fullname) {
        this.fullName = new RString(fullname);
    }

    /**
     * コンフィグ名称(DBC)の名称を返します。
     *
     * @return コンフィグ名称(DBC)の名称
     */
    public RString get名称() {
        return fullName;
    }

}
