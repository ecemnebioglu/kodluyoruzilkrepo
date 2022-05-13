import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1, side2, side3, perimeter;
        double areaPow, area, halfPerimeter;
        System.out.print("1. kenarı giriniz : ");
        side1 = sc.nextInt();

        System.out.print("2. kenarı giriniz : ");
        side2 = sc.nextInt();

        System.out.print("3. kenarı giriniz : ");
        side3 = sc.nextInt();

        perimeter = (side1 + side2 + side3);
        halfPerimeter = perimeter / 2;

        areaPow = halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3);
        area = Math.sqrt(areaPow);

        System.out.println("Çevresi : " + perimeter);
        System.out.print("Alanı : " + area);
    }
}
