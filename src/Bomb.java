/**
 * Created by cdhorn on 7/24/17.
 */
public class Bomb extends Soldier implements MoreFighting{

    public Bomb(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void fire() {

    }

    public void useWeapon() {

    }

    public void speak() {

    }

    public Bomb makeBomb() {
        System.out.println("explosion");
        return null;
    }

    public String toString() {
        return "Bomb{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
