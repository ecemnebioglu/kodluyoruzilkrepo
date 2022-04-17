import java.util.*;

public class flightTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int age, km, trip;
        double perKm = 0.10, sum = 0, agePer = 0, ageDis = 0, wAgeDis, tripPer = 0, wTripPer, total, total2;

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz  (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        trip = inp.nextInt();

        if (age >= 0 && km >= 0 && trip >= 0) {
            sum = km * perKm;
            if (age <= 12) {
                agePer = 0.5;
            } else if (age > 12 && age <= 24) {
                agePer = 0.1;
            } else if (age >= 65) {
                agePer = 0.3;
            } else {
                agePer = 0;
            }
            if (trip == 2) {
                tripPer = 0.2;
            } else {
                tripPer = 0;
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz ! ");
        }

        ageDis = sum * agePer;
        wAgeDis = sum - ageDis;
        wTripPer = wAgeDis * tripPer;
        total = wAgeDis - wTripPer;

        if (trip == 2) {
            total2 = total * 2;
        } else {
            total2 = total;
        }

        System.out.println("İndirimsiz bilet fiyatı: " + sum);
        System.out.println("Yaşınıza uygulanan indirim oranı : " + agePer);
        System.out.println("Uygulanan yaş indirimi : " + ageDis);
        System.out.println("Gidiş - dönüş bilet indirimi : " + wTripPer);
        System.out.println("Ödemeniz gereken toplam tutar : " + total2);

    }
}
