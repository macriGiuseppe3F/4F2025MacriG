package tracciaaudio;

public class TracciaAudio {
    private String titolo;
    private int durata; // espressa in secondi

    public TracciaAudio(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void mostraDettagli() {
        System.out.println("Titolo: " + titolo + " | Durata: " + durata + "s");
    }
}