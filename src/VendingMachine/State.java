package VendingMachine;

public interface State {
    void insertCoin(int amount);

    void chooseDestination(String station);

    void getTicket();
}
