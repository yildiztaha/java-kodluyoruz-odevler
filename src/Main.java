import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double hipotenus,alan;

        System.out.print("Ucgenin 1. kenarini  girin: ");
        a = input.nextInt();
        System.out.print("Ucgenin 2. kenarini  girin: ");
        b = input.nextInt();

        hipotenus = Math.sqrt((a*a) + (b*b));
        System.out.println("Ucgenin hipotenusu: "+hipotenus);

        double cevre = (a + b+ hipotenus)/ 2;
        alan = Math.sqrt( cevre * (cevre - a) * (cevre - b) * (cevre - hipotenus));
        System.out.print("Ucgenin Alani: " +alan);


    }
}