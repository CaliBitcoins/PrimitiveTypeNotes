package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // Wrapper Class - java uses this to perform operations on primitives
        // Integer wrapper class for int
        // int occupies 32 bits and has a width of 32
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // OVERFLOW occurs when allocating too large a number into memory allocated to a data type variables
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // UNDERFLOW occurs when allocating too small a number into memory allocated to a data type variables
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // IntelliJ catches OVERFLOW error
        //int myMaxIntTest = 2147483648;

        // Byte occupies 8 bits, or "a byte has a width of 8"
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // short occupies 16 bits and has a width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // long occupies 64 bits, and has a width of 64 (Double size of int)
        // long primitives declared using value and "L"
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // CASTING - instructs compiler to treat value as given type
        // without casting to byte here java tries to default value to int and throws error
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // CASTING -
        short myNewShortValue = (short) (myMinShortValue /2);



    }
}
