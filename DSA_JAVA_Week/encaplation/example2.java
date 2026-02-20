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
class example2{
    public static void main(String[] args) {
        
        employee e=new employee();
        e.setName("John");
        e.setId(123);
        e.setSalary(50000);
        e.setPhoneNumber(987654321);
        e.setAddress("123 Main St");
        System.out.println(e.getName());
        System.err.println(e.getId());
        System.err.println(e.getSalary());
        System.err.println(e.getPhoneNumber());
        System.out.println(e.getAddress());
    }

}