import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Creiamo uno Scanner per leggere l'input
        Scanner scanner = new Scanner(System.in);
        
        // Chiediamo all'utente di inserire un numero
        System.out.print("Inserisci un numero tra 0 e 3: ");
        int numero = scanner.nextInt();
        
        // Utilizziamo switch per convertire il numero in lettere
        System.out.print("Il numero in lettere è: ");
        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore: il numero deve essere compreso tra 0 e 3!");
        }
        
        // Chiudiamo lo scanner
        scanner.close();
    }
}
