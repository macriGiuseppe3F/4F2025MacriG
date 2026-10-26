package tracciaaudio;

public class Main {
    public static void main(String[] args) {
        // Aggiunti nel Passo 02: Array Playlist, popolamento e ciclo for-each
        TracciaAudio[] playlist = new TracciaAudio[4];

        playlist[0] = new Canzone("Bohemian Rhapsody", 354, "Queen");
        playlist[1] = new Podcast("Puntata 1 - Tech News", 1800, "Mario Rossi");
        playlist[2] = new Canzone("Imagine", 183, "John Lennon");
        playlist[3] = new Podcast("Puntata 2 - Storia Digitale", 2400, "Luca Bianchi");

        System.out.println("--- PLAYLIST ---");
        for (TracciaAudio traccia : playlist) {
            traccia.mostraDettagli();
        }
    }
}