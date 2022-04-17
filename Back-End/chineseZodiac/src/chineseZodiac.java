import java.util.*;

public class chineseZodiac {
    public static void main(String[] args) {
        int year, rem;
        String sign = "";
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        year = inp.nextInt();
        rem = year % 12;

        switch (rem) {
            case 0 -> sign = "Maymun";
            case 1 -> sign = "Horoz";
            case 2 -> sign = "Köpek";
            case 3 -> sign = "Domuz";
            case 4 -> sign = "Fare";
            case 5 -> sign = "Öküz";
            case 6 -> sign = "Kaplan";
            case 7 -> sign = "Tavşan";
            case 8 -> sign = "Ejderha";
            case 9 -> sign = "Yılan";
            case 10 -> sign = "At";
            case 11 -> sign = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + sign);
    }
}

