/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.DaichoType;
import jp.co.ndensan.reams.ur.urz.definition.Messages;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.Range;

/**
 * 施設入退所情報を表すクラスです。
 *
 * @author N3317 塚田 萌
 */
public class ShisetsuNyutaisho {

    private final LasdecCode 市町村コード;
    private final ShikibetsuCode 個人識別コード;
    private final RDateTime 処理日時;
    private final DaichoType 台帳種別;
    private final Range<FlexibleDate> 入所期間;
    private final NyushoShisetsu 入所施設;
    private final FlexibleDate 入所処理年月日;
    private final FlexibleDate 退所処理年月日;

    /**
     * コンストラクタです。
     *
     * @param 市町村コード 市町村コード
     * @param 個人識別コード 個人識別コード
     * @param 処理日時 処理日時
     * @param 台帳種別 台帳種別
     * @param 入所期間 入所期間
     * @param 入所施設 入所施設
     * @param 入所処理年月日 入所処理年月日
     * @param 退所処理年月日 退所処理年月日
     */
    public ShisetsuNyutaisho(LasdecCode 市町村コード,
            ShikibetsuCode 個人識別コード, RDateTime 処理日時,
            DaichoType 台帳種別, Range<FlexibleDate> 入所期間,
            NyushoShisetsu 入所施設, FlexibleDate 入所処理年月日, FlexibleDate 退所処理年月日) {

        this.市町村コード = requireNonNull(市町村コード, Messages.E00001.replace("市町村コード").getMessage());
        this.個人識別コード = requireNonNull(個人識別コード, Messages.E00001.replace("個人識別コード").getMessage());
        this.処理日時 = requireNonNull(処理日時, Messages.E00001.replace("処理日時").getMessage());
        this.台帳種別 = requireNonNull(台帳種別, Messages.E00001.replace("台帳種別").getMessage());
        this.入所期間 = requireNonNull(入所期間, Messages.E00001.replace("入所期間").getMessage());
        this.入所施設 = requireNonNull(入所施設, Messages.E00001.replace("入所施設").getMessage());
        this.入所処理年月日 = 入所処理年月日;
        this.退所処理年月日 = 退所処理年月日;
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
     * 個人識別コードを返します。
     *
     * @return 個人識別コード
     */
    public ShikibetsuCode get個人識別コード() {
        return 個人識別コード;
    }

    /**
     * 処理日時を返します。
     *
     * @return 処理日時
     */
    public RDateTime get処理日時() {
        return 処理日時;
    }

    /**
     * 台帳種別を返します。
     *
     * @return 台帳種別
     */
    public DaichoType get台帳種別() {
        return 台帳種別;
    }

    /**
     * 入所期間を返します。
     *
     * @return 入所期間
     */
    public Range<FlexibleDate> get入所期間() {
        return 入所期間;
    }

    /**
     * 入所施設を返します。
     *
     * @return 入所施設
     */
    public NyushoShisetsu get入所施設() {
        return 入所施設;
    }

    /**
     * 入所処理年月日を返します。
     *
     * @return 入所処理年月日
     */
    public FlexibleDate get入所処理年月日() {
        return 入所処理年月日;
    }

    /**
     * 退所処理年月日を返します。
     *
     * @return 退所処理年月日
     */
    public FlexibleDate get退所処理年月日() {
        return 退所処理年月日;
    }
}