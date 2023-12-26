package Deneme2;

public class ShadowTest {
    public int x = 0;

    class  FirstLevel {

        public int x=1;

        void methotInFirstLevel(int x){
            System.out.println("x= "+ x);
            System.out.println("this.x= "+this.x);
            System.out.println("ShadowTest.this.x= "+ShadowTest.this.x);
        }

    }
}
