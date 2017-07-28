public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Viking sven = new Viking("Sven", "Viking Chief", 12345);
        sven.fire();
        sven.sleep();
        sven.useWeapon();
        sven.speak();


        RomanSoldier brutus = new RomanSoldier("Brutus", "Corporal", 67890);
        brutus.fire();
        brutus.useWeapon();
        brutus.speak();
        brutus.sleep();

        Bomb newBomber = new Bomb("Carl", "Lieutenant", 56743);
        newBomber.makeBomb();
        System.out.println(newBomber.toString());



    }
}
