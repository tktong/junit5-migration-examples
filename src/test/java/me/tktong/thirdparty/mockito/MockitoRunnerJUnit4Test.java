package me.tktong.thirdparty.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoRunnerJUnit4Test {
    private static final long CURRENT_TIME = 1234L;

    @Mock
    private MyClock myClock;
    @InjectMocks
    private MyClockWrapper myClockWrapper;

    @Test
    public void getCurrentTime() {
        Mockito.when(myClock.getCurrentTime()).thenReturn(CURRENT_TIME);
        final long actual = myClockWrapper.getCurrentTime();
        Assert.assertEquals(CURRENT_TIME, actual);
    }
}
