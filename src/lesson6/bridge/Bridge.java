package lesson6.bridge;

public class Bridge {
    public static void main(String[] args) {
        Shape circle = new Circle(new GreenColor());
        Shape square = new Square(new RedColor());
        Shape triangle = new Triangle(new BlueColor());

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
