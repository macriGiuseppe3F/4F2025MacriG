package distrib.passo01;

public class GestoreCassa {
    private double creditoAttuale;

    public GestoreCassa() {
        this.creditoAttuale = 0.0;
    }

    public double getCreditoAttuale() {
        return creditoAttuale;
    }

    public void inserisciMoneta(TaglioMoneta moneta) {
        // Metodo vuoto
    }

    public double restituisciCredito() {
        return 0.0; // Dummy return
    }

    public boolean scalaCredito(double importo) {
        return false; // Dummy return
    }
}