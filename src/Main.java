import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        double total, discountPrice, roundCost;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafe giriniz: ");
        km = input.nextInt();

        System.out.print("Lütfen yaş giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen Yolculuk Tipi Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        type = input.nextInt();

        if (((0 < km) && (0 < age)) && ((type == 1) || (type == 2))) {
            if ((age < 12) && (type == 2)) {
                total = (km * 0.10);
                discountPrice = total - (total * 0.50);
                roundCost = (discountPrice * 0.20);
                total = (discountPrice - roundCost) * 2;
                System.out.println("Bilet Fiyatınız: " + total);
            } else if ((age < 12) && (type == 1)) {
                total = (km * 0.10);
                discountPrice = total - (total * 0.50);
                total = discountPrice;
                System.out.println("Bilet Fiyatınız: " + total);
            } else if (((age > 12) && (age < 24)) && (type == 2)) {
                total = (km * 0.10);
                discountPrice = total - (total * 0.10);
                roundCost = (discountPrice * 0.20);
                total = (discountPrice - roundCost) * 2;
                System.out.println("Bilet Fiyatınız: " + total + " TL");
            } else if (((age > 12) && (age < 24)) && (type == 1)) {
                total = (km * 0.10);
                discountPrice = total - (total * 0.10);
                total = discountPrice;
                System.out.println("Bilet Fiyatınız: " + total);
            } else if ((age > 65) && (type == 2)) {
                total = (km * 0.10);
                discountPrice = total - (total * 0.30);
                roundCost = (discountPrice * 0.20);
                total = (discountPrice - roundCost) * 2;
                System.out.println("Bilet Fiyatınız: " + total);
            } else if ((age > 65) && (type == 1)) {
                total = (km * 0.10);
                discountPrice = total - (total * 0.30);
                total = discountPrice;
                System.out.println("Bilet Fiyatınız: " + total);
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz!");

        }

    }
}