import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;
        
        System.out.print("Por favor, digite o número da Agência !\n");
        String numeroInserido = scanner.next();
        
        if (numeroInserido.equals(agencia)) {
            System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo " + saldo + " já está disponível para saque");
        }   
        else{
            System.out.print("O numero informado está errado!\n Tente novamente\n");
            main(args);
        }
    }


}
