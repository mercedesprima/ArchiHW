package lesson2.builder;
public class Main {
    public static void main(String[] args) {
        Dress dress1 = new DressBuilder()
                .setColour("blue")
                .setNeckStyle("collared Neck")
                .setSize(44)
                .setSleeveLength("short Sleeve")
                .setMaterial("cotton")
                .setOccasion("casual")
                .build();

        Dress dress2 = new DressBuilder()
                .setColour("red")
                .setNeckStyle("V-Neck")
                .setSize(46)
                .setSleeveLength("Long Sleeve")
                .setMaterial("viscose")
                .setOccasion("casual")
                .build();
        System.out.println(dress1);
        System.out.println(dress2);
    }
}
