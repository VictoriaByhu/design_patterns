package behavioral.command;

public class InputHandler {
    private Command buttonW;

    public void setCommand(Command command) {
        this.buttonW = command;
    }

    public void pressButton() {
        buttonW.execute();
    }
}
