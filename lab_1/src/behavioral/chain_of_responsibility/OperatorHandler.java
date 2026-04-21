package behavioral.chain_of_responsibility;

public class OperatorHandler extends SupportHandler {
    public void handleRequest(String issue, int level) {
        if (level <= 2) {
            System.out.println("Operator: I will help you figure out: " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, level);
        }
    }
}
