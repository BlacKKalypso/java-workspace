package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.common.Saisie;
import com.crea.bdwa1.backend.devclass.Etudiant;
import com.crea.bdwa1.backend.devclass.Notation;


public class TestEtudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom = Saisie.lireChaine("saisir le nom:");
		Etudiant e1 = new Etudiant(nom);
		int numberNote = Saisie.lireEntier("Combien de note voulez vous ajouter ? :");
		Notation[] tabNotes= new Notation[numberNote];
		
		for(int i=0; i < numberNote; i++) {
			float note = (float) Saisie.lireReel("Quel est la note ? :");
			float coef = (float) Saisie.lireReel("Quel est le coef de cette note (" + note + ") ? :");
			Notation n  = new Notation(note,coef);
			tabNotes[i] = n;
		}
		e1.setNotes(tabNotes);
		
		e1.affichage();
		
	}

}
