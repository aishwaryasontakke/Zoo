/*
 * Giraffe.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file has the methods specific to animal Giraffe. 
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class Giraffe extends Animal implements Herbivore{
	
	//Constructor of Giraffe class
	public Giraffe(String species,String homeStatus,String name,String hungry){
		super(species,homeStatus,name,hungry);
	}
	
	/**
  	* This method is used to print the animal shelter.
  	*
  	* @param       -    		No parameter is passed.
  	*                                    
  	* @return      String		This method returns the animal's shelter name.
  	*/
	public String whereIStay(){
		return("I stay in a grass land.");
	}

	/**
  	* This method is used to print the animal food.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public void Eat(){
		System.out.println("I eat "+whatIEat());
	}

	/**
  	* This method is used to send the animal to eat if it is hungry.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public void sentToEat(){
		hungry="Not hungry";
		System.out.println("Sent to "+this.goEat());
	}
}