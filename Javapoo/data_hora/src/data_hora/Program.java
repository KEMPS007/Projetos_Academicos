package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		//instaciação data e hora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); //  <--- global
		
		// formato iso 
		LocalDate d04 = LocalDate.parse("2026-04-03");
		LocalDateTime d05 = LocalDateTime.parse("2026-04-03T01:30:26");
		Instant d06 = Instant.parse("2026-04-03T01:30:26Z");
		Instant d07 = Instant.parse("2026-04-03T01:30:26-03:00");
		
		// texto customizado
		//LocalDate d08 = LocalDate.parse("2026-04-03", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate d08 = LocalDate.parse("03/04/2025", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("03/04/2025 01:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		// dados isolados 
		LocalDate d10 = LocalDate.of(2026, 04, 03);
		LocalDateTime d11 = LocalDateTime.of(2026, 04,03,7,50);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		System.out.println();
		//Formatação
		 
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04)); 
		System.out.println("d04 = " + fmt3.format(d06)); 
		
		// Converter data hora global para local 
		System.out.println();
		
		LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//calculo com data e hora 
		LocalDate pastweekLocaldate = d04.minusDays(7);
		LocalDate nextweekLocaldate = d04.plusDays(7);
		
		System.out.println("pastweekLocaldate = " + pastweekLocaldate);
		System.out.println("nextweekLocaldate = " + nextweekLocaldate);
		
		LocalDateTime pastweekLocaldateTime = d05.minusDays(7);
		LocalDateTime nextweekLocalDateTime = d05.plusDays(7);
		
		// duração entre data e hora
		
		Duration t1 = Duration.between(pastweekLocaldateTime, nextweekLocalDateTime);
		System.out.println("t1 dias " + t1.toDays());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
