package behavioral.state;

public class InjuredState implements State {
    public void pressAction(PlayerContext player) {
        System.out.println("The character barely moves forward...");
    }
}
