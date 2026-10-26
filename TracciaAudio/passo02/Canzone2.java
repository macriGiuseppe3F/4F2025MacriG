package tracciaaudio;

public class Canzone extends TracciaAudio {
    private String autore;

    public Canzone(String titolo, int durata, String autore) {
        super(titolo, durata);
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    // Aggiunto nel Passo 02
    @Override
    public void mostraDettagli() {
        System.out.println("[Canzone] Titolo: " + getTitolo() + " | Durata: " + getDurata() + "s | Autore: " + autore);
    }
}