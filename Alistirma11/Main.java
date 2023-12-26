package Alistirma11;

public class Main {
    public static void main(String[] args) {
        /*Müşteri Sınıfı:String ad, String soyad, String email ve String telefon özelliklerine sahip bir sınıf oluşturun.
          Getter ve setter metotları ekleyin.
          Sipariş Sınıfı:int siparisID, String urunAdi, int miktar ve double toplamFiyat özelliklerine sahip bir sınıf oluşturun.
          Getter ve setter metotları ekleyin.
          double hesaplaToplamFiyat() adında bir metod ekleyin. Bu metod, miktar ile birim fiyatın çarpımını kullanarak toplam fiyatı hesaplar.
          Main Program:Programın başlangıcında, en az iki müşteri oluşturun.
          Her müşterinin bilgilerini ekrana yazdırarak doğru oluşturulduğunu doğrulayın.
          Ardından, her müşteri için en az bir sipariş oluşturun.
          Her siparişin bilgilerini ekrana yazdırarak doğru oluşturulduğunu doğrulayın.
          Ayrıca, her siparişin toplam fiyatını hesaplayarak doğru çalıştığını kontrol edin.*/

        Musteri musteri1 = new Musteri();
        musteri1.setAd("Hilmi");
        musteri1.setSoyad("Gündoğdu");
        musteri1.setEmail("q@gmail.com");
        musteri1.setTelefon(45);

        Musteri musteri2 = new Musteri();
        musteri2.setAd("Taha");
        musteri2.setSoyad("Eren");
        musteri2.setEmail("w@gmail.com");
        musteri2.setTelefon(85);

        Siparis siparis1 = new Siparis(10,"laptop",1,100000);
        Siparis siparis2= new Siparis(11,"telefon",2,24000);

        System.out.println("Müşteri 1: " + musteri1.getAd() + " " + musteri1.getSoyad() + " " + musteri1.getEmail() + " " + musteri1.getTelefon());
        System.out.println("Müşteri 2: " + musteri2.getAd() + " " + musteri2.getSoyad() + " " + musteri2.getEmail() + " " + musteri2.getTelefon());

        System.out.println("Sipariş 1: " + siparis1.getSiparisID() + " " + siparis1.getUrunAdi() + " " + siparis1.getMiktar() + " " + siparis1.getBirimFiyat());
        System.out.println("Sipariş 2: " + siparis2.getSiparisID() + " " + siparis2.getUrunAdi() + " " + siparis2.getMiktar() + " " + siparis2.getBirimFiyat());

        System.out.println("Sipariş 1 Toplam Fiyat: " + siparis1.hesaplaToplamFiyat());
        System.out.println("Sipariş 2 Toplam Fiyat: " + siparis2.hesaplaToplamFiyat());
    }
    }

