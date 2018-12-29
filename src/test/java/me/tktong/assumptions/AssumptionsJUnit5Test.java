package me.tktong.assumptions;

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
        Assumptions.assumeFalse(true);
    }

    @Test
    void assumeFalseWithBooleanSupplier() {
        Assumptions.assumeFalse(() -> true);
    }

    @Test
    void assumeFalseWithBooleanSupplierAndMessage() {
        Assumptions.assumeFalse(() -> true, "My message");
    }

    @Test
    void assumeFalseWithBooleanSupplierAndMessageSupplier() {
        Assumptions.assumeFalse(() -> true, () -> "My message");
    }

    @Test
    void assumeFalseWithMessage() {
        Assumptions.assumeFalse(true, "My message");
    }

    @Test
    void assumeFalseWithMessageSupplier() {
        Assumptions.assumeFalse(true, () -> "My message");
    }

    @Test
    void assumeTrue() {
        Assumptions.assumeTrue(false);
    }

    @Test
    void assumeTrueWithBooleanSupplier() {
        Assumptions.assumeTrue(() -> false);
    }

    @Test
    void assumeTrueWithBooleanSupplierAndMessage() {
        Assumptions.assumeTrue(() -> false, "My message");
    }

    @Test
    void assumeTrueWithBooleanSupplierAndMessageSupplier() {
        Assumptions.assumeTrue(() -> false, () -> "My message");
    }

    @Test
    void assumeTrueWithMessage() {
        Assumptions.assumeTrue(false, "My message");
    }

    @Test
    void assumeTrueWithMessageSupplier() {
        Assumptions.assumeTrue(false, () -> "My message");
    }

    @Test
    void assumingThat() {
        Assumptions.assumingThat(false, () -> System.out.println("Some executable"));
    }

    @Test
    void assumingThatWithBooleanSupplier() {
        Assumptions.assumingThat(() -> false, () -> System.out.println("Some executable"));
    }
}
