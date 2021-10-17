package TheOtherPackage;

public class Tulip extends Flower {

    private int bulbSize;

    public Tulip(String name, String color, double height, int bulbSize){
        super(name,color,height);
        this.bulbSize = bulbSize;
    }

    public int getBulbSize() {
        return bulbSize;
    }

    public void setBulbSize(int bulbSize) {
        this.bulbSize = bulbSize;
    }

    @Override
    public void grow() {
        System.out.println("This is Tulip class grow function");
        super.grow();
        bulbSize++;
    }
}
