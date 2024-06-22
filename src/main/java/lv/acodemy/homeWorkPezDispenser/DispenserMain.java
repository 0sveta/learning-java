package lv.acodemy.homeWorkPezDispenser;

public class DispenserMain {
    public static void main(String[] args) {

        PezDispenser firstDispenser = new PezDispenser();
        System.out.println(firstDispenser);

        firstDispenser.setName("Hulk");
        firstDispenser.setColor("green");
        firstDispenser.setSeries("Marvel");
        firstDispenser.setMaxAmount(15);
        firstDispenser.setAmount(14);
        System.out.println(firstDispenser);

        firstDispenser.giveAwayCandy(8);
        firstDispenser.takeCandy();
        firstDispenser.takeOneCandy();
        firstDispenser.loadAll();
        firstDispenser.loadOne();
        firstDispenser.addCandy(5);


    }


}
