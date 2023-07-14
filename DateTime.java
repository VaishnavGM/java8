package Vaish;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
LocalDate l = LocalDate.now();
System.out.println(l);
LocalDate ls = LocalDate.of(2023,05,13);
System.out.println(ls);
LocalDate m = LocalDate.of(2022,Month.FEBRUARY,13);
System.out.println(m);
Instant mm = Instant.now();
System.out.println(mm);
/*for(String s :ZoneId.getAvailableZoneIds())
System.out.println(s);*/
LocalTime a = LocalTime.now(ZoneId.of("America/Recife"));
System.out.println(a);
LocalDate sss = ls.minusDays(2);
System.out.println(sss);

	}

}
