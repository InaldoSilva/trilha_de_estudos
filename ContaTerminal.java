import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a)!");
        System.out.println("Digite o número da sua conta: ");
        String numeroConta = scanner.nextLine();
        System.out.println("                 ");

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();
        System.out.println("                   ");

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("                 ");

        System.out.println("Digite o sua senha: ");
        String senha = scanner.nextLine();
        System.out.println("                   ");

        double saldo;
        saldo= 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta " + numeroConta + ". seu saldo atual é de R$ " + saldo + ", e já está disponível para saque.");
    }


}
