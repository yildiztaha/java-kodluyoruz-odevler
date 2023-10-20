import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int sonuc;
        int ebob = 1;
        int ekok = 1;

        System.out.print("Lütfen 1. Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("Lütfen 2. Sayıyı Giriniz: ");
        n2 = input.nextInt();

        /*for (int i = n1; i >= 1; i--) {
//            System.out.println(i);
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println(ebob);
                break;
            }
        }

        for (int k = 1; k <= (n1 * n2); k++) {
            if ((k % n1 == 0) && k % n2 == 0) {
                System.out.println(k);
                break;
            }
        }*/

        int i = 1;
        while (i <= n1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);

        int k = 1;
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("Ekok: "+ekok);
        System.out.println("Ekok: "+(n1*n2)/ebob);



    }
}