import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {
    public static void main(String[] args) throws IOException {
        AbstractMenu menu;
        System.out.println("What kind of shapes do you want to know about? (2D or 3D)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String response = br.readLine().toUpperCase();
        if (response.equals("2D")) {
            menu = new SimpleShapeMenu();
            menu.createMenu();
        } else if (response.equals("3D")) {
            menu = new ComplexShapeMenu();
            menu.createMenu();
        }
    }
}
