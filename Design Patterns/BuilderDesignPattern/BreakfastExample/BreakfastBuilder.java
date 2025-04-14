package BuilderDesignPattern.BreakfastExample;
public interface BreakfastBuilder {
    public void egg();
    public void greenOlive();
    public void blackOlive();
    public void bread();
    public void erzincanBezTulumCheese();
    public void jelly();
    public void honey();
    public void tea();
    public void coffee();
    public void peanutButter();
    public Breakfast build();
}
