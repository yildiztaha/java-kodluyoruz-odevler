import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if ((-20 < heat && heat > 45)) {
            System.out.println("Hava Dışarı Çıkmak İçin Tehlikeli Sıcaklıktadır!.\n" +
                    "Lütfen Evden Dışarı Çıkmayın");
        } else if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz");
        } else if ((5 < heat && heat < 15)) {
            System.out.println("Sinemaya Gidebilirsiniz");
        } else if (15< heat && heat < 25) {
            System.out.println("Pikniğe Gidebilirsiniz");
        } else if (heat > 25 && heat < 45) {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}