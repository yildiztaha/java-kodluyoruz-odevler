
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, ntotal = 1, rtotal = 1, nrtotal = 1, result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz: ");
        n = input.nextInt();

        System.out.print("2. Sayiyi Giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            ntotal = ntotal * i;
        }
        System.out.println("Kullanıcıdan gelen birinci sayı 'n': " + n + "!" + "\n" +
                "Faktöriyel değeri: " + ntotal);

        for (int i = 1; i <= r; i++) {
            rtotal = rtotal * i;
        }
        System.out.println("Kullanıcıdan gelen ikinci sayı 'r': " + r + "!" + "\n" +
                "Faktoriyel değeri: " + rtotal);

        for (int i = 1; i <= (n - r); i++) {
            nrtotal = nrtotal * i;
        }
        System.out.println("n-r: " + (n - r) + "!" + "\n" + "Faktöriyel değeri: " + nrtotal);

        result = ntotal / (rtotal * nrtotal);

        System.out.println("C(n,r)=n!/(r!*(n-r)!): " + "İşlemin Sonucu: " + result);
    }
}