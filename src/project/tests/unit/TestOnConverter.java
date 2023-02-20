package project.tests.unit;

import project.src.Converter;
import tests.game.Assertions;

import java.util.ArrayList;

public class TestOnConverter {
    public void converterTesting(){
        String scenario = "Тест на правильность создания массива символов числа для дальнейших расчетов(реверс)";
        try{
            ArrayList<Integer> actual = new ArrayList<>();
            actual.add(6);
            actual.add(5);
            actual.add(4);
            actual.add(3);
            actual.add(2);
            actual.add(1);
            ArrayList<Integer> expected = new Converter().numberConverting(123456);
            Assertions.assertEquals(expected,actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (AssertionError e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
