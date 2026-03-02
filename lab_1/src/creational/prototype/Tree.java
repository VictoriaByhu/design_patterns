package creational.prototype;

public abstract class Tree {
    public int x;
    public int y;
    public String color;

    public Tree(){}

    public Tree(Tree target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Tree clone();

    @Override
    public String toString(){
        return "Tree [x=" + x + ", y=" + y + ", color=" + color + "]";
    }
}
