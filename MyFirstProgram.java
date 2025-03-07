import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class MyFirstProgram {
 
    public static void main(String[] args) {
        // ANSI codes colour
        String RESET = "\u001B[0m";   // Reset warna
        String BLUE = "\u001B[34m";   // Biru
        String GREEN = "\u001B[32m";  // Hijau
        String YELLOW = "\u001B[33m"; // Kuning
        String CYAN = "\u001B[36m";   //Cyan
        String RED = "\u001B[31m";    // Merah

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
        System.out.println(YELLOW + "JAWA adalah hasil reinkarnasi dari Java");

        scanner.close();
        try {
            // Create a ProcessBuilder to run the command
            ProcessBuilder processBuilder = new ProcessBuilder("java", "--version");
            Process process = processBuilder.start();

            // Read and print the output of the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to exit
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //senior engineer
}
