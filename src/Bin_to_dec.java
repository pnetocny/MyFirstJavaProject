import java.util.Scanner;

public class Bin_to_dec {
    

        public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Zadání proměnných
        boolean chyba = false; 
        String BinarniCislo1 = ""; 
        
        
        // Výběr, zda budeme převádět číslo z binárního na desítkové nebo naopak
        

        
        // Převod čísla z desítkového na binární
        System.out.print("Zadej číslo v desítkové soustavě: "); String StringDesitkoveCislo = scanner.nextLine();

        String PrvniZnak = StringDesitkoveCislo.substring(0,1); 
        String OstatniZnaky = "0" + StringDesitkoveCislo.substring(1);
        
        if ((PrvniZnak.equals("+") || PrvniZnak.matches("[0-9]")) && OstatniZnaky.matches("\\d+")) {
        // šlo by zkrátit i takto: if (StringDesitkoveCislo.matches("[+]?\\d+")) {
        
            int DesitkoveCislo = Integer.parseInt(StringDesitkoveCislo); // převod stringu na integer
            
            while (DesitkoveCislo > 0) {
                int Zbytek = DesitkoveCislo % 2;
                BinarniCislo1 = Zbytek + BinarniCislo1;
                DesitkoveCislo = DesitkoveCislo / 2;
            }
            
            System.out.println(BinarniCislo1);
        }   
        
        else {
            chyba = true;
        }
        

        // Převod čísla z binárního na desítkové
        System.out.print("Zadej číslo v binárním kódu: ");
        String BinarniCislo2 = scanner.nextLine();

        int DelkaBinarniCislo2 = BinarniCislo2.length();
        int vysledek = 0;
        int hodnota;
        int exponent = 0;
        
        for (int i = DelkaBinarniCislo2; i > 0; i--) {
            
            char znak2 = BinarniCislo2.charAt(i - 1);

            if (znak2 == '0') {
                hodnota = 0;
            }   else if (znak2 == '1') {
                hodnota = 1;
                vysledek = vysledek + hodnota * (int) Math.pow(2, exponent); //číslo 2 umocňujeme exponentem
            }   else {
                chyba = true;
                break; // Přerušení cyklu v případě chyby
            }
            exponent = exponent + 1;
        }

        if (chyba == true) {
            System.out.println("V zadání čísla je chyba! Použijte pouze  znaky \"0\" a \"1\". ");
        }   else {
            System.out.println("Výsledné číslo v desítkové soustavě je: " + vysledek);
        }
    scanner.close();
    }
}
