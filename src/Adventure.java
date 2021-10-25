import java.util.Scanner;

public class Adventure {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        boolean gameActive = true;
        Map map = new Map(); // creating map
        Player player = new Player(); // creating player
        Message message = new Message();
        System.out.println(message.intro()); //prints the welcome message and instructions on start-up
        player.setCurrentRoom(map.roomCreation()); //places the player in room one and creates the map.
        System.out.println(player.roomName()); //prints current room at the start of the game

        while (gameActive) {

            String playerInput;
            System.out.print("Input: ");
            playerInput = scanner.nextLine();

            if (playerInput.equalsIgnoreCase("north") ||
                    playerInput.equalsIgnoreCase("n")) { //move north
                if (player.invalidRouteNorth() == null)
                    System.out.println("You Cannot Go That Way.");
                else {
                    player.moveNorth();
                    System.out.println("Going North");
                    System.out.println(player.roomName());
                }

            } else if (playerInput.equalsIgnoreCase("east") ||
                    playerInput.equalsIgnoreCase("e")) { //move east
                if (player.invalidRouteEast() == null)
                    System.out.println("You Cannot Go That Way.");
                else {
                    player.moveEast();
                    System.out.println("Going East");
                    System.out.println(player.roomName());
                }

            } else if (playerInput.equalsIgnoreCase("south") ||
                    playerInput.equalsIgnoreCase("s")) { //move south
                if (player.invalidRouteSouth() == null)
                    System.out.println("You Cannot Go That Way.");
                else {
                    player.moveSouth();
                    System.out.println("Going South");
                    System.out.println(player.roomName());
                }

            } else if (playerInput.equalsIgnoreCase("west") ||
                    playerInput.equalsIgnoreCase("w")) { //move west
                if (player.invalidRouteWest() == null)
                    System.out.println("You Cannot Go That Way.");
                else {
                    player.moveWest();
                    System.out.println("Going West");
                    System.out.println(player.roomName());
                }

            } else if (playerInput.equalsIgnoreCase("look")) { //look for items and secrets
                System.out.println("Looking For Stuff In This Room.");
                if (player.lookAround().equals("[]")) {
                    System.out.println("There Are No Items In This Room.");
                } else {
                    System.out.println(player.lookAround());
                }
                if (player.invalidRouteNorth() == null && player.invalidRouteWest() == null &&
                        player.invalidRouteEast() == null) {
                    System.out.println(message.xyzzy());
                }
            }

            else if (playerInput.equalsIgnoreCase("take")) { //add items to inventory
                System.out.println("Picked up room item(PH)");
            }

            else if (playerInput.equalsIgnoreCase("drop")) { //remove items from inventory
                System.out.println("removing item from inventory(PH)");
            }

            else if (playerInput.equalsIgnoreCase("inventory")) { //Look up what is in inventory
                System.out.println("Your inventory consists of: ");
            }

            else if (playerInput.equalsIgnoreCase("commands")) { //prints list of commands
                System.out.println("| North | East | South | West | Look | Take | Drop | Inventory | Commands | Quit |");
            }

            else if (playerInput.equalsIgnoreCase("quit")) { //quits the game
                System.out.println("Quitting Game!");
                gameActive = false;
            }

            else if (playerInput.equalsIgnoreCase("xyzzy")) {
                System.out.println(message.key());
                gameActive = false;
            } else {
                System.out.println(message.invalid());
            }
        }
    }
}









