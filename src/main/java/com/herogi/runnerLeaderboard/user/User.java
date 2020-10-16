package com.herogi.runnerLeaderboard.user;

public class User {
	private int id;
	private String userName;
	private String userAge;
	private String userSex;
	private String userDistance;
	private String userAvgPace;
	private String userTotalTime;
	
	public User() {
		
	}

	public User(int id, String userName, String userAge, String userSex, String userDistance, String userAvgPace,String userTotalTime) {
		this.id = id;
		this.userName = userName;
		this.userAge = userAge;
		this.userSex = userSex;
		this.userDistance = userDistance;
		this.userAvgPace = userAvgPace;
		this.userTotalTime = userTotalTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserDistance() {
		return userDistance;
	}

	public void setUserDistance(String userDistance) {
		this.userDistance = userDistance;
	}

	public String getUserAvgPace() {
		return userAvgPace;
	}

	public void setUserAvgPace(String userAvgPace) {
		this.userAvgPace = userAvgPace;
	}

	public String getUserTotalTime() {
		return userTotalTime;
	}

	public void setUserTotalTime(String userTotalTime) {
		this.userTotalTime = userTotalTime;
	}
	
	
	
}
