import java.util.Scanner;

public class Message {

    Scanner scanner = new Scanner(System.in);

    String playerInput;

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public String intro() { //The game startup message
        return TEXT_PURPLE + """

                Welcome To The Adventure Room Project Game!
                -------------------------------------------
                You Will Have To Use These Simple Commands To Find The Secret Room.
                ---------------------------|COMMAND LIST|---------------------------
                | North | East | South | West | Look | Take | Drop | Inventory | Commands | Quit |
                ----------------------------------------------------------------------------------
                The Secret Room Contains The Key To Your Salvation! GOOD LUCK!
                --------------------------------------------------------------""" + TEXT_RESET;
    }

    public String xyzzy() { //The key to salvation
        return "The Word '" + TEXT_CYAN + "Xyzzy" + TEXT_RESET + "' Appears To Be Chiseled On The Stone Wall.\n" +
                "What On Earth Could That Mean?";
    }

    public String key() { //For when the user types Xyzzy
        return TEXT_BLUE + """
                You Utter The Weird Word Written On The Wall.
                All Of A Sudden You Are Stunned By A Bright Flash Of Light!
                As Your Vision Returns, You Find Yourself Out Of The Strange Dungeon.
                You Are Free Once Again, CONGRATULATIONS!
                """ + TEXT_RESET;
    }
    public void lowHealth(int health){
        System.out.println("You have " + health + " health points left.\nYour health seems to have deteriorated to an critical state." +
                "\nFinding food should be priority number one.");
    }
    public void medHealth(int health){
        System.out.println("You have " + health + " health points left.\nThings arent out of control yet, but be careful." +
                "\nFinding something to eat would be nice.");
    }
    public void highHealth(int health){
        System.out.println("You have " + health + " health points left.\nGo get them, champ!!" +
                "\nWho cares about food, just bash in some skulls!");
    }
    public void sixtyNine(int health){
        System.out.println("You have " + health + " health points left. NICE!!!!");
    }
    public void notThere(){
        System.out.println("There is no such thing in this area.");
    }
    public void somethingsHere(String something){
        System.out.println("You picked up " + something + ".");
    }
    public void youDied(){
        System.out.println("Unfortunately you have been killed inside the caves. A real shame, so much potential wasted:(" +
                "\n                  GAME IS OVER!!!");
    }

    public void noWeapon() {
        System.out.println("It's either not a weapon or you don't have it, STOOPID.");
    }

    public String invalid(){ //Always assume the user is trying to crash your program
        return TEXT_RED + "Invalid Input!" + TEXT_RESET;
    }

    public void equipWeapon(Weapon weapon) {
        System.out.println("You have equipped " + weapon.getName() + ". Your weapon deals " + weapon.getDamage() + " damage.") ;
    }
    public void equipWeapon(Ranged weapon) {
        System.out.println("You have equipped " + weapon.getName() + ". Your weapon deals " + weapon.getDamageRanged() + " damage if you have ammunition." +
                " Otherwise it deals " + weapon.getDamage() + " damage. You have " + weapon.getAmmo() + " pieces of ammunition.");
    }

    public String noEnemy(){
        return "There is no enemy here!";
    }
    public void cantGoThatWay(){
        System.out.println("You Cannot Go That Way.");
    }
    public void goingDirection(String direction){
        if(direction.equalsIgnoreCase("w"))
            System.out.println("Going west.");
        else if(direction.equalsIgnoreCase("e"))
            System.out.println("Going east.");
        else if(direction.equalsIgnoreCase("n"))
            System.out.println("Going north.");
        else if(direction.equalsIgnoreCase("s"))
            System.out.println("Going south.");
        else
            System.out.println("Going " + direction + ".");
    }

    public boolean enemyChoices(Enemy currentEnemy){
        boolean fight = true;
        System.out.println("A " + currentEnemy.getName() + " is staring at you. Fight or flee?");
        do{
        playerInput = scanner.nextLine();
        if(playerInput.equalsIgnoreCase("fight"))
            fight = true;
        else if(playerInput.equalsIgnoreCase("flee"))
            fight = false;
        else
            System.out.println("Invalid output.");}
        while(!playerInput.equalsIgnoreCase("fight") && !playerInput.equalsIgnoreCase("flee"));
        return fight;
    }
}
