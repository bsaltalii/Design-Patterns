package ProxyDesignPattern.WebsiteExample;

public class SecureWebsiteProxy implements Website{
    private RealWebsite realWebsite;

    public SecureWebsiteProxy(){
        this.realWebsite = new RealWebsite();
    }

    @Override
    public void access(String url){
        if (url.startsWith("https://")){
            realWebsite.access(url);
        }else{
            System.out.println("Blocked: Insecure URL - " +url);
        }
    }
}
