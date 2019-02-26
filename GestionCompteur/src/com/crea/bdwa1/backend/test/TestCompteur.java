package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.devclass.Compteur;

public class TestCompteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compteur i = new Compteur();
		i.incrementer();
		i.affichage();
		i.incrementer();
		i.affichage();
		i.decrementer();
		i.affichage();
	}

}
