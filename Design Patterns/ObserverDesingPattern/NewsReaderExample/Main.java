package ObserverDesingPattern.NewsReaderExample;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer reader1 = new NewsReader("Ali");
        Observer reader2 = new NewsReader("Ayşe");

        agency.attach(reader1);
        agency.attach(reader2);

        agency.setNews("Earthquake in Istanbul");
        agency.setNews("New tax reform announced");
    }
}
