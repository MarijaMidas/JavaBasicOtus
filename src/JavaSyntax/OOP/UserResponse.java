package JavaSyntax.OOP;

import java.util.Scanner;

import static JavaSyntax.OOP.Test.answerOptions;
public class UserResponse {
    static Scanner scanner = new Scanner(System.in);
     private static int correctCount = 0;
    private static int wrongCount = 0;
    private static int questionCount = 0;
    public static void outputResult() {
        for (int i = 0; i < answerOptions.length; i++) {
                for (int k = 0; k < answerOptions[i][questionCount].length; k++) {
                    if (i == 2) {
                        System.out.print("Ваш ответ: ");
                        int in = scanner.nextInt();
                        if (answerOptions[i][questionCount][k].equals(in)) {
                            System.out.println("Правильно");
                            correctCount++;
                        } else {
                            System.out.println("Неправильно");
                            wrongCount++;
                        }
                    } else if(i==0) {
                        System.out.println(answerOptions[i][questionCount][k]);
                    } else {
                        System.out.println((k+1) + " " + (answerOptions[i][questionCount][k]));
                    }
                }
            }
        questionCount++;
        System.out.println();
    }
    public static int getCorrectCount() {
        return correctCount;
    }
    public static int getQuestionCount() {
        return questionCount;
    }

    public static int getWrongCount() {
        return wrongCount;
    }
}
