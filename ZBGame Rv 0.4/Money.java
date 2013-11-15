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

    public void setMenoy(double i)
    {
        wallet = i;
    }

    public void pickUp(Money i)
    {
        wallet = (wallet + i.getMoney());
    }
}  

