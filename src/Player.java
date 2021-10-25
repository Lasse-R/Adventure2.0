import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    ArrayList<Item> inventory = new ArrayList<>();
    Item currentItem;

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void moveNorth() {
        setCurrentRoom(getCurrentRoom().getNorth());
    }

    public void moveEast() {
        setCurrentRoom(getCurrentRoom().getEast());
    }

    public void moveSouth() {
        setCurrentRoom(getCurrentRoom().getSouth());
    }

    public void moveWest() {
        setCurrentRoom(getCurrentRoom().getWest());
    }

    public Room invalidRouteNorth() {
        return getCurrentRoom().getNorth();
    }

    public Room invalidRouteEast() {
        return getCurrentRoom().getEast();
    }

    public Room invalidRouteSouth() {
        return getCurrentRoom().getSouth();
    }

    public Room invalidRouteWest() {
        return getCurrentRoom().getWest();
    }

    public String roomName() {
        return currentRoom.getName();
    }

    public String lookAround() {
        return currentRoom.roomLoot();
    }

    public void takeItem(String pickItemName) {
        for (int i = 0; i < currentRoom.getLoot().size(); i++) {
            currentItem = currentRoom.getLoot().get(i);
            if (currentItem.getName().equalsIgnoreCase(pickItemName)) {
                inventory.add(currentItem);
                getCurrentRoom().getLoot().remove(i);
            }
        }
    }

    public void dropItem(String itemName){
        for(int i = 0; i < inventory.size(); i++){
            currentItem = inventory.get(i);
            if(inventory.get(i).getName().equalsIgnoreCase(itemName)){
                inventory.remove(i);
                getCurrentRoom().getLoot().add(currentItem);
            }
        }

    }

    public void showInventory(){
        System.out.println(inventory.toString());
    }

}

