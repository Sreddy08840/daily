import java.util.Scanner;
public class numeric5 {
	

	

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the number: ");

			int n = scan.nextInt();

			if(n == 1)

			{

				System.out.println(n + " is not a Prime number");

			}

			else

			{

				// call method

				findPrime(n);

			}

		}

		static void findPrime(int n)

		{

			int count = 0;

			

			for(int i=2; i<=Math.sqrt(n); i++)

			{

				if(n%i == 0)

				{

					count++;

				}

			}

			

			if(count == 0)

			{

				System.out.println(n + " is a prime number");

			}

			else

			{

				System.out.println(n + " is NOT a prime number");

			}

		

	}
}
