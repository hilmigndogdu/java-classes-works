package Alistirma22;

public class Car extends Vehicle{
    public String model;

    @Override
    public void start() {
        System.out.println("Araba Çalıştı");
    }
}
