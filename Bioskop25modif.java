public class Bioskop25modif { 
    public static void main(String[] args) {
    String[][] penonton = new String[4][2];

    penonton[0][0] = "Amin";
    penonton[0][1] = "Bena";
    penonton[1][0] = "Candra";
    penonton[1][1] = "Dela";
    penonton[2][0] = "Eka";
    penonton[2][1] = "Farhan";
    penonton[3][0] = "Gisel";
    penonton[3][1] = "Hana";

    System.out.println("Panjang array penonton: " + penonton.length);
    System.out.println("Panjang baris 1: " + penonton[0].length); 
    System.out.println("Panjang baris 2: " + penonton[1].length);
    System.out.println("Panjang baris 3: " + penonton[2].length); 
    System.out.println("Panjang baris 4: " + penonton[3].length);

   System.out.println(penonton.length);
   for (int i = 0; i < penonton.length; i++) {
    System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
   }

   System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
   System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
   System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
   System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
   
}
}