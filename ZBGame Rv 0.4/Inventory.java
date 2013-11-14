/**@author Blacklotus3
 */
public class Inventory 
{
   String Key="blue";
   String TestKey="";
   public void setInvKey()
           {  Key=Key+"";}
   public void setTestKey(String mainfeed)
   {TestKey=mainfeed; }
   public String setKeyName()
   {if (TestKey.equals("0"))
           {return "None";}
   if (TestKey.equals("1"))
           {return "White";}
   if (TestKey.equals("2"))
           {return "Blue";}
   if (TestKey.equals("3"))
           {return "Green";}
   if (TestKey.equals("4"))
           {return "Yellow";}
   if (TestKey.equals("5"))
           {return "Orange";}
   if (TestKey.equals("Red"))
           {return "Black";}
   if (TestKey.equals("7"))
           {return "Silver";}
   if (TestKey.equals("8"))
           {return "Gold";}
   else 
           {return "Master";}

   }
   public String getInvKey()
           { return Key;}
   public String getTestKey()
   {return TestKey;}
  
}
