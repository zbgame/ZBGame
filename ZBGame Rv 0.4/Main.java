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
        Room outside, buildingA, buildingB, buildingC, 
        a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, 
        b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, 
        c10, c11, c12, c13, c14, c15, c16, c17, c18, c19;

        // create the rooms
        outside = new Room("outside the university", false);
        buildingA = new Room("in the hallway of Building A", false);
        buildingB = new Room("in the hallway of Building B", true);
        buildingC = new Room("in the hallway of Building C", true);
        a10 = new Room("in room A10", true);
        a11 = new Room("in room A11", false);
        a12 = new Room("in room A12", false);
        a13 = new Room("in room A13", false);
        a14 = new Room("in room A14", true);
        a15 = new Room("in room A15", true);
        a16 = new Room("in room A16", false);
        a17 = new Room("in room A17", false);
        a18 = new Room("in room A18", true);
        a19 = new Room("in room A19", true);
        b10 = new Room("in room B10", false);
        b11 = new Room("in room B11", false);
        b12 = new Room("in room B12", true);
        b13 = new Room("in room B13", true);
        b14 = new Room("in room B14", false);
        b15 = new Room("in room B15", false);
        b16 = new Room("in room B16", false);
        b17 = new Room("in room B17", true);
        b18 = new Room("in room B18", false);
        b19 = new Room("in room B19", true);
        c10 = new Room("in room C10", false);
        c11 = new Room("in room C11", true);
        c12 = new Room("in room C12", false);
        c13 = new Room("in room C13", false);
        c14 = new Room("in room C14", false);
        c15 = new Room("in room C15", false);
        c16 = new Room("in room C16", true);
        c17 = new Room("in room C17", false);
        c18 = new Room("in room C18", true);
        c19 = new Room("in room C19", true);

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
        //set keys
        Key a10key = new Key("a10key", "The key to room a10", 0, a10);
        Key a14key = new Key("a14key", "The key to room a14", 0, a14);
        Key a15key = new Key("a15key", "The key to room a15", 0, a15);
        Key a18key = new Key("secretkey", "This key is a secret... Don't tell anyone.", 0, a18);
        Key a19key = new Key("a19key", "The key to room a19", 0, a19);
        
        Key b12key = new Key("b12key", "The key to room b12", 0, b12);
        Key b13key = new Key("b13key", "The key to room b13", 0, b13);
        Key b17key = new Key("b17key", "The key to room b17", 0, b17);
        Key b19key = new Key("b19key", "The key to room b19", 0, b19);
        
        Key c11key = new Key("c11key", "The key to room c11", 0, c11);
        Key c16key = new Key("c16key", "The key to room c16", 0, c16);
        Key c18key = new Key("c18key", "The key to room c18", 0, c18);
        Key c19key = new Key("c19key", "The key to room c19", 0, c19);
        
        Key bkey = new Key("bkey", "The key to Building B", 0, buildingB);
        Key ckey = new Key("ckey", "The key to Building C", 0, buildingC);
        
        //set food
        Food apple = new Food("apple","One of these a day may keep away medically inclined zombies.", 0, 2);
        Food chocolate = new Food("chocolate","chocolate? Chocolate! CHOCOLAAAAAAAAAAAAAAAAAAAAAATE!!!", 0, 5);
        Food medpak = new Food("medpak","Staple medic kit seen in any proper zombie game.", 0, 10);
        
        //set weapons
        Weapon fists = new Weapon("fists", "Your own bear hands!", 2, 1, true, "pummel them with your fists.");
        Weapon shotgun = new Weapon("shotgun", "The staple weapon in any good zombie game.", 0, 4, false, "unload your buckshot all over their face.");
        Weapon rocketBelts = new Weapon("rocketbelts", "Belts with rockets.", 0, 6, false, "use rocket belts.\nAnd fire a bazooka.");
        Weapon magic = new Weapon("magic", "\"Mystic Tome of the Arcane\" is written on the cover.", 0, 10, true, "concentrate your mana into your hands and fire a fireball at the enemy.");
        Weapon crysKnife = new Weapon("Crysknife", "A powerful melee weapon that kills any monster in a single hit.", 0, 100, true, "crush your foe with the power of the Spice.");
        Weapon chocoSword = new Weapon("ChocoboSword", "Sword of the legendary Onion Knight.", 0, 5, true, "your blade lets out a thunderous \"Wark!\" as it smites your foe.");
        
        //add items to inventory
        i1.setItem(a10key);
        i1.setItem(a14key);
        i1.setItem(a15key);
        i1.setItem(a18key);
        i1.setItem(a19key);
        i1.setItem(b12key);
        i1.setItem(b13key);
        i1.setItem(b17key);
        i1.setItem(b19key);
        i1.setItem(c11key);
        i1.setItem(c16key);
        i1.setItem(c18key);
        i1.setItem(c19key);
        i1.setItem(bkey);
        i1.setItem(ckey);
        i1.setItem(apple);
        i1.setItem(chocolate);
        i1.setItem(medpak);
        i1.setItem(fists);
        i1.setItem(shotgun);
        i1.setItem(rocketBelts);
        i1.setItem(magic);
        i1.setItem(crysKnife);
        i1.setItem(chocoSword);

        //set items for rooms
        //ALL THE KEYS
        Item rooma10key = new Item("a10key", "The key to room a10", 1);
        Item rooma14key = new Item("a14key", "The key to room a14", 1);
        Item rooma15key = new Item("a15key", "The key to room a15", 1);
        Item rooma18key = new Item("secretkey", "Shhhhhhh. This key is a secret... Don't tell anyone.", 1);
        Item rooma19key = new Item("a19key", "The key to room a19", 1);
        Item roomb12key = new Item("b12key", "The key to room b12", 1);
        Item roomb13key = new Item("b13key", "The key to room b13", 1);
        Item roomb17key = new Item("b17key", "The key to room b17", 1);
        Item roomb19key = new Item("b19key", "The key to room b19", 1);
        Item roomc11key = new Item("c11key", "The key to room c11", 1);
        Item roomc16key = new Item("c16key", "The key to room c16", 1);
        Item roomc18key = new Item("c18key", "The key to room c18", 1);
        Item roomc19key = new Item("c19key", "The key to room c19", 1);
        Item roombkey = new Item("bkey", "The key to room Building B", 1);
        Item roomckey = new Item("ckey", "The key to room Building C", 1);
        
        //Healing Items
        Item roomApple = new Item("apple","One of these a day may keep away medically inclined zombies.", 1);
        Item roomMedpak = new Item("medpak","Staple medic kit seen in any proper zombie game.", 1);
        
        //Weapons
        Item roomRocketBelts = new Item("rocketbelts", "Belts with rockets.", 1);
        Item roomShotgun = new Item("shotgun", "The staple weapon in any good zombie game.", 1);
        Item roomMagic = new Item("magic", "\"Mystic Tome of the Arcane\" is written on the cover.", 1);
        Item roomCrysknife = new Item("Crysknife", "A powerful melee weapon that kills any monster in a single hit.", 1);
        Item roomChocoSword = new Item("ChocoboSword", "Sword of the legendary Onion Knight.", 1);
        
        //add items to rooms
        a11.setItemsInRoom(rooma10key);
        a14.setItemsInRoom(roomMedpak);
        a14.setItemsInRoom(rooma15key);
        a12.setItemsInRoom(roomApple);
        b12.setItemsInRoom(roomb13key);
        b15.setItemsInRoom(roomb12key);
        c11.setItemsInRoom(rooma18key);
        c17.setItemsInRoom(roomc11key);
        
        //add enemies
        Zombie sweissman = new Zombie("Mr.Sweissman", "It's Mr.Sweissman", 25, 0, outside, 99);//final boss
        Zombie chem = new Zombie("ChemTeacher","The \"EVIL\" chemistry teacher.",21, 50, outside, 10);//third mini-boss
        Zombie megaMan = new Zombie("MegaMan", "He's a super fighting robot", 15, 20, outside, 5);//first boss
        Zombie cutsMan = new Zombie("CutsMan", "You'll have to play the game atleast 50 times before you can make it to CutsMan.", 12, 10, a15, 3);//first mini-boss
        Zombie ganon = new Zombie("Ganon", "It is written, only Link can defeat Ganon.", 18, 30, outside, 8);//second boss
        Zombie morshu = new Zombie("Morshu", "He can't give credit, come back when your a little, hmmm, richer.", 16, 25, outside, 6);//second mini-boss
        Zombie zombie1 = new Zombie("Zombie","A generic zombie.", 5, 5, a10, 1);
        Zombie zombie2 = new Zombie("Zombie","A zombie with a shotgun.", 4, 6, a12, 1);//shotgun zombie
        Zombie zombie3 = new Zombie("Zombie","A generic zombie.", 5, 7, outside, 1);
        Zombie zombie4 = new Zombie("Zombie","A cheerleader zombie with a chainsaw.", 5, 6, outside, 1);//girl zombie
        Zombie zombie5 = new Zombie("Zombie","A generic zombie.", 5, 5, outside, 1);
        Zombie zombie6 = new Zombie("Zombie","A generic zombie.", 5, 7, outside, 1);
        Zombie zombie7 = new Zombie("Zombie","A generic zombie.", 5, 8, outside, 1);
        Zombie zombie8 = new Zombie("Zombie","A generic zombie.", 5, 9, outside, 1);
        Zombie zombie9 = new Zombie("Zombie","A generic zombie.", 5, 8, outside, 1);
        Zombie zombie10 = new Zombie("Zombie","A generic zombie.", 5, 7, outside, 1);
        Zombie zombie11 = new Zombie("Zombie","A generic zombie.", 5, 9, outside, 1);
        Zombie zombie12 = new Zombie("Zombie","A generic zombie.", 5, 10, outside, 1);
        Zombie zombie13 = new Zombie("Zombie","A generic zombie.", 5, 11, outside, 1);
        Zombie zombie14 = new Zombie("Zombie","A generic zombie.", 5, 10, outside, 1);
        Zombie zombie15 = new Zombie("Zombie","A generic zombie.", 5, 9, outside, 1);
        Zombie zombie16 = new Zombie("SecretZombie","A peculiar weapon concealing zombie.", 20, 13, outside, 1);//secret zombie
        Zombie zombie17 = new Zombie("Zombie","A generic zombie.", 5, 13, outside, 1);
        Zombie zombie18 = new Zombie("Zombie","A generic zombie.", 5, 13, outside, 1);
        Zombie zombie19 = new Zombie("Zombie","A generic zombie.", 5, 13, outside, 1);

        //add attacks
        Attack doNothing = new Attack("does nothing...", 0);//Zaq: First attack should always be a do nothing type of attack
        Attack weakRub = new Attack("brushes against you, ouch.", 2);//low power attack added for testing, not very good
        Attack weakScratch = new Attack("scratches you with it's claws.", 4);//zombie weak claw attack
        Attack shotgunSmack = new Attack("clubs you with a shotgun", 3);//for shotgun weilding zombie2
        Attack megaBuster = new Attack("fires his transforming arm cannon.", 3);//megaman's main weapon, might enter into array 2 or 3 times for more frequency
        Attack doubleMegaBuster = new Attack("uses both his arm cannons to fire a more powerful blast, bet you didn't know he could do that.", 6);//megaman
        Attack hyperShell = new Attack("fires a giant bazooka that does massive damage, if it was upgraded correctly.", 5);//megaman
        Attack scizzors = new Attack("cuts, and he doesn't mean hair.", 4);//CutsMan doesn't cut hair
        Attack kungFu = new Attack("uses kung-fu to beat you senseless.", 3);//CutsMan becomes Kung-Fu Cutman
        Attack yourFace = new Attack("says \"Join me and I will make your face the greatest in  Koridai, or else you will die\", that hurt your pride.", 4);//ganon's taunt attack
        Attack bombs = new Attack("throws bombs at you, \"It's yours my friend.\"", 3);//morshu's bomb attack
        
        //attacks for zombie1
        zombie1.setBehavior(doNothing);
        zombie1.setBehavior(weakRub);
        
        //attacks for zombie2
        zombie2.setBehavior(doNothing);
        zombie2.setBehavior(weakRub);
        zombie2.setBehavior(shotgunSmack);
        
        //attacks for zombie3
        zombie3.setBehavior(doNothing);
        zombie3.setBehavior(weakRub);
        
        //attacks for zombie4
        zombie4.setBehavior(doNothing);
        zombie4.setBehavior(weakRub);
        
        //attacks for zombie5
        zombie5.setBehavior(doNothing);
        zombie5.setBehavior(weakRub);
        
        //attacks for zombie16
        zombie16.setBehavior(doNothing);
        zombie16.setBehavior(weakRub);
        
        //attacks for MegaMan
        megaMan.setBehavior(doNothing);
        megaMan.setBehavior(megaBuster);
        megaMan.setBehavior(hyperShell);
        
        //attacks for CutsMan
        cutsMan.setBehavior(doNothing);
        cutsMan.setBehavior(kungFu);
        cutsMan.setBehavior(scizzors);
        
        //attacks for Ganon
        ganon.setBehavior(doNothing);
        ganon.setBehavior(yourFace);
        
        //attacks for Morshu
        morshu.setBehavior(doNothing);
        
        //attacks for Mr.Sweissman
        sweissman.setBehavior(doNothing);

        //put enemies in rooms
        a10.setEnemy(zombie1);
        a12.setEnemy(zombie2);
        a15.setEnemy(zombie3);
        a16.setEnemy(zombie4);
        a17.setEnemy(zombie5);
        a18.setEnemy(zombie16);
        a15.setEnemy(cutsMan); //mini-boss
        a19.setEnemy(megaMan); //1st boss
        b11.setEnemy(zombie6);
        b12.setEnemy(zombie7);
        b16.setEnemy(zombie8);
        b17.setEnemy(zombie9);
        b18.setEnemy(zombie10);
        b13.setEnemy(morshu); //2nd mini-boss
        b19.setEnemy(ganon); //2nd boss
        buildingC.setEnemy(zombie11);
        c10.setEnemy(zombie12);
        c13.setEnemy(zombie13);
        c15.setEnemy(zombie14);
        c16.setEnemy(zombie15);
        c18.setEnemy(zombie17);
        c12.setEnemy(chem); //3rd mini-boss
        c19.setEnemy(sweissman); //Final boss

        //give items to zombies
        //Building A Zombies
        zombie1.addItem(rooma14key);
        zombie2.addItem(roomShotgun);
        cutsMan.addItem(rooma19key);
        megaMan.addItem(roombkey);
        
        //Building B Zombies
        zombie8.addItem(roomb17key);
        morshu.addItem(roomb19key);
        ganon.addItem(roomckey);
        
        //Building C Zombies
        zombie11.addItem(roomc18key);
        zombie15.addItem(roomc16key);
        chem.addItem(roomc19key);
        zombie16.addItem(roomCrysknife);
        
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
        System.out.println("The academy has been overrun by zombies... \nTake them all out and take out the source of the infection.");
        System.out.println("Enter \"Help\" if you need assistance.");//add in sarcastic comments...
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
            System.out.println("Would you like to buy soda for $2.00?");
            System.out.print("> ");
            answer = keyboard.nextLine();
            if (answer.equals("yes"))
            {
                if(p1.getCash() >= 200)
                {
                    if(p1.getHitpoints() < p1.getMaxHitpoints())
                    {
                        System.out.println("Great that will be $2.00");
                        p1.setCash(p1.getCash() - 200);
        
                        System.out.println("You have " + "$" + p1.getCash() + ". Have a nice day!");
                        p1.setHitpoints((p1.getHitpoints() + 2));
                        System.out.println("Your health is " + p1.getHitpoints() + ".");
                    }
                    else
                    {
                        p1.setCash(p1.getCash() + 200);
                        System.out.println("Wait...You don't need this.." + "$\n" + "Your wallet holds: $" + p1.getCash());                   
                    }
                }
                else
                {
                    System.out.println("You don't have enough money... Get a job you bum.");
                }
            }
            else
            {
                System.out.println(currentRoom.getLongDescription());
            }
        }
    }
}
