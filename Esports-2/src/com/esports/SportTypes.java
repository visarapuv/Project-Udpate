package com.esports;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.esports.iterator.CustomIterator;

public class SportTypes {
	
	String selSport = "";
	
	public String chooseSport() {
		Scanner scn = new Scanner(System.in); 
        System.out.println("Choose the Sport");
			int i =1;
			String[] aList = new String[10];
			aList[0] ="Racing";
			aList[1] = "Cricket";
			aList[2] = "Football";
			
			CustomIterator ite = new CustomIterator(aList);
			while(ite.hasNext()) {
				String carCompany = (String)ite.next();
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
	
		
}
