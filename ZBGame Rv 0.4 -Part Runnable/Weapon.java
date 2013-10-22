
 

import java.util.ArrayList;

public class Weapon extends Items{
    
    private Character strength;
    private int addedStrength, totalStrength;
    private String weaponName;
    private int weaponStat;
    ArrayList<String> weaponRoster = new ArrayList<String>();
    
    public Weapon(Character s, int a)
    {
        strength = s;
        addedStrength = a;        
    }
    
    public void addWeapon(String weaponName, int weaponStat){
        {
            weaponRoster.add(weaponStat, weaponName);
       }
    }
     public void removeWeapon(String weaponName, int weaponStat){
        {
            weaponRoster.remove(weaponStat);
            weaponRoster.remove(weaponName);
        }
    }
    
    public void hit()
    {
        totalStrength = (strength + weaponStat);
        System.out.println(totalStrength + " has been added to your weapon stat");
    }       
    public void kaputt()
    {
        totalStrength = strength - weaponStat;
        System.out.println(totalStrength + " has been removed to your weapon stat");
    }
}
