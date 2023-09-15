import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, merkezAci;
        double dilimAlan,alan,cevre,pi=3.14;

        System.out.print("Ucgenin yaricapini giriniz: ");
        r = input.nextInt();

        alan = pi * (r * r);
        cevre = 2 * pi * r;

        System.out.print("Merkez Aci girin: ");
        merkezAci = input.nextInt();
        dilimAlan = (pi * (r * r) * merkezAci) / 360 ;

        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Cevresi: "+cevre);
        System.out.println("Daire Diliminin Alanı: "+dilimAlan);



    }
}