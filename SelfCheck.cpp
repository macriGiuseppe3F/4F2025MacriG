#include <iostream>
#include <string>

using namespace std;

struct Studente {
    char nome[30];
    char cognome[30];
    float voto;
};

// Funzione per inserire gli studenti
void inserisciStudenti(Studente studenti[], int n){
    // CORRETTO: Nella struttura del for servono i punti e virgola ';', non le virgole ','
    for(int i=0; i<n; i++){
        // CORRETTO: Aggiunto il '+' per stampare correttamente il numero (es. Studente 1)
        cout << "\nStudente " << i + 1 << endl;

        cout << "Nome: ";
        cin >> studenti[i].nome;

        cout << "Cognome: ";
        cin >> studenti[i].cognome;

        cout << "Voto: ";
        cin >> studenti[i].voto;
    }
}

// Funzione per stampare gli studenti.
void stampaStudenti(Studente studenti[], int n){
    // CORRETTO: Tolto il punto e virgola errato prima di endl
    cout << "\n-----ELENCO STUDENTI-----" << endl;
    for(int i = 0; i<n; i++){
         cout << studenti[i].nome << " "
              << studenti[i].cognome
              << " - Voto: "
              << studenti[i].voto << endl;
    }
}

// Funzione per calcolare la media
float calcolaMedia(Studente studenti[], int n){
    float somma = 0;
    for(int i = 0; i<n; i++){
        somma += studenti[i].voto;
    }

    return somma / n;
}

// Funzione per trovare il voto migliore
int trovaMigliore(Studente studenti[], int n) {
    int indice = 0;

    for (int i = 1; i < n; i++) {
        if (studenti[i].voto > studenti[indice].voto) {
            indice = i;
        }
    }

    return indice;
}

// Funzione per contare le sufficienze
// CORRETTO: Rinominata in contaSufficienti (come la chiami nel main) e cambiato il tipo di ritorno in 'int'
int contaSufficienti(Studente studenti[], int n){
    int cont = 0;
    for(int i = 0 ; i<n; i++){
        // CORRETTO: Mancava l'indice [i] dopo studenti
        if(studenti[i].voto >= 6){
            cont++;
        }
    }
    
    return cont;
}

// Funzione per cercare uno studente per cognome
void cercaStudente(Studente studenti[], int n) {
    string cognomeRicerca;
    bool trovato = false;

    cout << "\nInserisci il cognome da cercare: ";
    cin >> cognomeRicerca;

    for (int i = 0; i < n; i++) {
        // Nota: Funziona anche se cognome è un array di char e cognomeRicerca è una string di C++
        if (studenti[i].cognome == cognomeRicerca) {
            cout << "\nStudente trovato:" << endl;
            cout << studenti[i].nome << " "
                 << studenti[i].cognome
                 << " - Voto: "
                 << studenti[i].voto << endl;

            trovato = true;
        }
    }

    if (!trovato) {
        cout << "Studente non trovato." << endl;
    }
}

int main() {
    const int MAX = 10;
    Studente studenti[MAX];

    int n;

    // Controllo input
    do {
        cout << "Quanti studenti vuoi inserire? (1-10): ";
        cin >> n;
    } while (n < 1 || n > 10);

    inserisciStudenti(studenti, n);

    stampaStudenti(studenti, n);

    // Media
    float media = calcolaMedia(studenti, n);
    cout << "\nMedia voti: " << media << endl;

    // Migliore studente
    int migliore = trovaMigliore(studenti, n);

    cout << "\nStudente con voto piu' alto:" << endl;
    cout << studenti[migliore].nome << " "
         << studenti[migliore].cognome
         << " - Voto: "
         << studenti[migliore].voto << endl;

    // Sufficienti
    int sufficienti = contaSufficienti(studenti, n);

    cout << "\nNumero studenti sufficienti: "
         << sufficienti << endl;

    // Ricerca
    cercaStudente(studenti, n);

    return 0;
}