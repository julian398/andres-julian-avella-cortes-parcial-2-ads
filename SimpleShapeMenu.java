import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Shapes.Shape;
import Shapes.ShapeFactory;

public class SimpleShapeMenu extends AbstractMenu {

    @Override
    public void menuWelcome() {
        System.out.println("Wellcome to the 2D shapes menu currently we have:");
    }

    @Override
    public void menuOptions() throws IOException {
        System.out.println("Circle");
        System.out.println("Rectangle");
        System.out.println("Square");
        System.out.println("Which one would you like to know more about?");
        ShapeFactory shapeFactory = new ShapeFactory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Shape shape = shapeFactory.getShape(br.readLine().toUpperCase());
        if (shape != null) {
            shape.setName();
            shape.setareaCalculator();
            shape.setPerimeterCalculator();
            System.out.println("The equation to calculate the area of that figure is: " + shape.getArea());
            System.out.println("The equation to calculate the perimeter of that figure is: " + shape.getPerimeter());
        }
    }

}