import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        String userName = input.nextLine();

        if (userName.equals("admin")) {
            System.out.print("Şifrenizi Giriniz :");

            String password = input.nextLine();

            if (password.equals("123456")) {
                System.out.println("Sisteme Giriş Yaptınız!");
            } else {
                System.out.println("Yanlış şifre girildi, şifrenizi sıfırlamak ister misiniz?");
                String menu = "Evet için 1'e, Hayır için 2'ye basınız.";
                System.out.println(menu);

                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.print("Oluşturmak istediğiniz yeni şifreyi giriniz :");
                    int newPassword = input.nextInt();

                    if (newPassword == 123456) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                } else if (choice == 2) {
                        System.out.println("Sisteme giriş yapabilmek için doğru şifreyi giriniz ya da yeni şifre oluşturunuz!");
                } else {
                        System.out.println("Geçersiz işlem yaptınız!");
                }
            }
        } else {
            System.out.println("Kullanıcı adı hatalı girildi!");
        }
    }
}
