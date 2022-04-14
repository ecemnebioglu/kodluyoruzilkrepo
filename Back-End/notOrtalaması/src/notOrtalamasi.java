import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, toplam ;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat =input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya=input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ort = toplam/6.0;
        System.out.println("Ortalamanız : " + ort);

        boolean kosul = ort >= 60;
        String  str = kosul ? "Sınıfı Geçti ! " : "Sınıfta Kaldı ! ";
        System.out.println(str);
    }
}
