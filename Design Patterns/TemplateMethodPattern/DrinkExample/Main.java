package TemplateMethodPattern.DrinkExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Making Tea ------");
        CaffeinatedBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n----- Making Coffee ------");
        CaffeinatedBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
