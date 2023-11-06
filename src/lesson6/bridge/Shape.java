package lesson6.bridge;

// Абстракция
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    Shape() {
    }

    public abstract void draw();
}
