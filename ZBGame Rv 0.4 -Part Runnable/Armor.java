
import java.util.ArrayList;

public class Armor extends Item    
{
    
    private int defense;  //sw Character vs Characters
    private int addedDefense, totalDef;
    private String armorName;
    private int armorStat;
    ArrayList<String> armorRoster = new ArrayList<String>();
    
    public Armor(int d, int a)
    {
        defense = d;
        addedDefense = a;        
    }
    
    public void addArmor(String armorName, int armorStat){
        {
            armorRoster.add(armorStat, armorName);
       }
    }
     public void removeArmor(String armorName, int armorStat){
        {
            armorRoster.remove(armorStat);
            armorRoster.remove(armorName);
        }
    }
    
    public void protect()
    {
        totalDef = defense + armorStat;
        System.out.println(totalDef + " has been added to your defense stat");
    }       
    public void broken()
    {
        totalDef = defense -= armorStat;
        System.out.println(totalDef + " has been removed to your defense stat");
    }
}
