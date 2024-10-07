package src;
import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

         System.out.println("Informe seu saldo: ");
         double saldo = scanner.nextDouble();

         System.out.println("Olá "+ nome + " Obrigada por criar uma conta em nosso banco, sua agência é "+ agencia + " ," + "conta: "+ conta + " e seu saldo é de "+ saldo + " já está disponível para saque");
    }
}
