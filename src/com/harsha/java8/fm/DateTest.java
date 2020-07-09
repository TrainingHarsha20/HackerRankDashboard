package com.harsha.java8.fm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class DateTest {
    public static void main(String[] args) {
        System.out.println("LocalDateTime ::" +  LocalDateTime.now());
        System.out.println("LocalDate     ::" + LocalDate.now());
        System.out.println("LocalTime     ::" + LocalTime.now());

                System.out.println("with Zone");
        System.out.println("LocalDateTime ::" +  LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("LocalDate     ::" + LocalDate.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("LocalTime     ::" + LocalTime.now(ZoneId.of("Asia/Kolkata")));

        System.out.println("Next week: " + LocalDateTime.now().plus(1, ChronoUnit.WEEKS));
    }
}
