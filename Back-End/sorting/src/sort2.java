import java.util.*;

public class sort2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        num1 = inp.nextInt();

        System.out.print("İkinci Sayıyı Giriniz  :");
        num2 = inp.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz : ");
        num3 = inp.nextInt();

        if ((num1 < num2) && (num1 < num3)) {
            if (num2 < num3) {
                System.out.println(num1 + "<" + num2 + "<" + num3);
            } else {
                System.out.println(num1 + "<" + num3 + "<" + num2);
            }
        } else if ((num2 < num1) && (num2 < num3)) {
            if (num1 < num3) {
                System.out.println(num2 + "<" + num1 + "<" + num3);
            } else {
                System.out.println(num2 + "<" + num3 + "<" + num1);
            }
        } else if ((num3 < num1) && (num3 < num2)) {
            if (num1 < num2) {
                System.out.println(num3 + "<" + num1 + "<" + num2);
            } else {
                System.out.println(num3 + "<" + num2 + "<" + num1);
            }
        }
    }
}
