package behavioral.chain_of_responsibility;

public class EngineerHandler extends SupportHandler {
    public void handleRequest(String issue, int level) {
        System.out.println("Engineer: It's complicated, but I'll figure it out: " + issue);
    }
}
