package me.tktong.thirdparty.mockito;

class MyClock {
    long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
