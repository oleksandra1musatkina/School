package sk.itsovy;

public class Main {

    public static void main(String[] args) {
        SlovakLanguage slovakLanguage = new SlovakLanguage();
        System.out.println(slovakLanguage.formatText("ahoj toto je test"));

        English english = new English();
        System.out.println(english.translate("macka"));
        System.out.println(english.translate("chobotnica"));

        Math math = new Math();
        System.out.println(math.reverse(123));
        System.out.println(math.reverse(650));
        System.out.println(math.reverse(65));
    }
}
