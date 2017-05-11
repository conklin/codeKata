package net.enoot;

import net.enoot.reversInteger.ReversInteger;
import net.enoot.reversInteger.UsingACharacterArray;
import net.enoot.reversInteger.UsingModOperator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseAnIntegerTest {

    public Integer maxInteger = 2147483647;

    @Test public void reverseIntegerUsingCharacterArray () {
        UsingACharacterArray classUnderTest = new UsingACharacterArray();
        assertEquals(1, classUnderTest.reverseInteger(1));
        assertEquals(123, classUnderTest.reverseInteger(321));
        assertEquals(0, classUnderTest.reverseInteger(2147483647));
        assertEquals(-123, classUnderTest.reverseInteger(-321));
    }

    @Test public void reverseIntegerUsingMod () {
        ReversInteger classUnderTest = new UsingModOperator();
        assertEquals(1, classUnderTest.reverseInteger(1));
        assertEquals(123, classUnderTest.reverseInteger(321));
        assertEquals(0, classUnderTest.reverseInteger(2147483647));
        assertEquals(-123, classUnderTest.reverseInteger(-321));
    }
}
