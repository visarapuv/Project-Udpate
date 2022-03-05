package com.esports.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import com.esports.template.Cricket;

public class CricketTest {

	
	@Test
	public void getTournmentTest() {
		Cricket cricket = new Cricket();
		 ArrayList<String> tList = cricket.getTournmentList();
		assertNotNull(tList);
		assertNotNull(cricket);
		assertEquals(3, tList.size());
	}

	
	@Test
	public void getPrizeTest() {
		Cricket cricket = new Cricket();
		String tournmentName = "World Cup";  
		cricket.prize();
		assertNotNull(tournmentName);
		assertNotNull(cricket);
	}
	
	@Test
	public void getTeamsTest() {
		Cricket cricket = new Cricket();
		String tournmentName = "World Cup";  
		cricket.teams();
		assertNotNull(tournmentName);
		assertNotNull(cricket);
	}
	
	@Test
	public void scheduleTest() {
		Cricket cricket = new Cricket();
		String tournmentName = "World Cup";  
		cricket.schedule();
		assertNotNull(tournmentName);
		assertNotNull(cricket);
	}
	
	@Test
	public void tournmentsTest() {
		Cricket cricket = new Cricket();
		String tournmentName = "World Cup";  
		String s = cricket.tournments();
		assertNotNull(s);
		assertNotNull(cricket);
	}

}
