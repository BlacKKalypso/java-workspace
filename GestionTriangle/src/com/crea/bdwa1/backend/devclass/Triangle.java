package com.crea.bdwa1.backend.devclass;

public class Triangle {
	
	/*
	 * Définition des attributs
	 */
	private Point a;
	private Point b;
	private Point c;
	
	/*
	 * Constructeurs
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triangle() {
		this(null, null, null);
	}
	
	/*
	 * Getters & Setters
	 */
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
	

	
	/**
	 * Affiche les coodronnées de tous les points ansi que les distance entre ceux-ci
	 * @return void 
	 */
	public void affichage() {
		System.out.println("Coordoonnées Point A | " + this.a.affichage() );
		System.out.println("Coordoonnées Point B | " + this.b.affichage());
		System.out.println("Coordoonnées Point C | " + this.c.affichage());
		System.out.println("Distance A-B: " + DistancePoint(this.a, this.b));
		System.out.println("Distance A-C: " + DistancePoint(this.a, this.c));
		System.out.println("Distance C-B: " + DistancePoint(this.c, this.b));

	}
	
	/**
	 * Permet de calculer la distance entre deux point
	 * @param a de type Point
	 * @param b de type Point
	 * @return double La distance entre le point a et le point b
	 */
	private double DistancePoint(Point a, Point b) {
		double ab = Math.sqrt( 
				Math.pow( (b.getX() - a.getX()) , 2) +
				Math.pow( (b.getY() - a.getY()) , 2)
		);
		return ab;
	}
	
	/**
	 * Permet de calculer de quel type de triangle il s'agit
	 * @return int 0: quelconque 1: Isocele 2: Isocele equilatérale
	 */
	private int triangleType() {
		double ab = DistancePoint(this.a, this.b);
		double ac = DistancePoint(this.a, this.c);
		double bc = DistancePoint(this.b, this.c);
		int triangleType=0;
		if(ab==ac && ab == bc && ac == bc) {
			triangleType=2;
		}else if(ab==ac || ab == bc || ac == bc) {
			triangleType=1;
		}
		return triangleType;
	}
	
	/*
	 * Permet d'afficher de quel type de triangle il s'agit
	 * @return void
	 */
	public void afficheType() {
		int type=triangleType();
		if(type==2) {
			System.out.println("C'est un triangle isocèle equilatérale");
		}else if(type==1){
			System.out.println("C'est un triangle isocèle");
		}else {
			System.out.println("C'est un triangle quelconque");	
		}
	}

}
