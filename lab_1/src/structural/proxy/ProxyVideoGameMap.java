package structural.proxy;

public class ProxyVideoGameMap implements VideoGameMap{
    private RealVideoGameMap realMap;
    private String fileName;

    public ProxyVideoGameMap(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realMap == null) {
            realMap = new RealVideoGameMap(fileName);
        }
        realMap.display();
    }
}
