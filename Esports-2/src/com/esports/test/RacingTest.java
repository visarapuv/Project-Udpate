package com.esports.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import com.esports.template.Racing;

public class RacingTest {

	
	@Test
	public void getTournmentTest() {
		Racing Racing = new Racing();
		 ArrayList<String> tList = Racing.getTournmentList();
		assertNotNull(tList);
		assertNotNull(Racing);
		assertEquals(3, tList.size());
	}

	
	@Test
	public void getPrizeTest() {
		Racing Racing = new Racing();
		String tournmentName = "World Cup";  
		Racing.prize();
		assertNotNull(tournmentName);
		assertNotNull(Racing);
	}
	
	@Test
	public void getTeamsTest() {
		Racing Racing = new Racing();
		String tournmentName = "World Cup";  
		Racing.teams();
		assertNotNull(tournmentName);
		assertNotNull(Racing);
	}
	
	@Test
	public void scheduleTest() {
		Racing Racing = new Racing();
		String tournmentName = "World Cup";  
		Racing.schedule();
		assertNotNull(tournmentName);
		assertNotNull(Racing);
	}
	
	@Test
	public void tournmentsTest() {
		Racing Racing = new Racing();
		String tournmentName = "World Cup";  
		String s = Racing.tournments();
		assertNotNull(s);
		assertNotNull(Racing);
	}

}
