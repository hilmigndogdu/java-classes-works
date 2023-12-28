package Alistirma21;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};

        Drawing drawing = new Drawing(shapes);

        drawing.drawShapes();
    }
}
