/**
 * Created by cdhorn on 7/24/17.
 */
public abstract class Soldier implements GroundFighting, AirFighting{

    protected String name;
    protected String rank;
    protected int serialNumber;

    public Soldier () {
    }

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public String sleep() {
        System.out.println("zzzz");
        return "zzzzzz";
    }

    public String eat() {
        System.out.println("yummy");
        return "yummy";
    }

    public String walk () {
        System.out.println("steady pace");
        return "steady pace";
    }

    public abstract void speak ();
}
