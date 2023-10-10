package lesson3.lsp;

public class AreaCounter {
    private Rectangle rectangle;

    public AreaCounter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь фигуры равна: ");
        System.out.println(rectangle.getArea());
    }
}
