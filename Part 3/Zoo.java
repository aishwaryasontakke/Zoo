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

import java.util.Scanner;

class Zoo{
    static Animal[] animals = { new PolarBear("PolarBear","home","Bobo",
      "hungry","Cage"),
    new Aardvark("Aardvark","Not home","Coco","not hungry","Jungle"),
    new Alpaca("Alpaca","Not home","Macy","hungry","Jungle")};

  /**
  * This method is used to print the name of the species the animal belongs to.
  *
  * @param       thisOne    Animal whose species name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */  
    public static void printSpecies(Animal thisOne) {
        System.out.println("I am a " + thisOne.getSpecies());
    }

  /**
  * This method is used to print the name of the animal.
  *
  * @param       thisOne    Animal whose name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
    public static void printName(Animal thisOne) {
        System.out.println("My name is " + thisOne.getName());
    } 

  /**
  * This method is used to print the animal's home name.
  *
  * @param       thisOne    Animal whose species home name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
    public static void printHomeName(Animal thisOne) {
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
    public static void printHomeStatus(Animal thisOne)   {
        System.out.println("I am" + ( thisOne.amIHome() ? " " : " not " )
          +"home.");        
    }

  /**
  * This method is used to print the animal's hunger status i.e whether it is 
  * hungry or not.
  *
  * @param       thisOne    Animal whose species name is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
    public static void printHungerStatus(Animal thisOne)   {
        System.out.println("I am" + ( thisOne.ifHungry() ? " " : " not " )
          +"hungry.");
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
  * This method is used to print the animal's position.
  *
  * @param       thisOne    Animal whose position is to be printed.
  *                                    
  * @return      void       This method does not return any type.
  */
    public static void printPosition(Animal thisOne){
        System.out.println("I am at "+thisOne.getPosition());
    }

  /**
  * The main program.
  *
  * @param    args    command line arguments (ignored)
  */
    public static void main(String args[] )      {
        Class[] classes;
        Scanner sc=new Scanner(System.in);

        //Position and name of the plant
        Plants palm=new Plants("Garden","Palm Tree");  
        int choice;
        boolean yes=true;
        String newPos;
        int noOfFishes;
        Fish f1;
        int ans;
        
        while(yes){      
          System.out.println();
          System.out.println("Enter your number choice :");
          System.out.println("1. Send animal to eat \n2. Send animal home \n3."
          +" Display position of an animals,plant and fish. \n4. Send animal"
          +" or plant to new position\n5. Add fishes to school \n"+"6. "
          +"Summary of ZOO \n7.Exit");
          choice=sc.nextInt();
          switch(choice) {
              case(1) : //Sending animal to eat
                      System.out.println("Which animal? \n1.Polar Bear "
                        +"\n2.Alpaca \n3.Aardvark");
                      ans= sc.nextInt();
                      if(ans==1){
                        animals[0].sentToEat();
                      }
                      else if(ans==2){
                        animals[2].sentToEat();
                      }
                      else if(ans==3){
                        animals[1].sentToEat();
                      }
                      else{
                        System.out.println("Incorrect choice. ");
                      }
                      break;

              case(2) : //Sending animal to home
                      System.out.println("Which animal? \n1.Polar Bear "
                        +"\n2.Alpaca \n3. Aardvark");
                      ans= sc.nextInt();
                      if(ans==1){
                        animals[0].goHome();
                      }
                      else if(ans==2){
                        animals[2].goHome();
                      }
                      else if(ans==3){
                        animals[1].goHome();
                      }
                      else
                        System.out.println("Incorrect choice. ");
                      break;

              case(3) : //Displaying positions
                      for ( int index = 0; index < animals.length; index ++ ) {
                        System.out.println(animals[index].getSpecies()+" "
                          +animals[index].name+" is at "
                          +animals[index].getPosition());
                      }
                      System.out.println(palm.name+" is at "+palm.getPosition());
                      break;

              case(4) : //Sending animal or plant to a new position
                      System.out.println("What do you want to send? \n1.Polar"
                      +" Bear \n2.Alpaca \n3. Aardvark\n4.Palm tree");
                      ans= sc.nextInt();
                      if(ans==1){
                        System.out.println(" Enter the new position");
                        newPos=sc.nextLine();
                        sc.nextLine();
                        animals[0].setPosition(newPos);
                      }
                      else if(ans==2){
                        System.out.println(" Enter the new position");
                        newPos=sc.nextLine();
                        animals[2].setPosition(newPos);                     
                      }
                      else if(ans==3){
                        System.out.println(" Enter the new position");
                        newPos=sc.nextLine();
                        animals[1].setPosition(newPos);
                      }
                      else if(ans==4)
                      {
                        System.out.println(" Enter the new position");
                        newPos=sc.nextLine();
                        palm.setPosition(newPos);
                      }
                      break;

              case(5) ://Adding fishes to school
                      System.out.println(" Enter how many fishes to add to"
                      +" the school.");
                      noOfFishes=sc.nextInt();
                      for(int i=0;i<noOfFishes;i++){
                        f1= new Fish("100,0");
                      }
                      System.out.println("School serial id is "+Fish.printId());
                      break;

              case(6) : //Printing summary of zoo
                      for ( int index = 0; index < animals.length; index ++ ) {
                        printSpecies(animals[index]) ;
                        System.out.println("Serial Id :"+animals[index].serialId);
                        printName(animals[index]) ;
                        printWhatIEat(animals[index]);
                        printHomeName(animals[index]) ;
                        printPosition(animals[index]);
                        System.out.println();
                      }

                      System.out.println("I am a  "+palm.name);
                      System.out.println("Serial Id: "+palm.serialId);
                      System.out.println("I am at "+palm.getPosition());
                      System.out.println();
                      System.out.println("School of fish ");
                      System.out.println("Serial Id :"+Fish.printId());
                      break;
              case(7) : 
                      System.out.println("Exit.");
                      yes=false;
                      System.exit(0);
          }
        }
    }
}