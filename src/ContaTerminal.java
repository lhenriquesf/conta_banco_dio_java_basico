import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome !");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo !");
        double saldoConta = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoConta);
    }
}