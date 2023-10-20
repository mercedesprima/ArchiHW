package lesson6.bridge;

public class RedColor implements Color {
    @Override
    public void getColor() {
        System.out.println("Using red color");
    }
}
