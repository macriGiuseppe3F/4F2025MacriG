package distrib.passo01;

public class Prodotto {
    private String codice;
    private String nome;
    private double prezzo;

    public Prodotto(String codice, String nome, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}