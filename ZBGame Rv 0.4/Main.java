import java.util.Scanner;
/** @author Zachary Molisee
 * edited by John Jones
 * doubly donkest version ever
 */
public class Main 
{

    private Parser parser;
    private Player p1 = new Player(5);
    private Scanner keyboard = new Scanner(System.in);
    private Room currentRoom;
    Inventory i1 = new Inventory(p1, currentRoom);

    private void generateStuff()//Zaq: Current means of manually generating all the instances in the game and setting values like exits, items, and enemies
    {
        Room outside, buildingA, buildingB, buildingC, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19;

        // create the rooms
        outside = new Room("outside the university", false);
        buildingA = new Room("in the hallway of Building A", false);
        buildingB = new Room("in the hallway of Building B", false);
        buildingC = new Room("in the hallway of Building C", false);
        a10 = new Room("in room A10", true);
        a11 = new Room("in room A11", false);
        a12 = new Room("in room A12", false);
        a13 = new Room("in room A13", false);
        a14 = new Room("in room A14", true);
        a15 = new Room("in room A15", true);
        a16 = new Room("in room A16", false);
        a17 = new Room("in room A17", false);
        a18 = new Room("in room A18", false);
        a19 = new Room("in room A19", true);
        b10 = new Room("in room B10", false);
        b11 = new Room("in room B11", false);
        b12 = new Room("in room B12", false);
        b13 = new Room("in room B13", false);
        b14 = new Room("in room B14", false);
        b15 = new Room("in room B15", false);
        b16 = new Room("in room B16", false);
        b17 = new Room("in room B17", false);
        b18 = new Room("in room B18", false);
        b19 = new Room("in room B19", false);
        c10 = new Room("in room C10", false);
        c11 = new Room("in room C11", false);
        c12 = new Room("in room C12", false);
        c13 = new Room("in room C13", false);
        c14 = new Room("in room C14", false);
        c15 = new Room("in room C15", false);
        c16 = new Room("in room C16", false);
        c17 = new Room("in room C17", false);
        c18 = new Room("in room C18", false);
        c19 = new Room("in room C19", false);

        // initialise room exits
        outside.setExit("buildinga", buildingA);
        outside.setExit("buildingb", buildingB);
        outside.setExit("buildingc", buildingC);

        buildingA.setExit("outside", outside);
        buildingA.setExit("a10", a10);
        buildingA.setExit("a11", a11);
        buildingA.setExit("a12", a12);
        buildingA.setExit("a13", a13);
        buildingA.setExit("a14", a14);
        buildingA.setExit("a15", a15);
        buildingA.setExit("a16", a16);
        buildingA.setExit("a17", a17);
        buildingA.setExit("a18", a18);
        buildingA.setExit("a19", a19);

        buildingB.setExit("outside", outside);
        buildingB.setExit("b10", b10);
        buildingB.setExit("b11", b11);
        buildingB.setExit("b12", b12);
        buildingB.setExit("b13", b13);
        buildingB.setExit("b14", b14);
        buildingB.setExit("b15", b15);
        buildingB.setExit("b16", b16);
        buildingB.setExit("b17", b17);
        buildingB.setExit("b18", b18);
        buildingB.setExit("b19", b19);

        buildingC.setExit("outside", outside);
        buildingC.setExit("c10", c10);
        buildingC.setExit("c11", c11);
        buildingC.setExit("c12", c12);
        buildingC.setExit("c13", c13);
        buildingC.setExit("c14", c14);
        buildingC.setExit("c15", c15);
        buildingC.setExit("c16", c16);
        buildingC.setExit("c17", c17);
        buildingC.setExit("c18", c18);
        buildingC.setExit("c19", c19);

        a10.setExit("hallway", buildingA);
        a11.setExit("hallway", buildingA);
        a12.setExit("hallway", buildingA);
        a13.setExit("hallway", buildingA);
        a14.setExit("hallway", buildingA);
        a15.setExit("hallway", buildingA);
        a16.setExit("hallway", buildingA);
        a17.setExit("hallway", buildingA);
        a18.setExit("hallway", buildingA);
        a19.setExit("hallway", buildingA);

        b10.setExit("hallway", buildingB);
        b11.setExit("hallway", buildingB);
        b12.setExit("hallway", buildingB);
        b13.setExit("hallway", buildingB);
        b14.setExit("hallway", buildingB);
        b15.setExit("hallway", buildingB);
        b16.setExit("hallway", buildingB);
        b17.setExit("hallway", buildingB);
        b18.setExit("hallway", buildingB);
        b19.setExit("hallway", buildingB);

        c10.setExit("hallway", buildingC);
        c11.setExit("hallway", buildingC);
        c12.setExit("hallway", buildingC);
        c13.setExit("hallway", buildingC);
        c14.setExit("hallway", buildingC);
        c15.setExit("hallway", buildingC);
        c16.setExit("hallway", buildingC);
        c17.setExit("hallway", buildingC);
        c18.setExit("hallway", buildingC);
        c19.setExit("hallway", buildingC);

        currentRoom = outside;  // start game outside
        i1.setRoom(currentRoom);

        //set items for invetory
        Key a10key = new Key("a10key", "The key to room a10", 0, a10);
        Key a14key = new Key("a14key", "The key to room a14", 0, a14);
        Key a15key = new Key("a15key", "The key to room a15", 0, a15);
        Key a19key = new Key("a19key", "The key to room a19", 0, a19);
        
        Food apple = new Food("apple","One of these a day may keep away medically inclined zombies.", 0, 2);
        Food medpak = new Food("medpak","Staple medic kit seen in any proper zombie game.", 0, 10);

        Weapon fists = new Weapon("fists", "Your own bear hands!", 2, 1, true, "pummel them with your fists");
        
        //add items to inventory
        i1.setItem(a10key);
        i1.setItem(a14key);
        i1.setItem(a15key);
        i1.setItem(a19key);
        i1.setItem(apple);
        i1.setItem(medpak);
        i1.setItem(fists);

        //set items for rooms
        Item rooma10key = new Item("a10key", "The key to room a10", 1);
        Item rooma14key = new Item("a14key", "The key to room a14", 1);
        
        Item roomApple = new Item("apple","One of these a day may keep away medically inclined zombies.", 1);
        Item roomMedpak = new Item("medpak","Staple medic kit seen in any proper zombie game.", 1);
        
        //add items to rooms
        a11.setItemsInRoom(rooma10key);
        a10.setItemsInRoom(rooma14key);
        a12.setItemsInRoom(roomApple);
        
        //add enemies
        Zombie Sweissman = new Zombie("Mr. Sweissman", "It's Mr. Sweissman", 25);
        Zombie megaMan = new Zombie("MegaMan", "He's a super fighting robot", 15);
        Zombie itsHim = new Zombie("Him!","Him! is an enemy", 5);

        //add attacks
        Attack doNothing = new Attack("does nothing...", 0);//Zaq: First attack should always be a do nothing type of attack
        Attack doRub = new Attack("brushes against you, ouch.", 2);
        itsHim.setBehavior(doNothing);
        itsHim.setBehavior(doRub);

        //put enemies in rooms
        a10.setEnemy(itsHim);

        p1.setInventory(i1);
    }

