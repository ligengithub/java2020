package com.demo.netio.nio;

import com.sun.prism.shader.DrawPgram_RadialGradient_REPEAT_AlphaTest_Loader;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author ligen
 * @title: nio.Test
 * @projectName noidemo
 * @description:
 * @date 2019/9/1217:43
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        Date date = new Date();
        LocalDateTime minus = time.minusDays(20);
        //        LocalDateTime minus = time.minus(20, ChronoUnit.DAYS);
        System.out.println(minus);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = minus.atZone(zoneId);//Combines this date-time with a time-zone to create a  ZonedDateTime.
        System.out.println(zdt);
        Date from = Date.from(zdt.toInstant());
        System.out.println(from);


        System.out.println(date);

////        time.minusDays(20);
//        time.minus(20, ChronoUnit.DAYS);
//        System.out.println(time);
//        ZoneId zoneId = ZoneId.systemDefault();
//        ZonedDateTime zdt = time.atZone(zoneId);//Combines this date-time with a time-zone to create a  ZonedDateTime.
//        Date date2 = Date.from(zdt.toInstant());
//        System.out.println(date2);
//
//        System.out.println(new Date());

    }

}
