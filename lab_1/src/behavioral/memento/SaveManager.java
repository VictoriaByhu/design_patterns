package behavioral.memento;
import java.util.Stack;

public class SaveManager {
    private Stack<GameSave> history = new Stack<>();

    public void save(GameSave save) {
        history.push(save);
    }

    public GameSave undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
