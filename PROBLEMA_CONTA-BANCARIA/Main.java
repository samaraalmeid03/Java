package application;

//Importação da classe ContaBancaria do pacote entities.
import entities.ContaBancaria;

//Importação das classes Scanner e Locale da biblioteca padrão do Java.
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        ContaBancaria conta; //Declaração de variável do tipo ContaBancaria;

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); //Limpeza de buffer;
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Deseja faze um deposito inicial (s/n)? ");
        char escolha = sc.next().charAt(0); //O método charAt(0) extrai o primeiro caractere da entrada do usuário.
        if (escolha == 's' || escolha == 'S') { //Se o valor da variável escolha for 's' ou 'S' entra no if.
            System.out.print("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            /*Criação de nova instância de ContaBancaria passando numero, nomeTitular e depositoInicial
            como parâmetros.*/
            conta = new ContaBancaria(numero, nomeTitular, depositoInicial);
        }
        else {
            /*Criação de nova instância de ContaBancaria passando apenas numero
             e nomeTitular como parâmetros.*/
            conta = new ContaBancaria(numero, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do deposito: ");
        double valor = sc.nextDouble();
        conta.deposito(valor); // Chamada do método deposito.
        System.out.println("Dados da conta atualizados:"); //Exibição dos dados atualizados da conta.
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do saque: ");
        valor = sc.nextDouble();
        conta.saque(valor); //Chamada do método saque.
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
