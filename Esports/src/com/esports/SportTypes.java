package com.esports;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SportTypes {
	
	String selSport = "";
	
	public String chooseSport() {
		Scanner scn = new Scanner(System.in); 
        System.out.println("Choose the Sport");
			int i =1;
			Iterator iterator = getSportTypes().iterator();
			while(iterator.hasNext()) {
				String carCompany = (String)iterator.next();
				System.out.println(i+" "+carCompany);
				i = i+1;
			}
			
			switch(scn.nextInt()) {
			case 1: selSport = "racing";
			        break;
			case 2: selSport = "cricket";
	        		break;
			case 3: selSport = "football";
	        		break;
					
			}
		return selSport;
	}
	
	private List<String> getSportTypes() {
		List<String> st = new ArrayList<String>();
		st.add("Racing");
		st.add("Cricket");
		st.add("Football");
		return st;
	}
	
}
