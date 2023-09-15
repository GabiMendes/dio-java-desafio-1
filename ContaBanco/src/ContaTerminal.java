import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero de sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero de sua agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da sua conta:");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Ola, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
