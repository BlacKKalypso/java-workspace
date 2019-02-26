package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.devclass.Phrase;

public class TestPhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phrase maPhrase = new Phrase("Bonjour, tout le monde*il fait beau");
		
		maPhrase.afficherElementsTokenizer();
		maPhrase.afficherElementsSplit();
		
		maPhrase.mirroirLettres();
		maPhrase.mirroirMots();
	}

}
