package TheOtherPackage;
// non abstract = concrete
public class Rose extends Flower {
    private int thorns = 1;

    public Rose(String name, String color, double height, int thorns){
        super(name,color,height,1);
        this.thorns = thorns;
    }

    // Overload - same function name, same return type - different wither order, number of parameters
    public Rose(String name, double height, int thorns){
        super(name,"red",height,1);
        this.thorns = thorns;
    }

    // Overload
    public Rose(String name, String color, double height){
        super(name,color,height,1);
    }

    public int getThorns() {
        return thorns;
    }

    public void setThorns(int thorns) {
        this.thorns = thorns;
    }

    @Override
    public void grow() {
        this.thorns++;
        super.grow();
    }
}
