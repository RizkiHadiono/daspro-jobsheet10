public class Tugas {

    public static void main(String[] args) {
        
        // Deklarasi array 2 dimensi
        // [jumlah baris][jumlah kolom] 
        int[][] dataSurvey = new int[][]{
            {4, 5, 3, 4, 5, 4},  // Responden 1
            {3, 4, 2, 3, 5, 4},  // Responden 2
            {5, 4, 4, 5, 3, 4},  // Responden 3
            {3, 3, 4, 2, 4, 3},  // Responden 4
            {4, 5, 5, 4, 4, 5},  // Responden 5
            {2, 3, 3, 4, 2, 3},  // Responden 6
            {4, 4, 5, 5, 4, 5},  // Responden 7
            {5, 5, 4, 5, 5, 5},  // Responden 8
            {3, 2, 3, 4, 3, 2},  // Responden 9
            {4, 5, 4, 4, 5, 5}   // Responden 10
        };

        // Deklarasi array jumlah pertanyaan dan respondent
        int jmlRespondent = dataSurvey.length;
        int jmlPertanyaan = dataSurvey[0].length;

        // Pembatas
        System.out.println("======= Rata-rata Responden =======\n");

        // Rata2 tiap respondent
        for (int i = 0; i < jmlRespondent; i++) {
            int skor = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                skor += dataSurvey[i][j];
            }
            // Menghitung rata-rata
            double rata2 = (double) skor / jmlPertanyaan;
            System.out.println("Rata-rata responden ke-" + (i+1) + " : " + rata2);
        }

        // Pembatas
        System.out.println("\n======= Rata-rata Pertanyaan =======\n");

        // Untuk rata-rata tiap pertanyaan
        for (int j = 0; j < jmlPertanyaan; j++) {
            int skor = 0;
            for (int i = 0; i < jmlRespondent; i++) {
                skor += dataSurvey[i][j];
            }
            // Hitung rata-rata
            double rata2 = (double) skor / jmlRespondent;
            System.out.println("Rata-rata pertanyaan ke-" + (j+1) + " : " + rata2);
        }

        // Pembatas
        System.out.println("\n======= Rata-rata Keseluruhan =======\n");

        // Untuk rata-rata keseluruhan
        int skorKeseluruhan = 0;
        for (int i = 0; i < jmlRespondent; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                skorKeseluruhan += dataSurvey[i][j];
            }
        }
        double rataKeseluruhan = (double) skorKeseluruhan / 
        (jmlRespondent * jmlPertanyaan);

        System.out.println("Rata-rata keseluruhan : " + rataKeseluruhan);

    }

}