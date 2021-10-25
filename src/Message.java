public class Message {

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public String intro() { //the game startup message
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

    public String xyzzy() { //the key to salvation
        return "The Word '" + TEXT_CYAN + "Xyzzy" + TEXT_RESET + "' Appears To Be Chiseled On The Stone Wall.\n" +
                "What On Earth Could That Mean?";
    }

    public String key() { //for when you type xyzzy
        return TEXT_BLUE + """
                You Utter The Weird Word Written On The Wall.
                All Of A Sudden You Are Stunned But A Bright Flash Of Light!
                As Your Vision Returns, You Find Yourself Out Of The Weird Dungeon.
                You Are Free Once Again, CONGRATULATIONS!
                """ + TEXT_RESET;
    }

    public String invalid(){
        return TEXT_RED + "Invalid Input!" + TEXT_RESET;
    }
}
