// CSE 205     : <Class 205> / <Tuesday and Thursday>
// Projects  : <Classes>
// Author      : <Parth Patel> & <1219217324>
// Description : <Inheritance>

package project3;

//imports
import java.util.Random;
//import packages 
import project3.characters.Superheroes;
import project3.characters.Villian;

public class Driver {

    public static void main(String[] args){

        //The characters I choose to go against each other was villian and superhero
    	Superheroes batman = new Superheroes("Batman");
    	Villian joker = new Villian("Joker");
       
    	//Let user know what is going on by printing out the information before
        System.out.println("Superhero vs Villian");
        System.out.println();
        System.out.println(joker);
        System.out.println();
        System.out.println(batman);
        System.out.println();
        System.out.println("The Battle has BEGUN!");
        
        //The way to lose the battle is when your health is 0 and below, 
        //so we will use random function and see who health value reaches to 0 first
        int battle = 1;
        Random number = new Random();
        
        //use while loop to repeat the number of battles
        while (batman.isAlive() && joker.isAlive())
        {
        	//Joker trying to attack Batman
        	//Joker health depleting 
            int pointsfromthejoker;
            pointsfromthejoker = number.nextInt(7);
            int startingvalue;
            for(startingvalue = 0; startingvalue<pointsfromthejoker; startingvalue++)
            {
            	batman.hit(joker.attack());
            }
            //Batman trying to attack Joker
            //Joker health depleting
            int pointsfromthebatman;
            pointsfromthebatman = number.nextInt(7);
            int beginningvalue;
            for(beginningvalue=0; beginningvalue<pointsfromthebatman; beginningvalue++)
            {
            	joker.hit(batman.attack());
            }
            
            //printing out results after each battle and repeating it
            System.out.println();
            System.out.println("Score following BATTLE"+" "+battle);
            System.out.println();
            System.out.println(joker);
            System.out.println();
            System.out.println(batman);
            battle++;
        }
        
        //printing out results once battle has finished
        System.out.println();
        System.out.println("BATTLE AS ENDED!!!!!!!");
        
        //if else statement to print out wheter batman or joker lost
        if(!joker.isAlive()){
            System.out.println("JOKER IS DEAD!!!!!!!!");
        }
        else {
            System.out.println("BATMAN HAS LET HIS CITY DOWN!!!!!!!");
        }
    }
}