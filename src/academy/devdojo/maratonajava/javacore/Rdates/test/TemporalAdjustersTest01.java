package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.withDayOfMonth(4);//substitui o dia do LocalDate
        System.out.println(now);
        now = now.with(ChronoField.DAY_OF_MONTH, 2);
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));//verifica quando foi a ultima quinta feira
        System.out.println(now);
    }
}