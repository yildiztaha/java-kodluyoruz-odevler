import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam=0;
        int basamakDegeri;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        while (sayi != 0){
            basamakDegeri = sayi % 10;
            sayi /= 10;
            toplam += basamakDegeri;
        }
        System.out.print(toplam);























        /*     Scanner input = new Scanner(System.in);
        int sayi,basamakSayisi=0;
        System.out.print("Bir Sayı Girin:");
        sayi = input.nextInt();

        while (sayi != 0){
            sayi /=10;

            basamakSayisi++;
        }
        System.out.println(basamakSayisi);*/

    }
}