package ObserverDesingPattern.NewsReaderExample;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String news;
    public void setNews(String news){
        this.news = news;
        notifyObservers();
    }
    public String getNews(){
        return news;
    }
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(news);
        }
    }
}
