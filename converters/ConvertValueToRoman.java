package converters;

import enums.RomanValues;
import interfaces.ArabicRoman;
import interfaces.ValueConverter;

public class ConvertValueToRoman implements ValueConverter {
    private int decrementNumber;
    private String romanValue;

    @Override
    public ArabicRoman convertValue(ArabicRoman valueToConvert) {
        decrementNumber = valueToConvert.getArabic();
        romanValue = "";

        for(RomanValues v : RomanValues.values()){
            checkNumbers(v.value, v.smallerValue, v.romanValue, v.smallerRomanValue);
        }

        valueToConvert.setRoman(romanValue);

        return valueToConvert;
    }

    public void checkNumbers(int calculatedValue, int smallerValue, String calculatedRomanNumber, String smallerRomanNumber){
        int repetitionCounter = 0;

        while(decrementNumber - calculatedValue >= 0 && repetitionCounter < 3 ){
            repetitionCounter++;
            decrementNumber -= calculatedValue;
            romanValue += calculatedRomanNumber;
        }

        if(smallerValue > 0){
            if(decrementNumber >= calculatedValue - smallerValue){
                romanValue += smallerRomanNumber;
                romanValue += calculatedRomanNumber;
                decrementNumber = decrementNumber - (calculatedValue-smallerValue);
            }
        }

        repetitionCounter = 0;
    }
}
