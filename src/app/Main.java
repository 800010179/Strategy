package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Kayttaja kayttaja = new Kayttaja();
		
		LajitteluAlgoritmi quick = new QuickLajittelu();
		LajitteluAlgoritmi selection = new SelectionLajittelu();
		LajitteluAlgoritmi insertion = new InsertionLajittelu();

	    Scanner skanneri = new Scanner(System.in);  
	  
	    
	   
	    boolean jatketaan = true;
	    while(jatketaan) {
	    	System.out.println("");
	    	System.out.println("Syötä luku 1-4:");
		    System.out.println("1: Nopealajittelu");
		    System.out.println("2: Valintalajittelu");
		    System.out.println("3: Lisäyslajittelu");
		    System.out.println("4: Lopeta");
		    int algoritmi = skanneri.nextInt(); 
		    switch(algoritmi) {
		    
	    	case 1:
	    		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	    		kayttaja.setLajittelu(quick);
	    		kayttaja.lajittele(input);
	    		break;
	    	case 2: 
	    		int[] input2 = {24,2,45,20,56,75,2,56,99,53,12};
	    		kayttaja.setLajittelu(selection);
	    		kayttaja.lajittele(input2);
	    		break;
	    	case 3:
	    		int[] input3 = {24,2,45,20,56,75,2,56,99,53,12};
	    		kayttaja.setLajittelu(insertion);
	    		kayttaja.lajittele(input3);
	    		break;
	    	case 4:
	    		jatketaan = false;
	    		break;
	    }
	    }
		
	 
	}

}
