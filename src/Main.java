
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Arthur";
        String conta = "Corrente";
        double saldo = 1000.00;
        double transferencia;
        double recibo;

        for (int opcao = 0; opcao <= 50; opcao++) {
            System.out.println("\nBem-vindo " + nome );
            System.out.println("Conta " + conta);
            System.out.println("--------------------------------");
            System.out.println("saldo = " + saldo);
            System.out.println("----------------------------------");
            System.out.println("1 - Consultar o saldo");
            System.out.println("2 - Receber valores");
            System.out.println("3- Transfeir valores");
            System.out.println("4 - sair");

            System.out.println("Digite a opção desejada:");
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println(saldo);
            } else if (opcao == 2) {

                System.out.println("\nDigite o valor recebido: ");
                recibo = leitura.nextDouble();
                saldo = saldo + recibo;

            }else if (opcao == 3) {
                System.out.println("\nDigite o valor que deseja tranferir:");
                transferencia = leitura.nextDouble();
                saldo = saldo - transferencia;

                if (transferencia > saldo){
                    System.out.println("\nsaldo insuficiente");
                }
            } else if (opcao > 4 ){
                System.out.println("\nnúmero inválido");
            }

            if (opcao == 4) {
                break;
            }
        }

    }
}
