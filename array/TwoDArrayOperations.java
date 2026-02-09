public class TwoArrayOperations{
	
	static void travese(int[][] arr){
		int rows=arr.length;
		int cols=arr[0].length;
		
		System.out.print("Row-wise Traversal: ");
		for (int i=0; i<rows ;i++){
			for(int j=0;j<cols;j++){
				System.out.printa(arr[i][j]+"");
			}
		}
		System.out.print("col-wise Traversal: ");
		for(int j=o;j<cols;j++){
			for(int i=0;i<rows; i++){
				System.out.print(arr[i][j]+"");
			}
		}
		System.out.println();
	}
	
	static int[][] add(int[][] A,int[][] B){
		int rows =A.length;
		int cols= A[0].length;
		int[][] C =new int[rows][cols];
		
		for(int i =0;i<rows ; i++){
			for(int j=0;j<cols;j++){
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		return C;
	}
	
	static int[][] sub(int [][] A,int [][] B){
		int rows=A.length;
		int cols=A[0].length;
		int [][] C=new int [rows][cols];
		
		for(int i=0;i<rows;i++){
			for(int j+0;j<cols;j++){
				C[i][j]=A[i][j]-B[i][j];
			}
		}
		return C;
	}
	
	static int[][] mutiply(int [][] A,int [][] B){
		int rowsA=A.length;
		int colsA=A[0].length;
		int colsB=B[0].length;
		
		int[][] C=new int [rowsA][colsB];
		
		for(int i=0;i<rowsA;i++){
			for(int j=0;j<colsB;J++){
				for(int k=0;k<colsA;k++){
					c[i][j] +=A[i][k]*B[k][j];
				}
			}
		}
		return C;
	}
	
	static void printMatrix(int [][] M){
		for  (int [] row :M){
			for (int val :row){
				System.out.print(val+"");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		
		int[][] arr = {{1,2,3},{4,5,6}};
		travese(arr);
		
		int[][] A={{1,2},{3,4}};
		int [][] B={{5,6},{7,8}};
		System.out.println("\n Matrix A:);
		printMtrix(A);
		System.out.println("Matrix B:");
		printMatrix(B);
		
		int [][] sum=add(A,B);
		System.out.println("A+B:");
		printMatrix(sum);
		
		int[][] diff=sub(A,B);
		System.out.println("A-B:");
		printMatrix(diff);
		 
		int[][] C=multiply (A,B);
		System.out.println("A*B:");
		printMatrix(c);
	}
}

		
		