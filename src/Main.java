public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Braveheart mel = new Braveheart("Mel", "Chief", 12345);
        mel.dropBomb();
        mel.sleep();
        mel.useSword();
        mel.speak();


        ArmySoldier joe = new ArmySoldier("Joe", "Corporal", 67890);
        joe.dropBomb();
        joe.useSword();
        joe.speak();
        joe.sleep();

        Bomb newBomber = new Bomb("Carl", "Lieutenant", 56743);
        newBomber.makeBomb();
        System.out.println(newBomber.toString());



    }
}
