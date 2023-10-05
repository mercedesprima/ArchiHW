package lesson2.builder;
public class Main {
    public static void main(String[] args) {
        Dress dress1 = new DressBuilder()
                .setColour("blue")
                .setNeckStyle("collared neck")
                .setSize(44)
                .setSleeveLength("short sleeve")
                .setMaterial("cotton")
                .setOccasion("casual")
                .build();

        Dress dress2 = new DressBuilder()
                .setColour("red")
                .setNeckStyle("v-neck")
                .setSize(46)
                .setSleeveLength("long sleeve")
                .setMaterial("viscose")
                .setOccasion("casual")
                .build();
        System.out.println(dress1);
        System.out.println(dress2);
    }
}
