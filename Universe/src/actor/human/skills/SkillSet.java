/**
 *  SkillSet.java
 *  Authored by Cody Fagley
 *  May 3, 2017
 */

/*
 *  Class containing the human skillset
 */
package actor.human.skills;


/*
 *  All Skills Start 4 - 32 (4d8) and scale up to 50
 */
public class SkillSet 
{
    //  Weapon Skills
    Skill melee;
    Skill handguns;
    Skill rifles;

    //  Survival Skills
    Skill cooking;
    Skill woodcutting;
    Skill construction;
    Skill beastiary;
    Skill sneak;
    short carryCapacity;
    
    //  Other Skills
    Skill research;
    short luck;
    Skill charisma;
    
}
