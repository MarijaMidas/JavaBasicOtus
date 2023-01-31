package tests.gameTests;

import tests.gameTests.unit.TestDiceImpl;
import tests.gameTests.unit.TestFirstPlayerWinner;
import tests.gameTests.unit.TestGame;

public class AllTests {
    public static void main(String[] args) {
        new TestDiceImpl().testingDiceAround1_6();
        new TestGame().playerGetTheSameNumber();
        new TestFirstPlayerWinner().testFirstPlayerWin();
        new TestGame().classTesting();
    }
}
