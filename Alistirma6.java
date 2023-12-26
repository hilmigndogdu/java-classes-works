import java.util.Scanner;

public class Alistirma6 {
    public static void main(String[] args) {
        //Kullanıcıdan 3 int değer alan ve 2. girilen int değeri, girilen 3 değerin ortalaması ise true,
        // değilse false döndüren fonksiyonu yazınız.

        Scanner soru = new Scanner(System.in);
        System.out.println("Lütfen 3 tane tam sayı giriniz:");
        int sayi1=soru.nextInt();
        int sayi2=soru.nextInt();
        int sayi3=soru.nextInt();

        boolean sonuc = ortalamasiMi(sayi1,sayi2,sayi3);

        System.out.println(sonuc);
    }

    public static boolean ortalamasiMi(int sayi1,int sayi2 ,int sayi3){

        int toplam = sayi1+sayi2+sayi3;

        return (toplam/3 == sayi2);

    }
}
