public class ContaPoupanca {
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

    public void calcularRendimento(double selic, int meses) {
        if (selic > 8.5){
            double saldoprevio = this.saldo;
            double novosaldo = saldoprevio;
            for (int i = 1; i <= meses; i++) {
                novosaldo += novosaldo * 0.05;
            }
            double rendimento = novosaldo - saldoprevio;
            System.out.println("O rendimento será de R$" + rendimento);
        } else {
            double saldoprevio = this.saldo;
            double novosaldo = saldoprevio;
            double taxa = selic * 0.007;
            for (int i = 1; i <= meses; i++) {
                novosaldo += novosaldo * taxa;
            }
            double rendimento = novosaldo - saldoprevio;
            System.out.println("O rendimento será de R$" + rendimento);
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}