package Shapes;

public abstract class Shape {
    protected String name;

    protected String perimeterCalculator;

    protected String areaCalculator;

    protected String volumeCalculator;

    public abstract void setName();

    public abstract void setPerimeterCalculator();

    public abstract void setareaCalculator();

    public abstract void setVolumeCalculator();

    String getName() {
        return this.name;
    }

    public String getArea() {
        return this.areaCalculator;
    }

    public String getPerimeter() {
        return this.perimeterCalculator;
    }

    public String getVolume() {
        return this.volumeCalculator;
    }
}