package sk.itsovy;

public class Math extends Sublejct {

    public int reverse(int number) {
        String s = Integer.toString(number);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        String string = sb.toString();
        if (string.charAt(0) == '0') {
            string = "0";
        }
        return Integer.parseInt(string);
    }

    public boolean isPrime(int cislo) {
        if (cislo == 0 || cislo == 1) {
            return true;
        } else {
            for (int i = 2; i <= cislo / 2; i++) {
                if (cislo % i == 0) {
                    return false;
                }
            }
            return true;

        }
    }

}
