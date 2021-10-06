package Shapes;

public class Rectangle extends Shape {

    @Override
    public void setName() {
        name = "Rectangle";
    }

    @Override
    public void setareaCalculator() {
        areaCalculator = "length * width";
    }

    @Override
    public void setPerimeterCalculator() {
        perimeterCalculator = "(Length * 2) + (width* 2)";
    }

    @Override
    public void setVolumeCalculator() {
        volumeCalculator = "Doesn't have a volume";
    }
}
