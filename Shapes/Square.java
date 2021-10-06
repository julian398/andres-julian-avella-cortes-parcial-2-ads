package Shapes;

public class Square extends Shape {

    @Override
    public void setName() {
        name = "Square";
    }

    @Override
    public void setareaCalculator() {
        areaCalculator = "length * length";
    }

    @Override
    public void setPerimeterCalculator() {
        perimeterCalculator = "4 * length";
    }

    @Override
    public void setVolumeCalculator() {
        volumeCalculator = "Doesn't have a volume";
    }
}
