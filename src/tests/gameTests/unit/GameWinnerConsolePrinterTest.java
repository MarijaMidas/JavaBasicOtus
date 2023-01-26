package tests.gameTests.unit;

import tests.game.GameWinnerPrinter;
import tests.game.Player;

import java.util.Objects;

public class GameWinnerConsolePrinterTest implements GameWinnerPrinter {
    public String result;
    @Override
    public void printWinner(Player winner) {
        this.result = winner.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameWinnerConsolePrinterTest that = (GameWinnerConsolePrinterTest) o;
        return Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
       @Override
    public String toString() {
        return  result;
    }
}
