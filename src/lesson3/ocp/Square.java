package lesson3.ocp;

// Класс `Square` имеет поле `side` и метод `area()`, который вычисляет площадь квадрата.
public class Square  implements Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

//    public int getSide() {
//        return side;
//    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
