public class Uber {
    private double distancia, tarifaBase, fatorDemanda;
    private int tempoEspera;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }
    public double calcularValorCorrida(){
        double ValorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;
        return ValorFinal;
    }

    public Uber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    public void exibirDetalhesCorrida(){
        System.out.println("Detalhes da Corrida:");
        System.out.println("Distância Percorrida: " + distancia + "km");
        System.out.println("Tarifa Base: " + tarifaBase);
        System.out.println("Fator Demanda: " + fatorDemanda);
        System.out.println("Tempo Espera: " + tempoEspera);
        System.out.println("Valor da corrida: " + calcularValorCorrida());
    }

}

