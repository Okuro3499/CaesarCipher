package models;

public class cipher {
    private String inputString;

    public cipher(String inputString, int cipherKey) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return this.inputString;
    }
}

