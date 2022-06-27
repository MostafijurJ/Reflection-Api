package com.learn.reflectionapi.reflectionapi;

import com.learn.reflectionapi.reflectionapi.util.ElementClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReflectionApiApplicationTests {

    @Autowired
    private ElementClass elementClass;

    @Test
    void contextLoads() {
    }

    @Test
    void testElementClass() throws NoSuchFieldException {
        elementClass.getElementClass();
    }
}
