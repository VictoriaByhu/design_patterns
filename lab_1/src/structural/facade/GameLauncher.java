package structural.facade;

public class GameLauncher {
    private GraphicsEngine graphics = new GraphicsEngine();
    private SoundSystem sound = new SoundSystem();
    private PhysicsEngine physics = new PhysicsEngine();

    public void startLevel(){
        System.out.println("--- Preparing to start the level ---");
        graphics.init();
        sound.loadMusic();
        physics.applyGravity();
        System.out.println("--- Game started! ---");
    }
}
