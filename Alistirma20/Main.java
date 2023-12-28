package Alistirma20;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeSound();
        System.out.println("Bakalım Hangi Hayvan");
        Bird kus = new Bird();
        kus.makeSound();
        kus.species = "Kuş";
        kus.age = 2;
        kus.featherColor = "Mavi";
        System.out.println("Tür:   "+kus.species);
        System.out.println("Yaşı:  "+kus.age);
        System.out.println("Rengi: "+kus.featherColor);
        kus.makeSound();
    }
}
