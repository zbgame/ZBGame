import java.util.Scanner;
/** @author Blacklotus3 
 * edited by John Jones
 * donkest version ever
 */
public class Main 
{
    
    private Parser parser;
    private Room room;
    private Character c1;
    private Inventory inventory;
    private Scanner keyboard = new Scanner(System.in);
    private Room currentRoom;
    
    private void generateStuff()
    {
        Room outside, buildingA, buildingB, buildingC, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19;
      
        // create the rooms
        outside = new Room("outside the university", false);
        buildingA = new Room("in the hallway of Building A", false);
        buildingB = new Room("in the hallway of Building B", false);
        buildingC = new Room("in the hallway of Building C", false);
        a10 = new Room("in room A10", true);
        
        
        // initialise room exits
        outside.setExit("BuildingA", buildingA);
        outside.setExit("BuildingB", buildingB);
        outside.setExit("BuildingC", buildingC);

        buildingA.setExit("A10", a10);
        
        KeyRing k1 = new KeyRing();
        Key a10key = new Key(a10);
        k1.setKey("a10key", a10key);
        

        currentRoom = outside;  // start game outside
        
        // initialise new player
        //Player P1 = new Player(5);
    }
    
    public Main()
    {
        
        generateStuff();
        parser = new Parser();  
    }

    public void play() 
    {
        c1 = new Character(3, inventory, new KeyRing()); //FIX
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) 
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
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
        //Character c1 = new Character();
        System.out.println();
        System.out.println("What is your name?");
        c1.setName(keyboard.nextLine());
        System.out.println("Welcome to the Zombie Academy, " + c1.getName() + ".");
        System.out.println("Enter \"Help\" if you need assistance.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
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
            goRoom(command);
        }
        else if (commandWord.equals("use"))
        {
            use(command);
        }
        else if (commandWord.equals("quit")) 
        {
            wantToQuit = quit(command);
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
    
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) 
        {
            System.out.println("There is no door!");
        }
        else if(nextRoom.getIsLocked() == true)
        {
            System.out.println("The door is locked.");
        }
        else if(nextRoom.getIsLocked() == false)
        {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }
    
    private boolean quit(Command command) 
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
    }
    
    private void use(Command command)
    {
        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Use what?");
            return;
        }
        
        
    }
}

