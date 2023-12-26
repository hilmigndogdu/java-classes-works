import java.util.Scanner;

public class Alistirma5 {
    public static void main(String[] args) {
        //Kullanıcının gireceği, en fazla 3 basamaklı olan sayının rakamları toplamını ekrana basan fonksiyonu yazınız.

        Scanner soru = new Scanner(System.in);
        System.out.println("Lütfen en fazla 3 basamaklı olan bir sayi giriniz:");
        int sayi = soru.nextInt();

        int birlerBasamagi,onlarBasamagi,yuzlerBasamagi;

        birlerBasamagi=sayi%10;
        onlarBasamagi=(((sayi%100)-birlerBasamagi)/10);
        yuzlerBasamagi=((sayi-(sayi%100))/100);

        System.out.println("Bu sayının rakamları toplamı: "+(birlerBasamagi+onlarBasamagi+yuzlerBasamagi));



    }
}
