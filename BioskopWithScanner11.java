
import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama\t: ");
            String nama = sc.nextLine();

            while (true) {
                System.out.print("Masukkan baris\t: ");
                int baris = sc.nextInt();

                System.out.print("Masukkan kolom\t: ");
                int kolom = sc.nextInt();
                sc.nextLine();

                // Untuk mengecek apakah baris dan kolom tersedia
                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                    System.out.println("Baris atau kolom tidak tersedia. Silakan masukkan baris 1-" + penonton.length +
                            " dan kolom 1-" + penonton[0].length + ".");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    // Untuk mengecek apakah kursi sudah terisi
                    System.out.println("Peringatan: Kursi sudah terisi! Silakan pilih kursi lain.");
                } else {
                    // Jika kursi kosong, masukkan nama
                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                }
            }

            // Tanya apakah pengguna ingin memasukkan penonton lain
            System.out.print("Input penonton lainnya (y/n) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        
        System.out.println("\nDaftar Penonton: ");
        
        for (int i = 0; i < penonton.length; i++) {
            System.out.printf("Baris %d: ", i + 1);

            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.print(penonton[i][j] + "\t");
                } else {
                    System.out.print("***\t");
                }
            }

            System.out.println();
            }
            
        }

    }
}
