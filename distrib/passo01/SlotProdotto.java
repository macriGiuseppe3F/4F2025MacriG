package distrib.passo01;

public class SlotProdotto {
    private String codiceSlot;
    private Prodotto prodotto;
    private int quantita;

    public SlotProdotto(String codiceSlot, Prodotto prodotto, int quantitaIniziale) {
        this.codiceSlot = codiceSlot;
        this.prodotto = prodotto;
        this.quantita = quantitaIniziale;
    }

    public String getCodiceSlot() {
        return codiceSlot;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public boolean isDisponibile() {
        return false; // Dummy return
    }

    public boolean eroga() {
        return false; // Dummy return
    }

    public void ricarica(int quantita) {
        // Metodo vuoto
    }
}