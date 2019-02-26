package com.crea.bdwa1.backend.devclasses;

public class Segment {
	/*
	 * Attributs
	 */
	private int abscisse;
	private int ordonnee;
	private int longueur;

	/*
	 * Constructeur avec abisse et ordonnées
	 */
	public Segment(int abscisse, int ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
		longueur = ordonnee - abscisse;
	}

	/*
	 * Constructeur avec segment et deplacement
	 * 
	 * @param abscisse
	 * 
	 * @param ordonnee
	 */
	public Segment(Segment origine, int dep) {
		// Appel du constructeur ci-dessus
		this(origine.abscisse + dep, origine.ordonnee + dep);
	}
	/*
	 * Accesseurs
	 */

	public int getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}

	public int getOrdonnee() {
		return ordonnee;
	}

	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	/*
	 * Methode de class
	 */
	public void afficheSegment() {
		System.out.println("(X,Y): (" + this.abscisse + "," + this.ordonnee + ") Longueur: " + this.longueur);

		int a = 30;
		int b = 23;
		a = (int) (a + b);
		System.out.println(a);
	}
}