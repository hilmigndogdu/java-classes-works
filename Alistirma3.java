import java.util.Scanner;

public class Alistirma3 {
    public static void main(String[] args) {
        //Kullanıcının gireceği String bir ifadenin ortasındaki karakteri döndürecek olan fonksiyonu yazınız.
        //Eğer String ifade çift sayılıysa ortadaki 2 karakteri, tek karakterse ortadaki karakteri yazdırınız.

        Scanner soru = new Scanner(System.in);
        System.out.println("Lütfen bir yazı giriniz: ");
        String text = soru.nextLine();

        int harfSayisi = text.length();

        if (harfSayisi % 2 == 0){
            System.out.println(text.charAt((harfSayisi/2-1)));
            System.out.println(text.charAt((harfSayisi/2)));
        }
        else {
            System.out.println(text.charAt((harfSayisi/2)));
        }

    }
}
