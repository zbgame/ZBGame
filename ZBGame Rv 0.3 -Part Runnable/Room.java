import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** @author Blacklotus3
 */
public class Room 
{      Inventory I1=new Inventory();
       Character c1= new Character();
       Scanner kybd = new Scanner(System.in);String rr="blah";
       String con="blah";
       String sloc="blah";
       
       int l;
       int setb;
       
       String Batl;
              
        public void setRoom(int roomnum)
           {  setb=roomnum;}
        public void askRoom()
           {System.out.println("Where would you like to go?");
        System.out.println("For rooms " + getLoc().charAt(9)+"10-"+getLoc().charAt(9)+"19 enter 10-19");
        System.out.println("For the main map enter 20 and for the soda machine enter 21");
        String saskroom=kybd.next();
        int askroom=0;
            //test string for numbers
            try {askroom = Integer.parseInt(saskroom);
               } catch (NumberFormatException e) {}
        if (askroom<10||askroom>22)
        {System.out.println("Please enter a valid number");askRoom();}
        else
        setRoom(askroom-10); 
           }
        public int getSetr()
           { return setb; }
        public String getRoom()
           {rr=room.get(setb); return rr; }    
        public void setLoc(String loc)
           {
               if(loc.equalsIgnoreCase("M"))
                       {l=0;}
               else if(loc.equalsIgnoreCase("A"))
                       {l=1;}
               else if(loc.equalsIgnoreCase("B"))
                       {l=2;}
               else if(loc.equalsIgnoreCase("C"))
                       {l=3;}  
               else
               {System.out.println("Please enter a valid selection");}   
           }
         public String getLoc()
           {
            if (l==0)
              {System.out.println("Choose a building: A, B, or C.");
                setLoc(kybd.next());
               if (l==0)
                 {getLoc();} 
              }
           sloc=loc.get(l); return sloc; 
           }
         public void setBatl()
           {  Batl=room.get(setb);}
         
          public String getBatl()
           { if('0'==Batl.charAt(4))
                {return "No Zombies you are safe... for now.";}
           else if ('Z'==Batl.charAt(4))
                 return "Zombie Attack!!!";
           else
               return "You Found a BOSS!!!";
           }
          String safe;
          String key;
          public void setKey()
           {key=room.get(setb);}
          public String whichKey()
          {return   ""+key.charAt(7);}
          public String getKey()
          {
              if ('0'==key.charAt(7))
          {return "This room does not require a key ";}
              else
                  I1.setTestKey(whichKey());
                  return "This room requires the "+I1.setKeyName()+" key ";
          } 
          
           public String enter()
          { System.out.println("Do you try to open the door? ");
            System.out.println("Enter 1 for Yes or 2 for No.");
            int t=kybd.nextInt();
              if (t==2)
              { return "You are in the Hall";}
              else if (t==1&&'4'==key.charAt(7))
              {return "This room requires the "+key.charAt(7)+" key ";}
              else
                  return "blah bl;ah ";
          }
  ArrayList<String> loc= new ArrayList<String>();
         ArrayList<String> cont= new ArrayList<String>();
         ArrayList<String> room= new ArrayList<String>();
         
        public  Room()
        {    // locations
            loc.add("Main Campus");loc.add("Building A");loc.add("Building B");loc.add("Building C");
            
            /**  first: 0=no zombie, Z= zombie A= miniboss1 B=miniboss2 C=boss3 etc..
              *  second: 0=no item A-Z= item letter
              *   Third: 0=no NPC  A-Z= NPC Letter
              *  fourth: 0= no key required 1-9= which key required
              */
            //contemts of room
            cont.add("Z0B0");cont.add("00B4");cont.add("ZA01");cont.add("0000");cont.add("ZJ04"); 
            cont.add("ZB00");cont.add("ZR00");cont.add("0DH0");cont.add("AL02");cont.add("BHY3");
            
         Collections.shuffle(cont); // randomize rooms
         
         for(int h=0; h<cont.size(); h++)
            {
             int numb=10+ h;
             char bldg='A';
             room.add(bldg+""+numb+" "+ cont.get(h));
            }
         //for testing
         for(int h=0; h<cont.size(); h++)
            {System.out.println("you enter "+room.get(h));} 
        }
        
}
