package com.example.kartrace.util;

import static com.example.kartrace.util.PilotInformationUtil.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.kartrace.model.PilotPerformance;

public class FileReaderUtil {
	
	public static void readFileAndSetPerformances(Map<String, List<PilotPerformance>> pilotsPerformances) throws IOException {
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader("result.txt"));
			
			 String line;
			 reader.readLine();
			 
			 while ((line = reader.readLine()) != null) {
				String[] values = line.split("\\s+");
				String pilot = putTogetherPilotString(new String[] {values[1], values[2], values[3]});
				
				PilotPerformance pp = new PilotPerformance();
				pp.setHour(stringToHour((values[0])));
				pp.setLap(stringToInteger(values[4]));
				pp.setLapTime(stringToLapTime(values[5]));
				pp.setAverageLapSpeed(stringToAverageLapTime(values[6]));
				pp.setPilot(pilot);
				
				if (pilotsPerformances.get(pilot) != null) {
					pilotsPerformances.get(pilot).add(pp);
				} else {
					List<PilotPerformance> pps = new ArrayList<>();
					pps.add(pp);
					
					pilotsPerformances.put(pilot, pps);
				}
				 
			 }
			 
		     reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}

}
