package behavioral.command;

public class MoveForwardCommand implements Command {
    private GameCharacter character;

    public MoveForwardCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.moveForward();
    }

    @Override
    public void undo() {
        character.moveBack();
    }
}
