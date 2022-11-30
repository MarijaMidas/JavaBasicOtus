package JavaSyntax;

import java.util.Scanner;

public class HomeworkTemplate {
    public static void testing() {
        int correctCount = 0, wrongCount = 0;

        String[][] answerOptions = new String[3][];
        answerOptions[0] = new String[6];
        answerOptions[0][0] = "В файл с каким расширением компилируется java-файл?";
        answerOptions[0][1] = "1. cs";
        answerOptions[0][2] = "2. java";
        answerOptions[0][3] = "3. class";
        answerOptions[0][4] = "4. exe";

        answerOptions[0][5] = "3. class"; // Правильный ответ

        answerOptions[1] = new String[6];
        answerOptions[1][0] = "С помощью какой команды git можно получить полную копию удаленного репозитория?";
        answerOptions[1][1] = "1. commit";
        answerOptions[1][2] = "2. push";
        answerOptions[1][3] = "3. clone";
        answerOptions[1][4] = "4. copy";

        answerOptions[1][5] = "3. clone"; // Правильный ответ

        answerOptions[2] = new String[5];
        answerOptions[2][0] = "Какой применяется цикл, когда не известно количество итераций?";
        answerOptions[2][1] = "1. while";
        answerOptions[2][2] = "2. for";
        answerOptions[2][3] = "3. loop";

        answerOptions[2][4] = "1. while"; // Правильный ответ

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < answerOptions.length; i++) {
            for (int j = 0; j < answerOptions[i].length-1; j++) {
                System.out.println(answerOptions[i][j]);
            }
                System.out.print("Ваш ответ: ");
                int in = scanner.nextInt();
                if (answerOptions[i][in].equals(answerOptions[i][answerOptions[i].length-1])){
                    System.out.println("Правильно");
                    correctCount++;
                }else {
                    System.out.println("Неправильно");
                    wrongCount++;
                }
                System.out.println();
            }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
