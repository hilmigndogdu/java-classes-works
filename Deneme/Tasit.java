package Deneme;

public class Tasit {
    private String isim;

    public Tasit() {
        isim = " ";
    }

    public Tasit(String ilkIsim) {
        isim = ilkIsim;
    }

    public void setIsim(String yeniIsim) {
        isim = yeniIsim;
    }
    public String getIsim() {
        return isim;
    }
    public void ciktiYaz()
    {
        System.out.println("Isim: " + isim);
    }
    public boolean ayniIsim(Tasit digerTasit)
    {
        return (this.isim.equalsIgnoreCase(digerTasit.isim));
    }

}
