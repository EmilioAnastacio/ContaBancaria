import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        conta Conta = new conta();
        BigDecimal aumento = new BigDecimal("0.05");
        boolean continuar = true;
        boolean menu = true;
        int sair = 0;
        int opc = 0;

        System.out.println("Bem vindo a sua conta bancara");

        while (continuar){
            System.out.println("Insira seu nome: ");
            String nome = scanner.nextLine();
            Conta.setNome(nome);

            System.out.println("Bem vindo," + nome);
            System.out.println("Saldo Atual: " + Conta.getUnidade());
            System.out.println("Saldo Investido: " + Conta.getSaldoInvestido());
            System.out.println("");

            continuar = false;
        }

        while (opc !=5){

            System.out.println("Qual operação deseja realizar?");

            System.out.println("Depositar - 1");
            System.out.println("Sacar - 2");
            System.out.println("Investir - 3");
            System.out.println("Dados da Conta - 4");

            opc = scanner.nextInt();

            switch (opc){

                case 1:
                    Conta.depositar();
                    break;

                case 2:
                        Conta.resgatar();
                        break;
                case 3:
                    Conta.Investir();
                    break;

                case 4:

                    System.out.println(Conta.getNome());
                    System.out.println(Conta.getUnidade());
                    System.out.println(Conta.getSaldoInvestido());
                    break;
                default:
                    System.out.println("valor invalido.");

                    }


            }
        Conta.setUnidade(Conta.getUnidade().multiply(BigDecimal.ONE.add(aumento)));
        scanner.close();

        }

    }
