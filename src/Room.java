import java.util.ArrayList;

public class Room {

    private String description;
    final private String name;
    final private int roomNumber;
    private ArrayList<Item> loot;
    Enemy currentEnemy;
    Map map = new Map();
    Enemy currentEnemy;
    FluffyRoomDescription fluffyRoomDescription = new FluffyRoomDescription();


    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room(int roomNumber, ArrayList loot) {
        this.name = fluffyRoomDescription.roomName();
        this.description = fluffyRoomDescription.roomDescription();
        this.roomNumber = roomNumber;
        this.loot = loot;
    }

    public Room(String name, String description, int roomNumber, ArrayList loot){
        this.name = name;
        this.description = description;
        this.roomNumber = roomNumber;
        this.loot = loot;
    }

    public ArrayList<Item> getLoot(){
        return loot;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public String getName() {
        return name;
    }

    public String roomLoot(){
        return loot.toString();
    }
    public void showLoot(){
        System.out.println(loot.toString());
    }
    public String getDescription(){
        return description;
    }
    public int getRoomNumber(){
        return roomNumber;
    }

    public void setCurrentEnemy(Enemy currentEnemy) {
        this.currentEnemy = currentEnemy;
    }
    public Enemy getCurrentEnemy(){
        return currentEnemy;
    }
}

