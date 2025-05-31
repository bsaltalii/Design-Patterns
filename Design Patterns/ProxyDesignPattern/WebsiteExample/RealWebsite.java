package ProxyDesignPattern.WebsiteExample;

public class RealWebsite implements Website{
    @Override
    public void access(String url) {
        System.out.println("Accessing : " + url);
    }
}
