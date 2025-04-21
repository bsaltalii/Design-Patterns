package BuilderDesignPattern.CoffeeExample;

public class Coffee {
    private String size;
    private boolean milk;
    private boolean sugar;
    private boolean whippedCream;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public String toString(){
        return "Coffee size : "+ size + " milk : "+milk + " sugar : "+sugar+ " whipped cream : "+whippedCream;
    }
}
