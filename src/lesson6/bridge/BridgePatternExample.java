package lesson6.bridge;

public class BridgePatternExample {
    public static void main(String[] args) {
        Shape Square = new Square(new RedColor());
        Square.draw();

        Shape Circle = new Circle(new GreenColor());
       Circle.draw();

        Shape Rectangle = new Rectangle(new BlueColor());
        Rectangle.draw();
    }
}
