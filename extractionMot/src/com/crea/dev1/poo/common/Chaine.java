package com.crea.dev1.poo.common;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Chaine {
	private String phrase;
	private ArrayList <String> mots;
	

	/*Constructeurs*/
	public Chaine(String phrase) {
		super();
		this.phrase = phrase;
	}
	
	/*Getter & setter*/
	
	public String getPhrase() {
		return phrase;
	}



	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}



	public void extraireMots(String separateurs){
		StringTokenizer st = new StringTokenizer(this.phrase, separateurs);
		while(st.hasMoreTokens()){
			mots.add(st.nextToken());
		}
	}
	
	public void afficherMots(){
		for(int i = 0; i < mots.size(); i++){
			System.out.println("Mots ("+i+")" +mots.get(i));
		}
	}
}
