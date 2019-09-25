package sk.itsovy;

public class Other {

    public boolean isCorrectPrice(String price) {
//        System.out.println("cena je: " + price);

        return price.matches("^(([0][.|,](\\s)?(\\d){2})|([1-9](\\d)*([.|,](\\s)?(\\d){2})?)|([0]))([\\s]?(€|Eur|eur))?$");

    }

    public byte reverseBitsByte(byte x) {
        int intSize = 8;
        byte y = 0;
        for (int position = intSize - 1; position > 0; position--) {
            y += ((x & 1) << position);
            x >>= 1;
        }
        return y;
    }

    public String convertOld(String text) {
        char[] chars = text.toCharArray();
        String toReturn = "";
        for (char pismeno : chars) {
            String pismenoAkoBinarnyRetazec = Integer.toBinaryString((int) pismeno);
            System.out.println(pismenoAkoBinarnyRetazec);
            String prvaPolovica = pismenoAkoBinarnyRetazec.substring(0, 3);
            String druhaPolovica = pismenoAkoBinarnyRetazec.substring(3, 7);
            StringBuilder stringBuilder = new StringBuilder(druhaPolovica);
            String otocenaDruhaPolovica = stringBuilder.reverse().toString();
            char novePismeno = (char) Integer.parseInt(prvaPolovica + otocenaDruhaPolovica, 2);
            toReturn += novePismeno;
            System.out.println("pp: " + prvaPolovica);
            System.out.println("dp: " + druhaPolovica);

        }
        return toReturn;
    }

    public String convert(String text) {
        char[] chars = text.toCharArray();
        String toReturn = "";
        for (char pismeno : chars) {
            byte prvaPolovica = (byte) (240 & pismeno);
            byte duhaPolovica = (byte) (15 & pismeno);
            duhaPolovica = (byte) (~duhaPolovica);
//            duhaPolovica = reverseBitsByte(duhaPolovica);
            duhaPolovica = (byte) (duhaPolovica & 15);
            int novePismeno = prvaPolovica | duhaPolovica;
            System.out.println("np: " + novePismeno);
            toReturn += (char) novePismeno;
        }


        return toReturn;
    }

    public String convert2(String text) {
        char[] chars = text.toCharArray();
        String toReturn = "";
        for (char pismeno : chars) {
            byte prvaPolovica = (byte) (240 & pismeno);
            byte duhaPolovica = (byte) (15 & pismeno);
            prvaPolovica = (byte) (prvaPolovica >> 4);
            duhaPolovica = (byte) (duhaPolovica << 4);
            byte novePismeno = (byte) (duhaPolovica | prvaPolovica);
            toReturn += (char) novePismeno;
        }


        return toReturn;
    }

    public String convert3(String text) {
        char[] chars = text.toCharArray();
        String toReturn = "";
        for (char pismeno : chars) {
            String binaryString = Integer.toBinaryString(pismeno);
//            System.out.println(binaryString);
            char[] charsArray = binaryString.toCharArray();
            for (int i = 1; i < charsArray.length; i += 2) {
//                System.out.println("i: " + charsArray[i]);
//                System.out.println("i+1: " + charsArray[i+1]);
                char temp = charsArray[i + 1];
                charsArray[i + 1] = charsArray[i];
                charsArray[i] = temp;
            }
            String newBinaryString = new String(charsArray);
//            System.out.println(newBinaryString);
            toReturn += (char) Integer.parseInt(newBinaryString, 2);
        }


        return toReturn;
    }


}


