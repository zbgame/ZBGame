public class Attack
{
    private String description;
    private int attackPower;

    public Attack(String d, int a)
    {
        description = d;
        attackPower = a;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getDamage()
    {
        return attackPower;
    }
}
