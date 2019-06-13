/*
 * Aardvark.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file has the methods specific to animal Aardvark. 
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class Aardvark extends Animal implements Herbivore, Carnivore{
	
	//Constructor of Aardvark  class
	public Aardvark (String species,String homeStatus,String name,String hungry,String position){
		super(species,homeStatus,name,hungry,position);
	}

	/**
  	* This method is used to print the animal food.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public  void Eat(){
		System.out.println("I eat "+this.IEat()+" and "+this.whatIEat());
	}

	/**
  	* This method is used to send the animal to eat if it is hungry.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public  void sentToEat(){
		if(hungry.equals("hungry") ){
			hungry="Not hungry";
			System.out.println("Sent to "+this.goEat()+" or "+this.goHunt());}
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
		return("I stay in Woodlands.");
	}
}