package Alistirma9;

public class Oyuncu {
    public String isim;
    public int seviye;
    public int puan;

    public Oyuncu(String isim,int seviye,int puan){
        this.isim = isim;
        this.puan = puan;
        this.seviye = seviye;
    }
    public void bilgileriYaz(){
        System.out.println("Oyuncunun ismi: "+isim+
                "\nOyuncunun seviyesi: "+seviye+
                "\nOyuncunun puanı: "+puan);
    }
}
