import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        
        // Chiediamo all'utente di inserire un numero
        System.out.print("Inserisci un numero intero positivo per il conto alla rovescia: ");
        
        // Leggiamo il numero inserito dall'utente
        int numero = scanner.nextInt();
        
        // Controlliamo se il numero è negativo
        if (numero < 0) {
            System.out.println("Il numero deve essere positivo!");
        } else {
            // Stampiamo un messaggio di inizio
            System.out.println("\nInizio conto alla rovescia:");
            
            // Usiamo un ciclo for per il conto alla rovescia
            // Partiamo dal numero inserito e scendiamo fino a 0
            for (int i = numero; i >= 0; i--) {
                // Stampiamo il numero corrente
                System.out.println(i);
                
                // Aggiungiamo una piccola pausa di mezzo secondo
                try {
                    Thread.sleep(500); // Pausa di 500 millisecondi
                } catch (InterruptedException e) {
                    // Gestiamo eventuali errori durante la pausa
                    System.out.println("Errore durante la pausa");
                }
            }
            
            // Stampiamo un messaggio di fine
            System.out.println("BOOM! Conto alla rovescia terminato!");
        }
        
        // Chiudiamo lo scanner
        scanner.close();
    }
}
