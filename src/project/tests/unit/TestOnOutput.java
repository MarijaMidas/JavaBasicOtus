package project.tests.unit;

import project.src.RubPrinting;
import project.src.User;
import tests.game.Assertions;

public class TestOnOutput {
    public void outputTestingFor50(){
        String scenario = "Тест на корректный вывод результата";
        try{
            User user = new UserTest(50);
            String actual = new RubPrinting().printer(user);
            String expected = "50 рублей";
            Assertions.assertEquals(expected,actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (AssertionError e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void outputTestingFor0(){
        String scenario = "Тест на корректный вывод результата";
        try{
            User user = new UserTest(0);
            String actual = new RubPrinting().printer(user);
            String expected = "0 рублей";
            Assertions.assertEquals(expected,actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (AssertionError e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void outputTestingFor1(){
        String scenario = "Тест на корректный вывод результата";
        try{
            User user = new UserTest(-11);
            String actual = new RubPrinting().printer(user);
            String expected = "11 рублей";
            Assertions.assertEquals(expected,actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (AssertionError e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
