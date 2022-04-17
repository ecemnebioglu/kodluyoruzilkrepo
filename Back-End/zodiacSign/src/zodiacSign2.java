import java.util.*;

public class zodiacSign2 {
    public static void main(String[] args) {
        int month, day;
        String sign = null;
        boolean isError = false;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Gününüzü Giriniz : ");
        day = inp.nextInt();

        System.out.print("Doğduğunuz Ayı Sayı Kullanarak Giriniz : ");
        month = inp.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    sign = "Oğlak";
                } else {
                    sign = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day <= 19) {
                    sign = "Kova";
                } else {
                    sign = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    sign = "Balık";
                } else {
                    sign = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    sign = "Koç";
                } else {
                    sign = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    sign = "Boğa";
                } else {
                    sign = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    sign = "İkizler";
                } else {
                    sign = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    sign = "Yengeç";
                } else {
                    sign = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    sign = "Aslan";
                } else {
                    sign = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    sign = "Başak";
                } else {
                    sign = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    sign = "Terazi";
                } else {
                    sign = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    sign = "Akrep";
                } else {
                    sign = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    sign = "Yay";
                } else {
                    sign = "Oğlak";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz !");
        } else {
            System.out.println("Burcunuz " + sign);
        }
    }
}

