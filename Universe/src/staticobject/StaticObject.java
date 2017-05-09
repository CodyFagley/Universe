/*
 *  StaticObject.java
 *  Dylan Todd and Cody Fagley
 *  May 8, 2017
 */

/*
 *  Base Object for Static Objects
 */

package staticobject;

import holdable.Holdable;

public class StaticObject 
{
    //  Build Requirements
    boolean buildable;
    boolean repairable;
    Holdable[] materialRequirements;
    byte requiredHeight; //  number of tiles required to build going up to down
    byte requiredWidth;  //  number of tiles required to build going left to right
    
    
    //  Hit and Death Stats
    int toughness;      //  remaining health before death
    boolean flammable;
    boolean explodable;
    Holdable[] droppables;
    
    //  Other
    boolean passable;
    
    
    
    
}
