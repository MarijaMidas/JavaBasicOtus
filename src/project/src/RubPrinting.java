package project.src;

import java.util.ArrayList;

public class RubPrinting extends Money implements Printing {
    @Override
    public String printer(User user) {
        Money ruble = new Ruble();
        ruble.setQuantity(user.userActions());
        int money = ruble.getQuantity();
        if(money<0){
            money *= -1;
            System.out.println("Вы ввели отрицательное число, поэтому расчет идет в модуле.");
        }
        if (money == 0) {
            return money + " рублей";
        }
        Converter converter = new Converter();
        ArrayList<Integer>numArr = converter.numberConverting(money);
        if (numArr.get(1) != 1 && numArr.get(0) == 1) {
            return money + " рубль";
        } else if (numArr.get(1) != 1 && (numArr.get(0) == 2 || numArr.get(0) == 3 || numArr.get(0) == 4)) {
            return money + " рубля";
        } else {
            return money + " рублей";
        }
    }
}