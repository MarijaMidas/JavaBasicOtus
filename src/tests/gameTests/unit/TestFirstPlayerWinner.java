package tests.gameTests.unit;

import tests.game.*;

public class TestFirstPlayerWinner {
    public void testFirstPlayerWin(){
        String scenario = "Тест на победу первого игрока";
        try{
            Dice diceTest = new TestDiceImplFirstWinner();
            GameWinnerConsolePrinterTest winnerPrinter = new GameWinnerConsolePrinterTest();
            Game gameTest = new Game(diceTest, winnerPrinter);
            Player expected = new Player("Вася");
            gameTest.playGame(expected, new Player("Игорь"));
            Player actual = winnerPrinter.winner;
            Assertions.assertEquals(expected,actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (Error e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
