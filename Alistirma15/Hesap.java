package Alistirma15;

public class Hesap {
    private String hesapNo;
    private String ad;
    private double bakiye;
    private static int hesapSayaci=0;

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void oku(){
        System.out.println(getAd()+"\t"+getHesapNo()+"\t"+getBakiye());
    }
    public int paraYatir(int yatir){
        int yeniBakiye = (int)bakiye + yatir;
        return yeniBakiye;

    }
    public double paraYatir(double yatir){
        bakiye += yatir;
        return bakiye;
    }
    public int paraÇek(int cek){
        int yeniBakiye = (int)bakiye - cek;
        return yeniBakiye;

    }
    public double paraCek(double cek){
        bakiye -= cek;
        return bakiye;
    }
    public static int hesapSayaci() {
        hesapSayaci++;
        return hesapSayaci;
    }

}
