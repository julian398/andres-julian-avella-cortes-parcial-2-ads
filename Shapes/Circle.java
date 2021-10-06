package Shapes;

public class Circle extends Shape {

    @Override
    public void setName() {
        this.name = "Circle";
    }

    @Override
    public void setareaCalculator() {
        areaCalculator = "Pi * r^2";
    }

    @Override
    public void setPerimeterCalculator() {
        perimeterCalculator = "2 * Pi * r";
    }

    @Override
    public void setVolumeCalculator() {
        volumeCalculator = "Doesn't have a volume";
    }

}
