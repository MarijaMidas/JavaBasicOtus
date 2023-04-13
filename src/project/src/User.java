package project.src;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);

    public int userActions() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        else {
            System.out.println("Будьте внимательны в следующий раз. Вводить необходимо цифры.");
            return 0;}
    }
}
