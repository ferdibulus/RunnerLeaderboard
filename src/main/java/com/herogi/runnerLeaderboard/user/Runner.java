package com.herogi.runnerLeaderboard.user;

public class Runner {
	private int id;
	private String runnerName;
	private String runnerAge;
	private String runnerSex;
	private String runnerDistance;
	private String runnerAvgPace;
	private String runnerTotalTime;
	
	public Runner() {
		
	}

	public Runner(int id, String runnerName, String runnerAge, String userSex, String runnerDistance, String runnerAvgPace,String runnerTotalTime) {
		this.runnerName = runnerName;
		this.runnerAge = runnerAge;
		this.runnerSex = userSex;
		this.runnerDistance = runnerDistance;
		this.runnerAvgPace = runnerAvgPace;
		this.runnerTotalTime = runnerTotalTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRunnerName() {
		return runnerName;
	}

	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}

	public String getRunnerAge() {
		return runnerAge;
	}

	public void setRunnerAge(String runnerAge) {
		this.runnerAge = runnerAge;
	}

	public String getRunnerSex() {
		return runnerSex;
	}

	public void setRunnerSex(String runnerSex) {
		this.runnerSex = runnerSex;
	}

	public String getRunnerDistance() {
		return runnerDistance;
	}

	public void setRunnerDistance(String runnerDistance) {
		this.runnerDistance = runnerDistance;
	}

	public String getRunnerAvgPace() {
		return runnerAvgPace;
	}

	public void setRunnerAvgPace(String runnerAvgPace) {
		this.runnerAvgPace = runnerAvgPace;
	}

	public String getRunnerTotalTime() {
		return runnerTotalTime;
	}

	public void setRunnerTotalTime(String runnerTotalTime) {
		this.runnerTotalTime = runnerTotalTime;
	}

	
	
	
}


