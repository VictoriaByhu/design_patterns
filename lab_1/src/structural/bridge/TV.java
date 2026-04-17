package structural.bridge;

public class TV implements Device {
    public void turnOn() { System.out.println("TV on"); }
    public void turnOff() { System.out.println("TV off"); }
    public void setChannel(int ch) { System.out.println("TV: channel " + ch); }
}
