package com.esports.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.esports.factory.RacingTournment;

public class RacingTournmentTest {

	
	@Test
	public void racingTournmentTest() {
		RacingTournment ct = new RacingTournment();
		ct.tournment();
		assertNotNull(ct);
	}

	}
