package me.tktong.assertions.equals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * JUnit5 uses assertion methods from {@link org.junit.jupiter.api.Assertions}. One of the major changes is that
 * there exists an assertEquals method for each of the primitives now whereas in JUnit4, it would rely on the long
 * implementation.
 */
class AssertEqualsJUnit5Test {
    private static final String MESSAGE = "My message";

    @Test
    void assertByteEquals() {
        final byte value = 5;
        Assertions.assertEquals(value, value);
    }

    @Test
    void assertByteEqualsWithMessage() {
        final byte value = 5;
        Assertions.assertEquals(value, value, MESSAGE);
    }

    @Test
    void assertByteEqualsWithMessageSupplier() {
        final byte value = 5;
        Assertions.assertEquals(value, value, () -> MESSAGE);
    }

    @Test
    void assertCharEquals() {
        Assertions.assertEquals('a','a');
    }

    @Test
    void assertCharEqualsWithMessage() {
        Assertions.assertEquals('a','a', MESSAGE);
    }

    @Test
    void assertCharEqualsWithMessageSupplier() {
        Assertions.assertEquals('a','a', () -> MESSAGE);
    }

    @Test
     void assertDoubleEquals() {
        Assertions.assertEquals(1.0, 1.0, 0.0);
    }

    @Test
     void assertDoubleEqualsWithDelta() {
        Assertions.assertEquals(1.0, 1.2, 0.5);
    }

    @Test
     void assertDoubleEqualsWithDeltaAndMessage() {
        Assertions.assertEquals(1.0, 1.2, 0.5, MESSAGE);
    }

    @Test
    void assertDoubleEqualsWithDeltaAndMessageSupplier() {
        Assertions.assertEquals(1.0, 1.2, 0.5, () -> MESSAGE);
    }

    @Test
     void assertDoubleEqualsWithMessage(){
        Assertions.assertEquals(1.0, 1.0, 0.0, MESSAGE);
    }

    @Test
    void assertDoubleEqualsWithMessageSupplier(){
        Assertions.assertEquals(1.0, 1.0, 0.0, () -> MESSAGE);
    }

    @Test
     void assertFloatEquals() {
        Assertions.assertEquals(1.0f, 1.0f, 0.0f);
    }

    @Test
     void assertFloatEqualsWithDelta() {
        Assertions.assertEquals( 1.0f, 1.2f, 0.5f);
    }

    @Test
     void assertFloatEqualsWithDeltaAndMessage() {
        Assertions.assertEquals(1.0f, 1.2f, 0.5f, MESSAGE);
    }

    @Test
    void assertFloatEqualsWithDeltaAndMessageSupplier() {
        Assertions.assertEquals(1.0f, 1.2f, 0.5f, () -> MESSAGE);
    }


    @Test
     void assertFloatEqualsWithMessage() {
        Assertions.assertEquals(1.0f, 1.0f, 0.0f, MESSAGE);
    }

    @Test
    void assertFloatEqualsWithMessageSupplier() {
        Assertions.assertEquals(1.0f, 1.0f, 0.0f, () -> MESSAGE);
    }


    @Test
    void assertIntegerEquals() {
        Assertions.assertEquals(1,1);
    }

    @Test
    void assertIntegerEqualsWithMessage() {
        Assertions.assertEquals(1,1, MESSAGE);
    }

    @Test
    void assertIntegerEqualsWithMessageSupplier() {
        Assertions.assertEquals(1,1, () -> MESSAGE);
    }

    @Test
     void assertLongEquals() {
        Assertions.assertEquals(1L, 1L);
    }

    @Test
     void assertLongEqualsWithMessage() {
        Assertions.assertEquals(1L, 1L, MESSAGE);
    }

    @Test
    void assertLongEqualsWithMessageSupplier() {
        Assertions.assertEquals(1L, 1L, () -> MESSAGE);
    }

    @Test
     void assertObjectEquals(){
        final Object object = new Object();
        Assertions.assertEquals(object, object);
    }

    @Test
     void assertObjectEqualsWithMessage(){
        final Object object = new Object();
        Assertions.assertEquals(object, object, MESSAGE);
    }

    @Test
    void assertObjectEqualsWithMessageSupplier(){
        final Object object = new Object();
        Assertions.assertEquals(object, object, () -> MESSAGE);
    }

    @Test
    void assertShortEquals() {
        final short value = 16;
        Assertions.assertEquals(value, value);
    }

    @Test
    void assertShortEqualsWithMessage() {
        final short value = 16;
        Assertions.assertEquals(value, value, MESSAGE);
    }

    @Test
    void assertShortEqualsWithMessageSupplier() {
        final short value = 16;
        Assertions.assertEquals(value, value, () -> MESSAGE);
    }
}
