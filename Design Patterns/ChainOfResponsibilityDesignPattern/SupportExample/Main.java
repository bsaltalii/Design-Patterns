package ChainOfResponsibilityDesignPattern.SupportExample;

public class Main {
    public static void main(String[] args) {
        SupportHandler basic = new BasicSupport();
        SupportHandler tech = new TechnicalSupport();
        SupportHandler supervisor = new SuperviserSupport();

        basic.setNext(tech);
        tech.setNext(supervisor);

        basic.handle("I forgot my password");
        basic.handle("The app crashes on login");
        basic.handle("Unfair account ban appeal");
    }
}
