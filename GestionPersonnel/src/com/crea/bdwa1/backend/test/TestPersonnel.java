package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.devclass.Personnel;

public class TestPersonnel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnel p1 = new Personnel();
		p1.setAnneeNaissance(1991);
		p1.setPrenom("Robin");
		p1.setNom("Ferrari");
		p1.setCivilite("célibataire");
		p1.setRue("5, Rue du vélodrome");
		p1.setSexe("h");
		p1.setVille("Genève");
		p1.afficheInfo();
		
		Personnel p2 = new Personnel(1982, "Hasina", "Tabet", "Célibataire", "2, Rue du Rhône", "Genève", "f" );
		p2.afficheInfo();
		p2.age();
		
	}

}
