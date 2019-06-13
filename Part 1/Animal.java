/* 
 * Animal.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file is the parent class for Herbivore.java and Carnivore.java and includes
 * all the attributes and methods common to all the animals.  
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public abstract class Animal{
	
	String species;
	String homeStatus;
	String name;
	String hungry;

	//Constructor for Animal Class
	public Animal(String species,String homeStatus,String name,String hungry){
		 this.species=species;
		 this.homeStatus=homeStatus;
		 this.name=name;
		 this.hungry=hungry;
	}

	//methods common to all the animals
	/**
  	* This method is used to get the home status of the animal i.e whether
  	* the animal is home or not.
  	*
  	* @param       -    		No parameter is passed.
  	*                                    
  	* @return      true/false	This method returns true or false depending
  	*							on animal's home status.
  	*/
	public boolean amIHome(){
		return(homeStatus.equals("home")?true:false);
	}

	/**
  	* This method is used to get the species of the animal 
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      species	Species name.
  	*/
	public String getSpecies(){
		return species;
	}

	/**
  	* This method is used to send the animal home if it is not. 
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      void		This method does not return any type.
  	*/
	public void goHome()
	{	if(!amIHome()){
		System.out.println("Sent home");
		homeStatus="home";
		}
	}

	/**
  	* This method is used to get the animal's name.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      name		Animal name.
  	*/
	public String getName()
	{
		return name;
	}
	
	//methods specific to different kinds of animals
	public abstract void whatIEat();
	public abstract boolean ifHungry();
	public abstract String goEat();
	public abstract String whereIStay();

}