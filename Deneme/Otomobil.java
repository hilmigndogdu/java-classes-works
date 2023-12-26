package Deneme;

public class Otomobil extends Tasit
{
    private int plakaNo;
    public Otomobil()
    {
        super();
        plakaNo = 0;
    }
    public Otomobil(String marka, int plakaNumarasi)
    {
        super(marka);
        plakaNo = plakaNumarasi;
    }
    public void reset(String yeniMarka, int yeniPlakaNumarasi)
    {
        setIsim(yeniMarka);
        plakaNo = yeniPlakaNumarasi;
    }
    public int getOtomobilPlakasi()
    {
        return plakaNo;
    }
    public void setPlakaNumarasi(int yeniPlakaNumarasi)
    {
        plakaNo = yeniPlakaNumarasi;
    }
    public void ciktiYaz()
    {
        System.out.println("Marka: " + getIsim());
        System.out.println("Plaka Numarasi: " + plakaNo);
    }
    public boolean equals(Otomobil digerOtomobil)
    {
        return (this.ayniIsim(digerOtomobil)
                && (this.plakaNo == digerOtomobil.plakaNo));
    }
}
