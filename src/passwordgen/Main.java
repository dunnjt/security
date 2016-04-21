//Author: John Madsen
package passwordgen;

public class Main {

    public static void main(String[] args) {

        PasswordGenerator pg = new PasswordGenerator();
        pg.setMaxLength(20);
        pg.setMinLength(12);
        
//        pg.setLowerCaseRequired(5);
//        pg.setNumbersRequired(3);
//        pg.setSymbolsRequired(5);
//        pg.setUpperCaseRequired(3);

        for (int i = 0; i < 50; i++) {
            System.out.println(pg.generatePassword());

        }

    }

}
