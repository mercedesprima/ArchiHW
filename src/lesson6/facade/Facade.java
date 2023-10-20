package lesson6.facade;

class Facade {
    private PrimarySchool primarySchool;
    private SecondarySchool secondarySchool;
    private HighSchool highSchool;

    public Facade() {
        primarySchool = new PrimarySchool();
        secondarySchool = new SecondarySchool();
        highSchool = new HighSchool();
    }

    public void tests() {
        primarySchool.pTests();
        secondarySchool.sTests();
        highSchool.hTests();
    }
}
