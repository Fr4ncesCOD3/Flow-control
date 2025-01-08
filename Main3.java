import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        
        // Creiamo una stringa per memorizzare l'input dell'utente
        String input;
        
        // Spieghiamo all'utente come funziona il programma
        System.out.println("Questo programma divide una stringa in caratteri separati da virgola");
        System.out.println("Inserisci ':q' per uscire dal programma");
        
        // Usiamo do-while per eseguire il programma almeno una volta
        do {
            // Chiediamo all'utente di inserire una stringa
            System.out.print("\nInserisci una stringa: ");
            input = scanner.nextLine();
            
            // Controlliamo se l'utente vuole uscire
            if (!input.equals(":q")) {
                System.out.print("Risultato: ");
                
                // Ciclo for per scorrere ogni carattere della stringa
                for (int i = 0; i < input.length(); i++) {
                    // Stampiamo il carattere corrente
                    System.out.print(input.charAt(i));
                    
                    // Se non siamo all'ultimo carattere, aggiungiamo una virgola
                    if (i < input.length() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println(); // Andiamo a capo dopo aver finito
            }
            
        } while (!input.equals(":q")); // Continuiamo finché l'input non è ":q"
        
        // Messaggio di uscita
        System.out.println("Programma terminato!");
        scanner.close();
    }
}
