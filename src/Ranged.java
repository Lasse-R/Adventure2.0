public class Ranged extends Weapon {

  private int ammo;

  public Ranged(String name, int damage, int ammo) {
    super(name, damage);
    this.ammo = ammo;
  }
    public int getDamage(){
        return super.getDamage();
    }


}
