import java.util.Scanner;

public class Alistirma4 {
    public static void main(String[] args) {
        //Kullanıcının gireceği bir metin içerisindeki kelime sayısını döndürecek olan fonksiyonu yazınız.

        Scanner soru = new Scanner(System.in);
        System.out.println("Lütfen bir yazı giriniz: ");
        String text = soru.nextLine().trim();

        int harfSayisi = text.length();
        int sayac=1;

        for (int i=0;i<harfSayisi;i++){
            if (text.charAt(i)==' '){
                sayac++;
            }
        }
        System.out.println("Bu metinin kelime sayısı: "+sayac);

    }
}
