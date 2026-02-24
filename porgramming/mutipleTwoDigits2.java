import java.util.Scanner;
class mutipleTwoDigits2{
public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=n;i++){
			if (n%a==0 || n%b==0){
			System.out.println(i);
			}
		}
	}
}