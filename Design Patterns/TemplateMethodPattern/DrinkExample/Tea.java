package TemplateMethodPattern.DrinkExample;

public class Tea extends CaffeinatedBeverage{
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add lemon");
    }
}
