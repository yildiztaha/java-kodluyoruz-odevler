import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // For Döngüsü İle Yapılan Hali:

       /* for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            }*/

        // While Döngüsü İle Yapılan Hali

      /*  while (i <= k) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/
        /*--------------------------------------------------------------------------*/
        Scanner input = new Scanner(System.in);
        int k, toplam = 0, kacSayi = 0;
        double ortalama = 0.0;

        System.out.print("Bir Sayi Giriniz: ");
        k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                kacSayi++;
                System.out.println("3'e ve 4'e Tam bölünebilen " + kacSayi + ".Sayı: " + i);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Çıktı: Toplam: " + kacSayi + " Sayı tam bölünebilmektedir.\n" +
                "Sayıların Toplamı: " + toplam + "\n" +
                "Aritmetik Ortalaması: " + (toplam / kacSayi) + "\n");


    }
}