package tests.gameTests.unit;

import tests.game.*;

public class TestGame {
    public void playerGetTheSameNumber(){
        String scenario = "Тест на ничью";
        try{
            Dice dice = new TestDiceSame();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterTest();
            Game game = new Game(dice, winnerPrinter);
            String expected = "Ничья";
            game.playGame(new Player("Вася"), new Player("Игорь"));
            String actual = winnerPrinter.toString();
            Assertions.assertEquals(expected,actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (AssertionError e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void classTesting(){
        String scenario = "Тест на соответствие класса";
        try{
            Dice expected = new DiceImpl();
            DiceImpl actual = new DiceImpl();
            Assertions.assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
            System.out.println(expected.getClass().getSimpleName());
            System.out.printf("\"%s\" passed %n", scenario);
        }catch (Error e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        };
    }
}
