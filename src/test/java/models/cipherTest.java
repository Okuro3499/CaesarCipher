package models;

import org.junit.*;
import static org.junit.Assert.*;

public class cipherTest {

    @Test
    public void newCipher_instantiatesCorrectly() {
        cipher testCipher = new cipher("A", 0);
        assertEquals(true, testCipher instanceof cipher);
    }

    @Test
    public void newCipher_getsInputString(){
        cipher testCipher = new cipher("A", 0);
        assertEquals("A", testCipher.getInputString());
    }
}