public class Food extends Item {

    private String taste;

    public Food(String name,int weight, String taste){
        super(name, weight);
        this.taste = taste;
    }

    public String toString(){
        return this.getName();
    }
}
