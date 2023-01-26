package tests.gameTests.unit;

import tests.game.Dice;

public class TestDiceSame implements Dice {
    @Override
    public int roll() {
        return 6;
    }
}
