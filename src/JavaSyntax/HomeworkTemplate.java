package JavaSyntax;

import java.util.Scanner;

public class HomeworkTemplate {
    public static void testing() {
        int correctCount = 0, wrongCount = 0;

        String[][][] answerOptions = new String[3][3][];
        answerOptions[0][0] = new String[]{"В файл с каким расширением компилируется java-файл?"};
        answerOptions[0][1] = new String[]{"1. cs","2. java","3. class","4. exe"};
        answerOptions[0][2] = new String[]{"3. class"};

        answerOptions[1][0] = new String[]{"С помощью какой команды git можно получить полную копию удаленного репозитория?"};
        answerOptions[1][1] = new String[]{"1. commit","2. push","3. clone","4. copy"};
        answerOptions[1][2] = new String[]{"3. clone"};

        answerOptions[2][0] = new String[]{"Какой применяется цикл, когда не известно количество итераций?"};
        answerOptions[2][1] = new String[]{"1. while", "2. for", "3. loop"};
        answerOptions[2][2] = new String[]{"1. while"};

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < answerOptions.length; i++) {
            for (int j = 0; j < answerOptions[i].length; j++) {
                for (int k = 0; k < answerOptions[i][j].length; k++) {
                    if (j == 2) {
                        System.out.print("Ваш ответ: ");
                        int in = scanner.nextInt();
                        if (answerOptions[i][j-1][in-1].equals(answerOptions[i][j][k])) {
                            System.out.println("Правильно");
                            correctCount++;
                        } else {
                            System.out.println("Неправильно");
                            wrongCount++;
                        }
                    } else {
                        System.out.println(answerOptions[i][j][k]);
                    }
                }
            }
                System.out.println();
            }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
