/*
 * Lion.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file has the methods specific to animal Lion. 
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class Lion extends Carnivore{
	
	//Constructor of Lion class
	public Lion(String species,String homeStatus,String name, String hungry){
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
		return("I stay in a cave.");
	}
}