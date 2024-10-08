import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();


        String banco = "r";
        do {
            System.out.println("===BANCO===");
            System.out.println("1 - Abrir conta; 2 - Acessar conta");
            int opcao = sc.nextInt();
            double quanto;
            switch (opcao) {
                case 1:
                    System.out.println("===ABRIR CONTA===");
                    System.out.println("1 - Abrir conta corrente; 2 - Abrir conta poupanca");
                    int tipo = sc.nextInt();
                    switch (tipo) {
                        case 1:
                            System.out.println("===ABRIR CONTA CORRENTE===");
                            System.out.println("Digite o nome do titular: ");
                            cc1.setNome(sc.next());
                            break;
                        case 2:
                            System.out.println("===ABRIR CONTA POUPANÇA===");
                            System.out.println("Digite o nome do titular: ");
                            cp1.setNome(sc.next());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("===ACESSAR CONTA===");
                    System.out.println("1 - Acessar conta corrente; 2 - Acessar conta poupanca");
                    int acessar = sc.nextInt();
                    String repetir = "r";
                    switch (acessar) {
                        case 1:
                            do {
                                System.out.println("===CONTA CORRENTE===");
                                System.out.println("1 - Depositar; 2 - Sacar; 3 - Sacar do cheque especial; 4 - Exibir dados");
                                int acao = sc.nextInt();
                                switch (acao) {
                                    case 1:
                                        System.out.println("===DEPOSITAR===");
                                        System.out.println("Quanto deseja depositar? ");
                                        quanto = sc.nextDouble();
                                        cc1.depositar(quanto);
                                        break;
                                    case 2:
                                        System.out.println("===SACAR===");
                                        System.out.println("Quanto deseja sacar? ");
                                        quanto = sc.nextDouble();
                                        cc1.sacar(quanto);
                                        break;
                                    case 3:
                                        System.out.println("===SACAR DO CHEQUE===");
                                        System.out.println("Quanto deseja sacar? ");
                                        quanto = sc.nextDouble();
                                        cc1.sacarChequeEspecial(quanto);
                                        break;
                                    case 4:
                                        System.out.println("===EXIBIR DADOS===");
                                        cc1.exibirDados();
                                        break;
                                }
                                System.out.println("Deseja fazer outra operação na conta corrente?");
                                repetir = sc.next();
                            } while (repetir.equals("r"));
                            break;
                        case 2:
                            do {
                                System.out.println("===CONTA POUPANÇA===");
                                System.out.println("1 - Depositar; 2 - Sacar; 3 - Calcular rendimento; 4 - Exibir dados");
                                int acao = sc.nextInt();
                                switch (acao) {
                                    case 1:
                                        System.out.println("===DEPOSITAR===");
                                        System.out.println("Quanto deseja depositar? ");
                                        quanto = sc.nextDouble();
                                        cp1.depositar(quanto);
                                        break;
                                    case 2:
                                        System.out.println("===SACAR===");
                                        System.out.println("Quanto deseja sacar? ");
                                        quanto = sc.nextDouble();
                                        cp1.sacar(quanto);
                                        break;
                                    case 3:
                                        System.out.println("===CALCULAR RENDIMENTO===");
                                        System.out.println("Qual o valor da SELIC? ");
                                        double selic = sc.nextDouble();
                                        System.out.println("De quantos meses será o investimento? ");
                                        int meses = sc.nextInt();
                                        cp1.calcularRendimento(selic, meses);
                                        break;
                                    case 4:
                                        System.out.println("===EXIBIR DADOS===");
                                        cp1.exibirDados();
                                        break;
                                }
                                System.out.println("Deseja fazer outra operação na conta poupança? Digite 'r'.");
                                repetir = sc.next();
                            } while (repetir.equals("r"));
                            break;
                    }
            }
            System.out.println("Deseja fazer outra operação? Digite 'r'.");
            banco = sc.next();
        } while (banco.equals("r"));

    }
}