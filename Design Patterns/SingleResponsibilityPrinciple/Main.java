package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 5000);

        EmployeePay pay = new EmployeePay();
        EmployeeRepository repo = new EmployeeRepository();
        EmployeeReport report = new EmployeeReport();

        pay.calculate(emp);
        repo.save(emp);
        report.generate(emp);
    }
}
