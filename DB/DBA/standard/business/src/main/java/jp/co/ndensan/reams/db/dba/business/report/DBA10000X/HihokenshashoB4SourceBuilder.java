/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.business.report.DBA10000X;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dba.definition.enumeratedtype.HihokenshashoB4PrintPosition;
import jp.co.ndensan.reams.db.dba.model.report.DBA10000X.HihokenshashoB4;
import jp.co.ndensan.reams.ur.urz.business.report.IReportSourceBuilder;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;

/**
 * 被保険者証B4版の帳票ソースを作成するクラスです。
 *
 * @author n8178 城間篤人
 */
public final class HihokenshashoB4SourceBuilder implements IHihokenshashoB4SourceBuilder {

    private final HihokenshashoB4Editor hihokenshashoEditor;

    /**
     * コンストラクタです。
     *
     * @param hihokenshashoEditor 被保険者証B4版Editor
     * @throws NullPointerException 引数にnullが渡されたとき
     */
    public HihokenshashoB4SourceBuilder(HihokenshashoB4Editor hihokenshashoEditor) throws NullPointerException {
        requireNonNull(hihokenshashoEditor, UrSystemErrorMessages.引数がnullのため生成不可
                .getReplacedMessage("被保険者証Editor", getClass().getName()));
        this.hihokenshashoEditor = hihokenshashoEditor;
    }

    @Override
    public HihokenshashoB4 buildSource() {
        return hihokenshashoEditor.edit(new HihokenshashoB4());
    }

    public HihokenshashoB4PrintPosition get印字位置() {
        return hihokenshashoEditor.get印字位置();
    }
}
