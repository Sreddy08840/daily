 class test{

    static int a,b;
    static{
        System.out.println("this is a static block");
    }
    static void display(){
        System.out.println("this is a static method");
        
    }
    int x,y;
    {
        System.out.println("this is a non static block");
    }
    void show(){
        System.out.println("this is a non static method");
    }

    public test() {
        System.out.println("this is a constructor");
    }
    

}
public class example {
    
    public static void main(String[] args) {
        test t1=new test();
        test.display();
        t1.show();
    }
}
