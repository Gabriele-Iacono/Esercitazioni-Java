public class OperatoriLogici {
    public static void main(String[] args) {
        Esercizio esercizio = new Esercizio();
//         classe     metodo
        esercizio.EsercizioUno();
        esercizio.EsercizioDue();
        esercizio.EsercizioTre();
        esercizio.EsercizioQuattro();
        esercizio.EsercizioCinque();
        esercizio.EsercizioSei();
    }
}
class Esercizio {
    public void EsercizioUno() {
//h Scrivi un programma Java che verifichi se un numero è compreso tra 10 e 20. Utilizza gli operatori logici.
        int numero = 15;
        if(numero >= 10 && numero <= 20){
            System.out.println("Il numero è compreso tra 10 e 20");
        }
    }

    public void EsercizioDue() {
        int anno = 2024;
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            System.out.println("L'anno è bisestile");
        }
    }

    public void EsercizioTre() {
       // Scrivi un programma Java che verifichi se una stringa è vuota o null.
        String testo = "";
// ? se la stringa è nulla o la stringa è vuota, stampa..
        if (testo == null || testo.isEmpty()) {
            System.out.println("La stringa è vuota o nulla");
        }
    }

    public void EsercizioQuattro() {
// Verifica se un numero è pari o dispari
        int numero = 15;
//
        if (numero % 2 != 0) {
            System.out.println("Il numero è dispari " + numero );
        }
        else {
            System.out.println("Il numero è pari " + numero);
        }
    }

    public void EsercizioCinque() {
        //chiede all’utente di inserire tre numeri interi e stampa il piu grande di questi.
        //! il più grande è 25, quindi deve stampare 25
        int numero = 15;
        int numero1 = 25;
        int numero2 = 5;
        if (numero>numero1 && numero>numero2){
            System.out.println(numero);
        }
        if (numero1 > numero && numero1 > numero2) {
            System.out.println(numero1);
        }
        if (numero2 > numero && numero2 > numero1) {
            System.out.println(numero2);
        }
    }

    public void EsercizioSei() {
        //  chiede all’utente di inserire tre numeri interi
        //e stampa su un’unica riga in ordine decrescente.
        int numero3 = 3;
        int numero2 = 2;
        int numero1 = 1;
        if (numero3>numero2 ){
            if (numero2>numero1){
                System.out.println(""+ numero3 + numero2 + numero1);
            }
            else {
                System.out.println("" + numero3 + numero1 + numero2);
            }
        }
    }
}







