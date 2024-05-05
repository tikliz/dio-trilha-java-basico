import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner mScan = new Scanner(System.in);
        mScan.useLocale(Locale.US);
        System.out.println("Por favor, digite o numero da conta: ");
        int accountNumber = mScan.nextInt();
        mScan.nextLine();
        
        System.out.println("Digite a agência: ");
        String agency = mScan.nextLine();

        System.out.println("Digite a nome do cliente: ");
        String clientName = mScan.nextLine();

        System.out.println("Digite o saldo: ");
        float balance = mScan.nextFloat();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque");

        mScan.close();
    }
}
