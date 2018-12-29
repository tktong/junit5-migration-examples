package me.tktong.assertions.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExpectedExceptionsJUnit5Test {
    private static final String EXCEPTION_MESSAGE = "Message inside exception";
    private static final String TEST_ERROR_MESSAGE = "Error message to report when assertion fails";

    @Test
    void assertExceptionThrown() {
        Assertions.assertThrows(RuntimeException.class, this::someBusinessLogic);
    }

    @Test
    void assertExceptionThrownWithExceptionMessage() {
        final RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, this::someBusinessLogic);
        Assertions.assertEquals(EXCEPTION_MESSAGE, thrown.getMessage());
    }

    @Test
    void assertExceptionThrownWithTestErrorMessage() {
        Assertions.assertThrows(RuntimeException.class, this::someBusinessLogic, TEST_ERROR_MESSAGE);
    }

    @Test
    void assertExceptionThrownWithTestErrorMessageSupplier() {
        Assertions.assertThrows(RuntimeException.class, this::someBusinessLogic, () -> TEST_ERROR_MESSAGE);
    }

    private void someBusinessLogic() {
        throw new RuntimeException(EXCEPTION_MESSAGE);
    }
}
