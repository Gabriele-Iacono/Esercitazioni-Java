import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Esercizi3 esercizi3 = new Esercizi3();
        esercizi3.EsercizioUno();
        esercizi3.EsercizioDue();
        esercizi3.EsercizioTre();
        esercizi3.EsercizioQuattro();
        esercizi3.EsercizioCinque();
        esercizi3.EsercizioSei();
        esercizi3.EsercizioSette();
    }
}

class Esercizi3{
    public void EsercizioUno() {
 //Stampare i numeri da 1 a 10 utilizzando un ciclo "for"
        for(int i = 1; i <=10; i ++){
            System.out.println(i);
        }
    }
    public void EsercizioDue(){
// Calcolare la somma dei numeri da 1 a 100 utilizzando un ciclo "for"
        int somma = 0; // non 1 ma 0
        for (int i = 1; i <=100; i ++) {
            somma += i;
        }
        System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
    }

    public void EsercizioTre() {
//c Stampare i numeri pari da 1 a 20 utilizzando un ciclo "for"
//la variabile i viene inizializzata a 2
   for (int i = 2; i<=20; i += 2){
       System.out.println(i);
   }
    }

    public void EsercizioQuattro() {
 //Stampare la tabellina del 5 utilizzando un ciclo "for":
        int numero = 5;
        for (int i = 1; i<=10; i ++ ){
            int risultato = 5 * i;

       System.out.println(numero + " x " + i + " = " + risultato);
 }
    }

    public void EsercizioCinque() {
// Stampare i caratteri di una stringa uno alla volta utilizzando un ciclo "for":
        String testo = "Maritozzo";
        for (int i = 0; i < testo.length(); i++) {
// Questa riga estrae il carattere nella posizione
// i dalla stringa "testo"
            char carattere = testo.charAt(i);
// e lo assegna alla variabile carattere.
            System.out.println(carattere);
        }
    }

    public void EsercizioSei() {
//c Stampare i numeri in ordine decrescente da 10 a 1 utilizzando un ciclo "for":
        for (int i = 10; i>=1; i--){
            System.out.println(i);
        }
    }

    public void EsercizioSette() {
        //c Stampare una sequenza di numeri in base all'input dell'utente utilizzando un ciclo "for":
        // es: l'utente mette 8, stampare da 1 a 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        //c Leggi l'input dell'utente come intero
        int numero = scanner.nextInt();
        System.out.println("Sequenza di numeri da 1 a " + numero);
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }














}