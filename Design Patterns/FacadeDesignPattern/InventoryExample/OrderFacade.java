package FacadeDesignPattern.InventoryExample;

public class OrderFacade {
    private OrderProcessor orderProcessor;
    private Inventory inventory;
    private ShippingService shippingService;

    public OrderFacade(){
        orderProcessor = new OrderProcessor();
        inventory = new Inventory();
        shippingService = new ShippingService();
    }

    public void placeOrder(String product){
        inventory.checkInventory(product);
        orderProcessor.processOrder(product);
        inventory.updateInventory(product);
        shippingService.shipProduct(product);
    }
}
