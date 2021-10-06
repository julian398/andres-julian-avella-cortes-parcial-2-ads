import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractMenu {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public final void createMenu() throws IOException {
        boolean stay = true;
        menuWelcome();
        while (stay) {
            menuOptions();
            stay = menuStay();
        }
        menuGoodbye();
    }

    public abstract void menuWelcome();

    public abstract void menuOptions() throws IOException;

    private boolean menuStay() throws IOException {
        System.out.println("Do you want to leave this menu? (yes or no)");
        String response = "";
        while (response.equals("")) {
            response = br.readLine().toUpperCase();
            if (response.equals("YES")) {
                return false;
            } else if (response.equals("NO")) {
                return true;
            } else {
                response = "";
            }
        }
        return true;
    }

    private void menuGoodbye() {
        System.out.println("Leaving this menu...");
    }
}
