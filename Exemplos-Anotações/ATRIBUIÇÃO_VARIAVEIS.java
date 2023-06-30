import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US); //Define que o separador de numeros reais sera o ponto e nao a virgula.
		
		int idade;
		double salario, altura;
		char genero;
		String nome; 
		
		idade = 21;
		salario = 1503.5;
		altura = 1.56;
		genero = 'F'; //Quando usamos tipo Char devemos colocar o conteudo que a variavel recebe entre aspas simples.
		nome = "Samara Almeida"; //No tipo String utiliza-se aspas duplas.
		
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + String.format("%.2f", salario)); //String.format: Formata o numero para ter duas casas decimais.
		System.out.println("ALTURA = " + String.format("%.2f", altura)); 
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);

	}
}
