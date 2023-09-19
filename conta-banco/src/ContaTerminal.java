import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        double saldoConta= Double.valueOf(args[0]);

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da conta! ");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o número da Âgencia! ");
            String numeroAgencia = scanner.next();

            System.out.println("Por favor, digite o número da Nome! ");
            String nomeCliente = scanner.next();

            //Exibir a mensagem final da conta criada

            System.out.println(" Olá "
            .concat(nomeCliente)
            .concat(", Obrigado por criar uma conta em nosso banco, sua agência é "
            .concat(numeroAgencia).concat(", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque ")));
        }

        
    }
}
