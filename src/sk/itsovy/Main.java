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

        Other other = new Other();
        System.out.println("je cena spravna?: " + other.isCorrectPrice("9.97 eur"));
        System.out.println("je cena spravna?: " + other.isCorrectPrice("9.97eur"));

        System.out.println("je cena spravna?: " + other.isCorrectPrice("9,97€"));
        System.out.println("je cena spravna?: " + other.isCorrectPrice("9,97 €"));

        System.out.println("je cena spravna?: " + other.isCorrectPrice("9.97 Eur"));
        System.out.println("je cena spravna?: " + other.isCorrectPrice("9.97Eur"));

        System.out.println("je cena spravna?: " + other.isCorrectPrice("0.97"));
        System.out.println("je cena spravna?: " + other.isCorrectPrice("0. 93"));

        System.out.println("je cena spravna?: " + other.isCorrectPrice("0.9"));
        System.out.println("je cena spravna?: " + other.isCorrectPrice("0 eur"));

//        System.out.println("zmeneny pes: " + other.convertOld("pes"));
        System.out.println("prve zmenenie pes: " + other.convert("pes"));
        System.out.println("druhe zmenenie pes: " + other.convert2("pes"));
        System.out.println("tretie zmenenie pes: " + other.convert3("pes"));

    }
}
