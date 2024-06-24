import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit; //Declaração de variáveis.
        char escolha;
        do {
            System.out.print("Digite a temperatura em Celsius: "); //Entrada de dados.
            celsius = sc.nextDouble();
            fahrenheit = (celsius * 9 / 5) + 32; //Converte uma temperatura em Celsius para Fahrenheit.
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit); //Mostra resultado.
            System.out.print("Deseja repetir (s/n)? ");
            escolha = sc.next().charAt(0);
        } while (escolha == 's'); //Executa o bloco acima ao menos uma vez e enquanto a condição for verdadeira repete.
    }
}
