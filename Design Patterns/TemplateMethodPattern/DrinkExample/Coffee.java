package TemplateMethodPattern.DrinkExample;

public class Coffee extends CaffeinatedBeverage{
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected boolean customerWantsCondiments(){
        return false;
    }
}
