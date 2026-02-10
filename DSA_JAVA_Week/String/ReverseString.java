public class ReverseString{
	public static void main(String[] args){
		String str ="Santosh";
		String rev="";
		for (int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		System.out.println("Orginal string: "+str);
		System.out.println("Reversed String: "+rev);
	}
}
