package com.esports.factory;

import java.util.Iterator;
import java.util.Scanner;

import com.esports.observer.CommentaryObservable;
import com.esports.observer.UsersObserver;
import com.esports.template.EsportTemplate;
import com.esports.template.Racing;

public class RacingTournment  implements Esports {
	
public void tournment() {
	EsportTemplate et = new Racing();
   String tournmentName =  et.esportStructure();
		
  
   CommentaryObservable obj = new CommentaryObservable("Final Racing starts between 22 racers...");
   UsersObserver observer = new UsersObserver(obj, "Sony Liv");
   UsersObserver observer2 = new UsersObserver(obj,"Star Sports");
   observer.subscribe();
   observer2.subscribe();
   System.out.println("------------------------------------------------------");
   obj.description("Welcome to live Racing match");
   
   observer.unSubscribe();
   
   obj.description("Race won by Michael Shumaker...");
   

	}
}     
