import java.util.ArrayList;
class Phone extends Device {
    private ArrayList<String> contacts;

    public Phone(String name, int powerRemaining, ArrayList<String> contacts) {
        super(name, powerRemaining);
        this.contacts = contacts;
    }

    public void call(String contact) {
        boolean containsContact = false;
        for (String s: contacts) {
            if (s.equals(contact)) containsContact = true;
        }
        if (containsContact) System.out.println("Calling " + contact + "..."); 
        else System.out.println("Couldn't find that contact."); 
    }
}