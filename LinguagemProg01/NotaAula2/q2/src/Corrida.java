public class Corrida {

    private double distancia, tarifaBase, fatorDemanda, valorCorrida;
    private int tempoEspera;



    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }
    public double calcularValorCorrida(){
        valorCorrida = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;
        return valorCorrida;
    }
    public void exibirDetalhesCorrida(){
        System.out.println("====Recibo da sua corrida====");
        System.out.println("Distância percorrida: " + distancia);
        System.out.println("Tempo de espera: " + tempoEspera);
        System.out.println("Tarifa base: " + tarifaBase);
        System.out.println("Fator de demanda: " + fatorDemanda);
        System.out.println("Distância percorrida: " + distancia);
        System.out.println("__________________________________");
        System.out.println("VALOR TOTAL DA CORRIDA: " + valorCorrida);
    }

}