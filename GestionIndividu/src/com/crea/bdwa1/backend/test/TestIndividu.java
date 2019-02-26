package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.devclass.Individu;

public class TestIndividu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individu mari = new Individu("Robin", "Ferrari", 2);
		Individu femme = new Individu("Melissa", "Sartori", 1);
		Individu autre = new Individu("David", "akris", 2);
		mari.afficheInfo();
		femme.afficheInfo();
		
		femme.marier(mari, 2);
		
		mari.afficheInfo();
		femme.afficheInfo();
		
		femme.marier(autre, 2);
	}

}
