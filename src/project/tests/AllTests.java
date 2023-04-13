package project.tests;

import project.tests.unit.TestOnConverter;
import project.tests.unit.TestOnOutput;

public class AllTests {
    public static void main(String[] args) {
        new TestOnOutput().outputTestingFor50();
        new TestOnOutput().outputTestingFor0();
        new TestOnOutput().outputTestingFor1();
        new TestOnConverter().converterTesting();
    }
}
