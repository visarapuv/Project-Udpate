package com.esports.template;

import java.util.ArrayList;
import java.util.Scanner;

import com.esports.iterator.CustomIterator;

public class Cricket extends EsportTemplate
{
	String tournmentName = "";
    @Override
    public String tournments() {
    	Scanner mScanner = new Scanner(System.in);
    	System.out.println("Please Select the Tournment ");
		int i = 1;
		String[] tournmentList = new String[10];
		tournmentList[0] = "World Cup";
		tournmentList[1] ="Asia Cup";
		tournmentList[2]="Indian Premier League";
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
		  System.out.println ("The tournment is scheduled between 01 January 2022 to 15 January 2022");
	    }else if("Asia Cup".equals(tournmentName)) {
	    	System.out.println ("The tournment is scheduled between 16 January 2022 to 28 January 2022");
	    }else if("Indian Premier League".equals(tournmentName)) {
	    	System.out.println ("The tournment is scheduled between 12 February 2022 to 25 March 2022");
	    }
    }
 
    @Override
    public void teams() {
    	if("World Cup".equals(tournmentName)) {
  		  System.out.println ("Total Number of Teams participated is 10");
  	    }else if("Asia Cup".equals(tournmentName)) {
  	    	System.out.println ("Total Number of Teams participated is 4");
  	    }else if("Indian Premier League".equals(tournmentName)) {
  	    	System.out.println ("Total Number of Teams participated is 8");
  	    }
    }
	
    @Override
	public void players(){
    	 System.out.println ("Total Number of players in each team is 15");
    	 System.out.println ("Total Number of players playing in each team is 11");
    }
 
    @Override
	public void results() {
   	 System.out.println ("One Team will be the Winner");
	 System.out.println ("One Team will be the Runner");
	}
    
    @Override
	public void prize() {
    	if("World Cup".equals(tournmentName)) {
		  System.out.println ("Total prize money of 50 millions plus Trophy");
	    }else if("Asia Cup".equals(tournmentName)) {
	    	System.out.println ("Total prize money of 20 millions plus Trophy");
	    }else if("Indian Premier League".equals(tournmentName)) {
	    	System.out.println ("Total prize money of 100 millions plus Trophy");
	    }
	}
	
    public ArrayList<String> getTournmentList() {
		ArrayList<String> tournmentList = new ArrayList<String>();
		tournmentList.add("World Cup");
		tournmentList.add("Asia Cup");
		tournmentList.add("Indian Premier League");
		return tournmentList;
	}

}
