import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kg;
//        armut: 2,14 TL , Elma : 3,67 TL , Domates : 1,11 TL , Muz: 0,95 TL , Patlıcan : 5,00 TL

        System.out.print("Armut Kaç Kilogram: ");
        kg = input.nextInt();
        float armutKg = (float) (kg * 2.14F);

        System.out.print("Elma Kaç Kilogram: ");
        kg = input.nextInt();
        float elmaKg = (float) (kg * 3.67F);

        System.out.print("Domates Kaç Kilogram: ");
        kg = input.nextInt();
        float domatesKg = (float) (kg * 1.11F);

        System.out.print("Muz Kaç Kilogram: ");
        kg = input.nextInt();
        float muzKg = (float) (kg * 0.95F);

        System.out.print("Patlıcan Kaç Kilogram: ");
        kg = input.nextInt();
        float patlicanKg = (float) (kg * 5.00F);

        float toplamTutar = (armutKg + elmaKg + domatesKg + muzKg + patlicanKg);
        System.out.print("Toplam tutar: "+toplamTutar);
    }
}