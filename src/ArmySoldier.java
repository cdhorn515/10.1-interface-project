/**
 * Created by cdhorn on 7/24/17.
 */
public class ArmySoldier extends Soldier {

    public ArmySoldier(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void dropBomb() {
        System.out.println("fire away");
    }

    public void useSword() {
        System.out.println("use bayonet");
    }

    public void speak() {
        System.out.println("leave no man behind!");
    }
}
