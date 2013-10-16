import java.util.Scanner;
/** @author Blacklotus3
 */
public class Main {

    public static void main(String[] args) 
    {
        
        Character c1= new Character();
        Room r1 = new Room();
        
        Inventory I1=new Inventory();
        
    String callme;
    Scanner kybd = new Scanner(System.in);
    
      //  System.out.println("Enter your name:");
     //   c1.setName("Bebel"/**kybd.nextLine()*/);
     //   System.out.println("Welcome to the Zombie Academy "+ c1.getName());
    //    System.out.println("private "+ c1.getHitpoints() + " hitpoints.");    
     //   System.out.println("Are you dead? "+ c1.getsDead());
       // while (c1.getHitpoints()>0)
            
        r1.getLoc();
        
        System.out.println("You have entered " +r1.getLoc());
        r1.askRoom();
             
        System.out.println("Room # "+ r1.getRoom());
        r1.setKey();       
        I1.setTestKey(r1.whichKey());
        System.out.println("Test key: "+I1.setKeyName());
        System.out.println(""+r1.enter());
       // System.out.println(r1.getKey());
       // r1.setBatl();
       // System.out.println(r1.getBatl());
        
        
        
        
        // System.out.println("Random "+ r1.get);
        
        
        /**
        c1.getItem();  //weapons + other non permanent items
        c1.setItem();       
        
        c1.getSoda();  // aquire and gain hp upon use
        c1.setSoda());
        
        
        */
    }
}
