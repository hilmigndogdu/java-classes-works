package Alistirma14;
public class Ogrenci {
    private String ad;
    private String soyAd;
    private int[] notlar;

    public Ogrenci(String ad, String soyAd, int[] notlar) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.notlar = notlar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int[] getNotlar() {
        return notlar;
    }

    public void setNotlar(int[] notlar) {
        this.notlar = notlar;
    }

    public double ortHesapla() {
        double toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
           toplam += notlar[i];
        }
        return toplam/ notlar.length;
    }


}
