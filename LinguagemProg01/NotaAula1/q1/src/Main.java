import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("====Cadastar notas de aluno====");
        System.out.println("Digite o nome do aluno: ");
        a1.setNome(sc.next());
        System.out.println("Digite a primeira nota: ");
        a1.setNota1(sc.nextDouble());
        System.out.println("Digite a segunda nota: ");
        a1.setNota2(sc.nextDouble());
        System.out.println("Digite a terceira nota: ");
        a1.setNota3(sc.nextDouble());
        a1.exibirDetalhesAluno();
    }
}
