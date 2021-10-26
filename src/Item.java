public abstract class Item {

    private String name;
    private int weight;
    private int HP;

    public Item() {}

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    public int getHP(){
        return HP;
    }


    public String toString(){
        return "Item: " + name;
    }

}
