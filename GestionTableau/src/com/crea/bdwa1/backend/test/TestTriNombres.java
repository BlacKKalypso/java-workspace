package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.common.Saisie;
import com.crea.bdwa1.backend.devclass.TriNombres;

public class TestTriNombres {

	public static void main(String[] args) {

		int [ ] tabDeInt = null;
		tabDeInt=Saisie.lireTabInt();

		TriNombres trn = new TriNombres(tabDeInt);
		
		trn.affichage();
		trn.triDecroissant();
		trn.affichage();
		trn.triCroissant();
		trn.affichage();
	}
	
	public static void saisieTableau(int taille, int[ ] tab) {
		/**Remplissage du tableau*/
	    for (int i=0 ; i< taille; i++)
	    {
			int chiffre = Saisie.lireEntier("donner la valeur du chiffre "+ (i+1) +" :");
			tab[i]=chiffre;
	    }
	}

}
