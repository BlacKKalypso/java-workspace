package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.devclasses.Segment;

public class TestSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Segment s = new Segment(5,5);
		s.setLongueur(20);
		s.afficheSegment();
		
		Segment sbis= new Segment(s, 10);
		sbis.setLongueur(6);
		sbis.afficheSegment();
	}

}
