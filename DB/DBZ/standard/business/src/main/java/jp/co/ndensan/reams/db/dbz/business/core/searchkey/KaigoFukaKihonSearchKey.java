/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.searchkey;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;

/**
 * 介護賦課基本情報の検索キークラスです。
 *
 * @author N8156 宮本 康
 */
public final class KaigoFukaKihonSearchKey {

    private final TsuchishoNo 通知書番号;
    private final FlexibleYear 賦課年度;
    private final LasdecCode 市町村コード;
    private final ShikibetsuCode 識別コード;

    /**
     * コンストラクタです。
     *
     * @param builder 介護賦課基本情報の検索キーBuilder
     * @throws NullPointerException 引数がnullの場合
     */
    private KaigoFukaKihonSearchKey(Builder builder) throws NullPointerException {
        requireNonNull(builder, UrSystemErrorMessages.値がnull.getReplacedMessage("builder"));
        this.通知書番号 = builder.通知書番号;
        this.賦課年度 = builder.賦課年度;
        this.市町村コード = builder.市町村コード;
        this.識別コード = builder.識別コード;
    }

    /**
     * 通知書番号を返します。
     *
     * @return 通知書番号
     */
    public TsuchishoNo get通知書番号() {
        return 通知書番号;
    }

    /**
     * 賦課年度を返します。
     *
     * @return 賦課年度
     */
    public FlexibleYear get賦課年度() {
        return 賦課年度;
    }

    /**
     * 市町村コードを返します。
     *
     * @return 市町村コード
     */
    public LasdecCode get市町村コード() {
        return 市町村コード;
    }

    /**
     * 識別コードを返します。
     *
     * @return 識別コード
     */
    public ShikibetsuCode get識別コード() {
        return 識別コード;
    }

    /**
     * Builder
     */
    public static class Builder {

        private final TsuchishoNo 通知書番号;
        private final FlexibleYear 賦課年度;
        private final LasdecCode 市町村コード;
        private final ShikibetsuCode 識別コード;

        /**
         * コンストラクタです。
         *
         * @param 通知書番号 通知書番号
         * @param 賦課年度 賦課年度
         * @param 市町村コード 市町村コード
         * @param 識別コード 識別コード
         * @throws NullPointerException 引数がnullの場合
         */
        public Builder(
                TsuchishoNo 通知書番号, FlexibleYear 賦課年度, LasdecCode 市町村コード, ShikibetsuCode 識別コード) throws NullPointerException {
            this.通知書番号 = requireNonNull(通知書番号, UrSystemErrorMessages.値がnull.getReplacedMessage("通知書番号"));
            this.賦課年度 = 賦課年度;
            this.市町村コード = requireNonNull(市町村コード, UrSystemErrorMessages.値がnull.getReplacedMessage("市町村コード"));
            this.識別コード = requireNonNull(識別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("識別コード"));
        }

        /**
         * 設定値を元に検索キークラスを作成して返します。
         *
         * @return 介護賦課基本情報の検索キー
         */
        public KaigoFukaKihonSearchKey build() {
            return new KaigoFukaKihonSearchKey(this);
        }
    }
}