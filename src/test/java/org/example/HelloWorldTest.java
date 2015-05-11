package org.example;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class HelloWorldTest {

    @Test
    public void testingHelloWorld() {
        assertEquals(
                "Here is test for Hello World String: ",
                "Hello World",
                HelloWorld.helloWorld()
        );
    }
}