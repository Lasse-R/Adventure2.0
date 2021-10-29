public class Food extends Item {


  private int HP;

  public Food(String name, int HP) {
    super(name);
    this.HP = HP;
  }

  public Food() {

  }

  public int getHP() {
    return HP;
  }

  public String toString() {
    return this.getName();
  }
}
