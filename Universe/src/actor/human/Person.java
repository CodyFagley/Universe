/**
 *  Person.java
 *  Authored by Cody Fagley
 *  May 3, 2017
 */

package actor.human;

import java.util.Vector;




public class Person 
{
    /*
     *  Body Parts
     */
        
    //  Critical Parts
    short head;
    short torso;
    
    //  Major Appendages
    short leftArm;
    short leftLeg;
    short leftHand;   //  Determined by Left Fingers
    short leftFoot;   //  Determined by Left Toes
    
    short rightArm;
    short rightLeg;
    short rightHand;  //  Determined by Right Fingers
    short rightFoot;  //  Determined by Right Toes
    
    
    //  Minor Appendages
    //  Left Hand
    short leftThumbFinger;
    short leftIndexFinger;
    short leftMiddleFinger;
    short leftRingFinger;
    short leftPinkyFinger;
    
    //  Left Foot
    short leftThumbToe;
    short leftIndexToe;
    short leftMiddleToe;
    short leftRingToe;
    short leftPinkyToe;
    
    //  Right Hand
    short rightThumbFinger;
    short rightIndexFinger;
    short rightMiddleFinger;
    short rightRingFinger;
    short rightPinkyFinger;
    
    //  Right Foot
    short rightThumbToe;
    short rightIndexToe;
    short rightMiddleToe;
    short rightRingToe;
    short rightPinkyToe;
    
    //  Genetic Statistics
    short age;
    boolean gender;  // True == Female, False == Male
    String firstName;
    String surname;
    
    //  Current Diseases
    Vector<Disease> diseases;
    
    
   /*
    *   Constructor
    */
    Person()
    {
        
    }
    
    //  Accessors
    public short getAge() {return age;}
    public void setAge(short Age) {age = Age;}
    
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

