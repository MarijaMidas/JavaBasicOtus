package tests.gameTests.unit;

import tests.game.Dice;

public class TestDiceImplFirstWinner implements Dice {
    int count = 0;
    @Override
    public int roll() {
        if (count == 0){
            count = 1;
        return 6;
    }else if (count == 1) {
            count = 0;
        }
        return 1;
    }
}
