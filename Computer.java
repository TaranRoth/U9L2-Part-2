public class Computer extends Device {
    private boolean hasMouse;

    public Computer(String name, int powerRemaining, boolean hasMouse) {
        super(name, powerRemaining);
        this.hasMouse = hasMouse;
    }

    public void buyMouse() {
        this.hasMouse = true;
        System.out.println("You finally bought a mouse, good job."); 
    }
}
