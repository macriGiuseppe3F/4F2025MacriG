package tracciaaudio;

public class Podcast extends TracciaAudio {
    private String conduttore;

    public Podcast(String titolo, int durata, String conduttore) {
        super(titolo, durata);
        this.conduttore = conduttore;
    }

    public String getConduttore() {
        return conduttore;
    }

    // Aggiunto nel Passo 02
    @Override
    public void mostraDettagli() {
        System.out.println("[Podcast] Titolo: " + getTitolo() + " | Durata: " + getDurata() + "s | Conduttore: " + conduttore);
    }
}