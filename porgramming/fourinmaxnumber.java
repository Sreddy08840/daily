import java.util.Scanner;
class fourinmaxnumber{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int max1=a<b ? b:a;
		int max2=c<d ?d:c;
		int max = max1<max2?max2:max1;
		System.out.println(max);
	}
}
		
		
		
		