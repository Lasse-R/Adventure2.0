import java.util.ArrayList;

public class Player { // damn this class is bloated

    private int health;
    private int damage;
    private Room currentRoom;
    ArrayList<Item> inventory = new ArrayList<>();
    ArrayList<Item> food = new ArrayList<>();
    Item currentItem;
    Weapon currentWeapon;
    Message msg = new Message();



    public void showFood() {
        food.clear();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) instanceof Food) {
                food.add(inventory.get(i));
            }
        }
        System.out.println(food.toString());
    }

    public Player(int health) {
        this.health = health;
    }
    public void addHealth(int addHealth) {
        this.health = this.health + addHealth;
        if (health > 100) {
            this.health = 100;
        }
    }
    public void lowerHealth(int lowerHealth) {
        this.health = this.health - lowerHealth;
    }

    public int getHealth() {
        return health;
    }

    public void showHealth() {
        if (getHealth() < 36) {
            msg.lowHealth(getHealth());
        }
        if (35 < getHealth() && getHealth() < 76 && getHealth() != 69) {
            msg.medHealth(getHealth());
        }
        if (getHealth() > 75) {
            msg.highHealth(getHealth());
        }
        if (getHealth() == 69) {
            msg.sixtyNine(getHealth());
        }
    }

    public void eatFood(String foodName) {
        boolean check = true;
        for (int i = 0; i < inventory.size(); i++) {

            if (foodName.equalsIgnoreCase(inventory.get(i).getName())) {
                if (inventory.get(i) instanceof Food) {
                    addHealth(inventory.get(i).getHP());
                    System.out.print("You ate the " + foodName + ", and your health is now " + getHealth());
                    if (health == 100) {
                        System.out.print("(max)");
                    }
                    System.out.println(".");
                    inventory.remove(i);
                    check = false;
                }
            }
        }
        if (check) {
            System.out.println("Sorry, you dont actually have that kind of food with you!");
        }
    }

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
    public String getRoomDescription(){
        return currentRoom.getDescription();
    }

    public String lookAround() {
        return currentRoom.roomLoot();
    }

    public boolean checkForEnemy(){
        if(currentRoom.currentEnemy == null || currentRoom.getCurrentEnemyHealth() < 1){
            return false;
        }
        else{
            return true;
        }
    }

    public void takeItem(String pickItemName) {
        boolean check = false;
        for (int i = 0; i < currentRoom.getLoot().size(); i++) {
            currentItem = currentRoom.getLoot().get(i);
            if (currentItem.getName().equalsIgnoreCase(pickItemName)) {
                inventory.add(currentItem);
                getCurrentRoom().getLoot().remove(i);
                msg.somethingsHere(pickItemName);
                check = true;
            }
        }
        if (!check) {
            msg.notThere();
        }
    }

    public void dropItem(String itemName) {
        for (int i = 0; i < inventory.size(); i++) {
            currentItem = inventory.get(i);
            if (inventory.get(i).getName().equalsIgnoreCase(itemName)) {
                inventory.remove(i);
                getCurrentRoom().getLoot().add(currentItem);
            }
        }
    }

    public void equipItem(String pickItemName) {
        boolean check = false;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) instanceof Weapon) {
                currentWeapon = (Weapon) inventory.get(i);
                if (currentWeapon.getName().equalsIgnoreCase(pickItemName)) {

                    if(currentWeapon instanceof Ranged){
                       setDamage((Ranged)currentWeapon);
                        msg.equipWeapon((Ranged)currentWeapon);
                    }
                    else{
                    setDamage(currentWeapon);
                    msg.equipWeapon(currentWeapon);}
                    check = true;
                }
            }
        }
        if (!check) {
            msg.noWeapon();
        }
    }
    public void setDamage(Weapon currentWeapon){
        if(currentWeapon instanceof Ranged){
            this.damage = ((Ranged) currentWeapon).damageWithAmmunition();
        }
        else
            this.damage = currentWeapon.getDamage();
            }
    public void damageToHealth(int changeAmount){
        this.health = (health - changeAmount);
    }

    public void showInventory() {
        System.out.println(inventory.toString());
    }

    public int getDamage() {
        return damage;
        }


    }


