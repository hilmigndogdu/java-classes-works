package Alistirma8;

public class Main {
    public static void main(String[] args) {
        /*UYGULAMA - 1 (Sınıf ve Nesne)
Bir "Kutu" sınıfı oluşturun. Bu sınıfın üç özelliği olmalı: uzunluk, genişlik ve yükseklik.
"Kutu" sınıfına ait bir nesne oluşturun ve bu nesneye belirli bir uzunluk, genişlik ve yükseklik değerleri atayın.
Bu nesnenin özelliklerini ekrana yazdırarak doğru atama yaptığınızı doğrulayın.
Kutunun hacmini hesaplayan bir metot ekleyin ve bu metodu kullanarak kutunun hacmini ekrana yazdırın.*/

        Kutu kutu1 = new Kutu();
        kutu1.genislik=10;
        kutu1.yukseklik=20;
        kutu1.uzunluk=30;
        System.out.println("Kutunun genisliği: "+kutu1.genislik+
                " uzunlugu: "+kutu1.uzunluk+
                " yüksekliği: "+kutu1.yukseklik);

        System.out.println("Kutunun hacmi:  "+kutu1.hacimHesapla());
    }
}
