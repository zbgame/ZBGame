import java.util.ArrayList;
import java.util.Random;
public class Enemy
{
    private String name;
    private String description;
    private int maxHealth;
    private int health;
    private boolean firstStrike = false;
    private Random random = new Random();
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

    public Enemy(String n, String d, int m)
    {
        name = n;
        description = d;
        maxHealth = m;
        health = maxHealth;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public void addAttack(Attack a)
    {
        attacks.add(a);
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setHealth(int h)
    {
        health = h;
    }

    public void setFirstStrike(boolean f)
    {
        firstStrike = f;
    }

    public void getBehavior(Player p)
    {
        if(firstStrike == true)
        {
            int doThis = random.nextInt(attacks.size());
            System.out.println(name+ " " +attacks.get(doThis).getDescription());
            p.setHitpoints(p.getHitpoints() - attacks.get(doThis).getDamage());
            if(attacks.get(doThis).getDamage() > 0)
            {
                System.out.println("You have "+p.getHitpoints()+" hearts remaining.");
            }
            if(attacks.get(doThis).getDamage() <= 0)
            {
                System.out.println("It didn't hurt at all.");
            }
        }
        if(firstStrike == false)
        {
            System.out.println(name+ " " +attacks.get(0).getDescription());
            System.out.println("It didn't hurt at all.");
            firstStrike = true;
        }
    }
}
