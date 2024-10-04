import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int hargaSepatu = 0;

        System.out.println("------------------------------------");
        System.out.println("----------- TOKO SEPATU ------------");
        System.out.println("------------------------------------");
        System.out.println("1. Converse (Slip On/High Top)");
        System.out.println("   Ukuran Slip On 36-40");
        System.out.println("   Ukuran High Top 40-44");
        System.out.println("2. Sketcher (Woman/Man)");
        System.out.println("   Ukuran Woman 36-41");
        System.out.println("   Ukuran Man 41-44");
        System.out.println("3. Nike (Kids/Adult)");
        System.out.println("   Ukuran Kids On 36-40");
        System.out.println("   Ukuran Adult Top 40-44");
        System.out.println("--------------------------------------");

        System.out.print("Masukkan merk yang dipilih: ");
        String pilihan_merk = input02.nextLine();
        System.out.print("Masukkan kategori (pilih salah satu): ");
        String kategori = input02.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = input02.nextInt();

        if (pilihan_merk.equalsIgnoreCase("Converse")){
            if (kategori.equalsIgnoreCase("Slip On")){
                if(ukuran >= 36){
                    if (ukuran <= 40)
                    hargaSepatu = 800000;
                    System.out.println("Harga yang harus dibayar: " + hargaSepatu);
                }       
            } else if (kategori.equalsIgnoreCase("High Top")){
                if(ukuran >= 40){
                    if (ukuran <= 44)
                    hargaSepatu = 1200000;
                    System.out.println("Harga yang harus dibayar: " + hargaSepatu);
                } 
            }       
                
        } else if (pilihan_merk.equalsIgnoreCase("Sketcher")){
            if (kategori.equalsIgnoreCase("Woman")){
                if(ukuran >= 36){
                    if (ukuran <= 41)
                    hargaSepatu = 1000000;
                    System.out.println("Harga yang harus dibayar: " + hargaSepatu);
                }  
            } else if (kategori.equalsIgnoreCase("Man")){
                if(ukuran >= 41){
                    if (ukuran <= 44)
                    hargaSepatu = 1800000;
                    System.out.println("Harga yang harus dibayar: " + hargaSepatu);
                }  
            }     

        } else if (pilihan_merk.equalsIgnoreCase("Nike")){
            if (kategori.equalsIgnoreCase("Kids")){
                if(ukuran >= 36){
                    if (ukuran <= 40)
                    hargaSepatu = 750000;
                    System.out.println("Harga yang harus dibayar: " + hargaSepatu);
                }     
            } else if (kategori.equalsIgnoreCase("Adult")){
                if(ukuran >= 40){
                    if (ukuran <= 44)
                    hargaSepatu = 1500000;
                    System.out.println("Harga yang harus dibayar: " + hargaSepatu);
                } 
            }                 
        } 
        input02.close(); 
  }
}