package lesson6.bridge;

// Конкретные реализации абстракции
class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing square. ");
        color.getColor();
    }
}

