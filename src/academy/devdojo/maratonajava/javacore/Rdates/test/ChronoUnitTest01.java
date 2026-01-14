package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.APRIL, 6, 12,9);
        LocalDateTime localDateTime = LocalDateTime.now();
        long between = ChronoUnit.DAYS.between(aniversario, localDateTime);
        long betweenWeeks = ChronoUnit.WEEKS.between(aniversario, localDateTime);
        long betweenMonths = ChronoUnit.MONTHS.between(aniversario, localDateTime);
        long betweenYears = ChronoUnit.YEARS.between(aniversario, localDateTime);
        System.out.println(between);
        System.out.println(betweenWeeks);
        System.out.println(betweenMonths);
        System.out.println(betweenYears);
    }
}
