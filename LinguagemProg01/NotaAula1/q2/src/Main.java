import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();

        String menu = "r";
        do{
            System.out.println("====Escolha uma opção: 1-Cadastrar produto; 2-Comprar produto");
            int x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("====Cadastrar produto====");
                    System.out.println("Digite o nome do produto: ");
                    p1.setNome(sc.next());
                    System.out.println("Digite o código do produto: ");
                    p1.setCodigo(sc.next());
                    System.out.println("Digite a cor do produto: ");
                    p1.setCor(sc.next());
                    System.out.println("Digite o tamanho do produto [PP/P/M/G/GG]: ");
                    p1.setTamanho(sc.next());
                    System.out.println("Digite a quantidade em estoque do produto: ");
                    p1.setQtdeEstoque(sc.nextInt());
                    System.out.println("Digite o valor da unidade do produto: ");
                    p1.setValor(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("====Comprar produto====");
                    System.out.println("Digite a quantidade do produto que deseja comprar: ");
                    int qtde = sc.nextInt();
                    p1.detalhesVenda(qtde);
                    String prosseguir = p1.getProsseguir();
                    if (prosseguir.equals("s")){
                        System.out.println("Digite como deseja pagar: ");
                        System.out.println("1-A vista, com 5% de desconto (Pix, Espécie, Transferência ou Débito)");
                        System.out.println("2-Crédito, em até 3x sem juros");
                        int pgto = sc.nextInt();
                        if (pgto == 1){
                            System.out.println("Digite o valor entregue pelo cliente: ");
                            double valor = sc.nextDouble();
                            p1.vendaAVista(qtde, valor);
                        } else if (pgto == 2){
                            System.out.println("Em quantas parcelas deseja comprar: ");
                            int parcela = sc.nextInt();
                            p1.vendaACredito(qtde, parcela);
                        }
                    }

            }
            System.out.println("Continuar no programa? S/N");
            menu = sc.next();
        } while (menu.equalsIgnoreCase("S"));
    }
}