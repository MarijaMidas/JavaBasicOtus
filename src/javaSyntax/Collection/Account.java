package javaSyntax.Collection;

import java.util.Objects;

public class Account {
    private int account;
    public Account(int account) {
        this.account = account;    }

    public int getAccount() {
        return account;    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return account == account1.account;
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }
}

