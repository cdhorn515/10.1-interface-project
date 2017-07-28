/**
 * Created by cdhorn on 7/24/17.
 */
public class RomanSoldier extends Soldier {

    public RomanSoldier(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void fire() {
        System.out.println("Chariots of fire!!!!");
    }

    public void useWeapon() {
        System.out.println("stab with long spear");
    }

    public void speak() {
        System.out.println("Hail Caesar!");
    }
}
