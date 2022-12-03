package JavaSyntax.OOP;

import java.util.Arrays;

public class Test {
    public static Object[][][] answerOptions=new Object[0][0][0];
    static int n = 0;

    public static void fillQuestion(String question) {
        answerOptions = new Object[3][UserResponse.getQuestionCount()+1][];
        n = 0;
        answerOptions[0][UserResponse.getQuestionCount()] = new String[]{question};
    }
    public static void fillAnswer(String answer) {
        if (n == 0) {
            n++;
            answerOptions[1][UserResponse.getQuestionCount()] = new Object[]{answer};
        }else {
            n++;
            answerOptions[1][UserResponse.getQuestionCount()] = Arrays.copyOf(answerOptions[1][UserResponse.getQuestionCount()], answerOptions[1][UserResponse.getQuestionCount()].length + 1);
            answerOptions[1][UserResponse.getQuestionCount()][answerOptions[1][UserResponse.getQuestionCount()].length-1] = answer;
        }
    }
    public static void fillCorrectAnswer(int correctAnswer){
        answerOptions[2][UserResponse.getQuestionCount()] = new Integer[]{correctAnswer};
    }
}
