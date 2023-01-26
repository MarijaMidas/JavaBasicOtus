package tests.gameTests.unit;

import tests.game.*;

public class TestFirstPlayerWinner {
    public void testFirstPlayerWin(){
        String scenario = "Тест на победу первого игрока";
        try{
            Dice dice = new TestDiceImplFirstWinner();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterTest();
            Game game = new Game(dice, winnerPrinter);
            String expected = "Вася";
            game.playGame(new Player("Вася"), new Player("Игорь"));
            String actual = winnerPrinter.toString();
            Assertions.assertEquals(expected,actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (Error e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
