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
 * This file is the parent class of Tiger.java and Lion.java and includes
 * all the attributes and methods common to carnivore animals.  
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public abstract class Carnivore extends Animal{

	String hungry;
	//Constructor of Carnivore class
	public Carnivore(String species,String homeStatus,String hungry,String name){
		super(species,homeStatus,name,hungry);
		this.hungry=hungry;
	} 

	//methods common to carnivore animals
	/**
  	* This method is used to print the animal food.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void 	This method does not return any type.
  	*/
	public void whatIEat(){
		System.out.println("I eat meat");
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
  	*							to hunt if it is hungry.
  	*/
	public String goEat(){	

		//After eating, set variable hungry to not hungry.
		hungry="not Hungry";
		return("Sent to hunt.");
	}

	//methods specific to different kinds of animals
	public abstract String whereIStay();
}