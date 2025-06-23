package TemplateMethodPattern.DrinkExample;

abstract class CaffeinatedBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    private void boilWater(){
        System.out.println("Boiling water");
    }

    private void pourInCup(){
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    protected boolean customerWantsCondiments(){
        return true;
    }
}
