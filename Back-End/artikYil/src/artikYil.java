import java.util.*;

public class artikYil {
    public static void main(String[] args) {
        int year;
        String con;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = inp.nextInt();


        if (year % 100 == 0) {
            if (year % 400 == 0) {
                con = " Bir artık yıldır ! ";
            } else {
                con = " Bir artık yıl değildir !";
            }
        } else {
            if (year % 4 == 0) {
                con = " Bir artık yıldır !";
            } else {
                con = " Bir artık yıl değildir ! ";
            }
        }
        System.out.println(year + con);
    }
}
