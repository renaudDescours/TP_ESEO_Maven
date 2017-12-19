package com;

public class App {
	public static void main (String[] args){
		VilleFranceDAOImpl villeFrance = new VilleFranceDAOImpl(); 
		villeFrance.findVille();
		// affichge dans la console
        //System.out.println( "Hello World!" );
    }
}
