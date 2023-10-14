import java.util.Objects;

public class Client {
    private int clientId;
    private String clientName;
    private String clientSurname;

    public Client(int clientId, String clientName, String clientSurname) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && Objects.equals(clientName, client.clientName) && Objects.equals(clientSurname, client.clientSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, clientSurname);
    }
}
