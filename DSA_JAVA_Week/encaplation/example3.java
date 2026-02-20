import java.util.Scanner;
 class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee() {
        name = "prashnna";
        id = 2000001;     
        salary = 80000;
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}


public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee("Santosh");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());  
        System.out.println("Employee Salary: " + emp.getSalary());
        
       
    }
    
}
