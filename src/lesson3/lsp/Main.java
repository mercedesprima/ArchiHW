package lesson3.lsp;


public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.setSideA(4);
        System.out.printf("В квадрате сторона равна %d\n", square.getSideA());
        AreaCounter viewSquare = new AreaCounter(square);
        viewSquare.showArea();

        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.setSideA(4);
        rectangle.setSideB(5);

        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        AreaCounter viewRect = new AreaCounter(rectangle);
        viewRect.showArea();
    }
}
