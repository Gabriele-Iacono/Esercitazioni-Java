import java.util.Scanner;

public class CondizionaliIf {
    public static void main(String[] args) {
        Esercizi2 esercizi2 = new Esercizi2();
        esercizi2.EsercizioUno();
        esercizi2.EsercizioDue();
        esercizi2.EsercizioTre();
        esercizi2.EsercizioQuattro();
        esercizi2.EsercizioCinque();
        esercizi2.EsercizioSei();

    }
    }
class Esercizi2{
    public void EsercizioUno() {
       // Scrivi un programma Java che verifica se un numero intero è positivo, negativo o zero.
        int numero = 1;
        if (numero>0){
            System.out.println("Il numero è positivo");
        }
        else if (numero<0){
            System.out.println("Il numero è negativo");
        }
        else{
            System.out.println("Il numero è zero");
        }
    }

    public void EsercizioDue() {
        //Scrivi un programma Java che verifica se un numero è pari o dispari.
        int numero = 1;
        if (numero % 2 == 0) {
            System.out.println("Il numero è pari");
        }
        else {
            System.out.println("Il numero è dispari");
        }
    }

    public void EsercizioTre() {
        //    Scrivi un programma Java che verifica
   //      se un carattere è una lettera maiuscola o una lettera minuscola.
        char chara ='C';
        if (Character.isUpperCase(chara)) {
            System.out.println("Il carattere è una lettera maiuscola");
        }
        else if (Character.isLowerCase(chara)){
            System.out.println("Il carattere è una lettera minuscola");
        }
        else {
            System.out.println("Questo carattere non è una lettera");
        }
    }

    public void EsercizioQuattro(){
        //c Scrivi un programma Java che verifica se una stringa è vuota o null.
        String testo = "";
        if (testo == null || testo.isEmpty()) {
            System.out.println("La stringa è vuota o null");
        }
    }

    public void EsercizioCinque() {
  //  Scrivi un programma Java che verifica
  //  se un numero è compreso tra due valori.
        int numero = 5;
        int valore1 = 1;
        int valore2 = 10;
        if (numero>=valore1 && numero<=valore2){
            System.out.println("Il numero è compreso tra i due valori");
        }
        else {
            System.out.println("Il numero non è compreso tra i due valori");
        }
    }

    public void EsercizioSei() {
//c    Scrivi un programma Java che calcola il prezzo scontato
//c    di un prodotto in base all'importo e al tasso di sconto.
        int importo = 100;
        double tdSconto = 10;
        double importoScontato = importo - (importo * (tdSconto / 100));
        System.out.println(importoScontato);

    }










}
