import java.awt.*;
import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        Esercizi4 esercizi4 = new Esercizi4();
        esercizi4.EsercizioUno();
        esercizi4.EsercizioDue();
       esercizi4.EsercizioTre();
        esercizi4.EsercizioQuattro();
       esercizi4.EsercizioCinque();
//        esercizi4.EsercizioSei();
//        esercizi4.EsercizioSette();
    }
}

class Esercizi4{
    public void EsercizioUno() {
//c Stampare gli elementi di un array di interi utilizzando il ciclo "foreach":
        //array di integer(numeri)
        Integer[] numeri = {1, 2, 3, 4, 6};
        for (Integer i : numeri){
            System.out.println(i);
        }
    }

    public void EsercizioDue() {
//c Calcolare la somma degli elementi di un array di double utilizzando il ciclo "foreach":
        Double[] elementi = {3.4, 2.5, 1.7};
        double somma = 0;
//Per ogni elemento di tipo Double, denominato 'i', nell'array elementi
        for (Double i : elementi){
            somma += i;
        }
        System.out.println("La somma degli elementi dell'array è: " + somma);
    }

    public void EsercizioTre() {
//Stampare le lettere di una stringa utilizzando il ciclo "foreach":
        String testo = "Ciao";
        for (char chara : testo.toCharArray()){
            System.out.println(chara);
// stampa ogni lettera della stringa
        }
    }

    public void EsercizioQuattro() {
//Calcolare la media dei voti in un array di interi utilizzando il ciclo "foreach":
        Double[] voti = {5.0, 7.5, 8.0, 9.5};
        double somma = 0;
//      per ogni voto in voti
        for (Double v : voti){
// somma prende i singoli voti e li somma assieme
            somma += v;
        }
        double media = somma / voti.length;
        System.out.println("La media dei voti è: " + media);
    }

    public void EsercizioCinque() {
//Stampare gli elementi di una lista di oggetti utilizzando il ciclo "foreach":
        ArrayList<String> animali = new ArrayList<>();
        animali.add("Gatto");
        animali.add("Pesce");
        animali.add("Cane");
        for (String i : animali){
            System.out.println(i);
        }
    }















}

