import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 110.20;
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite o número da sua conta");
        String numero = scanner.next();//tipo string
        Thread.dumpStack();

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá  " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
       
    }
}
