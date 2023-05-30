import converters.ConvertValueToArabic;
import converters.ConvertValueToRoman;
import interfaces.ArabicRoman;

import javax.swing.*;

public class RomanNumerals {
    public static void main( String args[] ){
        ConvertValueToRoman convertToRoman = new ConvertValueToRoman();
        ConvertValueToArabic convertToArabic = new ConvertValueToArabic();

        int option = 1;

        while(option != 0) {
            String select = JOptionPane.showInputDialog(
                "1 - Roman to Arabic\n" +
                "2 - Arabic to Roman\n" +
                "0 - Exit"
            );
            option = toInt(select);

            if(option == 1){
                String roman = JOptionPane.showInputDialog("Type numeral in Roman");
                Integer returnArabic = convertToArabic.convertValue( new ArabicRoman( roman.toUpperCase() ) ).getArabic();
                JOptionPane.showMessageDialog(null, returnArabic);
            } else if(option == 2) {
                String arabic = JOptionPane.showInputDialog("Type numeral in Arabic");
                String returnRoman = convertToRoman.convertValue( new ArabicRoman( toInt(arabic) ) ).getRoman();
                JOptionPane.showMessageDialog(null, returnRoman);
            }
        }
    }

    private static int toInt(String number) {
        return Integer.parseInt(number);
    }
}
