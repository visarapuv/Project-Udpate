package com.esports.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import com.esports.template.Football;

public class FootballTest {

	
	@Test
	public void getTournmentTest() {
		Football Football = new Football();
		 ArrayList<String> tList = Football.getTournmentList();
		assertNotNull(tList);
		assertNotNull(Football);
		assertEquals(3, tList.size());
	}

	
	@Test
	public void getPrizeTest() {
		Football Football = new Football();
		String tournmentName = "World Cup";  
		Football.prize();
		assertNotNull(tournmentName);
		assertNotNull(Football);
	}
	
	@Test
	public void getTeamsTest() {
		Football Football = new Football();
		String tournmentName = "World Cup";  
		Football.teams();
		assertNotNull(tournmentName);
		assertNotNull(Football);
	}
	
	@Test
	public void scheduleTest() {
		Football Football = new Football();
		String tournmentName = "World Cup";  
		Football.schedule();
		assertNotNull(tournmentName);
		assertNotNull(Football);
	}
	
	@Test
	public void tournmentsTest() {
		Football Football = new Football();
		String tournmentName = "World Cup";  
		String s = Football.tournments();
		assertNotNull(s);
		assertNotNull(Football);
	}

}
