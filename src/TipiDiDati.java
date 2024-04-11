public class TipiDiDati {
    public static void main(String[] args) {
        Esercizi esercizi = new Esercizi();
        esercizi.EsercizioUno();
        esercizi.EsercizioDue();
        esercizi.EsercizioTre();
        esercizi.EsercizioQuattro();
        esercizi.EsercizioCinque();
        esercizi.EsercizioSei();
        esercizi.EsercizioSette();
        esercizi.EsercizioOtto();
        esercizi.EsercizioNove();
        esercizi.EsercizioDieci();
    }
}

class Esercizi {
    //h Esercizio 1: Dichiarare e stampare un intero
    public void EsercizioUno() {
        int numero = 10;
        System.out.println(numero);
    }

    //h Esercizio 2: Dichiarare e stampare un float
    public void EsercizioDue() {
        float altezza = 1.75f;
        System.out.println(altezza);
    }

    //h Esercizio 3: Dichiarare e stampare un boolean
    public void EsercizioTre() {
        boolean isPieno = true;
        System.out.println(isPieno);
    }

    //h Esercizio 4: Dichiarare e stampare un char
    public void EsercizioQuattro() {
        char lettera = 'A';
        System.out.println(lettera);
    }

    //h Esercizio 5: Dichiarare e stampare una stringa
    public void EsercizioCinque() {
        String nome = "Mario Rossi";
        System.out.println(nome);
    }

    //h Esercizio 6: Dichiarare e stampare un double
    public void EsercizioSei() {
        double peso = 68.5;
        System.out.println(peso);
    }

    //h Esercizio 7: Sommare due interi e stampare il risultato
    public void EsercizioSette() {
        int numero1 = 5;
        int numero2 = 10;
        int somma = numero1 + numero2;
        System.out.println(somma);
    }

    //h Esercizio 8: Sottrarre due double e stampare il risultato
    public void EsercizioOtto() {
        double prezzo1 = 4.99;
        double prezzo2 = 2.5;
        double differenza = prezzo1 - prezzo2;
        System.out.println(differenza);
    }

    //h Esercizio 9: Dichiarare e stampare un long
    public void EsercizioNove() {
        long popolazioneMondiale = 7800000000L;
        System.out.println(popolazioneMondiale);
    }

    //h Scrivi un programma Java che dichiara una variabile di tipo byte chiamata "eta" e le assegna il valore 25.
    //h Stampa il valore della variabile.
    public void EsercizioDieci() {
        byte eta = 25;
        System.out.println(eta);
    }
}



