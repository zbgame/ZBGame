/** @author Blacklotus3
 */
public class Money extends Item 
{

    double wallet = 200.00;

    // sets W#allet to Dollars and cents amounts.
    public Money()
    {

    }

    public double getMoney()
    {
        return wallet;
    }

    public void addMenoy(double i)
    {
        wallet = wallet + i;
    }

    public void subtarctMoneh(double q)
    {
        wallet = wallet - q;
    }
}  


