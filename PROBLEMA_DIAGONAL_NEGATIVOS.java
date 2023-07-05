import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
		
		int n, quantNegativos;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n]; // -----> Criação de uma matriz.
		
		for (int i = 0; i < n; i++) { // -----> Entrada dos valores que serão armazenados na matriz.
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:"); // ------> Impressão da diagonal principal.
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		quantNegativos = 0;
		System.out.print("\nQUANTIDADE DE NEGATIVOS = "); // -----> Contagem da quantidade de negativos.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					quantNegativos++;
				}
			}
		}
		System.out.print(quantNegativos);
		
		sc.close();	
	}
}
