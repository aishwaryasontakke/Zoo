/*
 * Zoo.java
 *
 * Version: 
 *       2 
 * 
 * Revisions: 
 *       3
 */

/**
 * This program gives the description of the animal based on the parameters
 * passed to the corresponding animal object. 
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

class Zoo
{
   //Array of animal type to store animals
   static Animal[] animals = { new Tiger("Tiger","home","Katya","hungry"),
   new Giraffe("Giraffe","home","Coco","not hungry"), 
   new Aardvark("Aardvak","home","Pumba","hungry"), 
   new PolarBear("Polar Bear","home","Bobo","hungry"),
   new Ferret("Ferret","home","Peter","not hungry"),
   new Alpaca("Alpaca","home","Macy"," hungry"),
   new Camel("Camel","home","Chika","hungry"),
   new Skunk("Skunk","home","Timon"," hungry"),
   new Lion("Lion","Not home","Simba","not hungry"),
   new Gazelle("Gazelle","Not home","Piku"," hungry")};

  /**
  * This method is used to print the name of the species the animal belongs to.
  *
  * @param       thisOne    Animal whose species name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
   public static void printSpecies(Animal thisOne){
        System.out.println("I am a " + thisOne.getSpecies());
   }

  /**
  * This method is used to print the name of the animal.
  *
  * @param       thisOne    Animal whose name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
   public static void printName(Animal thisOne){
        System.out.println("My name " + thisOne.getName());
   }

  /**
  * This method is used to print the animal's home name.
  *
  * @param       thisOne    Animal whose species home name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
   public static void printHomeName(Animal thisOne){
        System.out.println(thisOne.whereIStay());
   }

  /**
  * This method is used to print the animal's home status i.e whether the
  * animal is home or not.
  *
  * @param       thisOne    Animal whose home status is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
   public static void printHomeStatus(Animal thisOne){
        System.out.println("I am" + ( thisOne.amIHome() ? " " : " not " ) + "home."  );    
   }

  /**
  * This method is used to print the animal's hunger status i.e whether it is 
  * hungry or not.
  *
  * @param       thisOne    Animal whose species name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
   public static void printHungerStatus(Animal thisOne){
        System.out.println("I am" + ( thisOne.ifHungry() ? " " : " not " ) + "hungry."  );
        if ( thisOne.ifHungry()){ 
          thisOne.sentToEat();
        }
   }

  /**
  * This method is used to print what the animal eats.
  *
  * @param       thisOne    Animal whose food is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
   public static void printWhatIEat(Animal thisOne){
        thisOne.Eat();
   }
  
  /**
  * The main program.
  *
  * @param    args    command line arguments (ignored)
  */
   public static void main(String args[] ){
        Class[] classes;
        for ( int index = 0; index < animals.length; index ++ ){
                printSpecies(animals[index]) ;
                printName(animals[index]) ;
                printWhatIEat(animals[index]);
                printHomeName(animals[index]) ;
                printHomeStatus(animals[index]) ;
                animals[index].goHome();
                printHungerStatus(animals[index]);
                System.out.println();
        }
   }
}