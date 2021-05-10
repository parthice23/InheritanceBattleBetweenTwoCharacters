// CSE 205     : <Class 205> / <Tuesday and Thursday>
// Projects  : <Classes>
// Author      : <Parth Patel> & <1219217324>
// Description : <Inheritance>

package project3.characters;

public class Superheroes extends Abstract {
    public Superheroes(String superheroes) {
        super(superheroes);
        this.totalnumberhealth = 200;
        this.totalnumberstrength = 50;
    }
    
    //public void hit(int points) reduces the character’s health based on the strength of an attack
    //we use -= in order to reduce the health
    public void hit(int points) 
    {
        this.totalnumberhealth -= points;
    }
    
    //public int attack() returns the strength of an attack
    //we are returning strength of superhero atttack
    public int attack() 
    {
        return totalnumberstrength;
    }
    
    //public boolean isAlive() returns a Boolean based on whether or not the character’s health is greater than 0.
    //if greater than 0 the superhero is alive 
    public boolean isAlive() 
    {
        return totalnumberhealth>=0;
    }

    //Write a toString() method for your character classes that displays the name, class, strength, & health of the character
    //We are displaying superhero class
    public String toString() 
    {
        return "(Class is Superhero)"+"\n"+super.toString();
    }
}