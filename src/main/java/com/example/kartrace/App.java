package com.example.kartrace;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.kartrace.model.DisplayResult;
import com.example.kartrace.model.PilotPerformance;

import static com.example.kartrace.util.PrintUtil.*;
import static com.example.kartrace.util.FileReaderUtil.*;
import static com.example.kartrace.util.ResultUtil.*;

public class App {
	
	static Map<String, List<PilotPerformance>> pilotsPerformances = new HashMap<>(); 
	
	public static void main(String[] args) throws IOException {
		readFileAndSetPerformances(pilotsPerformances);
		
		List<DisplayResult> drs = buildRaceResults(pilotsPerformances);
		printRaceResults(drs);
		printSeparator();
		printEachPilotsBestLapAndAverageSpeed(pilotsPerformances);
		printSeparator();
		printTimeDifferenceFromWinner(drs);
		printSeparator();
		printBestLap(pilotsPerformances);
	}

}
