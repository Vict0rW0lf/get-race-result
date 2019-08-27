package com.example.kartrace.model;

import java.time.LocalTime;
import static com.example.kartrace.util.PilotInformationUtil.*;

public class DisplayResult implements Comparable<DisplayResult>{
	
	int position;
	String pilot;
	int laps;
	LocalTime totalTime;
	private LocalTime hour;
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public LocalTime getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(LocalTime totalTime) {
		this.totalTime = totalTime;
	}
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}
	public int getLaps() {
		return laps;
	}
	public void setLaps(int laps) {
		this.laps = laps;
	}
	public LocalTime getHour() {
		return hour;
	}
	public void setHour(LocalTime hour) {
		this.hour = hour;
	}
	
	@Override     
	public int compareTo(DisplayResult pp) {
		if (this.getLaps() > pp.getLaps())
			return -1;
		
		return this.getHour().compareTo(pp.getHour());  
	}
	
	@Override
	public String toString() {
		return "[Position: " + this.position + ", Pilot: "+ this.pilot +", Laps: " + this.laps + ", Total time: " + removeUnecessaryZerosForLegibity(this.totalTime.toString())  + "]";
	}

}
