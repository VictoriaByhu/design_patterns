package behavioral.state;

public class HealthyState implements State {
    public void pressAction(PlayerContext player) {
        System.out.println("The character makes a quick dash forward!");
    }
}
