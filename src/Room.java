import java.util.ArrayList;

public class Room {

    private String description;
    final private String name;
    final private int roomNumber;
    private ArrayList<Item> loot;
    Map map = new Map();

    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room(String name, int roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public Room(String name, int roomNumber, ArrayList loot){
        this.name = name;
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
}

