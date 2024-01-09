import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk dik kenarın uzunluğunu giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci dik kenarın uzunluğunu girinizz: ");
        double kenar2 = scanner.nextDouble();

        // Hipotenüs hesaplama formülü: c^2 = a^2 + b^2
        double hipotenüs = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));

        System.out.println("Hipotenüs uzunluğu: " + hipotenüs);

        scanner.close();
    }
}
