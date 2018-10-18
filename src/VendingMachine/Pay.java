package VendingMachine;

public class Pay implements State {
    VendingMachine vendingMachine;

    public Pay(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        int curAmount = vendingMachine.getAmount() + amount;
        if (curAmount >= vendingMachine.getPrice()) {
            if (curAmount > vendingMachine.getPrice())
                System.out.println("Change " + (curAmount - vendingMachine.getPrice()));
            System.out.println("Complete:Get ticket");
            vendingMachine.setAmount(0);
            vendingMachine.setPrice(0);
            vendingMachine.setCurrentState(vendingMachine.getEnd());
        } else if (curAmount < vendingMachine.getPrice())
            System.out.println("Pls Insert Coin " + (vendingMachine.getPrice() - curAmount));
    }

    @Override
    public void chooseDestination(String station) {
        System.err.println("ERROR");
    }

    @Override
    public void getTicket() {
        System.err.println("ERROR");
    }
}
