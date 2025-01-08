public class Main1 {
    
    /**
     * Verifica se una stringa ha un numero pari di caratteri
     * @param stringa La stringa da controllare
     * @return true se il numero di caratteri è pari, false se dispari
     */
    public static boolean stringaPariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    /**
     * Verifica se un anno è bisestile
     * Un anno è bisestile se:
     * - è divisibile per 4
     * - se è divisibile per 100, deve essere anche divisibile per 400
     * 
     * @param anno L'anno da verificare
     * @return true se l'anno è bisestile, false altrimenti
     */
    public static boolean annoBisestile(int anno) {
        // Se l'anno è divisibile per 100, deve essere anche divisibile per 400
        if (anno % 100 == 0) {
            return anno % 400 == 0;
        }
        // Altrimenti basta che sia divisibile per 4
        return anno % 4 == 0;
    }

    /**
     * Metodo main per testare le funzioni
     */
    public static void main(String[] args) {
        // Test stringaPariDispari
        System.out.println("Test stringaPariDispari:");
        System.out.println("'ciao' è pari? " + stringaPariDispari("ciao"));
        System.out.println("'hello' è pari? " + stringaPariDispari("hello"));
        
        // Test annoBisestile
        System.out.println("\nTest annoBisestile:");
        System.out.println("2000 è bisestile? " + annoBisestile(2000));
        System.out.println("1900 è bisestile? " + annoBisestile(1900));
        System.out.println("2024 è bisestile? " + annoBisestile(2024));
    }
}
