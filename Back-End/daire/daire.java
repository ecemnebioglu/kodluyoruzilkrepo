import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r;
        double pi=3.14, alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarýçapýný giriniz : ");
        r = input.nextInt();

        alan = pi*r*r;
        System.out.println("Dairenin Alaný : " + alan);

        cevre = 2*pi*r;
        System.out.println("Dairenin Çevresi : " + cevre);

    }
}
