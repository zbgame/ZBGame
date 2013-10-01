import java.util.Scanner;
/** @author Blacklotus3
 */
public class Main {

    public static void main(String[] args) 
    {
        Room r1 = new Room();
        Character c1= new Character();
    
    String callme;
    Scanner kybd = new Scanner(System.in);
    
        System.out.println("Enter your name:");
        c1.setName("Bebel"/**kybd.nextLine()*/);
        System.out.println("Welcome to the Zombie Academy "+ c1.getName());
        System.out.println("private "+ c1.getHitpoints() + " hitpoints.");    
        System.out.println("Are you dead? "+ c1.getsDead());
        c1.getItem();  //weapons + other non permanent items
        c1.setItem();
        
        
        c1.getKey();  // permanent keys
        c1.setKey();
        
        c1.getSoda();  // aquire and gain hp upon use
        c1.setSoda();
        
        
        r1.getLocation();  //outside of the door with explanation of what if anything seen
        r1.setLocation();
        
        r1.getInside();  // what is inside of the room
        r1.setInside();
        
        r1.getBattle();  // get battle info have battle then set results
        r1.setBattle();
    }
}
