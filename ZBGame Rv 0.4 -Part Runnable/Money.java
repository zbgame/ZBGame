package mytestfile;
/** @author Blacklotus3
 */
public class Money {
     
   int Wallet=200;
   int change;
   int Dollars;
   int Cents;
   
   // sets W#allet to Dollars and cents amounts.
   public void setMoney()
   { Dollars= Wallet/100;
     Cents=Wallet%100;}
   
   public void setChange(int change) 
   {this.change = change;
     changeWallet();}

    // Changes Wallet Value. Setter.
     public void changeWallet () 
           {Wallet = Wallet + change;}
  
     // gets present amount in Wallet. Getter.
     public String currentWallet()
           {setMoney();
           //sets spacer if Cent>10
           String spacer=("");
           if (Cents<10)
           {spacer ="0";}
              return "$"+ Dollars+"."+spacer+Cents+ " in your wallet." ;}
     // buy soda
     public void buySoda()
     { int sodaPrice=-200;
        if (sodaPrice+Wallet>=0)
         {setChange(sodaPrice);
          System.out.println("You purchased a soda you now have "+ currentWallet());}// removes $2.00 for soda
        // add code to put a new soda in inventory
        else
        {System.out.println("Sorry but you only have " +currentWallet()+ "You do not have enough money to buy a soda at this point try killing more zombies");}
     }
     public void findMoney()
     { int found = 30;// temp to mak work
       setChange(found);// insert the amount where "found" is.
         System.out.println("You have found ." + found +" cents. You now have "+ currentWallet());
         
     }
     }  
    



