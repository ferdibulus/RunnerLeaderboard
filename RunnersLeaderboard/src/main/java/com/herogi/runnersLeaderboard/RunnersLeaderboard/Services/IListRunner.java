package com.herogi.runnersLeaderboard.RunnersLeaderboard.Services;

import java.util.ArrayList;

import com.herogi.runnersLeaderboard.RunnersLeaderboard.Runner.Runners;

public interface IListRunner {
	public ArrayList<Runners> runnerList();

	float CalculateAvgPace(String tTime, String distance);
}