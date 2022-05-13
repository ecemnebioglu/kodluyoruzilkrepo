import java.util.Scanner;

public class CircleSectorArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle, r;
        double sectorArea, pi =3.14;

        System.out.print("Merkez açı derecesini giriniz : ");
        angle = sc.nextInt();
        System.out.print("Yarıçapını giriniz : ");
        r = sc.nextInt();

        sectorArea = (pi*Math.pow(r,2)*angle)/360;

        System.out.print("Daire dilim alanı : "+sectorArea);
    }
}
