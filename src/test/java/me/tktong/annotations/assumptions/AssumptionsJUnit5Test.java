package me.tktong.annotations.assumptions;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**
 * JUnit4 uses assumption methods from {@link org.junit.jupiter.api.Assumptions}. Also note that
 * {@link org.junit.Assume#assumeNoException(Throwable)} and {@link org.junit.Assume#assumeNotNull(Object...)} are no
 * longer supported.
 */
class AssumptionsJUnit5Test {
    @Test
    void assumeFalse() {
        Assumptions.assumeFalse(false);
    }

    @Test
    void assumeFalseWithBooleanSupplier() {
        Assumptions.assumeFalse(() -> false);
    }

    @Test
    void assumeFalseWithBooleanSupplierAndMessage() {
        Assumptions.assumeFalse(() -> false, "My message");
    }

    @Test
    void assumeFalseWithBooleanSupplierAndMessageSupplier() {
        Assumptions.assumeFalse(() -> false, () -> "My message");
    }

    @Test
    void assumeFalseWithMessage() {
        Assumptions.assumeFalse(false, "My message");
    }

    @Test
    void assumeFalseWithMessageSupplier() {
        Assumptions.assumeFalse(false, () -> "My message");
    }

    @Test
    void assumeTrue() {
        Assumptions.assumeTrue(true);
    }

    @Test
    void assumeTrueWithBooleanSupplier() {
        Assumptions.assumeTrue(() -> true);
    }

    @Test
    void assumeTrueWithBooleanSupplierAndMessage() {
        Assumptions.assumeTrue(() -> true, "My message");
    }

    @Test
    void assumeTrueWithBooleanSupplierAndMessageSupplier() {
        Assumptions.assumeTrue(() -> true, () -> "My message");
    }

    @Test
    void assumeTrueWithMessage() {
        Assumptions.assumeTrue(true, "My message");
    }

    @Test
    void assumeTrueWithMessageSupplier() {
        Assumptions.assumeTrue(true, () -> "My message");
    }

    @Test
    void assumingThat() {
        Assumptions.assumingThat(true, () -> System.out.println("Some executable"));
    }

    @Test
    void assumingThatWithBooleanSupplier() {
        Assumptions.assumingThat(() -> true, () -> System.out.println("Some executable"));
    }
}
