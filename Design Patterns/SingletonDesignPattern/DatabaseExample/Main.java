package SingletonDesignPattern.DatabaseExample;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query("SELECT * FROM Students");

        Database database1 = Database.getInstance();
        if (database1 == database){
            System.out.println("Same instances");
        }else{
            System.out.println("Different instances");
        }
    }
}
