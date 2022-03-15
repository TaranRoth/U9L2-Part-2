import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Device d = new Device("My iPad", 95);
        d.charge(20);
        Computer c = new Computer("My Computer", 30, false);
        c.buyMouse();
        c.charge(50);
        ArrayList<String> contacts = new ArrayList<String>();
        contacts.add("Taran");
        Phone p = new Phone ("My Phone", 1, contacts);
        p.charge(90);
        p.call("Taran");
        p.call("Henry");
    }
}
