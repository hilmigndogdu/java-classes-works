import java.util.Scanner;

public class Alistirma7 {
    public static void main(String[] args) {
        //Kullanıcının girmiş olduğu, en az 5 ve en fazla 7 karakter içeren string ifadenin
        // palindromik olup olmadığını döndüren fonksiyonu yazınız.
        //Not: Palindrom kelimeler, baştan ve sondan okunuşu aynı olan kelimelerdir.

        Scanner soru = new Scanner(System.in);
        System.out.println("Lütfen en az 5 en fazla 7 karakterden oluşan bir kelime giriniz:");
        String kelime = soru.nextLine();

        if(kelime.length()==5 || kelime.length()==6 || kelime.length()==7){
            System.out.println("Doğru kelime girişi yaptınız.");
            char[] kelimeDizi = kelime.toCharArray();
            int kelimeUzunluk = kelime.length();
            for (int i = 0; i<kelimeUzunluk;i++){
                char temp = kelimeDizi[i];
                kelimeDizi[i]=kelimeDizi[kelimeUzunluk];
                kelimeDizi[kelimeUzunluk]=temp;
                kelimeUzunluk--;
            }
            new String(kelimeDizi);
            System.out.println("Girdiğiniz kelimenin tersi: "+kelimeDizi);

            }
        else {
            System.out.println("Geçersiz kelime girişi yaptınız.");
        }
        }

    }

