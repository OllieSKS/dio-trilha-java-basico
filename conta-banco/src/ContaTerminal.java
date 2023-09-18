import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        double saldoConta= 237.48;
        //TODO:Conhecer e importar a classe scanner
        //Obter pela classe scanner o valor digitado no terminal
        //Obter pela classe scanner o valor digitado no terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

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
