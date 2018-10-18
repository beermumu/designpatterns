package VendingMachine;

import java.util.Map;
import java.util.TreeMap;

public class Ready implements State{
    VendingMachine vendingMachine;
    Map<String, Integer> destinationPrice = new TreeMap<>();

    public Ready(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationPrice.put("Klongtun", 42);
        destinationPrice.put("Klongmaitun", 13);
        destinationPrice.put("Siam", 48);
        destinationPrice.put("Samyarn", 52);
        destinationPrice.put("Bangkapi", 67);
    }


    @Override
    public void getTicket() {
        System.err.println("ERROR");
    }

    @Override
    public void insertCoin(int amount) {
        System.err.println("ERROR");
    }


    @Override
    public void chooseDestination(String station) {
        if (destinationPrice.containsKey(station)) {
            System.err.println("Invalid destination station");
            return;
        }
        int price = destinationPrice.get(station);
        System.out.println("Select " + station + "- " + price + " Baht");
        vendingMachine.setCurrentState(vendingMachine.getPay());
    }
}
