import java.util.Scanner;

public class sicaklikEtkinlik {
    public static void main(String[] args) {
        int temp;
        Scanner inp = new Scanner(System.in);

        System.out.print("Etkinlik önerilmesi için lütfen sıcaklığı giriniz : ");
        temp = inp.nextInt();

        if (temp < 5) {
            System.out.println("Hava şartları Kayak yapmaya çok uygun. :) ");
        } else if (temp >= 5 && temp < 15) {
            System.out.println("Sinemaya gitmek için harika bir gün.  :) ");
        } else if (temp >= 15 && temp < 25) {
            System.out.println("Hava tam Piknik yapmalık. :)  ");
        } else {
            System.out.println("Biraz Yüzüp D vitamini almaya ne dersin? :)");
        }
    }
}
