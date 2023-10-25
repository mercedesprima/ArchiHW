package lesson6.bridge;
// конкретная реализация интерфейса для Формы
class Triangle extends Shape {
    private Color color;

    public Triangle(Color color) {
        this.color = color;
    }
    public void draw() {
        System.out.println("Drawing a triangle with color: " + color.getColor());
    }
}