import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 1;
        double saldo = 2500;
        System.out.println("*************************************");
        System.out.println("*****Dados Cliente*****");
        System.out.println("Nome:  Alexandre De Santana Souza");
        System.out.println("Tipo de Conta: Conta Corrente");
        System.out.println("Saldo Atual "+ saldo);
        System.out.println("*************************************");

        while (opcao != 4) {
            System.out.println("-----Menu-----");
            System.out.println("1- Saldo da Conta ");
            System.out.println("2- Tranferir ");
            System.out.println("3- Receber ");
            System.out.println("4- Sair ");
            System.out.println("Digite a Opção Desejada: ");
         opcao = scanner.nextInt();



            if (opcao == 1) {
                System.out.println("Seu Saldo Atual é " + saldo);

            } else if (opcao == 2) {
                System.out.print("Digite o Valor da transfêrencia:" );

                double transAtual = scanner.nextDouble();
                 saldo = saldo-transAtual;
                System.out.println("Transferência realizada com sucesso!"  );

                System.out.println("Seu Saldo Atual é:"+saldo);
            } else if (opcao == 3) {
                System.out.println("Digite o Valor do Deposito:" );

                double deposito = scanner.nextDouble();
                saldo = saldo+deposito;
                System.out.println("Deposito Realiado com Sucesso!" );
                System.out.println("Seu Saldo Atual é " + saldo);

            } else if (opcao == 4) {
                System.out.println("Programa Encerrado");

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }


        }
    }
}