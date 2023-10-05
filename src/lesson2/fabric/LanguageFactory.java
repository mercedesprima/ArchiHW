package lesson2.fabric;

public class LanguageFactory {
    public Language createLanguage(String languageName) {
        if ("russian".equalsIgnoreCase(languageName)) {
            return new Russian();
        } else if ("french".equalsIgnoreCase(languageName)) {
            return new French();
        } else if ("arabic".equalsIgnoreCase(languageName)) {
            return new Arabic();
        } else if ("chinese".equalsIgnoreCase(languageName)) {
            return new Chinese();
        } else {
            throw new IllegalArgumentException("Unsupported linguistic type");
            }
        }

    }
