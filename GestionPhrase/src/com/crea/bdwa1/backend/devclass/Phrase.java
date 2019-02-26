package com.crea.bdwa1.backend.devclass;
import java.util.StringTokenizer;

public class Phrase {
	// Attributes
	String laphrase;
	String [ ] phraseTab;
	// Constructeurs
	public Phrase(String laphrase) {
		this.laphrase = laphrase;
	}
	public Phrase() {
		this("");
	}
	
	public void afficherElementsSplit() {
		String phrase = this.laphrase;
		phrase=phrase.replaceAll("[*]", " ");
		phrase=phrase.replaceAll("[,]", "");
		String[] words = phrase.split(" ");
		int nbmots = words.length;
		for(int i=0;i<nbmots;i++){
			System.out.println("Elément: " + words[i]);

		}

	}
	public void afficherElementsTokenizer() {
		String phrase = this.laphrase;
		StringTokenizer stoken = new StringTokenizer(phrase, " ,*.;:");
		while(stoken.hasMoreTokens()){
			System.out.println("Elément: " + stoken.nextToken());
		}

	}
	public void mirroirLettres() {
		
		String phrase = this.laphrase;
		phrase =phrase.replaceAll("[*]", " ");
		phrase = phrase.replaceAll("[,]", "");
		
		char[] x = phrase.toCharArray();
		int nbmots = x.length;
		String mirror = "";
		for(int i=nbmots-1;i>=0;i--){
			mirror = mirror + x[i];
		}
		System.out.println(mirror);
	}
	public void mirroirMots() {
		String phrase = this.laphrase;
		StringTokenizer stoken = new StringTokenizer(phrase, " ,*.;:");
		int nbmots =stoken.countTokens();
		String[] tabMot = new String[nbmots];
		String mirror = "";
		for(int i=0;i<nbmots;i++){
			tabMot[i]=stoken.nextToken();
		}
		for(int i=nbmots-1;i>=0;i--){
			mirror = mirror + tabMot[i] + " ";
		}
		System.out.println(mirror);

	}


}
