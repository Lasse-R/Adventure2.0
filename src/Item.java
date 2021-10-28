public abstract class Item {

    private String name;
    private int HP;
    private int damage;

    public Item() {}

    public Item(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHP(){
        return HP;
    }


    public String toString(){
        return "Item: " + name;
    }
    public int getDamage(){
        return damage;
    }
}
