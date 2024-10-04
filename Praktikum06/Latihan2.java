import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        double hargaBuku, diskon;

        System.out.print("Masukkan Jenis Buku: ");
        String jenisBuku = input02.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        int jumlahBuku = input02.nextInt();
        System.out.print("Masukkan Harga Buku: ");
        int harga = input02.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            // Diskon 10% untuk buku kamus
            hargaBuku = (1.0 - 0.1) * harga * jumlahBuku;
            // Diskon tambahan 2% jika beli lebih dari 2 buku
            if (jumlahBuku > 2) {
                hargaBuku = (1.0 - 0.02) * hargaBuku;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            // Diskon 3% untuk buku novel
            hargaBuku = (1.0 - 0.03) * harga * jumlahBuku;
            // Diskon tambahan 2% jika beli lebih dari 3 buku
            if (jumlahBuku > 3) {
                hargaBuku = (1.0 - 0.02) * hargaBuku;
            }
        } else {
            // Diskon 5% jika jenis buku lain dan lebih dari 3 buku
            if (jumlahBuku > 3) {
                hargaBuku = (1.0 - 0.05) * harga * jumlahBuku;
            } else {
                hargaBuku = harga * jumlahBuku;
            }
        }

        // Menampilkan total harga setelah diskon
        System.out.println("Total Harga Setelah Diskon: " + hargaBuku);

        // Menghitung total diskon
        diskon = (harga * jumlahBuku) - hargaBuku;
        System.out.println("Total Diskon: " + diskon);

        input02.close();
    }
}
