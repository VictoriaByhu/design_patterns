package behavioral.observer;

public class VideoFan implements Subscriber {
    private String name;

    public VideoFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Hi, " + name + "! New video: " + videoTitle);
    }
}
