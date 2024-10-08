public class Produto {
    private String codigo, nome, cor, tamanho, prosseguir;
    private int qtdeEstoque;
    private double valor;

    public String getProsseguir() {
        return prosseguir;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void detalhesVenda(int qtde) {
        if (qtde <= qtdeEstoque){
            System.out.println("O valor total da compra é R$" + (this.valor * qtde));
            this.prosseguir = "s";
        } else {
            System.out.println("Não há itens suficientes no estoque.");
            this.prosseguir = "n";
        }

    }

    public void realizarVenda(int qtdeCompra){
        this.qtdeEstoque -= qtdeCompra;
        System.out.println("Compra realizada.");

    }

    public void vendaAVista(int qtde, double valorPago){
        double preco = this.valor * qtde;
        double precoFinal = preco - (preco * 0.05);
        double troco = valorPago - precoFinal;
        realizarVenda(qtde);
        System.out.println("O preço final do produto é " + precoFinal);
        if (troco > 0){
            System.out.println("Seu troco é de " + troco);
        }
    }

    public void vendaACredito(int qtde, int parcelas){
        double parcela = this.valor / parcelas;
        realizarVenda(qtde);
        System.out.println("Ficam " + parcelas + " de R$" + parcela);
    }

}