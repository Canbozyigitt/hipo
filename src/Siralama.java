import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        // Küçükten büyüğe sıralama
        if (sayi1 > sayi2) {
            int gecici = sayi1;
            sayi1 = sayi2;
            sayi2 = gecici;
        }
        if (sayi1 > sayi3) {
            int gecici = sayi1;
            sayi1 = sayi3;
            sayi3 = gecici;
        }
        if (sayi2 > sayi3) {
            int gecici = sayi2;
            sayi2 = sayi3;
            sayi3 = gecici;
        }

        System.out.println("Küçükten Büyüğe sıralama: " + sayi1 + ", " + sayi2 + ", " + sayi3);

        scanner.close();
    }
}
