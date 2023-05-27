public class ConvertValueToArabic implements ValueConverter {
    private Integer sumArabic;
    private String romanValue;
    private RomanValues[] values;

    @Override
    public ArabicRoman convertValue(ArabicRoman valorParaConverter) {
        sumArabic = 0;
        romanValue = valorParaConverter.getRoman();
        values = RomanValues.values();

        String par = "";
        Integer parValue = 0;

        for(RomanValues v : values){
            if(v.smallerValue > 0){
                par = v.smallerRomanValue + v.romanValue;
                parValue = v.value - v.smallerValue;

                if(romanValue.contains(par)){
                    sumArabic += parValue;
                    romanValue = romanValue.replaceAll(par, "");
                }
            }
        }

        for(String letra : romanValue.split("")){
            for(RomanValues v : values){
                if(letra.equals(v.romanValue)){
                    sumArabic += v.value;
                }
            }
        }

        valorParaConverter.setArabic(sumArabic);

        return valorParaConverter;
    }
}
