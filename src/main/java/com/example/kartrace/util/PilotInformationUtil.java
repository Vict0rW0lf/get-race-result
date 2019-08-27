package com.example.kartrace.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;

public class PilotInformationUtil {
	
	private static final String anythingThatIsNotNumber = "[^a-zA-Z0-9]";
	
	public static LocalTime stringToHour(String time) {
		String[] values = time.split(anythingThatIsNotNumber);
		
		return LocalTime.of(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3] + "000000"));
	}
	
	public static LocalTime stringToLapTime(String time) {
		String[] values = time.split(anythingThatIsNotNumber);
		
		return LocalTime.of(0, Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2] + "000000"));
	}
	
	public static Double stringToAverageLapTime(String value) {
		return Double.parseDouble(value.replace(",", "."));
	}
	
	public static int stringToInteger(String value) {
		return Integer.parseInt(value);
	}
	
	public static String putTogetherPilotString(String[] values) {
		String pilot = new String();
		
		for (int i = 0; i < values.length; i++) {
			if (i == 1) {
				pilot = pilot.concat(" " + values[i] + " ");
				
				continue;
			}
			
			pilot = pilot.concat(values[i]);
		}
		
		return pilot;
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public static String removeUnecessaryZerosForLegibity(String time) {
		if (time == null)
			return time;
		
		if (time.startsWith("00:00:"))
			return time.substring(6);
		
		if (time.startsWith("00:"))
			return time.substring(3);
		
		return time;
	}

}
