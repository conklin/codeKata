package net.enoot.reversInteger;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class UsingACharacterArray implements ReversInteger{

    public int reverseInteger(int x) {
        String xAsString = Integer.toString(x);

        boolean isXNegative = false;
        if (xAsString.startsWith("-")) {
            xAsString = xAsString.substring(1, xAsString.length());
            isXNegative = true;
        }

        char[] chars = xAsString.toCharArray();
        char[] reversedInteger = reversArray(chars);

        int reveresedInt = convertCharArrayToIntegerDefaultingTo0(reversedInteger);

        if (reveresedInt != 0 && isXNegative) {
            return Integer.parseInt("-" + Integer.toString(reveresedInt));
        }

        return reveresedInt;

    }


    private char[] reversArray(char[] chars) {
        char[] tmp = new char[chars.length];
        for (int i = (chars.length - 1); i >= 0; i--) {
            tmp[(chars.length - 1) - i] = chars[i];
        }
        return tmp;
    }

    private int convertCharArrayToIntegerDefaultingTo0(char[] chars) {
        try {
            return Integer.parseInt(String.valueOf(chars));
        } catch (NumberFormatException e) {
            return 0;
        }
    }


}