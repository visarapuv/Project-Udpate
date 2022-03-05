package com.esports.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.esports.factory.CricketTournment;
import com.esports.factory.Esports;
import com.esports.factory.EsportsFactory;
import com.esports.factory.FootballTournment;
import com.esports.factory.RacingTournment;

public class CricketTournmentTest {

	
	@Test
	public void CricketTournmentTest() {
		CricketTournment ct = new CricketTournment();
		ct.tournment();
		assertNotNull(ct);
	}

	}
