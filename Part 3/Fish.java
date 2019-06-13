/* 
 * Fish.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file contains the attributes and methods for fish.  
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public  class Fish extends InZoo{
	String name;
	String schoolId="5";
	static int noOfFish=0;
	static String SerialIdSchoool="5-0";

	//Constructor for class Fish
	public Fish(String position){
		super(position);
		noOfFish++;
		SerialIdSchoool=schoolId+"-"+noOfFish;		
	}

	/**
  	* This method is used to get the serial id of the school of fish.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      String 	Returns the Serial Id.
  	*/
	public static String printId(){
		return SerialIdSchoool;
	}
}