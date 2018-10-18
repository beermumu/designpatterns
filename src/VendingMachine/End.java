package VendingMachine;

public class End implements State{
    VendingMachine vendingMachine;

    public End(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.err.println("ERROR");
    }

    @Override
    public void chooseDestination(String station) {
        System.err.println("ERROR");
    }

    @Override
    public void getTicket() {
        System.out.println("Get Ticket");
        vendingMachine.setCurrentState(vendingMachine.getReady());
    }
}
