package Alistirma15;

public class Main {
    public static void main(String[] args) {
        /* Hesap adında bir sınıf oluşturunuz.
        Main İçerisinde:En az iki banka hesabı oluşturun.Her bir hesabın hesap numarası,sahibinin adı ve başlangıç bakiyesi olmalıdır.
        Oluşturduğunuz hesapların bilgilerini ekrana yazacak olan metodu oluşturun.
        PARA YATIRMA VE ÇEKME: Her bir hesaba para yatırabilen ve çekebilen metotlar ekleyin.Bu metotları kullanarak gerekli işlemleri
        gerçekleştirin ve sonuçları ekrana yazdırın. Yatırma ve çekme işlemlerinin metotları kullanıcı girişine göre, int yada double
        girdi alabilmelidir.
        Ayrıca, bir hesapSayaci() metodu ile toplam oluşturulan hesap sayısı bellekte tutulmalıdır. İhtiyaç olduğunda bu metot çağırılarak
        toplam hesap sayısı ekrana yazılabilmelidir.Son olarak,oluşturulan her bir hesabın hesap numarası “hesaplar” isimli bir dizi
        içerisinde saklanmalıdır.
         */
        Hesap bankaHesabi1 = new Hesap();
        bankaHesabi1.setAd("Hilmi");
        bankaHesabi1.setHesapNo("Altı");
        bankaHesabi1.setBakiye(2000);

        Hesap bankaHesabi2 = new Hesap();
        bankaHesabi2.setAd("Mami");
        bankaHesabi2.setHesapNo("On");
        bankaHesabi2.setBakiye(1230);

        String[] hesaplar = {bankaHesabi1.getHesapNo(), bankaHesabi2.getHesapNo()};

        bankaHesabi1.oku();
        bankaHesabi2.oku();

        System.out.println("Yeni bakiye: "+bankaHesabi1.paraYatir(1000.245));
        System.out.println("Yeni bakiye: "+bankaHesabi2.paraÇek(240));

        System.out.println("Toplam hesap sayısı: " + Hesap.hesapSayaci());
    }
}
