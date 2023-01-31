package javaSyntax.OOP;

public class Application {
    public static void main(String[] args) {
        Question test1 = new Question();
        Question test2 = new Question();
        Question test3 = new Question();

        test1.fillQuestion("В файл с каким расширением компилируется java-файл?");
        test1.fillAnswer(1,"cs");
        test1.fillAnswer(2,"java");
        test1.fillAnswer(3,"class");
        test1.fillAnswer(4,"exe");
        test1.fillCorrectAnswer(3);
        test1.testPrint();

        test2.fillQuestion("С помощью какой команды git можно получить полную копию удаленного репозитория?");
        test2.fillAnswer(1,"commit");
        test2.fillAnswer(2,"push");
        test2.fillAnswer(3,"clone");
        test2.fillAnswer(4,"copy");
        test2.fillCorrectAnswer(3);
        test2.testPrint();

        test3.fillQuestion("Какой применяется цикл, когда не известно количество итераций?");
        test3.fillAnswer(1,"while");
        test3.fillAnswer(2,"for");
        test3.fillAnswer(3,"loop");
        test3.fillCorrectAnswer(1);
        test3.testPrint();

        System.out.println("Результат: правильно " + UserResponse.getCorrectCount() + ", неправильно " + UserResponse.getWrongCount());
    }
}
