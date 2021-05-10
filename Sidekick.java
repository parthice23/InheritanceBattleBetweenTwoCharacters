// CSE 205     : <Class 205> / <Tuesday and Thursday>
// Projects  : <Classes>
// Author      : <Parth Patel> & <1219217324>
// Description : <Inheritance>

package project3.characters;

public class Sidekick extends Abstract{
    public Sidekick(String sidekick) {
        super(sidekick);
      //Gave it lower number of health and strength because its a sidekick.
        this.totalnumberhealth = 80;
        this.totalnumberstrength = 5; 
    }

    //public void hit(int points) reduces the character’s health based on the strength of an attack
    //we use -= in order to reduce the health
    public void hit(int points) 
    {
        this.totalnumberhealth -= points;
    }
    
    //public int attack() returns the strength of an attack
    //we are returning strength of sidekick atttack
    public int attack() 
    {
        return totalnumberstrength;
    }
    
    //public boolean isAlive() returns a Boolean based on whether or not the character’s health is greater than 0.
    //if greater than 0 the sidekick is alive
    public boolean isAlive() 
    {
        return totalnumberhealth >= 0;
    }
   
    //Write a toString() method for your character classes that displays the name, class, strength, & health of the character
    //We are displaying sidekick class
    public String toString() 
    {
        return "(Class is Sidekick)"+"\n"+ super.toString();
    }
}
