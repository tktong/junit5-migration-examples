package me.tktong.annotations.displayname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DisplayNameJUnit5Test {
    @Test
    @DisplayName("A more readable test name")
    void someTest(){}
}
