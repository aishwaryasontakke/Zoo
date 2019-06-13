/* 
 * Carnivore.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file describes the interface for all the Carnivore animals.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public interface Carnivore{

	/**
  	* This method is used to get the animal food.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      String 	Returns the food that the specific animal eats .
  	*/
	public default String IEat(){
		return(" meat");
	}

	/**
  	* This method is used to send the animal to eat if it is hungry.
  	*
  	* @param       -    		No parameter is passed.
  	*                                    
  	* @return      String		This method returns a string sending the animal
  	*							to hunt.
  	*/
	public default String goHunt(){		
		return("hunt");
	}

	//method specific to different animals
	public abstract  String whereIStay();	
}