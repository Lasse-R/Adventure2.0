import java.util.ArrayList;

public class Map {

    Item sword = new Weapon("Two-Handed Sword", 50, 5);
    Item hammer = new Weapon("An Ordinary Hammer", 50, 5);
    Item mace = new Weapon("Small Wooden Mace", 50, 5);
    Item spear = new Weapon("Rather Large Spear", 50, 5);
    Item cutlass = new Weapon("Pirates Cutlass", 50, 5);
    Item bread = new Food("Stale Old Bread", 1, "Stale");
    Item apple = new Food("Rotten Stinking Apple", 1, "Stale");
    Item oats = new Food("Roach Infested Oats", 1, "Stale");
    Item snickers = new Food("Half-Eating Snickers Bar", 1, "Stale");
    Item twix = new Food("Twix", 1, "Stale");


    public Room roomCreation() {//creating all the rooms and assigning pathways

        ArrayList<Item> loot1 = new ArrayList<>();
        ArrayList<Item> loot2 = new ArrayList<>();
        ArrayList<Item> loot3 = new ArrayList<>();
        ArrayList<Item> loot4 = new ArrayList<>();
        ArrayList<Item> loot5 = new ArrayList<>();
        ArrayList<Item> loot6 = new ArrayList<>();
        ArrayList<Item> loot7 = new ArrayList<>();
        ArrayList<Item> loot8 = new ArrayList<>();
        ArrayList<Item> loot9 = new ArrayList<>();

        Room room1 = new Room("You Find Yourself In A Dark Room With Mossy Walls.", 1, loot1);
        Room room2 = new Room("You Find Yourself On A Dimly Lit Swirly Staircase.", 2, loot2);
        Room room3 = new Room("You Find Yourself In A Cold And Abandoned Wine Cellar.", 3, loot3);
        Room room4 = new Room("You Find Yourself In A Long And Narrow Hallway With Torches On The Walls.", 4, loot4);
        Room room5 = new Room("You Find Yourself In A Large Room, There's Something Unusual About This Place.", 5, loot5);
        Room room6 = new Room("You Find Yourself In A Small, Almost Claustrophobic Tract That Only Seems To Lead In One Direction.", 6, loot6);
        Room room7 = new Room("You Find Yourself In What Seems To Be A Huge Dining Room.", 7, loot7);
        Room room8 = new Room("You Find Yourself In A Huge Corridor, There Seems To Be Three Passageways Here.", 8, loot8);
        Room room9 = new Room("You Find Yourself In A Dungeon Full Of Small Prison Cells.", 9, loot9);

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setEast(room3);
        room2.setWest(room1);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);

        loot1.add(sword);
        loot3.add(hammer);
        loot5.add(mace);
        loot5.add(twix);
        loot5.add(snickers);
        loot7.add(oats);
        loot7.add(bread);
        loot7.add(apple);
        loot9.add(cutlass);
        loot9.add(spear);


        return room1;
    }

}
