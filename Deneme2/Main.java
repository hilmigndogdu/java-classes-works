package Deneme2;

public class Main {
    public static void main(String[] args) {
        ShadowTest x1 = new ShadowTest();
        ShadowTest.FirstLevel x2 = x1.new FirstLevel();
        x2.methotInFirstLevel(23);

    }
}
