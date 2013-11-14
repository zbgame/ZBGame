
 
import java.util.ArrayList;

public class Food extends Item{  

private String itemName;
private int foodStat, increasedHealth, decreasedHealth, health;
ArrayList<String> foodStuff = new ArrayList<String>();

public Food(String n, int f, int h, int i, int d)
{
  increasedHealth = i;
  decreasedHealth = d;
  itemName = n;
  foodStat = f;
  health = h;
}
    public void addFood(String itemName, int foodStat){
        {
            foodStuff.add(foodStat, itemName);
       }
    }
     public void removeFood(String itemName, int foodStat){
        {
            foodStuff.remove(foodStat);
            foodStuff.remove(itemName);
        }
    }
    public void eat()
    {
       increasedHealth = health + foodStat;
       System.out.println(increasedHealth + " has been added to your HP");
    } 
    
    public void digest() //Not sure if food had a more lasting effect or not...can be removed
    {
        decreasedHealth = health -= foodStat;
        System.out.println(decreasedHealth + " has been subtracted from your HP");
    }
}
