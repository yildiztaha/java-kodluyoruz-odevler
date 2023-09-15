import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kilo;
        double boy, indeks;

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextInt();

        indeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: "+indeks);
    }
}