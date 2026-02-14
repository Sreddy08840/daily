class example{
    int c;
    int add(int a,int b){
        c=a+b;
        return c;
    }
}
class expo{
    public static void main(String[] args){
        example a=new example();
        int let=1;
        int get=2;
        int res=a.add(let,get);
        System.out.print(res);
    }
}