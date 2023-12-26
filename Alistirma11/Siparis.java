package Alistirma11;

public class Siparis {
    private int siparisID;
    private String urunAdi;
    private int miktar;
    private double birimFiyat;

    public Siparis(int siparisID, String urunAdi, int miktar, double birimFiyat) {
        this.siparisID = siparisID;
        this.urunAdi = urunAdi;
        this.miktar = miktar;
        this.birimFiyat = birimFiyat;
    }

    public int getSiparisID() {
        return siparisID;
    }

    public void setSiparisID(int siparisID) {
        this.siparisID = siparisID;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }
    public double hesaplaToplamFiyat(){
        return miktar*birimFiyat;
        }

    }
