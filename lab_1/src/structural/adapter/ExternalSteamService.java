package structural.adapter;

public class ExternalSteamService {
    public void sendAchievementSignal(int achievementId){
        System.out.println("Steam: Achievement №" + achievementId + " received!");
    }
}
