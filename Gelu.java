
import java.io.*; 

class Gelu { 
	public static void main(String[] args) 
	{ 

		int[][] integer2DArray = new int[5][3]; 
		System.out.println( 
			"Default value of int array element: "
			+ integer2DArray[0][0]); 

		String[][] string2DArray = new String[4][4]; 
		System.out.println( 
			"Default value of String array element: "
			+ string2DArray[0][0]); 

		boolean[][] boolean2DArray = new boolean[4][4]; 
		System.out.println( 
			"Default value of boolean array element: "
			+ boolean2DArray[0][0]); 

		char[][] char2DArray = new char[10][10]; 
		System.out.println( 
			"Default value of char array element: "
			+ char2DArray[0][0]); 

		int[][] arr; 
 
		arr = new int[5][3]; 
		System.out.println("arr[0][0]: " + arr[0][0]); 
	} 
}
