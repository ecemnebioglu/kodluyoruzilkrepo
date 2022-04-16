import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double avg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();


        if ((mat >= 0 && mat<=100) && (fizik>=0 && fizik <=100) &&  (turkce>=0 && turkce<=100) && (kimya>=0 && kimya<=100) && (muzik>=0 && muzik<=100) ){
            avg = ( mat + fizik + turkce + kimya + muzik ) /5 ;
            System.out.println("Ortalamanız : " + avg);
        }
        else{
            System.out.println("Girdiğiniz not geçerli değildir. ");
        }

    }
}
