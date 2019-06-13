/* 
 * Herbivore.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file is the parent class of Giraffe.java and Gazelle.java and includes
 * all the attributes and methods common to herbivore animals.  
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public abstract class Herbivore extends Animal{

	String hungry;

	//Constructor of Herbivore class
	public Herbivore(String species,String homeStatus,String hungry,String name){
		super(species,homeStatus,name,hungry);
		this.hungry=hungry;
	}

	//methods common to herbivore animals
	/**
  	* This method is used to print the animal food.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public void whatIEat(){
		System.out.println("I eat plants");
	}

	/**
  	* This method is used to find out whether the animal is hungry or not.
  	*
  	* @param       -    		No parameter is passed.
  	*                                    
  	* @return      true/false	This method returns true if animal is hungry
  	*							else it returns false.
  	*/
	public boolean ifHungry(){
		return(hungry.equals("hungry")?true:false);
	}

	/**
  	* This method is used to send the animal to eat if it is hungry.
  	*
  	* @param       -    		No parameter is passed.
  	*                                    
  	* @return      String		This method returns a string sending the animal
  	*							to hgraze if it is hungry.
  	*/
	public String goEat(){

		//After eating, set variable hungry to not hungry.
		hungry="Not hungry";
		return ("Sent to graze.");
	}
	
	//methods specific to different kinds of animals
	public abstract String whereIStay();
}