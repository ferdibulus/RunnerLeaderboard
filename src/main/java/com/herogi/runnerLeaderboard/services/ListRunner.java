package com.herogi.runnerLeaderboard.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.herogi.runnerLeaderboard.user.Runner;

@Service
public class ListRunner implements IListRunner {

	@Override
	@Autowired
	public ArrayList<Runner> runnerList() {
		
		List<Runner> listrunner = new ArrayList<Runner>();
		for(int i=0; i<=2; i++) {
			Runner runner = new Runner(1, "ferdi", "ferdi", "-", "ferdi", "ferdi", "ferdi");
			listrunner.add(runner);
		}
		
		return (ArrayList<Runner>) listrunner;
		
}
}
	

