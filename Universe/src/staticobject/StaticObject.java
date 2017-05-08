/*
 *  StaticObject.java
 *  Dylan Todd and Cody Fagley
 *  May 8, 2017
 */

/*
 *  Base Object for Static Objects
 */

package staticobject;

public class StaticObject 
{
    //  Build Requirements
    boolean buildable;
    boolean repairable;
    String[] materials;
    int[] matRequirements;
    byte requiredHeight; //  number of tiles required to build going up to down
    byte requiredWidth;  //  number of tiles required to build going left to right
    
    
    //  Hit and Death Stats
    int toughness;      //  remaining health before death
    boolean explodable;
    
    //  Other
    boolean passable;
    
    
    
    
}
