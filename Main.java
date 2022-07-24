import java.util.*;

public class Main {
    public static void main(String[] args) {

        Family m = new Family("John1");
        m.birth("John2", "John1");
        m.birth("Mike", "John1");
        m.birth("Fred", "Mike");
        List<String> list = m.getallChildren();
        System.out.println(list.toString());
        Brother ivan = new Brother("John2", "Ivan");
        Brother gosha = new Brother("Fred", "Gosha");
        Brother pir = new Brother("Fred", "Pir");
        ivan.display();
        gosha.display();
        pir.display();
    }
}
