public class ContaCorrente {
    private String titular;
    private double saldo = 0;

    public void setNome(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void sacarChequeEspecial(double valor) {
        if (this.saldo - valor >= -1000){
            this.saldo -= valor;
        } else {
            System.out.println("Você não tem saldo suficiente no cheque especial.");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        if (saldo >= 0) {
            System.out.println("Limite atual do cheque especial: R$1000,00");
        } else {
            System.out.println("Limite restante no cheque especial: R$" + (saldo + 1000));
        }
    }
}