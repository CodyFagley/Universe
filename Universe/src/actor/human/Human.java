/**
 *  Human.java
 *  Authored by Cody Fagley
 *  May 3, 2017
 */

package actor.human;

import actor.Actor;
import equipable.Equipable;
import java.util.Vector;




public class Human extends Actor
{
    /*
     *  Body Parts
     */
        
    //  Critical Parts
    byte head;
    byte torso;
    
    //  Major Appendages
    byte leftArm;
    byte leftLeg;
    byte leftHand;   //  Determined by Left Fingers
    byte leftFoot;   //  Determined by Left Toes
    
    byte rightArm;
    byte rightLeg;
    byte rightHand;  //  Determined by Right Fingers
    byte rightFoot;  //  Determined by Right Toes
    
    
    //  Minor Appendages
    //  Left Hand
    byte leftThumbFinger;
    byte leftIndexFinger;
    byte leftMiddleFinger;
    byte leftRingFinger;
    byte leftPinkyFinger;
    
    //  Left Foot
    byte leftThumbToe;
    byte leftIndexToe;
    byte leftMiddleToe;
    byte leftRingToe;
    byte leftPinkyToe;
    
    //  Right Hand
    byte rightThumbFinger;
    byte rightIndexFinger;
    byte rightMiddleFinger;
    byte rightRingFinger;
    byte rightPinkyFinger;
    
    //  Right Foot
    byte rightThumbToe;
    byte rightIndexToe;
    byte rightMiddleToe;
    byte rightRingToe;
    byte rightPinkyToe;
    
    //  Genetic Statistics
    byte age;
    boolean gender;  // True == Female, False == Male
    String firstName;
    String surname;
    
    SkillSet skills;
    
    //  Current Diseases
    Vector<Disease> diseases;
    
    //  Inventory
    Equipable[] inventory = new Equipable[40];
    
   /*
    *   Methods
    */
    
    
   /*
    *   Constructor
    */
    Human()
    {
        
    }
    
    //  Accessors
    public byte getAge() {return age;}
    public void setAge(byte Age) {age = Age;}
    
    public boolean isFemale() {return gender;}
    public void setFemale(boolean isFemale) {gender = isFemale;}
    
    public String getFirstName() {return firstName;}
    public void setFirstName(String fn) {firstName = fn;}
    
    public String getSurname() {return surname;}
    public void setSurname(String sn) {surname = sn;}
    
   /*   Returns
    *       0 if Person already has disease d
    *       1 if Person is successfully infected
    */
    public int applyDisease(Disease d)
    {
        if (diseases.contains(d)) {return 0;}
        
        diseases.add(d);
        return 1;
    }
    
   /*   Returns
    *       0 if Person does not have disease d
    *       1 if Person is successfully cleansed
    */
    public int removeDisease(Disease d)
    {
        boolean test = diseases.remove(d);
        
        if (test) {return 1;}
        else {return 0;}
    }
};

