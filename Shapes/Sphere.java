package Shapes;

public class Sphere extends Shape {

    @Override
    public void setName() {
        this.name = "Sphere";
    }

    @Override
    public void setareaCalculator() {
        areaCalculator = "Doesn't have an area";
    }

    @Override
    public void setPerimeterCalculator() {
        perimeterCalculator = "Doesn't have an area";
    }

    @Override
    public void setVolumeCalculator() {
        volumeCalculator = "(4/3) * Pi * r^3";
    }

}
