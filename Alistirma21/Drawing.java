package Alistirma21;

public class Drawing {
    public Shape[] shapes;
    public Drawing(Shape[] shapes){
        this.shapes = shapes;
    }
    public void drawShapes(){
        for (Shape shape:shapes) {
            System.out.println("Shape: "+shape.name);
            shape.draw();
            System.out.println("---------------");
        }
    }
}
