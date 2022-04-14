import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double perKm = 2.20, total, pay, startPrice = 10;

        System.out.print("KM giriniz : ");
        km = input.nextInt();
        System.out.println("KM baþýna : " + perKm + " TL");

        total = km * perKm + startPrice;
        System.out.println("Hesaplanan Tutar : " + total + " TL");

        boolean kosul = total < 20;
        pay = kosul ? 20 : total;
        System.out.print("Ödenecek Tutar : " + pay + " TL");
    }
}