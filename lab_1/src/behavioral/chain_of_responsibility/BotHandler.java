package behavioral.chain_of_responsibility;

public class BotHandler extends SupportHandler {
    public void handleRequest(String issue, int level) {
        if (level <= 1) {
            System.out.println("Bot: I dropped you the instructions for: " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, level);
        }
    }
}


