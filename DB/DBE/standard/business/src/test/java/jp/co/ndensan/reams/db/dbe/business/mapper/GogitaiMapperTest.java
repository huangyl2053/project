/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.mapper;

import jp.co.ndensan.reams.db.dbe.business.mapper.GogitaiMapper;
import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.Gogitai;
import jp.co.ndensan.reams.db.dbe.business.GogitaiList;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.GogitaiNo;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.GogitaiYukoKikanKaishiDate;
import jp.co.ndensan.reams.db.dbe.entity.helper.GogitaiMockEntityCreator;
import jp.co.ndensan.reams.db.dbe.entity.helper.ShinsakaiMockEntityCreator;
import jp.co.ndensan.reams.db.dbe.entity.relate.GogitaiWariateShinsakaiIinEntity;
import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestBase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * 合議体Mapperのテストです。
 *
 * @author n8178 城間篤人
 */
@RunWith(Enclosed.class)
public class GogitaiMapperTest {

    public static class to合議体Listのテスト extends DbeTestBase {

        private GogitaiList result;

        @Before
        public void setUp() {
            result = GogitaiMapper.to合議体List(create合議体割当委員EntityList());
        }

        @Test
        public void 合議体番号1_有効期間開始年月日19990101の合議体は_割当委員を3件持つ() {
            Gogitai 合議体 = result.get合議体(new GogitaiNo(1), new GogitaiYukoKikanKaishiDate("19990101"));
            assertThat(合議体.get割当委員List().size(), is(3));
        }

        @Test
        public void 合議体番号1_有効期間開始年月日20010101の合議体は_割当委員を2件持つ() {
            Gogitai 合議体 = result.get合議体(new GogitaiNo(1), new GogitaiYukoKikanKaishiDate("20010101"));
            assertThat(合議体.get割当委員List().size(), is(2));
        }

        @Test
        public void 合議体番号2_有効期間開始年月日19990101の合議体は_割当委員を3件持つ() {
            Gogitai 合議体 = result.get合議体(new GogitaiNo(2), new GogitaiYukoKikanKaishiDate("19990101"));
            assertThat(合議体.get割当委員List().size(), is(3));
        }

        @Test
        public void 合議体番号3_有効期間開始年月日20080101の合議体は_割当委員を1件持つ() {
            Gogitai 合議体 = result.get合議体(new GogitaiNo(3), new GogitaiYukoKikanKaishiDate("20080101"));
            assertThat(合議体.get割当委員List().size(), is(1));
        }
    }

    public static class to合議体List_ソートされていないListが渡されたときのテスト extends DbeTestBase {

        private GogitaiList result;

        @Before
        public void setUp() {
            result = GogitaiMapper.to合議体List(create未ソート合議体割当委員EntityList());
        }

        @Test
        public void 合議体番号1_有効期間開始年月日19990101の合議体は_割当委員を2件持つ() {
            Gogitai 合議体 = result.get合議体(new GogitaiNo(1), new GogitaiYukoKikanKaishiDate("19990101"));
            assertThat(合議体.get割当委員List().size(), is(2));
        }

        @Test
        public void 合議体番号1_有効期間開始年月日20010101の合議体は_割当委員を2件持つ() {
            Gogitai 合議体 = result.get合議体(new GogitaiNo(1), new GogitaiYukoKikanKaishiDate("20010101"));
            assertThat(合議体.get割当委員List().size(), is(2));
        }

        @Test
        public void 合議体番号2_有効期間開始年月日19990101の合議体は_割当委員を2件持つ() {
            Gogitai 合議体 = result.get合議体(new GogitaiNo(2), new GogitaiYukoKikanKaishiDate("19990101"));
            assertThat(合議体.get割当委員List().size(), is(2));
        }
    }

    private static List<GogitaiWariateShinsakaiIinEntity> create合議体割当委員EntityList() {
        List<GogitaiWariateShinsakaiIinEntity> list = new ArrayList<>();
        list.add(create合議体割当委員Entity(1, "19990101", "19991231", "00000001", "19800101", "basho01"));
        list.add(create合議体割当委員Entity(1, "19990101", "19991231", "00000002", "19800102", "basho01"));
        list.add(create合議体割当委員Entity(1, "19990101", "19991231", "00000003", "19800103", "basho01"));

        list.add(create合議体割当委員Entity(1, "20010101", "20011231", "00000001", "19800101", "basho02"));
        list.add(create合議体割当委員Entity(1, "20010101", "20011231", "00000002", "19800102", "basho02"));

        list.add(create合議体割当委員Entity(2, "19990101", "19991231", "00000004", "19800104", "basho01"));
        list.add(create合議体割当委員Entity(2, "19990101", "19991231", "00000005", "19800105", "basho01"));
        list.add(create合議体割当委員Entity(2, "19990101", "19991231", "00000006", "19800106", "basho01"));

        list.add(create合議体割当委員Entity(3, "20080101", "20081231", "00000001", "19800101", "basho02"));
        return list;
    }

    private static List<GogitaiWariateShinsakaiIinEntity> create未ソート合議体割当委員EntityList() {
        List<GogitaiWariateShinsakaiIinEntity> list = new ArrayList<>();

        list.add(create合議体割当委員Entity(1, "20010101", "20011231", "00000001", "19800101", "basho02"));
        list.add(create合議体割当委員Entity(1, "19990101", "19991231", "00000002", "19800102", "basho01"));
        list.add(create合議体割当委員Entity(2, "19990101", "19991231", "00000004", "19800104", "basho01"));
        list.add(create合議体割当委員Entity(1, "19990101", "19991231", "00000001", "19800101", "basho01"));
        list.add(create合議体割当委員Entity(2, "19990101", "19991231", "00000005", "19800105", "basho01"));
        list.add(create合議体割当委員Entity(1, "20010101", "20011231", "00000002", "19800102", "basho02"));

        return list;
    }

    private static GogitaiWariateShinsakaiIinEntity create合議体割当委員Entity(int 合議体番号, String 合議体有効期間開始年月日,
            String 合議体有効期間終了年月日, String 委員コード, String 委員開始年月日, String 場所コード) {
        GogitaiWariateShinsakaiIinEntity entity = new GogitaiWariateShinsakaiIinEntity();
        entity.set割当Entity(GogitaiMockEntityCreator.create合議体割当EntitySpy(合議体番号, 委員コード,
                合議体有効期間開始年月日, 合議体有効期間終了年月日));
        entity.set合議体情報Entity(GogitaiMockEntityCreator.create合議体情報Entity(合議体番号, 合議体有効期間開始年月日,
                合議体有効期間終了年月日, 場所コード));
        entity.set委員Entity(ShinsakaiMockEntityCreator.create審査会委員EntitySpy(委員コード));
        entity.set開催場所Entity(GogitaiMockEntityCreator.create開催場所EntitySpy(場所コード));
        return entity;
    }
}