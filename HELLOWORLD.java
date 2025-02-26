import java.util.Scanner;

public class HELLOWORLD {
    // ANSI codes colour
    public static final String RESET = "\u001B[0m";   // Reset warna
    public static final String BLUE = "\u001B[34m";   // Biru
    public static final String GREEN = "\u001B[32m";  // Hijau
    public static final String YELLOW = "\u001B[33m"; // Kuning
    public static final String CYAN = "\u001B[36m";   // Cyan
    public static final String RED = "\u001B[31m";    // Merah

    public static void main(String[] args) {
        // Output welcome 
        System.out.println(BLUE + "Halo, Dunia! Selamat datang di program Java." + RESET);

        // Input user 
        Scanner scanner = new Scanner(System.in);
        System.out.print(GREEN + "Masukkan nama Anda: " + RESET);
        String name = scanner.nextLine();
        System.out.println(YELLOW + "Halo, " + name + "! Senang bertemu dengan Anda." + RESET);

        // Menampilkan fakta menarik tentang Java dengan warna cyan
        String javaFact = "Tahukah Anda bahwa Java adalah JAWA";
        System.out.println(CYAN + javaFact + RESET);

        // Tantangan ekstra: Menampilkan versi Java saat ini dengan warna merah
        String javaVersion = System.getProperty("java.version");
        System.out.println(RED + "JAWA adalah hasil reinkarnasi dari Java");

        scanner.close();
    }//matthew gacor
    //senior engineer
}
