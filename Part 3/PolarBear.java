/*
 * PolarBear.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file has the methods specific to animal Polar Bear. 
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class PolarBear extends Animal implements Carnivore{
	
	//Constructor of PolarBear class
	public PolarBear(String species,String homeStatus,String name,String hungry,String position){
		super(species,homeStatus,name,hungry,position);
	}
	
	/**
  	* This method is used to print the animal food.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/	
	public void Eat(){
		System.out.println("I eat "+IEat());
	}

	/**
  	* This method is used to send the animal to eat if it is hungry.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public void sentToEat(){
		if(hungry.equals("hungry") ){
			hungry="Not hungry";
			System.out.println("Sent to "+this.goHunt());
		}
		else{
			System.out.println("Not Hungry.");
		}
	}
	
	/**
  	* This method is used to print the animal shelter.
  	*
  	* @param       -    		No parameter is passed.
  	*                                    
  	* @return      String		This method returns the animal's shelter name.
  	*/	
	public String whereIStay(){
		return("I stay in a Snow Cave .");
	}	
}