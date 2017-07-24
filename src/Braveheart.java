/**
 * Created by cdhorn on 7/24/17.
 */
public class Braveheart extends Soldier{

    public Braveheart(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void dropBomb() {
        System.out.println("No real bombs dropped in the movie, maybe a few f-bombs?");
    }

    public void useSword() {
        System.out.println("slicing motion");
    }

    public void speak() {
        System.out.println("They'll never take our freedom!!!!!!!");
    }
}
