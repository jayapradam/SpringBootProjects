/**
 * 
 */
package org.java8.examples;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Jayap
 *
 */
public class Java8DatetimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Clock class demo......
		final Clock clock = Clock.systemUTC();
		System.out.println("--------------CLOCK demo----------------------------");
		System.out.println("Time now: " + clock.systemDefaultZone());
		System.out.println("Time now: " + clock.millis());
		System.out.println("Time now: " + clock.instant());
		// Local date class
		final LocalDate localDate = LocalDate.now();
		System.out.println("----------------Local Date demo--------------------------");
		System.out.println("Date now............" + localDate.now());
		System.out.println("Lenght of the month............" + localDate.lengthOfMonth());
		System.out.println("Date now using clock............" + localDate.now(clock));

		// Local time Demo
		System.out.println("----------------Local time demo-------------------------");
		final LocalTime localTime = LocalTime.now();
		System.out.println("Time now is:: " + localTime);
		System.out.println("Time from Clock::  " + localTime.now(clock));

		// Datetime demo
		System.out.println("-------------Local date time demo-----------------------------");
		final LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Date time::  " + localDateTime.toString());
		System.out.println("hour::  " + localDateTime.getHour());
		System.out.println("Local Time:: " + localDateTime.toLocalTime());
		System.out.println("Date Time from clock:: " + localDateTime.now(clock));

		// Zoned date time demo
		System.out.println("-------------Zoned date time demo-----------------------------");
		final ZonedDateTime zoneDt = ZonedDateTime.now();
		System.out.println("zoned date time is:::: " + zoneDt);
		System.out.println("Zone info:: " + zoneDt.getZone());
		System.out.println("Zoned date time for a zones::: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Zoned date time from clock::: " + ZonedDateTime.now(clock));

		// Duration demo
		System.out.println("-------------Zoned date time demo-----------------------------");
		final LocalDateTime from = LocalDateTime.of(2017, Month.FEBRUARY, 16, 0, 0, 0);
		final LocalDateTime to = LocalDateTime.of(2018, Month.FEBRUARY, 15, 0, 0, 0);
		final Duration duration = Duration.between(from, to);
		System.out.println("Duration in days:: " + duration.toDays());
		System.out.println("Duration in hours:: " + duration.toHours());
		System.out.println("----------------END--------------------------");

	}

}
