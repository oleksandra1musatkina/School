package sk.itsovy;

public class English extends Sublejct {

    public String translate(String zviera) {
        if (zviera == null) {
            return null;
        }
        switch (zviera) {
            case "macka":
                return "cat";
            case "pes":
                return "dog";
            case "slon":
                return "elephant";
            case "tiger":
                return "tiger";
            case "zajac":
                return "rabbit";
            case "ryba":
                return "fish";
            case "medved":
                return "bear";
            case "holub":
                return "pigeon";
            default:
                return null;
        }
    }
}
