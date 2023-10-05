package lesson2.fabric;

public class Main {
    public static void main(String[] args) {
        LanguageFactory languageFactory = new LanguageFactory();
        Language russian = languageFactory.createLanguage("russian");
        russian.useAlphabet();

        Language french = languageFactory.createLanguage("french");
        french.useAlphabet();

        Language arabic = languageFactory.createLanguage("arabic");
        arabic.useAlphabet();

        Language chinese = languageFactory.createLanguage("chinese");
        chinese.useAlphabet();
        }
    }
