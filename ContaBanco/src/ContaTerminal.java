import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner = true
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        System.out.print("Por gentileza, informe a agência: ");
        String agencia = sc.next();
        System.out.print("Para seguirmos informe seu nome: ");
        String nomeCliente = sc.next();
        sc.nextLine();
        System.out.print("Informe seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("\n Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        sc.close();
    }
}
