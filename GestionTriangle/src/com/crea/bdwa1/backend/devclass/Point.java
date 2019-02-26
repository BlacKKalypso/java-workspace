package com.crea.bdwa1.backend.devclass;

public class Point {
	// Attributs
	private double x;
	private double y;
	
	/*
	 * Constructeurs
	 */
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(0,0);
	}
	
	/*
	 * Getters & Setters
	 */
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public String affichage() {
		return "Axe X:" + this.x + " Axe Y:" + this.y;
	}

}
