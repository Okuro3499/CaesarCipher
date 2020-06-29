package models;

public class cipher {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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

    public String getCipheredString() {
        if (cipherKey > 26) {
            cipherKey = cipherKey % 26;
        } else if (cipherKey < 0) {
            cipherKey = (cipherKey % 26) + 26;
        }
        String cipheredString = "";
        int length = inputString.length();
        for (int i = 0; i < length; i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + cipherKey);
                    if (c > 'z') {
                        cipheredString += (char) (ch - (26 - cipherKey));
                    } else {
                        cipheredString += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + cipherKey);
                    if (c > 'Z') {
                        cipheredString += (char) (ch - (26 - cipherKey));
                    } else {
                        cipheredString += c;
                    }
                }
            } else {
                cipheredString += ch;
            }
        }
        return cipheredString;
    }
}

