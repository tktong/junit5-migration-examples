package me.tktong.thirdparty.mockito;

class MyClockWrapper {
    private final MyClock clock;

    MyClockWrapper(final MyClock clock) {
        this.clock = clock;
    }

    long getCurrentTime() {
        return clock.getCurrentTime();
    }
}
