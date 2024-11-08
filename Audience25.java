import java.util.Scanner;

public class Audience25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2]; 
        int pilihan;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

         if (pilihan == 1) {
         while (true) {
         System.out.print("Masukkan nama: ");
         String nama = sc.nextLine();
         System.out.print("Masukkan baris (1-4): ");
         int baris = sc.nextInt();
         System.out.print("Masukkan kolom (1-2): ");
         int kolom = sc.nextInt();
         sc.nextLine(); 

         if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
         System.out.println("Nomor baris/kolom tidak tersedia.");
         } else if (penonton[baris-1][kolom-1] != null) {
         System.out.println("Kursi sudah terisi oleh penonton lain. Silakan pilih kursi lain.");
         } else {
         penonton[baris-1][kolom-1] = nama;
         break;
         }
         }
         } else if (pilihan == 2) {
          System.out.println("Daftar Penonton:");
         for (int i = 0; i < penonton.length; i++) {
         for (int j = 0; j < penonton[i].length; j++) {
         System.out.printf("%-10s ", penonton[i][j] != null ? penonton[i][j] : "***");
         }
          System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
