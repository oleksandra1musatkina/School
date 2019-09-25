package sk.itsovy;

public class SlovakLanguage extends Sublejct {

    public String formatText(String text) {
        if (text == null) {
            return null;
        }
        String text2 = text.toLowerCase().substring(0, 1).toUpperCase() + text.toLowerCase().substring(1);
        if (text2.charAt(text.length() - 1) == '.' || text2.charAt(text.length() - 1) == '!' || text2.charAt(text.length() - 1) == '?') {
            ;
        } else {
            text2 += '.';
        }
        return text2;
    }
}
