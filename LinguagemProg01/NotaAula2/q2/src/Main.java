import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Corrida c1 = new Corrida();

        System.out.println("====Calcular valor da corrida====");
        System.out.println("Digite a distância percorrida: ");
        c1.setDistancia(sc.nextDouble());
        System.out.println("Digite o tempo de espera: ");
        c1.setTempoEspera(sc.nextInt());
        System.out.println("Digite a tarifa base: ");
        c1.setTarifaBase(sc.nextDouble());
        System.out.println("Digite o fator de demanda R$ (1,0 = normal, 1,5 = pico): ");
        c1.setFatorDemanda(sc.nextDouble());

        c1.calcularValorCorrida();
        c1.exibirDetalhesCorrida();

    }
}