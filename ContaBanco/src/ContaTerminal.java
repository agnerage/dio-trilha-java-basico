import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int Numero;
        String Agencia;
        String Cliente;
        double Saldo;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta !");
            Numero = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Por favor, digite o número da Agência !");
            Agencia = scanner.nextLine(); 

            System.out.println("Por favor, digite o nome do Cliente !");
            Cliente = scanner.nextLine(); 

            System.out.println("Por favor, digite o número do saldo !");
            Saldo = scanner.nextDouble();

            // Construir a mensagem final 
            String mensagem = "Olá ".concat(Cliente).concat(", ")
                .concat("obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(Agencia).concat(", ")
                .concat("conta ").concat(String.valueOf(Numero)).concat(" e seu saldo ")
                .concat(String.valueOf(Saldo)).concat(" já está disponível para saque.");

            System.out.println(mensagem);

      
    scanner.close();
    }
}