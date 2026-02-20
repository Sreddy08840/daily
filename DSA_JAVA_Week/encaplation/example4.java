
import java.util.Scanner;

class employee{
    private String name;
    private int id;
    private int salary;
    private int phoneNumber;
    private String address;;

    public employee() {
    }

    public employee(String name, int id, int salary, int phoneNumber, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setAddress(String address){
        this.address=address;
    }   
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public String getAddress(){
        return address;
    }
}


public class example4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        employee e=new employee();
        System.out.println("Enter employee name:");
        e.setName(sc.next());
        System.out.println("Enter employee id:");
        e.setId(sc.nextInt());
        System.out.println("Enter employee salary:");
        e.setSalary(sc.nextInt());
        System.out.println("Enter employee phone number:");
        e.setPhoneNumber(sc.nextInt());
        System.out.println("Enter employee address:");
        e.setAddress(sc.next());
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId()); 
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Phone Number: " + e.getPhoneNumber());
        System.out.println("Address: " + e.getAddress());
        
    }
    
}
