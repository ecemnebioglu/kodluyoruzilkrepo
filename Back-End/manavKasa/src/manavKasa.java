import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14 , elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total, armutkg, elmakg, domateskg, muzkg, patlicankg;

        System.out.print("Armut Kilo : ");
        armutkg = input.nextDouble();

        System.out.print("Elma Kilo : ");
        elmakg = input.nextDouble();

        System.out.print("Domates Kilo : ");
        domateskg = input.nextDouble();

        System.out.print("Muz Kilo : ");
        muzkg = input.nextDouble();

        System.out.print("Patlýcan Kilo : ");
        patlicankg = input.nextDouble();

        total = (armut*armutkg) + (elma*elmakg) + (domates * domateskg) + (muz * muzkg) + (patlican * patlicankg);
        System.out.println("Ödeniz Gereken Toplam Tutar : " + total);
    }
}
