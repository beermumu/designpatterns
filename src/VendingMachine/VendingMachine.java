package VendingMachine;

public class VendingMachine {
    private State pay = new Pay(this);
    private State ready = new Ready(this);
    private State end = new End(this);
    private State currentState = ready;

    private int amount = 0;
    private int price = 0;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public State getPay() {
        return pay;
    }

    public State getReady() {
        return ready;
    }

    public State getEnd() {
        return end;
    }
}
