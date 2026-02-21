 import java.util.*;
 
 class employee {
    private String name;
    private int id;
    private double salary;

    public employee() {
      
    }

    public employee(String name, int id, double salary) {
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


public class encaplation6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the object:");
        int n=sc.nextInt();
        employee[] emp=new employee[n];
        for(int i=0;i<n;i++){

            employee e=new employee();
            System.out.println("Enter employee data:");
            String data=sc.next();
            String[] arr=data.split(",");
              
            String name=arr[0];
            int id=Integer.parseInt(arr[1]);
            double salary=Double.parseDouble(arr[2]);

            e.setName(name);
            e.setId(id);
            e.setSalary(salary);

            emp[i]=e;
            
        }
        System.out.println("Enter no of Employee details:");
        int m=sc.nextInt();
        
            System.out.println("Employee Details:");
            System.out.println("employee name: "+emp[m].getName());
            System.out.println("employee id: "+emp[m].getId());
            System.out.println("employee salary: "+emp[m].getSalary());
        

    }
}
