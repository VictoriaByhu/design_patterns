package behavioral.state;

public class PlayerContext {
    private State state;

    public PlayerContext() {
        state = new HealthyState(); // Початковий стан
    }

    public void setState(State state) {
        this.state = state;
    }

    public void performAction() {
        state.pressAction(this); // Делегуємо роботу поточному стану
    }
}
