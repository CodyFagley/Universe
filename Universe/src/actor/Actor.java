/**
 *  Actor.java
 *  Authored by Cody Fagley
 *  May 3, 2017
 */

/*
 *  An actor is anything that can be alive 
 *  or dead and act on other objects
 */
package actor;

public class Actor 
{
    //  Location Variables
    int x;  //  x is the number of tiles right from (0, 0)
    int y;  //  y is the number of tiles below (0, 0)
    
    boolean alive;

    
    //  Accessor Methods
    public boolean isAlive() {return alive;}
    public void setAlive(boolean b) {alive = b;}
}
