import java.util.Scanner;

public class Siakad11 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah matkul: ");
        int jmlMatkul = sc.nextInt();

        System.out.println();

        // Deklarasi array 2 dimensi
        int[][] nilai = new int[jmlMhs][jmlMatkul];

        // Mengisi array dan menghitung rata-rata nilai tiap siswa
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1) + ":");
            double totalPerSiswa = 0;

            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata = " + totalPerSiswa / jmlMatkul);
        }

        System.out.println("\n==================================================\n");

        // Hitung rata-rata tiap matkul
        System.out.println("Rata-rata nilai setiap matkul:");

        for (int i = 0; i < jmlMatkul; i++) {
            double totalPerMatkul = 0;

            for (int j = 0; j < jmlMhs; j++) {
                totalPerMatkul += nilai[j][i];
            }

            System.out.println("Mata kuliah " + (i + 1) + ": " + totalPerMatkul / jmlMhs);
        }
        
    }
}
