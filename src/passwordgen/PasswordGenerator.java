//Author: John Madsen
package passwordgen;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PasswordGenerator implements Serializable {

    private int upperCaseRequired = 0, lowerCaseRequired = 0, numbersRequired = 0,
            symbolsRequired = 0, minLength = 0, maxLength = 12;
    private final SecureRandom secureRandom = new SecureRandom();

//    public PasswordGenerator(int upperCaseRequired , int lowerCaseRequired , int numbersRequired , int
//            symbolsRequired , int minLength , int maxLength) {
//        this.upperCaseRequired = upperCaseRequired;
//        this.lowerCaseRequired = lowerCaseRequired;
//        this.numbersRequired = numbersRequired;
//        this.symbolsRequired = symbolsRequired;
//        this.minLength = minLength;
//        this.maxLength = maxLength;
//    }
    public String generatePassword() {
        String pass = nextRandomPassword();
        while (pass.equals(" ")) {
            pass = nextRandomPassword();
        }
        return pass;
    }

    private String nextRandomPassword() {
        int upper = 0, lower = 0, number = 0, symbol = 0, length = 0;
        byte[] passwordBytes = new BigInteger(700, secureRandom).toByteArray();
        byte[] password = new byte[maxLength+1];
        String finalPassword = " ";

        for (byte passwordByte : passwordBytes) {

            if (passwordByte < 33) {
                continue;
            } else if (passwordByte < 48) {
                symbol++;
            } else if (passwordByte < 58) {
                number++;
            } else if (passwordByte < 65) {
                symbol++;
            } else if (passwordByte < 91) {
                upper++;
            } else if (passwordByte < 97) {
                symbol++;
            } else if (passwordByte < 123) {
                lower++;
            } else if (passwordByte < 127) {
                symbol++;
            } else {
                continue;
            }
            try{
            password[length] = passwordByte;
            } catch ( Exception e){
                System.out.println("");
            }
            length++;
            if (length == maxLength) {
                break;
            }
        }
        if (upperCaseRequired > upper || lowerCaseRequired > lower || numbersRequired > number
                || symbolsRequired > symbol || minLength > length || maxLength < length) {
            return finalPassword;
        }
//        System.out.println(upper +" upper\n" + lower + " lower\n" + symbol + " symbol\n" + number + " number\n");

        try {
            finalPassword = new String(password, "US-ASCII");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PasswordGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

        return finalPassword;
    }

    public void setUpperCaseRequired(int upperCaseRequired) {
        this.upperCaseRequired = upperCaseRequired;
    }

    public void setLowerCaseRequired(int lowerCaseRequired) {
        this.lowerCaseRequired = lowerCaseRequired;
    }

    public void setNumbersRequired(int numbersRequired) {
        this.numbersRequired = numbersRequired;
    }

    public void setSymbolsRequired(int symbolsRequired) {
        this.symbolsRequired = symbolsRequired;
    }

    public void setMinLength(int minLength) {
            this.minLength = minLength;
    }

    public void setMaxLength(int maxLength) {
            this.maxLength = maxLength;

    }
    public boolean validRequirements(){
        return (!((upperCaseRequired + lowerCaseRequired + numbersRequired +
            symbolsRequired) > maxLength) || maxLength < minLength);
    }

    public int getUpperCaseRequired() {
        return upperCaseRequired;
    }

    public int getLowerCaseRequired() {
        return lowerCaseRequired;
    }

    public int getNumbersRequired() {
        return numbersRequired;
    }

    public int getSymbolsRequired() {
        return symbolsRequired;
    }

    public int getMinLength() {
        return minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

}
