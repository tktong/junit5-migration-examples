package me.tktong.info;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.Map;

class TestReporterJUnit5Test {
    @Test
    void publishMessage(final TestReporter testReporter) {
        testReporter.publishEntry("Hello");
    }

    @Test
    void publishKeyValuePair(final TestReporter testReporter) {
        testReporter.publishEntry("My key", "My value");
    }

    @Test
    void publishMap(final TestReporter testReporter) {
        testReporter.publishEntry(Map.of(
                "Key 1", "Value 1",
                "Key 2", "Value 2"
        ));
    }
}
