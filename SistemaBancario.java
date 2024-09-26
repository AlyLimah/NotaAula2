import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("Bem-vindo ao Sistema Bancário!");
        System.out.println("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.println("Selecione o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();

        if (tipoConta == 1) {
            conta = new ContaCorrente(titular);
        } else if (tipoConta == 2) {
            System.out.println("Digite o valor da taxa Selic atual (%): ");
            double selic = scanner.nextDouble();
            conta = new ContaPoupanca(titular, selic);
        }

        if (conta != null) {
            boolean sair = false;
            while (!sair) {
                System.out.println("\nMenu de opções:");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                if (conta instanceof ContaCorrente) {
                    System.out.println("3. Usar cheque especial");
                } else if (conta instanceof ContaPoupanca) {
                    System.out.println("3. Calcular rendimento");
                }
                System.out.println("4. Exibir dados da conta");
                System.out.println("5. Sair");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor a depositar:");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.println("Digite o valor a sacar:");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        break;
                    case 3:
                        if (conta instanceof ContaCorrente) {
                            System.out.println("Digite o valor a usar do cheque especial:");
                            double valorCheque = scanner.nextDouble();
                            ((ContaCorrente) conta).usarChequeEspecial(valorCheque);
                        } else if (conta instanceof ContaPoupanca) {
                            ((ContaPoupanca) conta).calcularRendimento();
                        }
                        break;
                    case 4:
                        conta.exibirDadosConta();
                        break;
                    case 5:
                        sair = true;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }

        scanner.close();
    }
}

