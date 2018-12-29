package me.tktong.thirdparty.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MockitoExtensionJUnit5Test {
    private static final long CURRENT_TIME = 1234L;

    @Mock
    private MyClock myClock;
    @InjectMocks
    private MyClockWrapper myClockWrapper;

    @Test
    void getCurrentTime() {
        Mockito.when(myClock.getCurrentTime()).thenReturn(CURRENT_TIME);
        final long actual = myClockWrapper.getCurrentTime();
        Assertions.assertEquals(CURRENT_TIME, actual);
    }
}
