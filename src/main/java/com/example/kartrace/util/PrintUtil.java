package com.example.kartrace.util;

import static com.example.kartrace.util.PilotInformationUtil.removeUnecessaryZerosForLegibity;
import static com.example.kartrace.util.PilotInformationUtil.round;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import com.example.kartrace.model.DisplayResult;
import com.example.kartrace.model.PilotPerformance;

public class PrintUtil {
	
	public static void printTimeDifferenceFromWinner(List<DisplayResult> drs) {
		
		println("Difference between crossing the finish line between pilots who finished the race and the winner");
		
		for (int i = 1; i < drs.size(); i++) {
			if (drs.get(i).getLaps() != 4)
				continue;
			
			println(drs.get(i).getPilot()+ ": " + removeUnecessaryZerosForLegibity(drs.get(i).getHour().minusNanos(drs.get(0).getHour().toNanoOfDay()).toString()));
		} 
	}

	public static void printRaceResults(List<DisplayResult> drs) {
		for (int i = 0; i < drs.size(); i++) {
			drs.get(i).setPosition(i + 1);
			println(drs.get(i).toString());
		} 
	}

	public static void printEachPilotsBestLapAndAverageSpeed(Map<String, List<PilotPerformance>> pilotsPerformances) {
		for (List<PilotPerformance> lpp : pilotsPerformances.values()) {
			LocalTime bestLap = null;
			Double speedSum = 0.0;
			int divideSpeedBy = 0;
			String pilot = lpp.get(0).getPilot();
			
			for (int i = 0; i < lpp.size(); i++) {
				speedSum += lpp.get(i).getAverageLapSpeed();
				divideSpeedBy++;
				
				if (bestLap == null) {
					bestLap = lpp.get(i).getLapTime();
				} else if (bestLap.isAfter(lpp.get(i).getLapTime())){
					bestLap = lpp.get(i).getLapTime();
				}
			}
			
			println(pilot + " best lap: " + removeUnecessaryZerosForLegibity(bestLap.toString()));
			println(pilot + " average speed: " + round((speedSum / divideSpeedBy), 3));
		}
	}

	public static void printBestLap(Map<String, List<PilotPerformance>> pilotsPerformances) {
		LocalTime bestLapPerformance = null;
		String pilot = null;
		
		for (List<PilotPerformance> lpp : pilotsPerformances.values()) {
			for (int i = 0; i < lpp.size(); i++) {
				if (bestLapPerformance == null) {
					bestLapPerformance = lpp.get(i).getLapTime();
					pilot = lpp.get(i).getPilot();
				} else if (bestLapPerformance.isAfter(lpp.get(i).getLapTime())){
					bestLapPerformance = lpp.get(i).getLapTime();
					pilot = lpp.get(i).getPilot();
				}
			}
		}
		
		println("Best lap: " + removeUnecessaryZerosForLegibity(bestLapPerformance.toString()) + " by: " + pilot);
	}
	
	public static void println(String text) {
		System.out.println(text);
	}
	
	public static void printSeparator() {
		println("================================================================================================");
	}

}
