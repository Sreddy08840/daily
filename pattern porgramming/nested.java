public class nested {
	public  static void main(String[] args) {
		for(int i = 0; i<= 5; i++) {
			for (int j =0 ; j <= 5; j++) {
				if (i ==3) {
					break;
				}
				System.out.println("i:"+i + "j+ "+ j);
			}
			System.out.println();
		}
	}
}