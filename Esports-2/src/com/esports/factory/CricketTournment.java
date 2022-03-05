package com.esports.factory;

import com.esports.observer.CommentaryObservable;
import com.esports.observer.UsersObserver;
import com.esports.template.Cricket;
import com.esports.template.EsportTemplate;

public class CricketTournment implements Esports {

	public void tournment() {
		EsportTemplate et = new Cricket();
		String tournmentName = et.esportStructure();

		String finalists = "";
		if ("World Cup".equals(tournmentName)) {
			finalists = "India vs Australia";
		} else if ("Asia Cup".equals(tournmentName)) {
			finalists = "India vs Srilanka";
		} else if ("Indian Premier League".equals(tournmentName)) {
			finalists = "Mumbai Indians Vs Sunrisers Hyderabad";
		}

		CommentaryObservable obj = new CommentaryObservable("Final Match between " + finalists);
		UsersObserver observer = new UsersObserver(obj, "CricInfo");
		UsersObserver observer2 = new UsersObserver(obj, "CricBuzz");
		observer.subscribe();
		observer2.subscribe();
		System.out.println("------------------------------------------------------");
		obj.description("Welcome to live Cricket match");
		obj.description("Current score 0-0");

		observer.unSubscribe();

		if ("World Cup".equals(tournmentName)) {
			obj.description("India won the toss and elected to batting");
			obj.description("It's a Four!!");
			obj.description("Current score 4-0");
		} else if ("Asia Cup".equals(tournmentName)) {
			obj.description("Srilanka won the toss and elected to bowling");
			obj.description("It's a single!!");
			obj.description("Current score 1-0!!! India opened account with a single");
		} else if ("Indian Premier League".equals(tournmentName)) {
			obj.description("Mumbai India won the toss and elected to bowling");
			obj.description("It's a Six!!");
			obj.description("Current score 6-0!!! Sunrisers opened account with a six");
		}

	}
}
