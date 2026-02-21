import  java.util.Scanner;
class farmer{
    float p;
    float t;
    static  float r=5.0f; // Static variable for interest rate
    float si;
    static{
        System.out.println("Static block executed. Initializing interest rate:");
        // Setting a fixed interest rate of 5%
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        p = sc.nextFloat();
        System.out.println("Enter the time in years:");
        t = sc.nextFloat();
       // Assuming a fixed interest rate of 5%
    }
    void calculate(){
        
        si = (p * t * r) / 100;
    }
    void display(){
        System.out.println("The simple interest is: " + si);
    }

}


public class example2 {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculator");
        
        farmer f = new farmer();
        
        f.input();
        f.calculate();
        f.display();
    }
}
