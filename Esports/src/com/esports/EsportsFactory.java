package com.esports;

public class EsportsFactory {

	public static Esports chooseSport(String sport) {

		if ("racing".equalsIgnoreCase(sport)) {
			return new RacingTournment();
		} else if ("cricket".equalsIgnoreCase(sport)) {
			return new CricketTournment();
		} else if ("football".equalsIgnoreCase(sport)) {
			return new FootballTournment();
		}
		return null;
	}
}
