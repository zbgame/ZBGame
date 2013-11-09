public class Weapon extends Item
{
    private int attackModifier;//increase the players attack by this much when the attack function is called
    private boolean doesAttackStack = true;//can be used to over ride players attack stat and only use weapons attack, guns do not use any of your own physical strength
    private boolean isEquiped = false;//will be called when using the equip function and when checking attacks to make sure it increases player damage (Not necessary, left in for testing, remove at a later date)
    private boolean usesAmmo;//determines if a weapon needs ammo to use, gun vs knife
    private int ammo;//counts ammo down when used
    private String attackDescriptor;//describes the type of attack this weapon will perform

    public Weapon()
    {

    }

}
