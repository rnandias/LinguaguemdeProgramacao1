public class Aluno {
    private String nome;
    private String situacao;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public Aluno() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        this.media = (this.nota1 + this.nota2 + this.nota3) / 3.0;
        return this.media;
    }

    public String verificarAprovacao() {
        if (this.media >= 7.0) {
            this.situacao = "Aprovado";
        } else if (this.media >= 5.0 & this.media < 7.0) {
            this.situacao = "Recuperação";
        } else {
            this.situacao = "Reprovado";
        }

        return this.situacao;
    }

    public void exibirDetalhesAluno() {
        this.calcularMedia();
        this.verificarAprovacao();
        System.out.println("====Boletim do aluno====");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Nota 3: " + this.nota3);
        System.out.println("Média: " + this.media);
        System.out.println("Situação: " + this.situacao);
    }
}
