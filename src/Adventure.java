import java.util.Locale;
import java.util.Scanner;

public class Adventure {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player(69); // creating player with a nice amount of hp
        Message message = new Message();    // message board created
        Map map = new Map(); // creating map

        boolean gameActive = true;
        String itemName;

        player.setCurrentRoom(map.roomCreation()); //places the player in room one and creates the map.

        System.out.println(message.intro()); //prints the welcome message and instructions on start-up
        System.out.println(player.roomName() + "\n" + player.getRoomDescription()); //prints current room at the start of the game

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
                    System.out.println(player.getRoomDescription());
                }

            }
             else if (playerInput.equalsIgnoreCase("east") ||
                    playerInput.equalsIgnoreCase("e")) { //move east
                if (player.invalidRouteEast() == null)
                    System.out.println("You Cannot Go That Way.");
                else {
                    player.moveEast();
                    System.out.println("Going East");
                    System.out.println(player.roomName());
                    System.out.println(player.getRoomDescription());

                }

            } else if (playerInput.equalsIgnoreCase("south") ||
                    playerInput.equalsIgnoreCase("s")) { //move south
                if (player.invalidRouteSouth() == null)
                    System.out.println("You Cannot Go That Way.");
                else {
                    player.moveSouth();
                    System.out.println("Going South");
                    System.out.println(player.roomName());
                    System.out.println(player.getRoomDescription());
                    if(player.checkForEnemy() != true){
                        System.out.println(message.noEnemy());
                    }
                }

            } else if (playerInput.equalsIgnoreCase("west") ||
                    playerInput.equalsIgnoreCase("w")) { //move west
                if (player.invalidRouteWest() == null)
                    System.out.println("You Cannot Go That Way.");
                else {
                    player.moveWest();
                    System.out.println("Going West");
                    System.out.println(player.roomName());
                    System.out.println(player.getRoomDescription());
                }
             }
            else if(playerInput.toLowerCase(Locale.ROOT).contains("eat ")){    // eats something in one sentence
                itemName = playerInput.substring(4);
                player.eatFood(itemName);
            }
                else if (playerInput.equalsIgnoreCase("eat")) {
                System.out.println("What would you like to eat?");
                player.showFood();
                itemName = scanner.nextLine();
                player.eatFood(itemName);
            }
                else if(playerInput.equalsIgnoreCase("health")){
                    player.showHealth();
            }
             else if (playerInput.equalsIgnoreCase("look")) { //look for items and secrets
                System.out.println("Looking For Stuff In This Area.");
                if (player.lookAround().equals("[]")) {
                    System.out.println("There Are No Items In This Area.");
                } else {
                    System.out.println(player.lookAround());
                }
                if (player.getCurrentRoom().getRoomNumber() == 5) {
                    System.out.println(message.xyzzy());
                }
            }
            else if(playerInput.toLowerCase(Locale.ROOT).contains("take ")){    // picks up something in one sentence
                itemName = playerInput.substring(5);
                player.takeItem(itemName);
            }
            else if (playerInput.equalsIgnoreCase("take")) {//add items to inventory
                player.getCurrentRoom().showLoot();
                System.out.print("Which item would you like to pick up? ");
                itemName = scanner.nextLine();
                player.takeItem(itemName);

            }
            else if(playerInput.toLowerCase(Locale.ROOT).contains("drop ")){    // drops something in one sentence
                itemName = playerInput.substring(5);
                player.dropItem(itemName);
            }

            else if(playerInput.toLowerCase(Locale.ROOT).contains("equip ")){    // equips something in one sentence
                itemName = playerInput.substring(6);
                player.equipItem(itemName);
            }

            else if (playerInput.equalsIgnoreCase("drop")) { //remove items from inventory
                player.showInventory();
                System.out.print("Which item would you like to drop? ");
                itemName = scanner.nextLine();
                player.dropItem(itemName);
            }


            else if (playerInput.equalsIgnoreCase("inventory") || playerInput.equalsIgnoreCase("i")) {//Look up what is in inventory
                player.showInventory();
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
            if(player.getHealth() < 1){
                message.youDied();
                gameActive = false;
            }
        }
    }

}









