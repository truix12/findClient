import findClientById.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientMap {
    public static void main(String[] args) {
        Client client1 = new Client(1, "Jan", "Kowalski");
        Client client2 = new Client(2, "Katarzyna", "Nowak");
        Client client3 = new Client(3, "Marek", "Grzyb");

        Map<Integer, Client> mapOfClients = new HashMap<>();
        mapOfClients.put(client1.getClientId(), client1);
        mapOfClients.put(client2.getClientId(), client2);
        mapOfClients.put(client3.getClientId(), client3);

        int clientIdToFind = 3;
        Client foundClient = mapOfClients.get(clientIdToFind);
        if (foundClient != null) {
            System.out.println("Znaleziony klient: " + foundClient);
        } else {
            System.out.println("Klient o Id " + clientIdToFind + " Nie istnieje");
        }
    }
}