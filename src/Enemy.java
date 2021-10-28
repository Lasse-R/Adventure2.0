public class Enemy {
    private int health;
    private String name;
    private int damage;

    public Enemy(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public void damageToHealth(int changeAmount){
        this.health = (health - changeAmount);
    }
}
