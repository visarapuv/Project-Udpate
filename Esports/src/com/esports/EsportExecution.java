package com.esports;

import java.util.Iterator;
import java.util.Scanner;

public class EsportExecution {
	
		public static void main(String[] args) {
		
		SportTypes st = new SportTypes();
		String sport = st.chooseSport();
		Esports es = EsportsFactory.chooseSport(sport);
		es.tournment();
		
		System.out.println();
		SportTypes st1 = new SportTypes();
		String sport1 = st1.chooseSport();
		Esports es1 = EsportsFactory.chooseSport(sport1);
		es1.tournment();
		
		System.out.println();
		SportTypes st2 = new SportTypes();
		String sport2 = st2.chooseSport();
		Esports es2 = EsportsFactory.chooseSport(sport2);
		es2.tournment();
	}
}
