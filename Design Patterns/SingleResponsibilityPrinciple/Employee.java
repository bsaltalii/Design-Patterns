package SingleResponsibilityPrinciple;
//Before SRP : Everything in one class

//public class Employee {
//    private String name;
//    private String jobTitle;
//    private double salary;
//
//
//    public Employee(String name,String jobTitle,double salary){
//        this.name=name;
//        this.jobTitle=jobTitle;
//        this.salary=salary;
//    }
//
//    public void CalculatePay(){
//        System.out.println("Calculating pay for : "+ name);
//    }
//
//    public void saveEmployee(){
//        System.out.println("Saving employee : "+ name);
//    }
//
//    public void generateReport(){
//        System.out.println("Generating report for : "+ name);
//    }
//}

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String jobTitle, double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
}

class EmployeeRepository{
    public void save(Employee employee){
        System.out.println("Saving employee : " + employee.getName());
    }
}

class EmployeeReport{
    public void generate(Employee employee){
        System.out.println("Generating report for : " +employee.getName());
    }
}

class EmployeePay{
    public void calculate(Employee employee){
        System.out.println("Calculating pay for : "+ employee.getName());
    }
}