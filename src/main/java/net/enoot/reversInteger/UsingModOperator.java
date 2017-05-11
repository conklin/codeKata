package net.enoot.reversInteger;


public class UsingModOperator  implements  ReversInteger{
    @Override
    public int reverseInteger(int x) {


        long reversedNumber = 0;
        while (x !=0) {
            int lastDigit = getRightMostDigit(x);
            x = removeRightMostDigit(x);

            reversedNumber = appendDigitTo(reversedNumber, lastDigit);
        }

        if  (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE){
            return 0;
        }

        return (int) reversedNumber;

    }

    private long appendDigitTo(long number, int toAppend) {
        return (number * 10) + toAppend;
    }


    private int getRightMostDigit(int x) {
        return x % 10;
    }

    private int removeRightMostDigit(int x) {
        return ((x)/10);
    }
}
