import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); 
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numeroConta + 
                          " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
