import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = entrada.next();

        System.out.print("Digite o número da conta: ");
        int conta = entrada.nextInt();

        System.out.print("Digite o saldo do cliente: ");
        double saldo = entrada.nextDouble();

        System.out.print("Digite o número da agência: ");
        String agencia = entrada.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);


        entrada.close();
    }
}
