package ProxyDesignPattern.WebsiteExample;

public class Main {
    public static void main(String[] args) {
        Website website = new SecureWebsiteProxy();

        website.access("https://google.com");
        website.access("http://notsecure.com");
    }
}
