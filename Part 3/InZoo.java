/*
 * InZoo.java
 *
 * Version: 
 *       2 
 * 
 * Revisions: 
 *       3
 */

/**
 * This program is the parent class of Animal.java and Plants.java and
 * includes methods which are common to both
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public abstract class InZoo{
	final int serialId;
	static int val=1;
	String positionXY;

	//Constructor of class InZoo
	public  InZoo(String position ){
		positionXY=position;
		serialId=val++;
	}

	/**
  	* This method is used to get the position of plant or animal.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      String 	Returns the position.
  	*/
	public String getPosition(){
		return " "+this.positionXY;
	}

	/**
  	* This method is used to set the new position of plant or animal.
  	*
  	* @param       -    	No parameter is passed.
  	*                                    
  	* @return      String 	Returns the new position.
  	*/	
	public String setPosition(String newPos){
		return this.positionXY=newPos;
	}

}