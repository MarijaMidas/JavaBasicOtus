package JavaSyntax.OOP;

import java.util.Scanner;
public class UserResponse {
    static Scanner scanner = new Scanner(System.in);
     private static int correctCount = 0;
    private static int wrongCount = 0;
    public static String outputResult(Object[][][] test) {
        for (int i = 0; i < test.length; i++) {
                for (int k = 0; k < test[i][0].length; k++) {
                    if (i == 2) {
                        System.out.print("Ваш ответ: ");
                        int in = scanner.nextInt();
                        if (test[i][0][k].equals(in)) {
                            correctCount++;
                            return "Правильно";
                        } else {
                            wrongCount++;
                            return "Неправильно";
                        }
                    } else if(i==0) {
                        System.out.println(test[i][0][k]);
                    } else {
                        System.out.println((k+1) + " " + (test[i][0][k]));
                    }
                }
            }
        System.out.println();
        return null;
    }
    public static int getCorrectCount() {
        return correctCount;
    }
    public static int getWrongCount() {
        return wrongCount;
    }
}
