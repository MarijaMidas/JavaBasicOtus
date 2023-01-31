package javaSyntax.Collection;

import java.util.Objects;
public class Client {
    private String clientName;
    private int clientAge;
    public Client(String clientName, int clientAge) {
        this.clientName = clientName;
        this.clientAge = clientAge;    }

    public String getClientName() {
        return clientName;    }

    public int getClientAge() {
        return clientAge;    }

    @Override    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientName, client.clientName);    }

    @Override    public int hashCode() {
        return Objects.hash(clientName);    }
}

