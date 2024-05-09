
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso terminal

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem criada

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da agência :");
        numero = sc.nextInt();

        System.out.println("Digite o nome da agencia :");
        agencia = sc.next();

        System.out.println("Digite o seu nome :");
        nomeCliente = sc.next();

        System.out.println("Digite o saldo da sua conta :");
        saldo = sc.nextDouble();

    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta na agência bancária, a agência bancária é " + agencia + " conta " + numero + ", o saldo da conta é R$" + saldo);


    }
}
