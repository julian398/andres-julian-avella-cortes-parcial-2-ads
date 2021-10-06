package Shapes;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        else if (shapeType.equalsIgnoreCase("SPHERE")) {
            return new Sphere();
        }

        else if (shapeType.equalsIgnoreCase("CUBE")) {
            return new Cube();
        }

        return null;
    }
}