package tracciaaudio;

// Sottoclasse che eredita da TracciaAudio
public class Podcast extends TracciaAudio {
    private String conduttore;

    public Podcast(String titolo, int durata, String conduttore) {
        super(titolo, durata);
        this.conduttore = conduttore;
    }

    public String getConduttore() {
        return conduttore;
    }
}