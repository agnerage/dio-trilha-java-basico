package ContaBanco;

// Inclui o import do Scanner.

import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
    

        int numero = 1021;
        String agencia ="067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);
        
        // Pede a entrada dos dados ao usuário.

        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner.

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine(); 

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.nextLine(); 

        System.out.println("Por favor, digite o valor do saldo !");
        saldo = scanner.nextDouble();

        // Constroi a mensagem final sobre o status da conta e que ela foi criada.
        String mensagem = "Olá ".concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
        .concat(agencia)
        .concat(", conta ")
        .concat(String.valueOf(numero)) 
        .concat(" e seu saldo de R$ ")
        .concat(String.valueOf(saldo)) 
        .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}