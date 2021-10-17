package TheOtherPackage;

public abstract class Plant {    // by default extending Object (concrete class)
    // abstract classes can have 0 or more abstract methods

    private String name;
    private double height;
    private String color;

    public Plant(String name, String color,double height) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    abstract public void grow();    // an abstract method is a one that doesn't have implementation
                                    // abstract methods can only be added to abstract classes
                                    // if I have an abstract method in a class, that class should be abstract


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
