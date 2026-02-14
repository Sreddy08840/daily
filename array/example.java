import java.util.Scanner;
class example{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int [] b=new int[5];
        int i;
        for(i=0;i<5;i++){
            System.out.println("Enterr the number");
            b[i]=sc.nextInt();

        }
        for(i=0;i<5;i++){
            System.out.println(b[i]);
        }
    }
}
