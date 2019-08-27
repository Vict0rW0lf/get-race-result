package com.example.kartrace.util;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.example.kartrace.model.DisplayResult;
import com.example.kartrace.model.PilotPerformance;

public class ResultUtil {
	
	public static List<DisplayResult> buildRaceResults(Map<String, List<PilotPerformance>> pilotsPerformances) {
		List<DisplayResult> drs = new ArrayList<>();
		
		for (Map.Entry<String, List<PilotPerformance>> p : pilotsPerformances.entrySet()) {
			DisplayResult dr = new DisplayResult();
			PilotPerformance lastLap = p.getValue().get(p.getValue().size() - 1);
			LocalTime totalTime = null;
			
			dr.setLaps(lastLap.getLap());
			dr.setHour(lastLap.getHour());
			dr.setPilot(lastLap.getPilot());
			
			for (int i = 0; i < p.getValue().size(); i++) {
				if (totalTime == null) {
					totalTime = p.getValue().get(i).getLapTime();
				} else {
					totalTime = totalTime.plus(Duration.ofNanos(p.getValue().get(i).getLapTime().toNanoOfDay()));
				}
			}
			
			dr.setTotalTime(totalTime);
			drs.add(dr);
		}
		
		Collections.sort(drs);
		
		return drs;
	}

}
