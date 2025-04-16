import java.util.Scanner;

public class TP02Ex04 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] matriz = {{1, 2, 3},
						  {4, 5, 6}};
						  
		System.out.println("Os valores da matriz: ");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}			 
	}
}