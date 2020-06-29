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

    @Test
    public void newCipher_getsCipherKey(){
        cipher testCipher = new cipher("A",0);
        Integer expectedOutput = 0;
        assertEquals(expectedOutput, testCipher.getCipherKey());
    }

    @Test
    public void newCipher_cipheredInputString(){
        cipher testCipher = new cipher("A", 23);
        assertEquals("X", testCipher.getCipheredString());
    }
}