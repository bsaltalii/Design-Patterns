package CompositeDesignPattern.MenuExample;

public class Main {
    public static void main(String[] args) {
        MenuItem meal = new MenuItem("Burger",200);
        MenuItem meal2 = new MenuItem("Pizza",300);

        Menu mealMenu = new Menu("Meals");
        mealMenu.addComponent(meal);
        mealMenu.addComponent(meal2);

        MenuItem dessert = new MenuItem("Ice Cream",10);
        MenuItem dessert2 = new MenuItem("Cake",15);

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addComponent(dessert);
        dessertMenu.addComponent(dessert2);

        mealMenu.showDetails();
        System.out.println("----------");
        dessertMenu.showDetails();
    }
}
