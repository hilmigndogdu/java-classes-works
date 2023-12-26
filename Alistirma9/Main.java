package Alistirma9;

public class Main {
    public static void main(String[] args) {
        /*Uygulama - 2 (Constructor)
        Oyuncu Sınıfı:İsim (Oyuncunun kullanıcı adı),Seviye (Oyuncunun seviyesinin sayısal değeri),Puan (Oyuncunun puanı [0-100]
        Bir “Oyuncu” sınıfı oluşturun. Oluşturduğunuz sınıf aşağıdaki özelliklere sahip olmalıdır.
        Constructor:Bu sınıfa ait bir kurucu metot ekleyin. Bu constructor, yukarıdaki özellikleri parametre
        olarak almalı ve her nesne için bu özellikleri tanımlamalıdır.
        Bilgiler:Oyuncunun bilgilerinin ekrana yazdırılmasını sağlayan bir metot oluşturun.*/
        Oyuncu oyuncu1 = new Oyuncu("Hilmi",90,100);
        oyuncu1.bilgileriYaz();


    }
}
