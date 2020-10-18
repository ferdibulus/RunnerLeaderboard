package com.herogi.runnerLeaderboard.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.herogi.runnerLeaderboard.services.ListRunner;
import com.herogi.runnerLeaderboard.user.Runner;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class RunnerController {
	
	@Autowired
	private ListRunner listRunner;
	
	@GetMapping("/runners")
	public ArrayList<Runner> runnerList(){
		return listRunner.runnerList();
	}
}