    public Main()
    {

        generateStuff();
        parser = new Parser();  
    }

    public void play() 
    {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) 
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
            if(!currentRoom.roomHasEnemy()){}
            else if(currentRoom.getEnemy().getHealth() > 0)//Zaq: If an enemy is in the room, this if calls for it to do something
            {
                currentRoom.getEnemy().getBehavior(p1);
            }
            if(p1.getHitpoints() <= 0)//Zaq: Checks if player has died
            {
                finished = true;
                System.out.println("You have died.");
            }
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    private void printWelcome()
    {
        System.out.println();
        System.out.println("What is your name?");
        System.out.print("> ");
        p1.setName(keyboard.nextLine());
        System.out.println("Welcome to the Zombie Academy, " + p1.getName() + ".");
        System.out.println("Enter \"Help\" if you need assistance.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) 
        {
            System.out.println("I don't know how to " + parser.getInput() + "!");
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
        else if (commandWord.equals("look"))
        {
            look(command);
        }
        else if (commandWord.equals("get"))
        {
            pickUp(command);
        }
        else if (commandWord.equals("soda"))// added to see if money class would be needed
        {
            buySoda(command);
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

    private void goRoom(Command command) //Zaq: Modified go method from zuul's, now accounts for locked doors and sends currentRoom to inventory for item interactions
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
            i1.setRoom(currentRoom);
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

    private void use(Command command)//Zaq: New use method that calls for an item to be used using an overidden/overloaded item use() function called from inventory
    {
        String item = command.getSecondWord();
        Item useThis = i1.getItem(item);

        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we don't know what to use...
            System.out.println("Use what?");
            return;
        }
        if(useThis == null || i1.getItem(item).getQuantity() <= 0)
        {
            System.out.println("You don't have that!");
        }
        else
        {
            i1.use(i1.getItem(item));
        }
    }

    private void pickUp(Command command)//Zaq: New use method that calls for an item to be used using an overidden/overloaded item use() function called from inventory
    {
        String item = command.getSecondWord();
        Item getThis = i1.getItem(item);

        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we don't know what to use...
            System.out.println("Get what?");
            return;
        }
        if(!(getThis instanceof Item))
        {
            System.out.println("You can't get that!");
        }
        else
        {
            try
            {
                getThis.setQuantity(getThis.getQuantity()+currentRoom.getItemsInRoom(item).getQuantity());
                System.out.println("You got "+currentRoom.getItemsInRoom(item).getQuantity()+" "+item);
                currentRoom.removeItemFromRoom(item);
            }
            catch(NullPointerException e)
            {
                System.out.println("You can't get that!");
                return;
            }
        }
    }

    private void look(Command command)//Zaq: New look command, allows players to survey their surroundings and gather information about the game world
    {
        String secondWord = command.getSecondWord();
        Room lookRoom = currentRoom.getExit(secondWord);
        Item lookItem = currentRoom.getItemsInRoom(secondWord);
        Zombie lookZombie = currentRoom.getEnemy();
        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we look in the current room
            System.out.println(currentRoom.getLongDescription());
        }
        else if(secondWord.equals("self"))
        {
            System.out.println(p1.getDescription());
        }
        else if(lookRoom instanceof Room)
        {
            System.out.println(lookRoom.look(secondWord));
        }
        else if(lookItem instanceof Item)
        {
            System.out.println(lookItem.getDescription());
        }
        else if (lookZombie instanceof Zombie)
        {
            System.out.println(lookZombie.description());
        }
    }

    private void buySoda(Command command)
    {
        String secondWord = command.getSecondWord();
        String answer;        
        int hp = p1.getHitpoints();

        if(!command.hasSecondWord())
        {
            System.out.println("Would you like to buy soda for $50?");              
            answer = keyboard.nextLine();
            if (answer.equals("yes"))
            {
                System.out.println("Great that will be 50$");
                p1.setCash(p1.getCash());

                System.out.println("You have " + "$" + p1.getCash() + ". Have a nice day!");
                p1.setHitpoints((p1.getHitpoints() + 1));

                if(p1.getHitpoints() <= 3 && p1.getHitpoints() >=0)
                {
                    System.out.println("One health has been restored. Your health is " + p1.getHitpoints() + ".");
                }
                else if(p1.getHitpoints() > 3)
                {
                    p1.setCash(p1.getCash() + 50);
                    System.out.println("Wait...You don't need this.." + "$" + p1.getCash());                   
                }
            }

            if(answer.equals("no"))        
            {
                System.out.println(currentRoom.getLongDescription());
            }

        }
    }
}

