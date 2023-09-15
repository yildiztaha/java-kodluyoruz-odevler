import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,fizik,kimya,turkce,tarih,muzik;
        int ortalama;

        System.out.print("Matematik notunu girin: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunu girin: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu girin: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunu girin: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu girin: ");
        tarih = input.nextInt();

        System.out.print("Muzik notunu girin: ");
        muzik = input.nextInt();

        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6 ;
        System.out.println("Ortalamanız: "+ortalama);

        int cikti = (ortalama >= 60) ? 1 :0;
        System.out.println("Dersi Geçtiniz ");
    }

}