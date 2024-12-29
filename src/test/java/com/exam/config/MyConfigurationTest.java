package com.exam.config;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyConfigurationTest {

    @Test
    void testCorsConfigurer() {
        MyConfiguration myConfiguration = new MyConfiguration();
        WebMvcConfigurer configurer = myConfiguration.corsConfigurer();

        assertNotNull(configurer);

        CorsRegistry registry = new CorsRegistry();
        configurer.addCorsMappings(registry);

        // Use reflection to access the protected getCorsConfigurations method
        try {
            Method method = CorsRegistry.class.getDeclaredMethod("getCorsConfigurations");
            method.setAccessible(true);
            Map<String, ?> corsConfigurations = (Map<String, ?>) method.invoke(registry);

            // Verify that the CORS mapping was added
            assertTrue(corsConfigurations.containsKey("/**"));
        } catch (Exception e) {
            fail("Failed to access protected method: " + e.getMessage());
        }
    }
}