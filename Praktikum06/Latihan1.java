public class Latihan1 {
    public static void main(String[] args) {
        int Bil1 = 28;
        int Bil2 = 54;
        int Bil3 = 15;

        if (Bil1 > Bil2) {
            if (Bil1 > Bil3){
                System.out.println("Bilangan Terbesar " + Bil1);
            } else
                System.out.println("Bilangan Terbesar " + Bil2);
        } else 
            if (Bil2 > Bil1){
                System.out.println("Bilangan Terbesar " + Bil2);
            } else
                System.out.println("Bilangan Terbesar " + Bil1);
        }
    }
