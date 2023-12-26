import java.util.Scanner;

public class Alistirma2 {
    public static void main(String[] args) {
        //Kullanıcıdan alınacak olan 3 sayının ortalamasını alacak ve ekrana basacak olan fonksiyonu yazınız.

        Scanner soru = new Scanner(System.in);
        System.out.println("Lütfen 3 tane sayı giriniz:");
        double sayi1=soru.nextInt();
        double sayi2=soru.nextInt();
        double sayi3=soru.nextInt();

        double ortalama = ((sayi1+sayi2+sayi3)/3);

        System.out.println("Bu 3 sayının ortalaması:  "+ortalama);
    }
}
