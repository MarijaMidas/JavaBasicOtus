package tests.gameTests.unit;

import tests.game.Assertions;
import tests.game.DiceImpl;

public class TestDiceImpl {
    public void testingDiceAround1_6() {
        String scenario = "Тест с проверкой вхождения в диапазон от 1 до 6";
        try {
            int actual = new DiceImpl().roll();
            if (actual>0&&actual<7){
                System.out.printf("\"%s\" passed %n", scenario);
            }else {
            Assertions.assertEquals(1, actual);
            }

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
