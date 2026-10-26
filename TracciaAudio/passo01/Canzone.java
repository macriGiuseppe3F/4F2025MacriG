package tracciaaudio;

// Sottoclasse che eredita da TracciaAudio
public class Canzone extends TracciaAudio {
    private String autore;

    public Canzone(String titolo, int durata, String autore) {
        super(titolo, durata);
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }
}