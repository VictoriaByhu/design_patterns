package structural.bridge;

public class Radio implements Device {
    public void turnOn() { System.out.println("Radio on"); }
    public void turnOff() { System.out.println("Radio off"); }
    public void setChannel(int ch) { System.out.println("Radio: frequency " + ch); }
}
