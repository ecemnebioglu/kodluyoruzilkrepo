import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        int dik1, dik2, alan, cevre;
        double hip;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Dik kenar : ");
        dik1 = input.nextInt();

        System.out.print("2. Dik kenar : ");
        dik2 = input.nextInt();

        hip = Math.sqrt(dik1*dik1 + dik2*dik2);
        System.out.println("Hipotenüs : " + hip);
        alan = (dik1*dik2/2);
        cevre = (int)(dik1+dik2+hip);
        System.out.println("Alan : "+alan);
        System.out.println("Çevre : " + cevre);
    }
}