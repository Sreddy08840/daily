class demo{
    int a =0;
    int b=1;
    void add(){
        int c;
        c=a+b;
        System.out.println(c);
    }
}
class exaple{
    public static void main(String[] args) {
        demo d=new demo();
        d.add();
    }
}