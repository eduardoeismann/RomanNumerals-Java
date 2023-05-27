import converters.ConvertValueToArabic;
import converters.ConvertValueToRoman;
import interfaces.ArabicRoman;

public class RomanNumerals {
    public static void main( String args[] ){
        ConvertValueToRoman convertToRoman = new ConvertValueToRoman();
        ConvertValueToArabic convertToArabic = new ConvertValueToArabic();

        System.out.println(convertToRoman.convertValue( new ArabicRoman(1984) ).getRoman() );
        System.out.println(convertToRoman.convertValue( new ArabicRoman(2000) ).getRoman() );
        System.out.println(convertToRoman.convertValue( new ArabicRoman(2023) ).getRoman() );

        System.out.println(convertToArabic.convertValue( new ArabicRoman("MCMLXXXIV") ).getArabic() );
        System.out.println(convertToArabic.convertValue( new ArabicRoman("MM") ).getArabic() );
        System.out.println(convertToArabic.convertValue( new ArabicRoman("MMXXIII") ).getArabic() );
    }
}
