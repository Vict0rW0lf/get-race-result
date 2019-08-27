package com.example.kartrace.model;

import java.time.LocalTime;

public class PilotPerformance {

	LocalTime hour;
	String pilot;
	int lap;
	LocalTime lapTime;
	Double averageLapSpeed;
	
	public PilotPerformance() {}
	
	public PilotPerformance(LocalTime hour, String pilot, int lap, LocalTime lapTime, Double averageLapTime) {
		this.hour = hour;
		this.pilot = pilot;
		this.lap = lap;
		this.lapTime = lapTime;
		this.averageLapSpeed = averageLapTime;
	}
	
	public LocalTime getHour() {
		return hour;
	}
	public void setHour(LocalTime hour) {
		this.hour = hour;
	}
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}
	public int getLap() {
		return lap;
	}
	public void setLap(int lap) {
		this.lap = lap;
	}
	public LocalTime getLapTime() {
		return lapTime;
	}
	public void setLapTime(LocalTime lapTime) {
		this.lapTime = lapTime;
	}
	public Double getAverageLapSpeed() {
		return averageLapSpeed;
	}
	public void setAverageLapSpeed(Double averageLapTime) {
		this.averageLapSpeed = averageLapTime;
	}
	
}
