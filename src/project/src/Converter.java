package project.src;

import java.util.ArrayList;

public class Converter {
    public ArrayList numberConverting(int number){
        ArrayList<Integer> numArr = new ArrayList<>();
        while (number != 0) {
            numArr.add(number % 10);
            number /= 10;
        }
        if (numArr.size() == 1) {
            numArr.add(0);
        }
        return numArr;
    }
}
