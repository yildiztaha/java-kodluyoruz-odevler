import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Baklava diliminin boyutunu giriniz:");
        int satir = scan.nextInt();

        //Baklava diliminin üst kısmını oluşturuyoruz.
        for (int i = 0; i <= satir; i++)
        {
            for (int j = 0; j <= (satir + 1) - i; j++)
            {
                System.out.print("  ");
            }

            for (int k = 0; k <= 2 * i - 2; k++)
            {
                System.out.print("**");
            }
            System.out.println("");
        }

        //Baklava diliminin alt kısmını oluşturuyoruz.
        for (int m = 0; m <= satir; m++)
        {
            for (int n = 0; n <= m; n++)
            {
                System.out.print("  ");
            }

            for (int z = m * 2; z <= satir * 2; z++)
            {
                System.out.print("**");
            }
            System.out.println("");
        }


    }
}