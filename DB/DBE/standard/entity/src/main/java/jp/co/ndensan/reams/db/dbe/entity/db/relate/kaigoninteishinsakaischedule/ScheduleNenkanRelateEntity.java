/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.kaigoninteishinsakaischedule;

import java.util.List;

/**
 * 介護認定審査会スケジュール表（年間）のRelateEntityクラスです。
 *
 * @reamsid_L DBE-0130-090 duanzhanli
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
@lombok.Setter
public class ScheduleNenkanRelateEntity {

    private WeekRelateEntity week;
    private List<GogitaiRelateEntity> gogitaiList;
}