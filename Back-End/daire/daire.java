import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r;
        double pi=3.14, alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yar��ap�n� giriniz : ");
        r = input.nextInt();

        alan = pi*r*r;
        System.out.println("Dairenin Alan� : " + alan);

        cevre = 2*pi*r;
        System.out.println("Dairenin �evresi : " + cevre);

    }
}
