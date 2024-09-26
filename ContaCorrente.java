public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial = 1000.00;

    public ContaCorrente(String titular) {
        super(titular);
    }
    public void usarChequeEspecial(double valor) {
        if (valor <= chequeEspecial) {
            saldo -= valor;
            chequeEspecial -= valor;
            System.out.println("Cheque especial usado. Valor: R$" + valor);
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }
        public void exibirDadosConta() {
            System.out.println("Conta Corrente");
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: R$" + saldo);
            System.out.println("Limite Cheque Especial: R$" + chequeEspecial);
        }


    }

