package com.esports.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.esports.SportTypes;

public class SportTypesTest {

	
	@Test
	public void sportTypesTest() {
		SportTypes st = new SportTypes();
		String s = st.chooseSport();
		assertNotNull(st);
		assertNotNull(s);
	}

	}
