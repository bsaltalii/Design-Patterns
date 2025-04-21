package SingletonDesignPattern.DatabaseExample;

public class Database {
    private static Database instance;

    private Database(){
        System.out.println("Database created..");
    }

    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
    public void query(String sql){
        System.out.println("Query : "+sql);
    }
}
