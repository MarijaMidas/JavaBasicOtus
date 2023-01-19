package exceptions;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Home home1 = new Home();
        Map<Integer,String> home = null;
        try {
           home =  home1.createHomeList();
        } catch (NumberException e) {
            e.printStackTrace();
            System.out.println("Не удалось создать новый список жителей. Учитывайте при записи отсутствие квартиры №4");
            try {
                home1.createHomeList();
            } catch (NumberException ex) {
                throw new RuntimeException(ex);
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Test", false))){
            String file = home.toString();
            writer.write(file);
            writer.flush();
            try {
                Path path = Paths.get("Test");
                Scanner sc = new Scanner(path);
                while (sc.hasNext()){
                    System.out.println(sc.next());
                }
            } catch (IOException e) {
                throw new RuntimeException("Файл не найден", e);
            }
        } catch (IOException e) {
            throw new RuntimeException("Произошла ошибка глубже.", e);
        }

    }

}


