/*
 * Camel.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file has the methods specific to animal Camel. 
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class Camel extends Animal implements Herbivore{
	
	//Constructor of Camel class
	public Camel(String species,String homeStatus,String name,String hungry){
		super(species,homeStatus,name,hungry);
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

	/**
  	* This method is used to print the animal food.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public String whereIStay(){
		return("I stay in a desert.");
	}	
}