package Alistirma13;

public class Main {
    public static void main(String[] args) {
        /*Bir “HesapMakinesi” sınıfı oluşturun. Oluşturduğunuz sınıfın aşağıdaki işlemleri yerine getirebilen metotları içermesini sağlayın:
        topla(int sayi1, int sayi2)-> İki tam sayıyı toplayan bir metot
        topla(doublesayi1,doublesayi2)-> İki double sayıyı toplayan bir metot.
        carp(int sayi1, int sayi2)-> İki tam sayıyı çarpan bir metot.
        carp(doublesayi1,doublesayi2)-> İki double sayıyı çarpan bir metot.
        carp(doublesayi1,doublesayi2,doublesayi3)->Üç double sayıyı çarpan bir metot.*/

        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        System.out.println(hesapMakinesi.topla(10,20));
        System.out.println(hesapMakinesi.topla(10.12,23.45));
        System.out.println(hesapMakinesi.carp(12,2));
        System.out.println( hesapMakinesi.carp(10.12,24.45));
        System.out.println( hesapMakinesi.carp(1.2,3.4,5.6));
        System.out.println("Deneme");


    }
}
