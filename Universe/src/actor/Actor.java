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

import gameboard.GameObject;
import java.util.Vector;

public class Actor extends GameObject
{
    boolean alive;
    Vector<Integer> tasks;
    
    
    //  Accessor Methods
    public boolean isAlive() {return alive;}
    public void setAlive(boolean b) {alive = b;}
}
