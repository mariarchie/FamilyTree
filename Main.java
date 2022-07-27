import java.util.*;

public class Main {

    public static void main(String[] args) {

        Family m = new Family("John1");
        m.addChild("John2", "John1");
        m.addChild("Mike", "John1");
        m.addChild("Fred", "Mike");
        m.addChild("Krec", "Fred");
        m.addChild("Adam", "Krec");
        List<String> list = m.getallChildren();
        System.out.println(list.toString());
        Brother ivan = new Brother("John2", "Ivan");
        Brother gosha = new Brother("Fred", "Gosha");
        Brother pir = new Brother("Fred", "Pir");
        ivan.display();
        gosha.display();
        pir.display();
        Collections.sort(list);
        System.out.println("Family members in alphabetic order:\n" + list);

    }
}
