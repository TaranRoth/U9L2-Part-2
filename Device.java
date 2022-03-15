public class Device {
    private String model;
    private int powerRemaining;

    public Device(String model, int powerRemaining) {
        this.model = model;
        this.powerRemaining = powerRemaining;
    }

    public void charge(int amount) {
        powerRemaining += amount;
        if (powerRemaining > 100) powerRemaining = 100;
        System.out.println("Charged to " + this.powerRemaining + "%."); 
    }
}
