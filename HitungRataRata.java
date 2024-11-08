import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] nilaiResponden = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("Masukkan nilai responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Responden " + (i+1) + ", Pertanyaan " + (j+1) + ": ");
                nilaiResponden[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < jumlahResponden; i++) {
            int jumlahNilaiResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                jumlahNilaiResponden += nilaiResponden[i][j];
            }
            double rataRataResponden = (double) jumlahNilaiResponden / jumlahPertanyaan;
            System.out.println("Rata-rata responden " + (i+1) + ": " + rataRataResponden);
        }

        System.out.println("\nRata-rata nilai setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int jumlahNilaiPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                jumlahNilaiPertanyaan += nilaiResponden[i][j];
            }
            double rataRataPertanyaan = (double) jumlahNilaiPertanyaan / jumlahResponden;
            System.out.println("Pertanyaan " + (j+1) + ": " + rataRataPertanyaan);
        }
        int jumlahNilaiKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                jumlahNilaiKeseluruhan += nilaiResponden[i][j];
            }
        }
        double rataRataKeseluruhan = (double) jumlahNilaiKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);
    }
}
