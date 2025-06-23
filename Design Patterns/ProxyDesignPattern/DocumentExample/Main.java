package ProxyDesignPattern.DocumentExample;

public class Main {
    public static void main(String[] args) {
        Document report = new SecureDocumentProxy("financial_report_2025.pdf");

        report.display("guest");
        report.display("admin");
        report.display("admin");
    }
}
