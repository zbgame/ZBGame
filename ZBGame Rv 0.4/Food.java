public class Food extends Item
{
    private int foodStat, increasedHealth, decreasedHealth, health;

    public Food(String n, int f, int h, int i)
    {
        increasedHealth = i;
        foodStat = f;
        health = h;
    }

    public void addFood(int foodStat)
    {
    }

    public void removeFood(String itemName, int foodStat)
    {
        {
            
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
    
    public void use(Inventory i)
    {
        i.getPlayer().setHitpoints(i.getPlayer().getHitpoints()+increasedHealth);
    }
}
