public class PalindromeCheck{
	public static void main(String[] args){
		String str="hello";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--){
			rev= rev+str.charAt(i);
		}
		
		if (str.equals(rev)){
			System.out.println(str+" is a paliandrome.");
		}
		else
			System.out.println(str+" is NOT a Palindrome.");
		}
	}
	