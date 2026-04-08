package structural.adapter;

public class SteamAdapter implements GameAchievements{
    private ExternalSteamService steamService;

    public SteamAdapter(ExternalSteamService steamService){
        this.steamService = steamService;
    }

    @Override
    public void unlockAchievement(String name){
        int id = convertNameToId(name);
        steamService.sendAchievementSignal(id);
    }

    private int convertNameToId(String name){
        if(name.equals("First Blood")) return 1;
        if(name.equals("Winner")) return 2;
        return 0;
    }
}
