/**
 * Created by cdhorn on 7/24/17.
 */
public class Viking extends Soldier {

    public Viking(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void fire() {
        System.out.println("Firing ship's cannons!!!!");
    }

    public void useWeapon() {
        System.out.println("Fierce fighting, and even fiercer horns!!!");
    }

    public void speak() {
        System.out.println("We plunder the sea!");
    }
}
