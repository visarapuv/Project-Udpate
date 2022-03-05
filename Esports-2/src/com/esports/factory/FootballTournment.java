package com.esports.factory;

import java.util.Iterator;
import java.util.Scanner;

import com.esports.observer.CommentaryObservable;
import com.esports.observer.UsersObserver;
import com.esports.template.EsportTemplate;
import com.esports.template.Football;

public class FootballTournment  implements Esports {
	
public void tournment() {
	EsportTemplate et = new Football();
    String tournmentName = et.esportStructure();
    
    String finalists = "";
    if("World Cup".equals(tournmentName)) {
    	finalists = "America vs Brazil";
	}else if("Euro Cup".equals(tournmentName)) {
		finalists = "France vs England";
	}else if("Ameriacan Premier League".equals(tournmentName)) {
		finalists = "America Vs Mexico";
	}
    
    CommentaryObservable obj = new CommentaryObservable("Final Match between "+finalists);
    UsersObserver observer = new UsersObserver(obj, "Sony Liv");
    UsersObserver observer2 = new UsersObserver(obj,"Star Sports");
    observer.subscribe();
    observer2.subscribe();
    System.out.println("------------------------------------------------------");
    obj.description("Welcome to live Football match");
    obj.description("Current score 0-0");

    observer.unSubscribe();
    
    if("World Cup".equals(tournmentName)) {
    	 obj.description("America won the toss");
    	 obj.description("It's a goal!!");
    	 obj.description("Current score 1-0");
	}else if("Euro Cup".equals(tournmentName)) {
		 obj.description("France won the toss");
    	 obj.description("Mid fielder pass the ball to forwarder!!");
    	 obj.description("Umpire shows yellow card");
	}else if("Ameriacan Premier League".equals(tournmentName)) {
		 obj.description("Mexico won the toss");
    	 obj.description("Mexico is attacking American goal post");
    	 obj.description("What a save from American goal keeper");
	}

		
	}
}     
