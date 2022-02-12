package com.esports;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Racing extends EsportTemplate
{
	String tournmentName = "";
    @Override
    public void tournments() {
    	Scanner mScanner = new Scanner(System.in);
    	System.out.println("Please Select the Tournment ");
		int i = 1;
		Iterator iterator = getTournmentList().iterator();
		while (iterator.hasNext()) {
			String tournment = (String) iterator.next();
			System.out.println(i + "  " + tournment);
			i = i + 1;
		}
		tournmentName = getTournmentList().get(mScanner.nextInt()-1);
    }
    	
 
    @Override
    public void schedule() {
    	if("Formula 1".equals(tournmentName)) {
		  System.out.println ("The tournment is scheduled between 03 August 2022 to 19 August 2022");
	    }else if("Monaco Grand Pix".equals(tournmentName)) {
	    	System.out.println ("The tournment is scheduled between 13 Mar 2022 to 24 April 2022");
	    }else if("World Sportscar Championship".equals(tournmentName)) {
	    	System.out.println ("The tournment is scheduled between 02 October 2022 to 27 October 2022");
	    }
    }
 
    @Override
    public void teams() {
    	if("Formula 1".equals(tournmentName)) {
  		  System.out.println ("Total Number of Teams participated is 16");
  	    }else if("Monaco Grand Pix".equals(tournmentName)) {
  	    	System.out.println ("Total Number of Teams participated is 12");
  	    }else if("World Sportscar Championship".equals(tournmentName)) {
  	    	System.out.println ("Total Number of Teams participated is 26");
  	    }
    }
	
    @Override
	public void players(){
    	 System.out.println ("Total Number of players in each team is 4");
    	 System.out.println ("Total Number of players playing in each team is 2");
    }
 
    @Override
	public void results() {
   	 System.out.println ("One Team will be the Winner");
	 System.out.println ("One Team will be the Runner");
	}
    
    @Override
	public void prize() {
    	if("Formula 1".equals(tournmentName)) {
		  System.out.println ("Total prize money of 350 millions plus Trophy");
	    }else if("Monaco Grand Pix".equals(tournmentName)) {
	    	System.out.println ("Total prize money of 220 millions plus Trophy");
	    }else if("World Sportscar Championship".equals(tournmentName)) {
	    	System.out.println ("Total prize money of 160 millions plus Trophy");
	    }
	}
	
    
    private List<String> getTournmentList() {
		List<String> tournmentList = new ArrayList<String>();
		tournmentList.add("Formula 1");
		tournmentList.add("Monaco Grand Pix");
		tournmentList.add("World Sportscar Championship");
		return tournmentList;
	}
  

}
