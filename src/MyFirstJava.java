import java.util.Scanner;

// Řádek public class MyFirstJava je základní struktura definice třídy v Javě
public class MyFirstJava { 

    // Tento řádek kódu představuje vstupní bod (entry point) pro spuštění programu v Javě.
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Jak se jmenuješ? ");
        String jmeno = scanner.nextLine();

        System.out.print("Kolik ti je roku? ");
        int roky = scanner.nextInt();
        
        System.out.println("\nAhoj " + jmeno + "!");
        System.out.println("Máš " + roky + " roků.");
    }
}
