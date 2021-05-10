// CSE 205     : <Class 205> / <Tuesday and Thursday>
// Projects  : <Classes>
// Author      : <Parth Patel> & <1219217324>
// Description : <Inheritance>

package project3.characters;

public abstract class Abstract {
    //introducing the new variables and strings, (name, strength, health)
	int totalnumberstrength;
	String charactersname;
    int totalnumberhealth;

    //class Character() to introduce name of monster
    public Abstract(String character) {
        this.charactersname = character;
    }

    // class getCharactername so that we can get the Characters names
    public String getCharactersname() {
        return charactersname;
    }

    //class getTotalnumberstrength() so we are able to get total strength character will have
    public int getTotalnumberstrength() {
        return totalnumberstrength;
    }
    //class getTotalnumberhealth() so we are able to get total strength character will have
    public int getTotalnumberhealth() {
        return totalnumberhealth;
    }

    //public void hit(int points) reduces the character’s health based on the strength of an attack 
    public abstract void hit(int points);
    
    //public int attack() returns the strength of an attack
    public abstract int attack();
    
    //public boolean isAlive() returns a Boolean based on whether or not the character’s health is greater than 0.
    public abstract boolean isAlive();

    //Write a toString() method for your character classes that displays the name, class, strength, & health of the character
    public String toString() {
        return "(Name of Character is" + " " + charactersname+")"+ "\n" + "(Total Number of Strength"+" "+"="+" "+ totalnumberstrength+")"+ "\n" + "(Total Number Health"+" "+"="+" "+ totalnumberhealth+")" ;
    }
}