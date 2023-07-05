import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n]; // ------> Criação de um vetor.
		
		for (int i = 0; i < n; i++) { // ------> Entrada dos valores que serão armazenados no vetor.
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print("\nVALORES = "); // -----> Imprimi os valores presentes no vetor.
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		
		System.out.print("\nSOMA = "); // ------> Faz a soma acumulada de todos os valores do vetor.
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		System.out.print(String.format("%.2f", soma));
		
		media = soma / n; // ------> Calcula a media dos valores presentes no vetor.
		System.out.print("\nMEDIA = " + String.format("%.2f", media));
		
		sc.close();	
	}
}
