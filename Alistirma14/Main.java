package Alistirma14;

public class Main {
    public static void main(String[] args) {
        /*Öğrenci Bilgi Sistemi:String ad,String soyad,int[]notlar. Bir “Ogrenci” sınıfı oluşturun. Bu sınıf aşağıdaki özelliklere sahip olmalıdır.
        Ayrıca,bu sınıfa ait bir constructor metot ekleyin. Bu constructor, öğrencinin adını, soyadını ve notlarını parametre olarak almalıdır.
        Son olarak, öğrencinin not ortalamasını hesaplayacak ve ekrana basacak olan bir ortHesapla() fonksiyonu yazın.*/

        int[] ogrenci1Not={100,50,40};
        int[] ogrenci2Not={70,55,98};

        Ogrenci ogrenci1 = new Ogrenci("Hilmi","Gündoğdu",ogrenci1Not);
        Ogrenci ogrenci2 = new Ogrenci("Mami","Güney",ogrenci2Not);

        System.out.println("Hilminin not ortalaması: "+ogrenci1.ortHesapla());
        System.out.println("Maminin not ortalaması: "+ogrenci2.ortHesapla());

    }
}
