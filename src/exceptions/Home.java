package exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Home{

    public static Map<Integer,String> createHomeList() throws NumberException {
        Map<Integer,String>home = new HashMap<>();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(count<=4){
            home.put(sc.nextInt(),sc.nextLine());
            if(home.containsKey(4)){
                throw new NumberException("Квартиры с номером \"4\" не существует.");
            }
            count++;
        }
        return home;
    }
}
