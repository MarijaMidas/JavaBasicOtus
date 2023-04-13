package project;

import project.src.Menu;
import project.src.RubPrinting;
import project.src.User;

public class Application {
    public static void main(String[] args) {
        boolean loop = true;
        while(loop) {
            Menu menu = new Menu();
            menu.printMenuStart();
            User user = new User();
            System.out.println(new RubPrinting().printer(user));
            menu.printMenuEnd();
            loop = new User().userActions() == 1?true:false;
        }
    }
}
