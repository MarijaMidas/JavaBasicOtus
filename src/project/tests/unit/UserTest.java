package project.tests.unit;

import project.src.User;

public class UserTest extends User {
    int num;
    UserTest(int num){
        this.num = num;
    }
    public int userActions() {
        return num;
    }
}
