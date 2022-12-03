package JavaSyntax.OOP;

public class Application {
    public static void main(String[] args) {
        Test.fillQuestion("В файл с каким расширением компилируется java-файл?");
        Test.fillAnswer("cs");
        Test.fillAnswer("java");
        Test.fillAnswer("class");
        Test.fillAnswer("exe");
        Test.fillCorrectAnswer(3);
        UserResponse.outputResult();

        Test.fillQuestion("С помощью какой команды git можно получить полную копию удаленного репозитория?");
        Test.fillAnswer("commit");
        Test.fillAnswer("push");
        Test.fillAnswer("clone");
        Test.fillAnswer("copy");
        Test.fillCorrectAnswer(3);
        UserResponse.outputResult();

        Test.fillQuestion("Какой применяется цикл, когда не известно количество итераций?");
        Test.fillAnswer("while");
        Test.fillAnswer("for");
        Test.fillAnswer("loop");
        Test.fillCorrectAnswer(1);
        UserResponse.outputResult();

        System.out.println("Результат: правильно " + UserResponse.getCorrectCount() + ", неправильно " + UserResponse.getWrongCount());
    }
}
