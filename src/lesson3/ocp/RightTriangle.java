package lesson3.ocp;

//Класс `RightTriangle` имеет поля `side1`, `side2`, а также метод `area()`, который вычисляет площадь прямоугольного треугольника.
public class RightTriangle implements Shape {
    private int side1;
    private int side2;
    private double hypotenuse;

    public RightTriangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

//    public int getSide2() {
//        return side2;
//    }
//
//    public int getSide1() {
//        return side1;
//    }
//
//    public double getHypotenuse() {
//        return hypotenuse;
//    }

    @Override
    public double area() {
        return side1 * side2 / 2.0;
    }
}
