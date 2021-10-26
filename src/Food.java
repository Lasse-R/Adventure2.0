public class Food extends Item {

    private String taste;
    private int HP;

    public Food(String name,int weight, String taste,int HP){
        super(name, weight);
        this.taste = taste;
        this.HP = HP;
    }

    public Food() {

    }

    public int getHP(){
        return HP;
    }

    public String getTaste(){
        return taste;
    }

    public String toString(){
        return this.getName();
    }
}
