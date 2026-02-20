import java.util.*;
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
      
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void  setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setId(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }

    void setSalary(double salary){
        this.salary = salary;
    }
    double getSalary(){
        return salary;
    }

        
}


public class example5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter employee data:");
        String data=sc.next();
        String[] arr=data.split(",");
        emp.setName(arr[0]);
        emp.setId(Integer.parseInt(arr[1]));
        emp.setSalary(Double.parseDouble(arr[2]));
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Salary: " + emp.getSalary());

        Employee e=new Employee();
        System.out.println("Enter employee data:");
        String data1=sc.next();
        String[] arr1=data1.split(","); 
        e.setName(arr1[0]);
        e.setId(Integer.parseInt(arr1[1]));
        e.setSalary(Double.parseDouble(arr1[2]));
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Salary: " + e.getSalary());
        

    }
}
