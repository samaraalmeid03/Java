import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.print("Quantas linhas vai ter a matriz? ");
		m = sc.nextInt();
		System.out.print("Quantas colunas vai ter a matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[m][n]; //Criação de uma matriz.
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMATRIZ DIGITADA:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(); //Quebra de linha após a impressão dos elementos da primeira linha.
		}
		
		sc.close();	
	}
}
