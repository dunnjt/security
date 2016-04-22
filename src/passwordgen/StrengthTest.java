/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

/**
 *StrengthTest designed to encourage stronger passwords through obfuscation. The user is unaware of exactly why there password is weak
 * therefore encouraging them to make a stronger password rather than attempting to just fulfill a requirement.
 * @author johndunn
 */
public class StrengthTest {
    /**
     * getStrength() tests password strength for length, uppercase, lowercase, symbols
     * @param password taken from JPassword Field in the new user JPanel
     * @return boolean whether password meets requirements
     */
    public static boolean getStrength(String password) {
        if (password.length()<8) {
            return false;
        }
        else if (password.length()>=8) {
            int upperCaseCount = 0;
            int lowerCaseCount= 0;
            int symbolCount = 0;
            int numCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char p = password.charAt(i);
                int ascii = (int) p;
                if(p>=33 && p<=47 || p>=58 && p<=64 || p>=91 && p<=96 || p>=123 && p<=126) {
                    symbolCount++;
                }
                else if(p>=48 && p<=57) {
                    numCount++;
                }
                else if(p>=65 && p<=90) {
                    upperCaseCount++;
                }
                else if(p>=97 && p<=122) {
                    lowerCaseCount++;
                }      
            }
            //System.out.println("s" + symbolCount + " num" + numCount + " upp" + upperCaseCount + " low" + lowerCaseCount);
            if(numCount<2 || upperCaseCount<2 || lowerCaseCount<2 || symbolCount<2) {
                return false;
            }
        }
        return true;
    }
    
//    public static void main(String [] args) {
//        System.out.println(getStrength(""));
//    }
}