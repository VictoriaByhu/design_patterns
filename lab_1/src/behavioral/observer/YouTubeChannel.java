package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void uploadVideo(String title) {
        System.out.println("The channel is uploading video: " + title);
        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {
        for (Subscriber s : subscribers) {
            s.update(title);
        }
    }
}
