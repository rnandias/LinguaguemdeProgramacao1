import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir = "r";
        do{
            System.out.println("===CADASTRO DE ANIMAIS===");
            System.out.println("Digite o nome do animal: ");
            String nome = sc.next();
            System.out.println("Digite a raça do animal:");
            String raca = sc.next();
            if (raca.equalsIgnoreCase("cachorro")){
                Cachorro c1 = new Cachorro(nome);
                c1.late();
                c1.caminha();
            } else if (raca.equalsIgnoreCase("gato")){
                Gato g1 = new Gato(nome);
                g1.mia();
                g1.caminha();
            } else {
                Animal a1 = new Animal(nome);
                System.out.println("O animal pode caminhar? [true/false]");
                a1.setPodeCaminhar(sc.nextBoolean());
                a1.caminha();
            }
            System.out.println("Deseja cadastrar outro animal? Digite 'r'");
            repetir = sc.next();
        } while (repetir.equalsIgnoreCase("r"));
    }
}