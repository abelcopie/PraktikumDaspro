import java.util.Scanner;
public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        double diskon ;
        double harga; 
        double total_bayar = 0; // Inisialisasi total bayar
        String member;

        System.out.println("--------------------------------------");
        System.out.println("----------- MENU KAFE JTI ------------");
        System.out.println("--------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = input02.nextInt();
        
        input02.nextLine(); // Menyerap newline setelah nextInt
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input02.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) { // menggunakan equalsIsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                input02.close();
                return;
            }

            total_bayar = harga-(harga*diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
                
        } else if (member.equalsIgnoreCase("n")) { // menggunakan equalsIsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                input02.close();
                return;
            }

        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("Total bayar setelah diskon dan potongan = " + total_bayar);

        input02.close();
        }
}