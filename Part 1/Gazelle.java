/*
 * Gazelle.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file has the methods specific to animal Gazelle. 
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class Gazelle extends Herbivore{

	//Constructor of Gazelle class
	public Gazelle(String species,String homeStatus,String name,String hungry){
		super(species,homeStatus,hungry,name);
	}

	/**
  	* This method is used to print the animal shelter.
  	*
  	* @param       -    		No parameter is passed.
  	*                                    
  	* @return      String		This method returns the animal's shelter name.
  	*/
	public String whereIStay(){
		return("I stay in a savanna.");
	}
	
}