import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int totalLesson = 5, invalidLesson = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu girin: ");
        mat = input.nextInt();

        System.out.print("Fizik notu girin: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notu girin: ");
        turkce = input.nextInt();

        System.out.print("Kimya notu girin: ");
        kimya = input.nextInt();

        System.out.print("Müzik notu girin: ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
            invalidLesson++;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            invalidLesson++;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            invalidLesson++;
        }
        if (kimya < 0 || kimya > 100) {
            mat = 0;
            invalidLesson++;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            invalidLesson++;
        }

        double total = mat + fizik + turkce + kimya + muzik;
        double average = total / (totalLesson - invalidLesson);

        if (average <= 55) {
            System.out.println("Ortalamanız: "+average);
            System.out.println("Sınıfta Kaldınız. Seneye görüşmek üzere");
        } else {
            System.out.println("Ortalamanız: "+average);
            System.out.println("Tebrikler sınıfı geçtiniz");
        }

    }
}
