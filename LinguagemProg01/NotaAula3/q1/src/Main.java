import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();
        Programador p1 = new Programador();

        String repetir = "r";
        do {
            System.out.println("===CADASTRO DE FUNCIONÁRIO===");
            System.out.println("1 - Cadastrar um gerente");
            System.out.println("2 - Cadastrar um programador");
            System.out.println("3 - Cadastrar um outro tipo de funcionário");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("===CADASTRO DE GERENTE===");
                    System.out.println("Digite o nome:");
                    g1.setNome(sc.next());
                    System.out.println("Digite o salário:");
                    g1.setSalario(sc.nextDouble());
                    System.out.println("Digite a data de nascimento:");
                    System.out.println("Dia");
                    g1.setDiaNasc(sc.nextInt());
                    System.out.println("Mês");
                    g1.setMesNasc(sc.nextInt());
                    System.out.println("Ano");
                    g1.setAnoNasc(sc.nextInt());
                    System.out.println("Digite o projeto com a qual ele trabalha:");
                    g1.setProjeto(sc.next());
                    System.out.println("Informações do gerente: ");
                    g1.informarSalario();
                    g1.calcularIdade();
                    g1.informarProjeto();
                    break;
                case 2:
                    System.out.println("===CADASTRO DE PROGRAMADOR===");
                    System.out.println("Digite o nome:");
                    p1.setNome(sc.next());
                    System.out.println("Digite o salário:");
                    p1.setSalario(sc.nextDouble());
                    System.out.println("Digite a data de nascimento:");
                    System.out.println("Dia");
                    p1.setDiaNasc(sc.nextInt());
                    System.out.println("Mês");
                    p1.setMesNasc(sc.nextInt());
                    System.out.println("Ano");
                    p1.setAnoNasc(sc.nextInt());
                    System.out.println("Digite a linguagem com a qual ele trabalha:");
                    p1.setLinguagem(sc.next());
                    System.out.println("Informações do programador: ");
                    p1.informarSalario();
                    p1.calcularIdade();
                    p1.informarLinguagem();
                    break;
                case 3:
                    System.out.println("===CADASTRO DE FUNCIONÁRIO===");
                    System.out.println("Digite o nome:");
                    f1.setNome(sc.next());
                    System.out.println("Digite o salário:");
                    f1.setSalario(sc.nextDouble());
                    System.out.println("Digite a data de nascimento:");
                    System.out.println("Dia");
                    f1.setDiaNasc(sc.nextInt());
                    System.out.println("Mês");
                    f1.setMesNasc(sc.nextInt());
                    System.out.println("Ano");
                    f1.setAnoNasc(sc.nextInt());
                    System.out.println("Informações do funcionário: ");
                    f1.informarSalario();
                    f1.calcularIdade();
                    break;
                default:
                    break;
            }
            System.out.println("Deseja fazer novo cadastro?");
            repetir = sc.next();
        } while (repetir.equals("r"));
    }
}