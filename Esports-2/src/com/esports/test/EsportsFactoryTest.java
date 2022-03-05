package com.esports.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.esports.factory.CricketTournment;
import com.esports.factory.Esports;
import com.esports.factory.EsportsFactory;
import com.esports.factory.FootballTournment;
import com.esports.factory.RacingTournment;

public class EsportsFactoryTest {

	
	@Test
	public void chooseSportRacingTest() {
		EsportsFactory cof = new EsportsFactory();
		Esports co = EsportsFactory.chooseSport("racing");
		assertNotNull(co);
		assertTrue(co instanceof RacingTournment);
	}

	@Test
	public void chooseSportCricketTest() {
		EsportsFactory cof = new EsportsFactory();
		Esports co = EsportsFactory.chooseSport("cricket");
		assertNotNull(co);
		assertTrue(co instanceof CricketTournment);
	}

	@Test
	public void chooseSportFootballTest() {
		EsportsFactory cof = new EsportsFactory();
		Esports co = EsportsFactory.chooseSport("football");
		assertNotNull(co);
		assertTrue(co instanceof FootballTournment);
	}
}
