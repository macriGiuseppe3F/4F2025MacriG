package distrib.passo01;

import java.util.ArrayList;
import java.util.List;

public class Distributore {
    private List<SlotProdotto> slots;
    private GestoreCassa cassa;

    public Distributore() {
        this.slots = new ArrayList<>();
        this.cassa = new GestoreCassa();
    }

    public void aggiungiSlot(SlotProdotto slot) {
        // Metodo vuoto
    }

    public void inserisciMoneta(TaglioMoneta moneta) {
        // Metodo vuoto
    }

    public double getCreditoAttuale() {
        return 0.0; // Dummy return
    }

    public boolean selezionaProdotto(String codiceSlot) {
        return false; // Dummy return
    }

    public double annullaOperazione() {
        return 0.0; // Dummy return
    }

    public List<SlotProdotto> getStatoSlot() {
        return null; // Dummy return
    }
}