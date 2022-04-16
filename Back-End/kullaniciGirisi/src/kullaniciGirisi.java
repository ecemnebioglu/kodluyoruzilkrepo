import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String username, password, answ, pass = null;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("1234")) {
            System.out.println("Giriş Başarılı. Hoşgeldiniz. :)");
        } else if (!username.equals("patika")) {
            System.out.println("Kullanıcı adı şifre uyumsuzluğu...");
        } else {
            System.out.println("Şifre Kullanıcı Adı Uyumsuzluğu .\nŞifrenizi sıfırlamak ister misiniz ?\nYes or No ");
            answ = inp.nextLine();
            if (answ.equals("yes")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                pass = inp.nextLine();
                if (pass.equals(password)) {
                    System.out.println("Seçtiğiniz şifre eski şifrenizle aynı olmamalıdır. Şifre oluşturulamadı.");
                } else {
                    System.out.println("Şifre oluşturuldu!");
                }
            } else {
                System.out.println(" 'No' seçtiğinizden şifre oluşturulamadı. Giriş Başarısız olmuştur.");
            }
        }
    }

}

