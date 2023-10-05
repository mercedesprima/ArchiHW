package lesson2.builder;

public class Dress {
    private String colour;
    private String neckStyle;
    private int size;
    private String sleeveLength;
    private String sleeveType;
    private String material;
    private String occasion;

    public Dress(String colour, String neckStyle, int size, String sleeveLength, String material, String occasion) {
        this.colour = colour;
        this.neckStyle = neckStyle;
        this.size = size;
        this.sleeveLength = sleeveLength;
        this.material = material;
        this.occasion = occasion;
    }

    @Override
    public String toString() {

        return String.format("Dress: colour: %s, neckStyle: %s, size: %d, sleeveLength: %s, material: %s, occasion: %s ", colour, neckStyle,
                size, sleeveLength, material, occasion);
//        return "Dress {" +
//                "colour: " + colour + '\'' +
//                ", neckStyle: '" + neckStyle + '\'' +
//                ", size: " + size +
//                ", sleeveLength: '" + sleeveLength + '\'' +
//                ", material: '" + material + '\'' +
//                ", occasion: '" + occasion + '\'' +
//                '}';
    }
}
