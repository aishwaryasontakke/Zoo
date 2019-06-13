/* 
 * Plants.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file contains the attributes and methods common to all the plants.  
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public  class Plants extends InZoo{
	String name;

	//Constructor for Plants class
	public Plants(String position,String name){
		super(position);
		this.name=name;
	}
}