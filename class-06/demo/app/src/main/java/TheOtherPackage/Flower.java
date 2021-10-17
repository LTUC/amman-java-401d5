package TheOtherPackage;

public abstract class Flower extends Plant {  // abstract class -> I cannot create objects / instances from

    private int petal;

    public Flower(String name, String color, double height, int petal){
        super(name,color,height);
        this.petal = petal;
    }

    public int getPetal() {
        return petal;
    }

    public void setPetal(int petal) {
        this.petal = petal;
    }

    @Override
    public void grow() {
        this.setHeight(this.getHeight()+1);
    }
}
