package javaSyntax.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {
        public static void main(String[] args) {
            Map<Account, Client> clientAccounts = getClientAccounts();
            //Map<Client, Set<Account>>accounts = ;
            Client client = new Client("Piter", 35);
            getAccount(client);
            Account account = new Account(215);
            getClient(account);
        }
        private static void getAccount(Client client){

            for(Map.Entry<Account,Client> entry: getClientAccounts().entrySet()){
                if(client.equals(entry.getValue())){
                    System.out.println(entry.getKey().getAccount());            }
            }
        }

        private static void getClient(Account account){
            for(Map.Entry<Account,Client> entry: getClientAccounts().entrySet()){
                if(account.equals(entry.getKey())){
                    System.out.println(entry.getValue().getClientName());            }
            }
        }

        private static Map<Account, Client> getClientAccounts() {
            Client client1 = new Client("Nick", 25);
            Client client2 = new Client("Molly", 45);
            Client client3 = new Client("Piter", 35);
            Client client4 = new Client("Mike", 22);
            Client client5 = new Client("Jane", 18);
            Map<Account,Client> clientAccounts = new HashMap<>();
            clientAccounts.put(new Account(250), client1);
            clientAccounts.put(new Account(50), client1);
            clientAccounts.put(new Account(350),client2);
            clientAccounts.put(new Account(80), client3);
            clientAccounts.put(new Account(215), client3);
            clientAccounts.put(new Account(100), client4);
            clientAccounts.put(new Account(1400), client4);
            clientAccounts.put(new Account(20), client5);
            return clientAccounts;
        }

}
