package com.esports.template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.esports.iterator.CustomIterator;

public class Football extends EsportTemplate
{
	String tournmentName = "";
    @Override
    public String tournments() {
    	Scanner mScanner = new Scanner(System.in);
    	System.out.println("Please Select the Tournment ");
		int i = 1;
		String[] tournmentList = new String[10];
		tournmentList[0] = "World Cup";
		tournmentList[1] ="Euro Cup";
		tournmentList[2]="Ameriacan Premier League";
		
		CustomIterator iterator = new CustomIterator(tournmentList);
		while(iterator.hasNext()) {
			String tournment = (String) iterator.next();
			System.out.println(i + "  " + tournment);
			i = i + 1;
		}
		tournmentName = getTournmentList().get(mScanner.nextInt()-1);
		return tournmentName;
    }
    	
 
    @Override
    public void schedule() {
    	if("World Cup".equals(tournmentName)) {
		  System.out.println ("The tournment is scheduled between 03 December 2021 to 15 February 2022");
	    }else if("Euro Cup".equals(tournmentName)) {
	    	System.out.println ("The tournment is scheduled between 18 Mar 2022 to 26 April 2022");
	    }else if("Ameriacan Premier League".equals(tournmentName)) {
	    	System.out.println ("The tournment is scheduled between 11 May 2022 to 18 June 2022");
	    }
    }
 
    @Override
    public void teams() {
    	if("World Cup".equals(tournmentName)) {
  		  System.out.println ("Total Number of Teams participated is 32");
  	    }else if("Euro Cup".equals(tournmentName)) {
  	    	System.out.println ("Total Number of Teams participated is 20");
  	    }else if("Ameriacan Premier League".equals(tournmentName)) {
  	    	System.out.println ("Total Number of Teams participated is 16");
  	    }
    }
	
    @Override
	public void players(){
    	 System.out.println ("Total Number of players in each team is 20");
    	 System.out.println ("Total Number of players playing in each team is 12");
    }
 
    @Override
	public void results() {
   	 System.out.println ("One Team will be the Winner");
	 System.out.println ("One Team will be the Runner");
	}
    
    @Override
	public void prize() {
    	if("World Cup".equals(tournmentName)) {
		  System.out.println ("Total prize money of 200 millions plus Trophy");
	    }else if("Euro Cup".equals(tournmentName)) {
	    	System.out.println ("Total prize money of 120 millions plus Trophy");
	    }else if("Ameriacan Premier League".equals(tournmentName)) {
	    	System.out.println ("Total prize money of 70 millions plus Trophy");
	    }
	}
	
    
    public ArrayList<String> getTournmentList() {
    	ArrayList<String> tournmentList = new ArrayList<String>();
		tournmentList.add("World Cup");
		tournmentList.add("Euro Cup");
		tournmentList.add("Ameriacan Premier League");
		return tournmentList;
	}
  

}
