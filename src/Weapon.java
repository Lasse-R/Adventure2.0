public abstract class Weapon extends Item {

    private int damage;

    public Weapon() {

    }

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String toString() {
        return this.getName();
    }

}
