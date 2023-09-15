import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int para,kdvTutarı,toplamFiyat;


        System.out.print("Fiyat Giriniz: ");
        para = input.nextInt();

        if ( 0 < para && para < 1000){
            kdvTutarı = (para/100)*18 ;
            toplamFiyat = kdvTutarı + para;
            System.out.println("KDV'siz Fiyat: "+para);
            System.out.println("KDV'li Fiyat: "+toplamFiyat);
            System.out.println("KDV Tutarı: "+kdvTutarı);
        }else if (para > 1000) {
            kdvTutarı = (para/100)*8 ;
            toplamFiyat = kdvTutarı + para;
            System.out.println("KDV'siz Fiyat: "+para);
            System.out.println("KDV'li Fiyat: "+toplamFiyat);
            System.out.println("KDV Tutarı: "+kdvTutarı);
        }
    }
}
