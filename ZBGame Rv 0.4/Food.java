public class Food extends Item
{
    private int increasedHealth;

    public Food(String n, String e, int q, int i)
    {
        super.setName(n);
        super.setDescription(e);
        super.setQuantity(q);
        increasedHealth = i;
    }

    public void use(Player p)
    {
        p.setHitpoints(p.getHitpoints()+increasedHealth);
        if(p.getHitpoints()>p.getMaxHitpoints())
        {
            p.setHitpoints(p.getMaxHitpoints());
        }
        super.setQuantity(super.getQuantity() - 1);
        System.out.println("You used "+super.getName());
    }
}
