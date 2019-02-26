package com.crea.bdwa1.backend.devclass;

public class Notation {
	// Attributs
	private float note;
	private float coef;
	
	
	/*
	 * Définition du constructeur
	 */
	
	/**
	 * Constructeur avec deux argument: note et coef
	 * @param note
	 * @param coef
	 */
	public Notation(float note, float coef) {
		this.note = note;
		this.coef = coef;
	}
	/**
	 * Constructeur avec un argument note
	 * @param note
	 */
	public Notation(float note) {
		this.note = note;
		this.coef = 1;
	}
	/*
	 * Constructeur par default
	 */
	public Notation() {
		this(0.0f,0.0f);
	}
	/*
	 * Getters and setters
	 */
	
	
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public float getCoef() {
		return coef;
	}
	public void setCoef(float coef) {
		this.coef = coef;
	}
	
	public void afficheInfo() {
		System.out.println("Note: "+ this.note + " Coef:" + this.coef);
	}
	
	
}
