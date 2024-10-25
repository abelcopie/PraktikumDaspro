import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t  CABANG OLAHRAGA PORSENI \t");
        System.out.println("1. Badminton");
        System.out.println("2. Tenis meja");
        System.out.println("3. Basket");
        System.out.println("4. Bola voly");
 
        for (int i = 1; i <= 4; i++) {
            System.out.println("\nCabang Olahraga ke- " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet ke- " + j + " = ");
                String namaAtlet = sc.nextLine();
            }
        }
    }
}