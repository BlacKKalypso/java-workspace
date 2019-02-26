package com.crea.bdwa1.backend;

public class TestEmploye {

	public static void main(String[] args) { // Méthode principale
		Employe e1 = new Employe("Tobago", 1965);
		Employe e2 = new Employe("Bonanza", 1969);
		Employe e3 = new Employe("Tonye", 1994);
		Employe e4 = new Employe("Mendes", 1997);
		e1.afficher();
		e1.calculAge();
		e2.afficher();
		e2.calculAge();
		e3.calculAge();
		e4.calculAge(2010);

	}
}
