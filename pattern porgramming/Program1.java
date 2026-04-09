
class Program1

{

    static int a;

    
	static int b;
    static

    {

       System.out.println("Inside static-block");

        a = 10;

        b = 200;

    }



    



    void disp()

    {

    	System.out.println("inside nin-static method");

    	System.out.println(a);

    	System.out.println(b);

    }

    

    public static void main(String[] args)

    {

        Program1 p1 = new Program1();

        p1.a = 111;

        p1.disp();

        Program1 p2 = new Program1();

        p2.a = 222;

        p2.disp();

    }

}