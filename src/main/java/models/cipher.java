package models;

public class cipher {
    private String inputString;
    private int cipherKey;

    public cipher(String inputString, int cipherKey) {
        this.inputString = inputString;
        this.cipherKey = cipherKey;
    }

    public String getInputString() {
        return this.inputString;
    }

    public Integer getCipherKey() {
        return this.cipherKey;
    }
}

