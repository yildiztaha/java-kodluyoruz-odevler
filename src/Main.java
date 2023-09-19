import java.util.Scanner;
/************ Kullanıcıdan Sayı Alarak Döngüler Kullanılır Ve İşlem Yapar *************/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, summer = 0;

/*        do {
            System.out.print("Sayi Giriniz: ");
            number = scan.nextInt();
            if (number % 2 == 1) {
                summer += number;
            }
        } while (number > 0);

        System.out.println("Toplam: "+summer);*/

        do {
            System.out.print("Sayi Giriniz: ");
            number = scan.nextInt();
            if ((number % 2 == 0) && (number % 4 == 0)) {
                summer += number;
            }
        } while (!(number % 2 == 1));

        System.out.println("Toplam: "+summer);

    }

}