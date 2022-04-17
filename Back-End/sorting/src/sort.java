import java.util.*;

public class sort {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        num1 = inp.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = inp.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz : ");
        num3 = inp.nextInt();

        int[] arr = {num1, num2, num3};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
