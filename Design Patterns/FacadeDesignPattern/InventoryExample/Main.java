package FacadeDesignPattern.InventoryExample;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Laptop");
    }
}
