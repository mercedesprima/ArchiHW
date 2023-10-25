package lesson6.bridge;
// конкретная реализация интерфейса для Формы
class Square extends Shape {
    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a square with color: " + color.getColor());
    }
}

