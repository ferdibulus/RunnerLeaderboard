package com.herogi.runnersLeaderboard.RunnersLeaderboard.Services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herogi.runnersLeaderboard.RunnersLeaderboard.Runner.Runners;

@Service
public class ListRunner implements IListRunner {

	@Override
	@Autowired
	public ArrayList<Runners> runnerList() {
		
		 List<Runners> listrunner = new ArrayList<Runners>();
		 String userCsvFile = "./users.csv";
		 String paceCsvFile = "./pace.csv";
	        BufferedReader br = null;
	        BufferedReader br1 = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        String[] userCsv;
	        String[] paceCsv = null;
	        float avgPace = 0;
	        int counter = 0;
	        try {

	            br = new BufferedReader(new FileReader(userCsvFile));
	            br1 = new BufferedReader(new FileReader(paceCsvFile));	
	            
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                userCsv = line.split(cvsSplitBy);
	                

	            if((line = br1.readLine()) != null){
	                // use comma as separator
	                paceCsv = line.split(cvsSplitBy);
	                
	            }
	         
	            counter++;
	            if(counter >= 2) {
	            avgPace = CalculateAvgPace(paceCsv[1],paceCsv[2]);
	            String AvgPace = Float.toString(avgPace);
	            if(userCsv[0].equals(paceCsv[0])) {
	            	  Runners runner = new Runners(Integer.parseInt(userCsv[0]),userCsv[1],userCsv[2] , "-", paceCsv[2],AvgPace,paceCsv[1]);
	            	  listrunner.add(runner);
	            }
	         
	            }
	            }
	      
	        } catch (FileNotFoundException e) {
	            System.out.println("File is not find");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    
		return (ArrayList<Runners>) listrunner;
		
}

	@Override
	public float CalculateAvgPace(String tTime, String distance) {
		int a = Integer.parseInt(tTime);
		int b = Integer.parseInt(distance);
		//Distance is stored as metre now.We changed metre to km.
		float sum = b /1000 ;
		sum = sum / a;
	  return sum;
	}

	
}