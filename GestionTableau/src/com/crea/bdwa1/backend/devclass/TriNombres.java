package com.crea.bdwa1.backend.devclass;

public class TriNombres {
	// attributs
	private int tab[];
	
	public TriNombres(int tab[]) {
		this.tab=tab;
	}
	
	/*
	 * Méthodes
	 */
	
	public void triDecroissant() {
		int i;
		int j;
		int AIDE;
		int N = this.tab.length;
		for (i=0; i<N-1; i++)
		{
		    for (j=i+1; j<N; j++)
		    {
		        if (this.tab[j]>this.tab[i])
		        {
		            AIDE=this.tab[i];
		            this.tab[i]=this.tab[j];
		            this.tab[j]=AIDE;
		        }
		    }
		}
	}
	public void triCroissant() {
		int i;
		int j;
		int AIDE;
		int N = this.tab.length;
		for (i=0; i<N-1; i++)
		{
		    for (j=i+1; j<N; j++)
		    {
		        if (this.tab[j]<this.tab[i])
		        {
		            AIDE=this.tab[i];
		            this.tab[i]=this.tab[j];
		            this.tab[j]=AIDE;
		        }
		    }
		}
	}
	
	public void affichage() {
	    int i;
	    int N = this.tab.length;
	    String display="T[";
	    for(i=0; i<N; i++)
	    {
	    		display= display + " " + this.tab[i];
	    }
	    display = display + "]";
	    
	    System.out.println(display);
	}

}
 