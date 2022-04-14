import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double tutar, kdvOrani, kdvTutari, odenecek;

     System.out.print("Alışveriş Tutarını Giriniz : ");
     tutar = input.nextDouble();

     boolean kosul = tutar > 1000;
     kdvOrani = kosul ? 0.08 : 0.18;
     System.out.println("KDV Oranı : " + kdvOrani);

     kdvTutari = tutar*kdvOrani;
     System.out.println("KDV Tutarı : " + kdvTutari);

     odenecek = kdvTutari + tutar ;
     System.out.println("Ödenecek KDV'li Tutar : " + odenecek);
    }
}
