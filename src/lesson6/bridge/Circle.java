package lesson6.bridge;

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing circle. ");
        color.getColor();
    }
}
