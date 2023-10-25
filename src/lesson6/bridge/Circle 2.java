package lesson6.bridge;
// конкретная реализация интерфейса для Формы
class Circle extends Shape {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a circle with color: " + color.getColor());
    }
}