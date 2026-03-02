package creational.prototype;

public class PineTree extends Tree{
    public int needLength;

    public PineTree(){}

    public PineTree(PineTree target){
        super(target);
        if(target != null){
            this.needLength = target.needLength;
        }
    }

    @Override
    public Tree clone(){
        return new PineTree(this);
    }
}
