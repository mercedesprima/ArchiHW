package lesson6.bridge;

public class BlueColor implements Color {
    @Override
    public void getColor() {
        System.out.println("Using blue color");
    }
}
