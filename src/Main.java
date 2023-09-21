import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        int total = 1;

        System.out.print("Üssü alınacak sayıyı girin: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;

        }
        System.out.println("Sonuc= " + total);
    }

}