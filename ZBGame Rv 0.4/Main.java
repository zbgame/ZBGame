import java.util.Scanner;
/** @author Blacklotus3 
 * edited by John Jones
 * donkest version ever
 */
public class Main 
{
    
    private Parser parser;
    private Room room;
    private Character c1;// starting character
    private Inventory inventory;
    private Scanner keyboard = new Scanner(System.in);
    public Main()
    {
        this.play();
        //r1.createRooms();
        c1= new Character("Player", 3,inventory, new KeyRing());// must repair
        parser = new Parser();     
    }

    public void play() 
    {
        room = new Room();
        printWelcome();       
       
        boolean gameOver = false;
        while(!gameOver)
        {
            room.getLoc();
            
            
           // gameOver = this.processCommand(Command); 
        }
        // Player has ended the game via "quit" 
        System.out.println("Thank you for playing. Just remember, there's no \"quit\" button");
        System.out.println("to push when the zombies really attack!");
        
    }
       /*
      String callme;
        Scanner kybd = new Scanner(System.in);

          System.out.println("Enter your name:");
           c1.setName("Bebel"/**kybd.nextLine()
           System.out.println("Welcome to the Zombie Academy "+ c1.getName());
            System.out.println("private "+ c1.getHitpoints() + " hitpoints.");    
           System.out.println("Are you dead? "+ c1.getsDead());
         while (c1.getHitpoints()>0)


        r1.askRoom();
        System.out.println("Room # "+ r1.getRoom());
        r1.setKey();       
        I1.setTestKey(r1.whichKey());
        System.out.println("Test key: "+I1.setKeyName());
        System.out.println(""+r1.enter());
         System.out.println(r1.getKey());
         r1.setBatl();
         System.out.println(r1.getBatl());

         System.out.println("Random "+ r1.get);
        *
        /**
        c1.getItem();  //weapons + other non permanent items
        c1.setItem();       

        c1.getSoda();  // aquire and gain hp upon use
        c1.setSoda());

         */

    
    private void printWelcome()
    {
      //  Character c1 = new Character();
        System.out.println();
        System.out.println("What is your name?");
        c1.setName(keyboard.nextLine());
        System.out.println("Welcome to the Zombie Academy, " + c1.getName() + ".");
        System.out.println("Enter \"Help\" if you need assistance.");
        System.out.println();
    }

    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;
        if(command.isUnknown()) 
        {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) 
        {
            printHelp();
        }
        else if (commandWord.equals("go")) 
        {
            room.getLoc();
        }
        else if (commandWord.equals("quit")) 
        {
            //wantToQuit = quit(command);
        }
        // else command not recognised.
        return wantToQuit;
    }
    
    private void printHelp() 
    {
        System.out.println("Your objective is to survive the");
        System.out.println("zombie invasion.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }
    

    
    /**private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) 
        {
            System.out.println("Quit what?");
            return false;
        }
        else 
        {
            return true;  // signal that we want to quit
        }
    }*/
}

