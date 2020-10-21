package com.herogi.runnersLeaderboard.RunnersLeaderboard.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herogi.runnersLeaderboard.RunnersLeaderboard.Runner.Runners;
import com.herogi.runnersLeaderboard.RunnersLeaderboard.Services.ListRunner;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class RunnerController {
	
	@Autowired
	private ListRunner listRunner;
	
	@GetMapping("/runners")
	public ArrayList<Runners> runnerList(){
		return listRunner.runnerList();
	}
}
