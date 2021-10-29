public class Ranged extends Weapon{

    private int ammo;
    private int damageRanged;

    public Ranged(String name, int damage, int ammo, int damageRanged){
        super(name, damage);
        this.ammo = ammo;
        this.damageRanged = damageRanged;
    }
    public int getDamage(){
        return super.getDamage();
    }
    public int damageWithAmmunition(){

        if(getAmmo() > 0){

           return getDamageRanged();
        }
        else{

            return super.getDamage();
        }

    }
    public void setDamage(int damage){
        super.setDamage(damage);
    }
    public void useAmmo(){
        this.ammo = (getAmmo() - 1);
    }
    public int getAmmo(){
        return ammo;
    }
    public int getDamageRanged(){
        return damageRanged;
    }
}
