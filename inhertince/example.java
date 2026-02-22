

class parent{
    String color="red";
    void  toMethod(){
        System.out.println("this is parent class");
    }
}
    class child extends parent{
       
        }
  
 class example {
    public static void main(String[] args) {
        child c=new child();
        System.out.println(c.color);
        c.toMethod();
    }
}