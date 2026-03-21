package structural.proxy;

public class RealVideoGameMap implements VideoGameMap{
    private String fileName;

    public RealVideoGameMap(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // Імітація важкого завантаження
    }

    private void loadFromDisk() {
        System.out.println("Loading a map '" + fileName + "'... Please wait. (it takes 5 sec)");
    }

    @Override
    public void display() {
        System.out.println("Displaying the map: " + fileName);
    }
}
