package com.mrlonis.time;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class JodaToJavaTimeApplicationTests {
    @Test
    void contextLoads() {
        assertTrue(true);
    }
}
