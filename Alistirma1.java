import java.util.Scanner;

public class Alistirma1 {
    public static void main(String[] args) {

        //Kullanıcıdan alınacak olan 3 tam sayıdan en büyüğünü geri döndürecek olan fonksiyonu yazınız

        Scanner soru = new Scanner(System.in);
        System.out.println("Lütfen 3 tane tam sayı giriniz:");
        int sayi1=soru.nextInt();
        int sayi2=soru.nextInt();
        int sayi3=soru.nextInt();

        int maks=sayi1;

        if(sayi2>=maks) {
            if (sayi2>sayi3)
                maks = sayi2;
            else
                maks = sayi3;
        }
        System.out.println("Bu 3 sayıdan en büyüğü: "+maks);

    }
}
