import controller.LoginController;
import view.InputBukuView;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView menu = new LoginView();
        new LoginController(menu);

    }
}
