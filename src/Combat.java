import java.util.Random;
import java.util.Scanner;

public class Combat {

    Scanner scanner = new Scanner(System.in);
    Enemy currentEnemy = new Enemy();
    Random random = new Random();




    public void fight(Enemy currentEnemy, Player player){
        setCurrentEnemy(currentEnemy);
        String fightOrFlee;
        boolean fight = true;



        do{

            if(random.nextInt(11) > 2) {
                currentEnemy.damageToHealth(player.getDamage());
                System.out.println("You hit " + currentEnemy.getName() + ". For " + player.getDamage() + " damage.");
            }
            if(random.nextInt(11) > 2 && currentEnemy.getHealth() > 0) {
                if (player.getHealth() > 50) {
                    player.damageToHealth(currentEnemy.getDamage());
                    System.out.println(currentEnemy.getName() + " hit you for " + currentEnemy.getDamage() + " damage. You have " + player.getHealth() + " health left.");
                    if (player.getHealth() <= 50) {
                        System.out.println("Would you like to keep fighting or flee?");
                        fightOrFlee = scanner.nextLine();
                        if(fightOrFlee.equalsIgnoreCase("flee")){
                            fight = false;
                            System.out.println("You ran like a little bitch!!");
                        }
                    }
                }
                else if (player.getHealth() > 30) {
                    player.damageToHealth(currentEnemy.getDamage());
                    System.out.println(currentEnemy.getName() + " hit you for " + currentEnemy.getDamage() + " damage. You have " + player.getHealth() + " health left.");
                    if (player.getHealth() <= 30) {
                        System.out.println("Would you like to keep fighting or flee?");
                        fightOrFlee = scanner.nextLine();
                        if(fightOrFlee.equalsIgnoreCase("flee")){
                            fight = false;
                            System.out.println("Probably wise decision.");
                        }
                    }
                }
                else if (player.getHealth() <= 30) {
                    player.damageToHealth(currentEnemy.getDamage());
                    System.out.println(currentEnemy.getName() + " hit you for " + currentEnemy.getDamage() + " damage. You have " + player.getHealth() + " health left.");
                }
            }
            if (player.getHealth() < 1)
                System.out.println("You lost the fight.");
            if (currentEnemy.getHealth() < 1)
                System.out.println("You have defeated " + currentEnemy.getName() + ".");


        }while(player.getHealth() > 0 && currentEnemy.getHealth() > 0 && fight);

    }

    public void setCurrentEnemy(Enemy newEnemy){
        this.currentEnemy = newEnemy;
    }
    }



