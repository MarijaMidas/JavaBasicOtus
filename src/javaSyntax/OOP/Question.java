package javaSyntax.OOP;

import java.util.Arrays;

class Question implements TestFillable, TestPrintable {
    Object[][][] answerOptions = new Object[3][1][];
    @Override
    public void fillQuestion(String question) {

        answerOptions[0][0] = new String[]{question};
    }
    @Override
    public void fillAnswer(int numberAnswer, String answer) {

        if (numberAnswer <= 1) {
            answerOptions[1][0] = new Object[]{answer};
        }else {
            answerOptions[1][0] = Arrays.copyOf(answerOptions[1][0], answerOptions[1][0].length + 1);
            answerOptions[1][0][numberAnswer-1] = answer;
        }

    }
    @Override
    public void fillCorrectAnswer(int correctAnswer){
        answerOptions[2][0] = new Integer[]{correctAnswer};
    }

    @Override
    public void testPrint() {
        System.out.println(UserResponse.outputResult(answerOptions));
    }
}
