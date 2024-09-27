import java.util.Scanner;

public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        if (usia < 0) {
            System.out.print("Input tidak valid!");     
            scanner.close();
        }
        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori= "Dewasa";
        } else {
            kategori = "lansia";
        }
        System.out.println("Kategori usia Anda: " + kategori);

        scanner.close();
    }
}