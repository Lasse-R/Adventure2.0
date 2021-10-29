import java.util.ArrayList;

public class Map {

    public Room roomCreation() { //creates all the rooms/items and assigning pathways

        Item sword = new Melee("Sword", 5);
        Item hammer = new Melee("Hammer", 5);
        Item mace = new Melee("Mace", 5);
        Item spear = new Melee("Spear", 5);
        Item bow = new Ranged("Bow", 5, 10);
        Item bread = new Food("Bread", 25);
        Item apple = new Food("Apple", 75);
        Item oats = new Food("Oats", -100);
        Item snickers = new Food("Snickers", 50);
        Item twix = new Food("Twix", 30);
        Item danskVand = new Food("Water", 35);

        Enemy goat = new Enemy("Goat", 45, 4);
        Enemy redDragon = new Enemy("Red Dragon of Doom", 100, 10);
        Enemy bigFatOrc = new Enemy("Orc", 60, 6);
        Enemy yamcha = new Enemy("Yamcha the Wolf Warrior", 10, 1);

        ArrayList<Item> loot1 = new ArrayList<>();
        ArrayList<Item> loot2 = new ArrayList<>();
        ArrayList<Item> loot3 = new ArrayList<>();
        ArrayList<Item> loot4 = new ArrayList<>();
        ArrayList<Item> loot5 = new ArrayList<>();
        ArrayList<Item> loot6 = new ArrayList<>();
        ArrayList<Item> loot7 = new ArrayList<>();
        ArrayList<Item> loot8 = new ArrayList<>();
        ArrayList<Item> loot9 = new ArrayList<>();

        Room room1 = new Room("Enjoyable cave.", "A warm, safe and cozy area.\nDefinitely doesnt LOOK like there are any monsters around here.", 1, loot1);
        Room room2 = new Room(2, loot2);
        Room room3 = new Room(3, loot3);
        Room room4 = new Room(4, loot4);
        Room room5 = new Room(5, loot5);
        Room room6 = new Room(6, loot6);
        Room room7 = new Room(7, loot7);
        Room room8 = new Room(8, loot8);
        Room room9 = new Room(9, loot9);

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
        loot1.add(oats);
        loot7.add(bread);
        loot1.add(apple);
        loot1.add(bow);
        loot9.add(spear);
        loot3.add(danskVand);

        room4.setCurrentEnemy(goat);
        room9.setCurrentEnemy(bigFatOrc);
        room5.setCurrentEnemy(redDragon);
        room7.setCurrentEnemy(yamcha);
        return room1;
    }

}
