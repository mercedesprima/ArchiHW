package lesson2.builder;
public class DressBuilder {
    private String colour;
    private String neckStyle;
    private int size;
    private String sleeveLength;
    private String material;
    private String occasion;

    public DressBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public DressBuilder setNeckStyle(String neckStyle) {
        this.neckStyle = neckStyle;
        return this;
    }

    public DressBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public DressBuilder setSleeveLength(String sleeveLength) {
        this.sleeveLength = sleeveLength;
        return this;
    }

    public DressBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public DressBuilder setOccasion(String occasion) {
        this.occasion = occasion;
        return this;
    }


    public Dress build(){
        return new Dress (colour, neckStyle, size, sleeveLength, material, occasion);
    }
}
