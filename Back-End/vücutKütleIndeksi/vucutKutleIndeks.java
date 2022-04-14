import java.util.Scanner;
public class vucutKutleIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, vki;

        System.out.print("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        vki = kilo / (boy*boy);
        System.out.println("Vücut Kitle Ýndeksiniz : " + vki);
    }
}
