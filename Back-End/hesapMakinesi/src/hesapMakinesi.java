import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int num1, num2;
        float sonuc=0;
        String op;
        Scanner inp = new Scanner(System.in);

        System.out.print("+\n-\n*\n/\n��lemi Se�iniz : ");
        op = inp.nextLine();

        System.out.print("1. Say�y� Giriniz ");
        num1 = inp.nextInt();
        System.out.print("2. Say�y� Giriniz : ");
        num2 = inp.nextInt();

        switch (op) {
            case "+" : sonuc = (num1 + num2); break;
            case "-" : sonuc = (num1 - num2); break;
            case "*" : sonuc = (num1 * num2); break;
            case "/" :
            if (num2 == 0){
                System.out.println("Bir say� 0'a b�l�nemez ! ");
            }else {
                System.out.println( sonuc = num1 / num2);
            } break;
            default : System.out.println("Yanl�� se�im yapt�n�z. Tekrar deneyiniz. ");
        }
        if(sonuc!=0) {
            System.out.println("��leminizin Sonucu = " + sonuc);
        }

    }
}
