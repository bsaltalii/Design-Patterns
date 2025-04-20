package FacadeDesignPattern.InventoryExample;

public class Inventory {
    public void checkInventory(String product){
        System.out.println("Checking inventory for " + product);
    }

    public void updateInventory(String product){
        System.out.println("Inventory updated for "+product);
    }
}
