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
        return "Dress {" +
                "colour: " + colour + '\'' +
                ", neckStyle: '" + neckStyle + '\'' +
                ", size: " + size +
                ", sleeveLength: '" + sleeveLength + '\'' +
                ", material: '" + material + '\'' +
                ", occasion: '" + occasion + '\'' +
                '}';
    }
}
