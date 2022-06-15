package day16.api.time;

import utility.Util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class LocalDateExample {

    public static void main(String[] args) {

        // 현재 날짜 정보 얻기 (연, 월, 일)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 현재 시간 정보 얻기(시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        // 현재 날짜와 시간 정보 얻기(연, 월, 일, 시, 분, 초)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        
        // 특정 날짜와 시간 정보 얻기 of 스태틱메서드
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("beginDate = " + beginDate);
        
        // 연도 추출하기 getYear 인스턴트매서드
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        int MonthValue = localDateTime.getMonthValue();
        System.out.println("Month = " + MonthValue);

        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);

        int hour = localDateTime.getHour();
        System.out.println("hour = " + hour);

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        Util.line();
        
        // 지금으로부터 3일 뒤
        LocalDateTime returnData = localDateTime.plusDays(3);
        System.out.println("returnData = " + returnData);

        // 지금으로부터 1년 2개월 7일 뒤 시간
        LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);

        // 사이 날짜 연산
        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate f = LocalDate.of(2022, 9, 14);

        long between = ChronoUnit.DAYS.between(b, f);
        System.out.println("between = " + between);

        Util.line();
        // 날짜 포맷 변경하기
        System.out.println(localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 E요일 a h시 m분 ss초");

        System.out.println(localDateTime.format(dtf));

    }
}
